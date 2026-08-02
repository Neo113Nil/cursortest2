package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.mvvm.model.Player;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class t34 {
    public static EventSuggestRequest a(EventSuggest.IncidentSuggest incidentSuggest) {
        incidentSuggest.getClass();
        if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
            EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest;
            Player player = cardSuggest.getPlayer();
            return new EventSuggestRequest.CardSuggest(player != null ? Integer.valueOf(player.getId()) : null, cardSuggest.getPlayerName(), cardSuggest.getType(), cardSuggest.getSide(), cardSuggest.getTime(), cardSuggest.getAddedTime());
        }
        if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
            zzl.b();
            return null;
        }
        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
        int homeScoreSuggest = goalSuggest.getHomeScoreSuggest();
        int awayScoreSuggest = goalSuggest.getAwayScoreSuggest();
        Player player2 = goalSuggest.getPlayer();
        Integer valueOf = player2 != null ? Integer.valueOf(player2.getId()) : null;
        Player assist = goalSuggest.getAssist();
        return new EventSuggestRequest.GoalSuggest(homeScoreSuggest, awayScoreSuggest, valueOf, assist != null ? Integer.valueOf(assist.getId()) : null, goalSuggest.getPlayerName(), goalSuggest.getAssistName(), goalSuggest.getType(), goalSuggest.getSide(), goalSuggest.getTime(), goalSuggest.getAddedTime());
    }
}
