package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.config.dynamic.baseview.cusview.FeedBackLinerLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import com.sofascore.results.calendar.MaterialCalendarView;
import com.sofascore.results.dialog.CupTreeDialog;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentHeaderView;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.league.fragment.details.LeagueEditorsBottomModal;
import com.sofascore.results.manager.details.ManagerDetailsFragment;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.mma.organisation.details.view.MmaOrganisationFeaturedEventView;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.FeaturedMatchView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class au7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ au7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Event event = (Event) obj2;
                FeaturedMatchView featuredMatchView = (FeaturedMatchView) obj;
                int i3 = FeaturedMatchView.o;
                if (!Intrinsics.c(ok3.s(event), Sports.MMA)) {
                    a99 a99Var = LeagueActivity.h0;
                    Context context = featuredMatchView.getContext();
                    context.getClass();
                    UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                    a99.A(a99Var, context, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), Integer.valueOf(event.getTournament().getId()), null, null, null, null, 4088);
                    break;
                } else {
                    int i4 = MmaFightNightActivity.R;
                    Context context2 = featuredMatchView.getContext();
                    context2.getClass();
                    x2a.S(event.getTournament().getId(), context2);
                    break;
                }
            case 1:
                int i5 = FeaturedTournamentHeaderView.f;
                a99 a99Var2 = LeagueActivity.h0;
                Context context3 = ((FeaturedTournamentHeaderView) obj2).getContext();
                context3.getClass();
                a99.A(a99Var2, context3, Integer.valueOf(((UniqueTournamentDetails) obj).getId()), null, null, null, null, null, 4088);
                break;
            case 2:
                int i6 = TeamActivity.Z;
                Context context4 = ((tv7) obj2).getContext();
                context4.getClass();
                jle.r(context4, ((bbi) obj).c.getTeam().getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 3:
                ((FeedBackLinerLayout) obj2).a((RadioButton) obj, view);
                break;
            case 4:
                int i7 = FeedbackActivity.M;
                ((fd) obj2).e.clearFocus();
                p4h.w((FeedbackActivity) obj, "https://sofascore.helpscoutdocs.com/");
                break;
            case 5:
                Context context5 = ((c68) obj).getContext();
                context5.getClass();
                int id = ((Event) obj2).getId();
                CupTreeDialog cupTreeDialog = new CupTreeDialog();
                Bundle bundle = new Bundle();
                bundle.putInt("EVENT_ID", id);
                cupTreeDialog.setArguments(bundle);
                if (context5 instanceof csk) {
                    context5 = ((csk) context5).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context5 instanceof AppCompatActivity ? (AppCompatActivity) context5 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(cupTreeDialog, appCompatActivity, rq3Var, i2));
                    break;
                }
                break;
            case 6:
                ts1 ts1Var = (ts1) obj2;
                ts1Var.h(ts1Var.b, (APIBuzzerTile) obj);
                break;
            case 7:
                ts1 ts1Var2 = (ts1) obj2;
                ts1Var2.h(ts1Var2.b, (APIBuzzerTile) obj);
                break;
            case 8:
                ts1 ts1Var3 = (ts1) obj2;
                ts1Var3.h(ts1Var3.b, (APIBuzzerTile) obj);
                break;
            case 9:
                ud9 ud9Var = (ud9) obj2;
                ud9Var.i.invoke((TextView) ((v82) ud9Var.j).e, (List) obj);
                break;
            case 10:
                ts1 ts1Var4 = (ts1) obj2;
                ts1Var4.h(ts1Var4.b, (APIBuzzerTile) obj);
                break;
            case 11:
                fy4 fy4Var = (fy4) obj2;
                fy4Var.h(fy4Var.b, (APIBuzzerTile) obj);
                break;
            case 12:
                ts1 ts1Var5 = (ts1) obj2;
                ts1Var5.h(ts1Var5.b, (APIBuzzerTile) obj);
                break;
            case 13:
                a99 a99Var3 = LeagueActivity.h0;
                ((LeagueActivity) obj2).X((List) obj);
                break;
            case 14:
                a99 a99Var4 = LeagueActivity.h0;
                Context context6 = ((tua) obj2).getContext();
                context6.getClass();
                a99.A(a99Var4, context6, Integer.valueOf(((UniqueTournament) obj).getId()), null, null, null, null, null, 4088);
                break;
            case 15:
                int i8 = TeamActivity.Z;
                Context context7 = ((tua) obj2).getContext();
                context7.getClass();
                jle.r(context7, ((Team) obj).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 16:
                int i9 = TeamActivity.Z;
                jle.r((Activity) obj2, ((Team) obj).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 17:
                a99.A(LeagueActivity.h0, (Activity) obj2, Integer.valueOf(((UniqueTournament) obj).getId()), null, null, null, null, null, 4088);
                break;
            case 18:
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) obj2;
                List list = (List) obj;
                if (list.size() != 1) {
                    UniqueTournament uniqueTournament2 = leagueDetailsFragment.G().getUniqueTournament();
                    if (uniqueTournament2 != null) {
                        int id2 = uniqueTournament2.getId();
                        Context requireContext = leagueDetailsFragment.requireContext();
                        requireContext.getClass();
                        LeagueEditorsBottomModal leagueEditorsBottomModal = new LeagueEditorsBottomModal();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("UNIQUE_TOURNAMENT_ID", id2);
                        leagueEditorsBottomModal.setArguments(bundle2);
                        if (requireContext instanceof csk) {
                            requireContext = ((csk) requireContext).getBaseContext();
                        }
                        AppCompatActivity appCompatActivity2 = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
                        if (appCompatActivity2 != null) {
                            wca.x(appCompatActivity2.getLifecycle()).b(new r1(leagueEditorsBottomModal, appCompatActivity2, rq3Var, i2));
                            break;
                        }
                    }
                } else {
                    Context requireContext2 = leagueDetailsFragment.requireContext();
                    requireContext2.getClass();
                    nv.n0(requireContext2, ev.EDITOR_LEAGUE);
                    int i10 = ProfileActivity.Q;
                    Context requireContext3 = leagueDetailsFragment.requireContext();
                    requireContext3.getClass();
                    v8a.H(requireContext3, ((ProfileData) CollectionsKt.Y(list)).getId(), ((ProfileData) CollectionsKt.Y(list)).getEditorName());
                    break;
                }
                break;
            case 19:
                int i11 = TeamActivity.Z;
                Context requireContext4 = ((ManagerDetailsFragment) obj2).requireContext();
                requireContext4.getClass();
                jle.r(requireContext4, ((Team) obj).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 20:
                int i12 = MaterialCalendarView.C;
                ((MaterialCalendarView) obj2).w((fg2) obj);
                break;
            case 21:
                wxf wxfVar = EventActivity.h0;
                wxf.B(((vh) obj).b, ((Event) obj2).getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 22:
                int i13 = MmaOrganisationActivity.T;
                Context context8 = ((olc) obj2).getContext();
                context8.getClass();
                inb.F(((UniqueTournament) obj).getId(), context8);
                break;
            case 23:
                int i14 = MmaOrganisationActivity.T;
                Context requireContext5 = ((MmaFightNightFragment) obj2).requireContext();
                requireContext5.getClass();
                inb.F(((UniqueTournament) obj).getId(), requireContext5);
                break;
            case 24:
                xxb xxbVar = (xxb) obj;
                ImageView imageView = ((up9) obj2).c;
                z8e.s(imageView, imageView.getRotation() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                xxbVar.invoke();
                break;
            case 25:
                int i15 = MmaOrganisationActivity.T;
                Context requireContext6 = ((MmaFighterDetailsFragment) obj2).requireContext();
                requireContext6.getClass();
                inb.F(((UniqueTournament) obj).getId(), requireContext6);
                break;
            case 26:
                ts1 ts1Var6 = (ts1) obj2;
                ts1Var6.h(ts1Var6.b, (APIBuzzerTile) obj);
                break;
            case 27:
                int i16 = MmaOrganisationFeaturedEventView.x;
                wxf wxfVar2 = EventActivity.h0;
                Context context9 = ((MmaOrganisationFeaturedEventView) obj2).getContext();
                context9.getClass();
                wxf.B(context9, ((MmaEvent) obj).getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 28:
                int i17 = MmaFighterActivity.U;
                Context context10 = ((kqc) obj2).getContext();
                context10.getClass();
                f7a.x(((Team) obj).getId(), context10);
                break;
            default:
                ImageButton imageButton = (ImageButton) obj2;
                of ofVar = ((lcd) obj).d;
                if (ofVar != null) {
                    ofVar.k(ofVar.g() == 0 ? 100 : 0);
                    r5 = ofVar.g();
                }
                imageButton.setContentDescription(imageButton.getContext().getString(r5 == 0 ? R.string.nimbus_muted : R.string.nimbus_unmuted));
                imageButton.setImageLevel(r5);
                break;
        }
    }

    public /* synthetic */ au7(Object obj, Event event, int i) {
        this.a = i;
        this.c = obj;
        this.b = event;
    }
}
