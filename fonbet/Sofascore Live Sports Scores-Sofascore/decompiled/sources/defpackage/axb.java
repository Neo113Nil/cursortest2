package defpackage;

import android.app.Application;
import com.sofascore.local_persistance.BrandingBoostedOdds;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Laxb;", "Lynb;", "Lrwb;", "Lcwb;", "Ltwb;", "uwb", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class axb extends ynb {
    public final s96 l;
    public final fyk m;
    public final umd n;
    public final amd o;
    public Event p;
    public BrandingBoostedOdds q;
    public Integer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(Application application, s96 s96Var, fyk fykVar, umd umdVar, amd amdVar) {
        super(application, tnb.a);
        s96Var.getClass();
        fykVar.getClass();
        umdVar.getClass();
        amdVar.getClass();
        this.l = s96Var;
        this.m = fykVar;
        this.n = umdVar;
        this.o = amdVar;
    }

    public final dwb t(BrandingBoostedOdds brandingBoostedOdds, w3f w3fVar, ProviderOdds providerOdds) {
        Object u2gVar;
        Double d;
        String[] strArr;
        OddsChoice oddsChoice;
        Double d2;
        String fractionalValue;
        Object u2gVar2;
        String[] strArr2;
        List<OddsChoice> choices;
        OddsChoice oddsChoice2;
        String str = w3fVar.g;
        if (str == null) {
            str = WhoWillWinOptions.HOME_TEAM_WIN.getChoice();
        }
        String str2 = str;
        String home = Intrinsics.c(str2, WhoWillWinOptions.HOME_TEAM_WIN.getChoice()) ? brandingBoostedOdds.getHome() : Intrinsics.c(str2, WhoWillWinOptions.DRAW.getChoice()) ? brandingBoostedOdds.getDraw() : Intrinsics.c(str2, WhoWillWinOptions.AWAY_TEAM_WIN.getChoice()) ? brandingBoostedOdds.getAway() : brandingBoostedOdds.getHome();
        String str3 = null;
        if (home != null) {
            try {
                p2g p2gVar = w2g.b;
                strArr = (String[]) new Regex("/").h(home).toArray(new String[0]);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (strArr.length != 2) {
                throw new NumberFormatException(home);
            }
            double parseDouble = Double.parseDouble(strArr[0]);
            double parseDouble2 = Double.parseDouble(strArr[1]);
            if (parseDouble2 <= 0.0d) {
                throw new NumberFormatException(home);
            }
            u2gVar = Double.valueOf((parseDouble / parseDouble2) + 1.0d);
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            d = (Double) u2gVar;
        } else {
            d = null;
        }
        if (providerOdds == null || (choices = providerOdds.getChoices()) == null) {
            oddsChoice = null;
        } else {
            if (Intrinsics.c(str2, WhoWillWinOptions.HOME_TEAM_WIN.getChoice())) {
                oddsChoice2 = (OddsChoice) CollectionsKt.a0(0, choices);
            } else if (Intrinsics.c(str2, WhoWillWinOptions.DRAW.getChoice())) {
                if (choices.size() < 3) {
                    choices = null;
                }
                oddsChoice2 = choices != null ? (OddsChoice) CollectionsKt.a0(1, choices) : null;
            } else {
                oddsChoice2 = Intrinsics.c(str2, WhoWillWinOptions.AWAY_TEAM_WIN.getChoice()) ? (OddsChoice) CollectionsKt.j0(choices) : (OddsChoice) CollectionsKt.a0(0, choices);
            }
            oddsChoice = oddsChoice2;
        }
        if (oddsChoice == null || (fractionalValue = oddsChoice.getFractionalValue()) == null) {
            d2 = null;
        } else {
            try {
                p2g p2gVar3 = w2g.b;
                strArr2 = (String[]) new Regex("/").h(fractionalValue).toArray(new String[0]);
            } catch (Throwable th2) {
                p2g p2gVar4 = w2g.b;
                u2gVar2 = new u2g(th2);
            }
            if (strArr2.length != 2) {
                throw new NumberFormatException(fractionalValue);
            }
            double parseDouble3 = Double.parseDouble(strArr2[0]);
            double parseDouble4 = Double.parseDouble(strArr2[1]);
            if (parseDouble4 <= 0.0d) {
                throw new NumberFormatException(fractionalValue);
            }
            u2gVar2 = Double.valueOf((parseDouble3 / parseDouble4) + 1.0d);
            if (u2gVar2 instanceof u2g) {
                u2gVar2 = null;
            }
            d2 = (Double) u2gVar2;
        }
        String homeUrl = Intrinsics.c(str2, WhoWillWinOptions.HOME_TEAM_WIN.getChoice()) ? brandingBoostedOdds.getHomeUrl() : Intrinsics.c(str2, WhoWillWinOptions.DRAW.getChoice()) ? brandingBoostedOdds.getDrawUrl() : Intrinsics.c(str2, WhoWillWinOptions.AWAY_TEAM_WIN.getChoice()) ? brandingBoostedOdds.getAwayUrl() : null;
        String string = i().getString(R.string.super_odds_unlocked);
        string.getClass();
        String m = rld.m(i(), home);
        if (d2 != null) {
            if (d2.doubleValue() >= (d != null ? d.doubleValue() : 0.0d)) {
                d2 = null;
            }
            if (d2 != null) {
                str3 = rld.m(i(), oddsChoice.getFractionalValue());
            }
        }
        return new dwb(string, m, homeUrl, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable u(Event event, sq3 sq3Var) {
        wwb wwbVar;
        int i;
        OddsCountryProvider oddsCountryProvider;
        Object obj;
        AllOddsResponse allOddsResponse;
        List<ProviderOdds> markets;
        Object obj2;
        if (sq3Var instanceof wwb) {
            wwbVar = (wwb) sq3Var;
            int i2 = wwbVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wwbVar.t = i2 - Integer.MIN_VALUE;
                Object obj3 = wwbVar.r;
                lu3 lu3Var = lu3.a;
                i = wwbVar.t;
                Object obj4 = null;
                if (i != 0) {
                    y6a.M(obj3);
                    Integer num = this.r;
                    if (num != null) {
                        int intValue = num.intValue();
                        Iterator it = this.o.c().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((OddsCountryProvider) obj).getProvider().getId() == intValue) {
                                break;
                            }
                        }
                        oddsCountryProvider = (OddsCountryProvider) obj;
                    } else {
                        oddsCountryProvider = null;
                    }
                    if (oddsCountryProvider == null) {
                        bga bgaVar = xld.a;
                        oddsCountryProvider = xld.a(i(), true);
                        if (oddsCountryProvider == null) {
                            return null;
                        }
                    }
                    int id = event.getId();
                    String statusType = event.getStatusType();
                    boolean shouldReverseTeams = event.shouldReverseTeams();
                    wwbVar.t = 1;
                    umd umdVar = this.n;
                    umdVar.getClass();
                    obj3 = yaa.P(new gmd(umdVar, oddsCountryProvider, statusType, id, shouldReverseTeams, null), wwbVar);
                    if (obj3 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj3);
                }
                allOddsResponse = (AllOddsResponse) yaa.x((x2g) obj3);
                if (allOddsResponse == null && (markets = allOddsResponse.getMarkets()) != null) {
                    Iterator it2 = rld.o(markets).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        List list = (List) obj2;
                        if (((ProviderOdds) list.get(0)).getType() == ProviderOdds.Type.STANDARD && ((ProviderOdds) list.get(0)).getMarketId() == 1) {
                            break;
                        }
                    }
                    List list2 = (List) obj2;
                    if (list2 == null) {
                        return null;
                    }
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        if (!((ProviderOdds) next).isLive()) {
                            obj4 = next;
                            break;
                        }
                    }
                    return (ProviderOdds) obj4;
                }
            }
        }
        wwbVar = new wwb(this, sq3Var);
        Object obj32 = wwbVar.r;
        lu3 lu3Var2 = lu3.a;
        i = wwbVar.t;
        Object obj42 = null;
        if (i != 0) {
        }
        allOddsResponse = (AllOddsResponse) yaa.x((x2g) obj32);
        return allOddsResponse == null ? null : null;
    }
}
