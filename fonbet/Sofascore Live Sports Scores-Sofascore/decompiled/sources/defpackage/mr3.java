package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mr3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ mr3(LinkedHashMap linkedHashMap, int i) {
        this.a = i;
        this.b = linkedHashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        Integer valueOf2;
        int i = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (i) {
            case 0:
                EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) obj2;
                if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                    if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                        Integer time = ((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest).getTime();
                        valueOf = Integer.valueOf(time != null ? time.intValue() : Integer.MIN_VALUE);
                    }
                    zzl.b();
                    return 0;
                }
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getId()));
                valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                EventSuggest.IncidentSuggest incidentSuggest2 = (EventSuggest.IncidentSuggest) obj;
                if (!(incidentSuggest2 instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                    if (incidentSuggest2 instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                        Integer time2 = ((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest2).getTime();
                        valueOf2 = Integer.valueOf(time2 != null ? time2.intValue() : Integer.MIN_VALUE);
                    }
                    zzl.b();
                    return 0;
                }
                Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest2).getId()));
                valueOf2 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                return valueOf.compareTo(valueOf2);
            case 1:
                Integer num3 = (Integer) linkedHashMap.get(((fhd) obj).a);
                if (num3 == null) {
                    num3 = r0;
                }
                Integer num4 = (Integer) linkedHashMap.get(((fhd) obj2).a);
                return num3.compareTo(num4 != null ? num4 : Integer.MAX_VALUE);
            default:
                return o93.b((Comparable) linkedHashMap.get(((TopPlayerCategoryUiModel) obj).a), (Comparable) linkedHashMap.get(((TopPlayerCategoryUiModel) obj2).a));
        }
    }
}
