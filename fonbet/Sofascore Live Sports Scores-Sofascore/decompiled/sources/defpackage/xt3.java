package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.CricketSupportStaff;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.TeamSides;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xt3 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ xt3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        Character F;
        String valueOf;
        Character F2;
        String valueOf2;
        r3 = null;
        r3 = null;
        Integer num = null;
        switch (this.a) {
            case 0:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element.getClass();
                CoroutineContext minusKey = coroutineContext.minusKey(element.getKey());
                g gVar = g.a;
                if (minusKey != gVar) {
                    tq3 tq3Var = d.Q7;
                    d dVar = (d) minusKey.get(tq3Var);
                    if (dVar == null) {
                        cVar = new c(element, minusKey);
                    } else {
                        CoroutineContext minusKey2 = minusKey.minusKey(tq3Var);
                        if (minusKey2 == gVar) {
                            break;
                        } else {
                            cVar = new c(dVar, new c(element, minusKey2));
                        }
                    }
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ((Integer) obj).intValue();
                uv3 uv3Var = (uv3) obj2;
                uv3Var.getClass();
                break;
            case 5:
                CricketSupportStaff cricketSupportStaff = (CricketSupportStaff) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                cricketSupportStaff.getClass();
                String name = cricketSupportStaff.getName();
                Map map = d14.a;
                String role = cricketSupportStaff.getRole();
                role.getClass();
                Integer num2 = (Integer) d14.a.get(role);
                break;
            case 6:
                ((Integer) obj).intValue();
                wyf wyfVar = (wyf) obj2;
                wyfVar.getClass();
                break;
            case 7:
                ((Integer) obj).intValue();
                EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) obj2;
                incidentSuggest.getClass();
                break;
            case 8:
                rgc rgcVar = (rgc) obj;
                Throwable th = (Throwable) obj2;
                rgcVar.getClass();
                qa3 qa3Var = rgcVar.b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                qa3Var.j0(th);
                break;
            case 9:
                pr4 pr4Var = (pr4) obj2;
                break;
            case 10:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    udj.c("Event ID", null, 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var, 0, 0, 262142);
                } else {
                    av8Var.W();
                }
                break;
            case 11:
                Event event = (Event) obj;
                event.getClass();
                obj2.getClass();
                event.getAwayScore(TeamSides.ORIGINAL).setDisplay((Integer) obj2);
                break;
            case 12:
                Event event2 = (Event) obj;
                event2.getClass();
                obj2.getClass();
                event2.getAwayScore(TeamSides.ORIGINAL).setPeriod1((Integer) obj2);
                break;
            case 13:
                Event event3 = (Event) obj;
                event3.getClass();
                obj2.getClass();
                event3.getAwayScore(TeamSides.ORIGINAL).setPeriod2((Integer) obj2);
                break;
            case 14:
                Event event4 = (Event) obj;
                event4.getClass();
                obj2.getClass();
                event4.getAwayScore(TeamSides.ORIGINAL).setPeriod3((Integer) obj2);
                break;
            case 15:
                Event event5 = (Event) obj;
                event5.getClass();
                obj2.getClass();
                event5.getAwayScore(TeamSides.ORIGINAL).setPeriod4((Integer) obj2);
                break;
            case 16:
                Event event6 = (Event) obj;
                event6.getClass();
                obj2.getClass();
                event6.getAwayScore(TeamSides.ORIGINAL).setPeriod5((Integer) obj2);
                break;
            case 17:
                Event event7 = (Event) obj;
                event7.getClass();
                obj2.getClass();
                event7.getAwayScore(TeamSides.ORIGINAL).setPeriod6((Integer) obj2);
                break;
            case 18:
                Event event8 = (Event) obj;
                event8.getClass();
                obj2.getClass();
                event8.getAwayScore(TeamSides.ORIGINAL).setPeriod7((Integer) obj2);
                break;
            case 19:
                Event event9 = (Event) obj;
                event9.getClass();
                obj2.getClass();
                event9.getAwayScore(TeamSides.ORIGINAL).setPoint((String) obj2);
                break;
            case 20:
                FootballEvent footballEvent = (FootballEvent) obj;
                footballEvent.getClass();
                obj2.getClass();
                boolean z = obj2 instanceof String;
                String str = z ? (String) obj2 : null;
                footballEvent.setHomeRedCards((str == null || (F2 = iii.F(0, str)) == null || (valueOf2 = String.valueOf(F2.charValue())) == null) ? null : StringsKt.toIntOrNull(valueOf2));
                String str2 = z ? (String) obj2 : null;
                if (str2 != null && (F = iii.F(1, str2)) != null && (valueOf = String.valueOf(F.charValue())) != null) {
                    num = StringsKt.toIntOrNull(valueOf);
                }
                footballEvent.setAwayRedCards(num);
                break;
            case 21:
                AmericanFootballEvent americanFootballEvent = (AmericanFootballEvent) obj;
                americanFootballEvent.getClass();
                obj2.getClass();
                AmericanFootballDownDistance yardDistance = americanFootballEvent.getYardDistance();
                if (yardDistance != null) {
                    yardDistance.setCurrentDown((Integer) obj2);
                }
                break;
            case 22:
                AmericanFootballEvent americanFootballEvent2 = (AmericanFootballEvent) obj;
                americanFootballEvent2.getClass();
                obj2.getClass();
                AmericanFootballDownDistance yardDistance2 = americanFootballEvent2.getYardDistance();
                if (yardDistance2 != null) {
                    yardDistance2.setCurrentPossession(((Integer) obj2).intValue());
                }
                break;
            case 23:
                AmericanFootballEvent americanFootballEvent3 = (AmericanFootballEvent) obj;
                americanFootballEvent3.getClass();
                obj2.getClass();
                AmericanFootballDownDistance yardDistance3 = americanFootballEvent3.getYardDistance();
                if (yardDistance3 != null) {
                    yardDistance3.setCurrentTeamHalf(((Integer) obj2).intValue());
                }
                break;
            case 24:
                AmericanFootballEvent americanFootballEvent4 = (AmericanFootballEvent) obj;
                americanFootballEvent4.getClass();
                obj2.getClass();
                AmericanFootballDownDistance yardDistance4 = americanFootballEvent4.getYardDistance();
                if (yardDistance4 != null) {
                    yardDistance4.setCurrentYardline((Integer) obj2);
                }
                break;
            case 25:
                AmericanFootballEvent americanFootballEvent5 = (AmericanFootballEvent) obj;
                americanFootballEvent5.getClass();
                obj2.getClass();
                AmericanFootballDownDistance yardDistance5 = americanFootballEvent5.getYardDistance();
                if (yardDistance5 != null) {
                    yardDistance5.setCurrentYardsToFirstDown((Integer) obj2);
                }
                break;
            case 26:
                ServableEvent servableEvent = (ServableEvent) obj;
                servableEvent.getClass();
                obj2.getClass();
                servableEvent.assignFirstToServe((Integer) obj2);
                break;
            case 27:
                Event event10 = (Event) obj;
                event10.getClass();
                obj2.getClass();
                event10.getHomeScore(TeamSides.ORIGINAL).setDisplay((Integer) obj2);
                break;
            case 28:
                Event event11 = (Event) obj;
                event11.getClass();
                obj2.getClass();
                event11.getHomeScore(TeamSides.ORIGINAL).setPeriod1((Integer) obj2);
                break;
            default:
                Event event12 = (Event) obj;
                event12.getClass();
                obj2.getClass();
                event12.getHomeScore(TeamSides.ORIGINAL).setPeriod2((Integer) obj2);
                break;
        }
        return Unit.a;
    }
}
