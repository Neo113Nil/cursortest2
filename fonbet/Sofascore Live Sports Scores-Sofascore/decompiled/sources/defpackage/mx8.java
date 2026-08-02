package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.MyContributionsResponse;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mx8 {
    public final e64 a;

    public mx8(e64 e64Var) {
        e64Var.getClass();
        this.a = e64Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(int i, String str, sq3 sq3Var) {
        lx8 lx8Var;
        int i2;
        MyContributionsResponse myContributionsResponse;
        Object copy;
        if (sq3Var instanceof lx8) {
            lx8Var = (lx8) sq3Var;
            int i3 = lx8Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lx8Var.t = i3 - Integer.MIN_VALUE;
                Object obj = lx8Var.r;
                lu3 lu3Var = lu3.a;
                i2 = lx8Var.t;
                Object[] objArr = 0;
                if (i2 != 0) {
                    y6a.M(obj);
                    lx8Var.t = 1;
                    e64 e64Var = this.a;
                    e64Var.getClass();
                    obj = yaa.P(new c64((Object) e64Var, i, (Object) str, (rq3) (objArr == true ? 1 : 0), 5), lx8Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                myContributionsResponse = (MyContributionsResponse) yaa.x((x2g) obj);
                if (myContributionsResponse != null) {
                    return null;
                }
                EventSuggest.StatusSuggest statusSuggest = myContributionsResponse.getStatusSuggest();
                EventSuggest.StatusSuggest copy$default = statusSuggest != null ? EventSuggest.StatusSuggest.copy$default(statusSuggest, 0, statusSuggest.getStatus() == SuggestStatus.IGNORED ? SuggestStatus.PENDING : statusSuggest.getStatus(), false, null, null, 29, null) : null;
                EventSuggest.StartDateSuggest startDateSuggest = myContributionsResponse.getStartDateSuggest();
                EventSuggest.StartDateSuggest copy$default2 = startDateSuggest != null ? EventSuggest.StartDateSuggest.copy$default(startDateSuggest, 0, startDateSuggest.getStatus() == SuggestStatus.IGNORED ? SuggestStatus.PENDING : startDateSuggest.getStatus(), false, 0L, 13, null) : null;
                List<EventSuggest.IncidentSuggest> liveIncidentSuggests = myContributionsResponse.getLiveIncidentSuggests();
                ArrayList arrayList = new ArrayList(k13.r(liveIncidentSuggests, 10));
                for (EventSuggest.IncidentSuggest incidentSuggest : liveIncidentSuggests) {
                    if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                        EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest;
                        copy = EventSuggest.IncidentSuggest.CardSuggest.copy$default(cardSuggest, 0, cardSuggest.getStatus() == SuggestStatus.IGNORED ? SuggestStatus.PENDING : cardSuggest.getStatus(), false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, null);
                    } else {
                        if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                            zzl.b();
                            return null;
                        }
                        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                        copy = goalSuggest.copy((r29 & 1) != 0 ? goalSuggest.id : 0, (r29 & 2) != 0 ? goalSuggest.status : goalSuggest.getStatus() == SuggestStatus.IGNORED ? SuggestStatus.PENDING : goalSuggest.getStatus(), (r29 & 4) != 0 ? goalSuggest.validated : false, (r29 & 8) != 0 ? goalSuggest.homeScoreSuggest : 0, (r29 & 16) != 0 ? goalSuggest.awayScoreSuggest : 0, (r29 & 32) != 0 ? goalSuggest.player : null, (r29 & 64) != 0 ? goalSuggest.assist : null, (r29 & 128) != 0 ? goalSuggest.playerName : null, (r29 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? goalSuggest.assistName : null, (r29 & 512) != 0 ? goalSuggest.type : null, (r29 & 1024) != 0 ? goalSuggest.side : null, (r29 & a.o) != 0 ? goalSuggest.time : null, (r29 & 4096) != 0 ? goalSuggest.addedTime : null, (r29 & 8192) != 0 ? goalSuggest.applied : null);
                    }
                    arrayList.add(copy);
                }
                EventSuggest.FinalScoreSuggest finalScoreSuggest = myContributionsResponse.getFinalScoreSuggest();
                return myContributionsResponse.copy(copy$default2, copy$default, arrayList, finalScoreSuggest != null ? EventSuggest.FinalScoreSuggest.copy$default(finalScoreSuggest, 0, finalScoreSuggest.getStatus() == SuggestStatus.IGNORED ? SuggestStatus.PENDING : finalScoreSuggest.getStatus(), false, 0, 0, 29, null) : null);
            }
        }
        lx8Var = new lx8(this, sq3Var);
        Object obj2 = lx8Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = lx8Var.t;
        Object[] objArr2 = 0;
        if (i2 != 0) {
        }
        myContributionsResponse = (MyContributionsResponse) yaa.x((x2g) obj2);
        if (myContributionsResponse != null) {
        }
    }
}
