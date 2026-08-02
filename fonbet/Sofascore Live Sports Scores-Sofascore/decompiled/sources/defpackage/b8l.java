package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.event.dialog.AmFootballWinProbabilityDescriptionModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b8l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8l b;

    public /* synthetic */ b8l(h8l h8lVar, int i) {
        this.a = i;
        this.b = h8lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        h8l h8lVar = this.b;
        switch (i) {
            case 0:
                return new c8l(h8lVar, 2);
            default:
                Event event = h8lVar.e;
                if (event == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                Event event2 = h8lVar.e;
                if (event2 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Team awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null);
                Context context = h8lVar.getContext();
                context.getClass();
                int id = homeTeam$default.getId();
                Context context2 = h8lVar.getContext();
                context2.getClass();
                String p = tba.p(context2, homeTeam$default);
                int id2 = awayTeam$default.getId();
                Context context3 = h8lVar.getContext();
                context3.getClass();
                String p2 = tba.p(context3, awayTeam$default);
                p.getClass();
                p2.getClass();
                AmFootballWinProbabilityDescriptionModal amFootballWinProbabilityDescriptionModal = new AmFootballWinProbabilityDescriptionModal();
                amFootballWinProbabilityDescriptionModal.setArguments(fz8.C(fz8.D(id, "FIRST_TEAM_ID"), fz8.H("FIRST_TEAM_NAME", p), fz8.D(id2, "SECOND_TEAM_ID"), fz8.H("SECOND_TEAM_NAME", p2)));
                Unit unit = Unit.a;
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(amFootballWinProbabilityDescriptionModal, appCompatActivity, null, 3));
                }
                return Unit.a;
        }
    }
}
