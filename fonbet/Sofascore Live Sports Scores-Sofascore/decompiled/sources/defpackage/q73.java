package defpackage;

import android.content.Context;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class q73 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ q73(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                tee teeVar = (tee) obj;
                teeVar.getClass();
                return Integer.valueOf(teeVar.size());
            case 1:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(null, 3), uo5.f(null, 3));
            case 2:
                tee teeVar2 = (tee) obj;
                teeVar2.getClass();
                return Integer.valueOf(teeVar2.size());
            case 3:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(null, 3), uo5.f(null, 3));
            case 4:
                tee teeVar3 = (tee) obj;
                teeVar3.getClass();
                return Integer.valueOf(teeVar3.size());
            case 5:
                w83 w83Var = (w83) obj;
                w83Var.getClass();
                return duf.a.getOrCreateKotlinClass(w83Var.getClass());
            case 6:
                ksa ksaVar = (ksa) obj;
                ksaVar.getClass();
                return Boolean.valueOf(ksaVar.h() > 0 || ksaVar.i() > 0);
            case 7:
                qug qugVar = (qug) obj;
                qugVar.getClass();
                return Boolean.valueOf(qugVar.a.h() > 0);
            case 8:
                EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) obj;
                incidentSuggest.getClass();
                if ((incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) && incidentSuggest.getId() >= 0 && ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getStatus() != SuggestStatus.SUBMITTED) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 9:
                kfk kfkVar = (kfk) obj;
                kfkVar.getClass();
                return Integer.valueOf(kfkVar.a);
            case 10:
                ((efa) obj).getClass();
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof au3) {
                    return (au3) element;
                }
                return null;
            case 13:
                return obj;
            case 14:
                h38 h38Var = (h38) obj;
                h38Var.getClass();
                return duf.a.getOrCreateKotlinClass(h38Var.getClass());
            case 15:
                EventSuggest.IncidentSuggest incidentSuggest2 = (EventSuggest.IncidentSuggest) obj;
                incidentSuggest2.getClass();
                return Integer.valueOf(incidentSuggest2.getId());
            case 16:
                n44 n44Var = (n44) obj;
                n44Var.getClass();
                return duf.a.getOrCreateKotlinClass(n44Var.getClass());
            case 17:
                kxe kxeVar = (kxe) obj;
                kxeVar.getClass();
                return Integer.valueOf(kxeVar.a);
            case 18:
                fci fciVar = (fci) obj;
                fciVar.getClass();
                return duf.a.getOrCreateKotlinClass(fciVar.getClass());
            case 19:
                ((String) obj).getClass();
                return new AtomicBoolean(false);
            case 20:
                ((String) obj).getClass();
                return ml4.g(-1, 6, null);
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder p = bf3.p(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                p.append(value);
                return p.toString();
            case 22:
                ((Context) obj).getClass();
                return km5.a;
            case 23:
                return Unit.a;
            case 24:
                return CollectionsKt.N((List) obj);
            case 25:
                return Boolean.valueOf(!((MonthlyUniqueTournamentItem) obj).getUniqueTournamentIds().isEmpty());
            case 26:
                y3h.d((b4h) obj);
                return Unit.a;
            case 27:
                y3h.d((b4h) obj);
                return Unit.a;
            case 28:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            default:
                return Unit.a;
        }
    }
}
