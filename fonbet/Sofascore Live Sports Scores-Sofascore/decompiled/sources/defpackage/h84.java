package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.dialog.TennisPowerGraphDescriptionModal;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyJoinLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class h84 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h84(u6b u6bVar, Function0 function0) {
        this.a = 9;
        e6b e6bVar = e6b.a;
        this.b = u6bVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        int i3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                j84 j84Var = (j84) obj;
                Drawable drawable = context.getDrawable(R.drawable.team_logo_placeholder);
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(context.getColor(j84Var.d.b), PorterDuff.Mode.SRC_IN));
                    break;
                }
                break;
            case 1:
                Function1 function1 = (Function1) obj;
                String str = ((b94) obj2).p;
                if (str != null) {
                    function1.invoke(new zv7(str));
                }
                break;
            case 2:
                Context context2 = (Context) obj2;
                String str2 = uae.b;
                context2.getClass();
                String absolutePath = gvd.v(context2, ((dg4) obj).b).getAbsolutePath();
                absolutePath.getClass();
                break;
            case 3:
                break;
            case 4:
                ((m8j) obj2).d.invoke((r8j) obj);
                break;
            case 5:
                mvh mvhVar = (mvh) obj;
                wd8.a((wd8) obj2);
                if (mvhVar != null) {
                    ((lw4) mvhVar).a();
                }
                break;
            case 6:
                ((Function1) obj2).invoke((j1f) obj);
                break;
            case 7:
                ((y15) obj2).i((d6d) obj, false);
                break;
            case 8:
                Context context3 = (Context) obj2;
                int i4 = TeamActivity.Z;
                jle.r(context3, ((z75) obj).a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 9:
                Function0 function0 = (Function0) obj;
                if (((u6b) obj2).getLifecycle().b().compareTo(e6b.e) >= 0) {
                    function0.invoke();
                }
                break;
            case 10:
                qq3 qq3Var = (qq3) obj2;
                String str3 = (String) obj;
                ip5 ip5Var = (ip5) qq3Var.c;
                if (ip5Var == null) {
                    Enum[] enumArr = (Enum[]) qq3Var.b;
                    ip5Var = new ip5(str3, enumArr.length);
                    for (Enum r0 : enumArr) {
                        ip5Var.j(r0.name(), false);
                    }
                    break;
                }
                break;
            case 11:
                Context context4 = (Context) obj2;
                Integer num = ((dm) obj).a;
                if (num != null) {
                    int intValue = num.intValue();
                    int i5 = PlayerActivity.Z;
                    jle.q(context4, intValue, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                }
                break;
            case 12:
                ((Function1) obj2).invoke(new pr5(((ms5) ((os5) obj)).a.d));
                break;
            case 13:
                ((Function1) obj2).invoke(Integer.valueOf(((skc) obj).a));
                break;
            case 14:
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) obj2;
                Event event = (Event) obj;
                Context requireContext = eventDetailsFragment.requireContext();
                requireContext.getClass();
                Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                Context requireContext2 = eventDetailsFragment.requireContext();
                requireContext2.getClass();
                String p = tba.p(requireContext2, homeTeam$default);
                Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                Context requireContext3 = eventDetailsFragment.requireContext();
                requireContext3.getClass();
                String p2 = tba.p(requireContext3, awayTeam$default);
                p.getClass();
                p2.getClass();
                TennisPowerGraphDescriptionModal tennisPowerGraphDescriptionModal = new TennisPowerGraphDescriptionModal();
                tennisPowerGraphDescriptionModal.setArguments(fz8.C(fz8.H("HOME_TEAM_NAME", p), fz8.H("AWAY_TEAM_NAME", p2)));
                Unit unit = Unit.a;
                if (requireContext instanceof csk) {
                    requireContext = ((csk) requireContext).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(tennisPowerGraphDescriptionModal, appCompatActivity, rq3Var, i2));
                }
                break;
            case 15:
                ((EventDetailsFragment) obj2).Q(((iy5) obj).x);
                break;
            case 16:
                ((ir1) obj2).o((y21) obj, true, true);
                break;
            case 17:
                String str4 = (String) obj2;
                e1d e1dVar = (e1d) obj;
                String str5 = ((fj6) e1dVar.getValue()).a;
                if (!str4.equals("PrimaryNotEditable") && !str4.equals("PrimaryEditable")) {
                    r2 = str4.equals("SecondaryEditable") ? str5.equals("SecondaryEditable") : false;
                }
                if (r2) {
                    e1dVar.setValue(new fj6(str4));
                }
                break;
            case 18:
                Function0 function02 = (Function0) obj;
                if (((Boolean) ((Function0) obj2).invoke()).booleanValue()) {
                    break;
                }
                break;
            case 19:
                ((Function1) obj2).invoke((il6) obj);
                break;
            case 20:
                ((Function1) obj2).invoke((s37) obj);
                break;
            case 21:
                znh znhVar = (znh) obj;
                znh znhVar2 = ((qug) obj2).a;
                if (znhVar2.h() != 0 && znhVar.h() < znhVar2.h()) {
                    r2 = false;
                }
                znhVar.i(znhVar2.h());
                break;
            case 22:
                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = (FantasyCompetitionMyTeamFragment) obj;
                ((Function0) obj2).invoke();
                fantasyCompetitionMyTeamFragment.u = xw3.L(wca.x(fantasyCompetitionMyTeamFragment.getLifecycle()), null, null, new nt6(fantasyCompetitionMyTeamFragment, rq3Var, i3), 3);
                break;
            case 23:
                ((Function1) obj2).invoke((mp6) obj);
                break;
            case 24:
                ((Function1) obj2).invoke((fv6) obj);
                break;
            case 25:
                Long l = (Long) obj2;
                break;
            case 26:
                Context context5 = (Context) obj2;
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj;
                wxf wxfVar = EventActivity.h0;
                if (fantasyPlayerFixtureUiModel != null) {
                    wxf.B(context5, fantasyPlayerFixtureUiModel.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    break;
                } else {
                    a70.r("Required value was null.");
                    break;
                }
            case 27:
                xw3.L((ku3) obj2, null, null, new w07((q50) obj, rq3Var, i3), 3);
                break;
            case 28:
                nv.A((Context) obj2, "join_random_league", "competition");
                n27 n27Var = (n27) ((FantasyJoinLeagueBottomSheet) obj).B.getValue();
                xw3.L(un0.z(n27Var), null, null, new hs6(n27Var, rq3Var, 12), 3);
                break;
            default:
                Function1 function12 = (Function1) obj2;
                eo7 eo7Var = (eo7) obj;
                if (function12 != null) {
                    function12.invoke(eo7Var);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h84(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ h84(int i, Context context, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = context;
    }
}
