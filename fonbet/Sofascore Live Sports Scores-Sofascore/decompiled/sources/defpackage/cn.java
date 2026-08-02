package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.textfield.TextInputEditText;
import com.ironsource.D8;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.customui.views.YouTubePlayerSeekBar;
import com.sofascore.model.Sports;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.bettingtips.BetBoost;
import com.sofascore.model.newNetwork.FeaturedPlayer;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.graph.AttackMomentumGraph;
import com.sofascore.results.event.dialog.AttackMomentumInfoBottomSheet;
import com.sofascore.results.event.dialog.CricketRunsPerOverDescriptionModal;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.settings.deleteAccount.DeleteAccountActivity;
import com.sofascore.results.stagesport.StageCategoryActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.EventInfoView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Calendar;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cn(AlertDialog alertDialog, Function0 function0) {
        this.a = 1;
        this.b = alertDialog;
        this.c = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((jx1) obj2).invoke();
                ((AlertDialog) obj).dismiss();
                break;
            case 1:
                ((AlertDialog) obj).dismiss();
                ((Function0) obj2).invoke();
                break;
            case 2:
                ((hp5) obj2).invoke();
                ((AlertDialog) obj).dismiss();
                break;
            case 3:
                Context context = (Context) obj;
                Event event = ((AttackMomentumGraph) ((om0) obj2).d.c).getEvent();
                if (event != null) {
                    rik rikVar = nm0.d;
                    String s = ok3.s(event);
                    rikVar.getClass();
                    s.getClass();
                    nm0 nm0Var = s.equals(Sports.FOOTBALL) ? nm0.FOOTBALL : s.equals(Sports.ICE_HOCKEY) ? nm0.ICE_HOCKEY : null;
                    if (nm0Var != null) {
                        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                        int id = homeTeam$default.getId();
                        String A = tba.A(context, homeTeam$default);
                        if (A == null) {
                            A = tba.p(context, homeTeam$default);
                        }
                        int id2 = awayTeam$default.getId();
                        String A2 = tba.A(context, awayTeam$default);
                        if (A2 == null) {
                            A2 = tba.p(context, awayTeam$default);
                        }
                        A.getClass();
                        A2.getClass();
                        AttackMomentumInfoBottomSheet attackMomentumInfoBottomSheet = new AttackMomentumInfoBottomSheet();
                        attackMomentumInfoBottomSheet.setArguments(fz8.C(fz8.G("ATTACK_MOMENTUM_SPORT", nm0Var), fz8.D(id, "FIRST_TEAM_ID"), fz8.H("FIRST_TEAM_NAME", A), fz8.D(id2, "SECOND_TEAM_ID"), fz8.H("SECOND_TEAM_NAME", A2)));
                        Unit unit = Unit.a;
                        if (context instanceof csk) {
                            context = ((csk) context).getBaseContext();
                        }
                        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(attackMomentumInfoBottomSheet, appCompatActivity, rq3Var, i2));
                            break;
                        }
                    }
                }
                break;
            case 4:
                ts1 ts1Var = (ts1) obj2;
                ts1Var.h(ts1Var.b, obj);
                break;
            case 5:
                u61 u61Var = (u61) obj;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=" + ((String) obj2) + "#t=" + ((YouTubePlayerSeekBar) u61Var.c.j).getSeekBar().getProgress()));
                try {
                    Context context2 = (Context) u61Var.a.get();
                    if (context2 != null) {
                        context2.startActivity(intent);
                        break;
                    }
                } catch (Exception e) {
                    e.getMessage();
                    ugj.a.getClass();
                    return;
                }
                break;
            case 6:
                ConstraintLayout constraintLayout = (ConstraintLayout) ((bv1) obj2).b;
                Context context3 = constraintLayout.getContext();
                Context context4 = constraintLayout.getContext();
                context4.getClass();
                Toast.makeText(context3, tba.p(context4, (Team) obj), 0).show();
                break;
            case 7:
                int i3 = PlayerActivity.Z;
                Context context5 = ((jr1) obj2).getContext();
                context5.getClass();
                jle.q(context5, ((FeaturedPlayer) obj).getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                break;
            case 8:
                ts1 ts1Var2 = (ts1) obj2;
                ts1Var2.h(ts1Var2.b, (APIBuzzerTile) obj);
                break;
            case 9:
                Event event2 = (Event) obj2;
                au1 au1Var = (au1) obj;
                HashSet<EventType> typeList = event2.getTypeList();
                if (typeList != null) {
                    typeList.add(EventType.MUTED);
                }
                event2.setMute(1);
                su8.b(au1Var.a, event2);
                nv.y(au1Var.a, vu.MUTE_NOTIFICATION, xu.EVENT, event2.getId(), wu.POPUP);
                PopupWindow popupWindow = au1Var.d;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    break;
                }
                break;
            case 10:
                au1 au1Var2 = (au1) obj2;
                int i4 = StageCategoryActivity.R;
                yfa.J(au1Var2.a, (UniqueStage) obj);
                PopupWindow popupWindow2 = au1Var2.d;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                    break;
                }
                break;
            case 11:
                au1 au1Var3 = (au1) obj2;
                int i5 = TeamActivity.Z;
                jle.r(au1Var3.a, ((Team) obj).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                PopupWindow popupWindow3 = au1Var3.d;
                if (popupWindow3 != null) {
                    popupWindow3.dismiss();
                    break;
                }
                break;
            case 12:
                au1 au1Var4 = (au1) obj2;
                int i6 = TeamActivity.Z;
                jle.r(au1Var4.a, ((SubTeam) obj).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                PopupWindow popupWindow4 = au1Var4.d;
                if (popupWindow4 != null) {
                    popupWindow4.dismiss();
                    break;
                }
                break;
            case 13:
                Context context6 = ((vh) obj2).b;
                bea.G(context6, ((BetBoost) obj).getBetSlipLink());
                nv.a0(context6, "odds_value");
                break;
            case 14:
                ((il2) obj2).b.invoke((PickerItem) obj);
                break;
            case 15:
                ((TextInputEditText) ((ez0) obj2).d).clearFocus();
                ((AlertDialog) obj).dismiss();
                break;
            case 16:
                int i7 = CollapsibleToolbarActivity.K;
                int i8 = StageCategoryActivity.R;
                yfa.J((CollapsibleToolbarActivity) obj2, (UniqueStage) obj);
                break;
            case 17:
                int i9 = TeamActivity.Z;
                jle.r(((vh) obj2).b, ((e43) obj).b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 18:
                ((c63) obj2).f.invoke(Integer.valueOf(((Player) obj).getId()));
                break;
            case 19:
                ((c63) obj2).f.invoke(Integer.valueOf(((Team) obj).getId()));
                break;
            case 20:
                int i10 = TeamActivity.Z;
                jle.r(((wh) obj2).b, ((f14) obj).a.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 21:
                w04 w04Var = (w04) obj2;
                Event event3 = (Event) obj;
                Context context7 = w04Var.getContext();
                context7.getClass();
                Team homeTeam$default2 = Event.getHomeTeam$default(event3, null, 1, null);
                Context context8 = w04Var.getContext();
                context8.getClass();
                String p = tba.p(context8, homeTeam$default2);
                Team awayTeam$default2 = Event.getAwayTeam$default(event3, null, 1, null);
                Context context9 = w04Var.getContext();
                context9.getClass();
                String p2 = tba.p(context9, awayTeam$default2);
                p.getClass();
                p2.getClass();
                CricketRunsPerOverDescriptionModal cricketRunsPerOverDescriptionModal = new CricketRunsPerOverDescriptionModal();
                cricketRunsPerOverDescriptionModal.setArguments(fz8.C(fz8.H("HOME_TEAM_NAME", p), fz8.H("AWAY_TEAM_NAME", p2)));
                Unit unit2 = Unit.a;
                if (context7 instanceof csk) {
                    context7 = ((csk) context7).getBaseContext();
                }
                AppCompatActivity appCompatActivity2 = context7 instanceof AppCompatActivity ? (AppCompatActivity) context7 : null;
                if (appCompatActivity2 != null) {
                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(cricketRunsPerOverDescriptionModal, appCompatActivity2, rq3Var, i2));
                    break;
                }
                break;
            case 22:
                ts1 ts1Var3 = (ts1) obj2;
                ts1Var3.h(ts1Var3.b, (APIBuzzerTile) obj);
                break;
            case 23:
                D8.a((D8) obj2, (D8.b) obj, view);
                break;
            case 24:
                Calendar calendar = (Calendar) obj;
                zqb F = ((DateMatchesFragment) obj2).F();
                F.j0.j(new pn3(calendar));
                F.o(calendar);
                break;
            case 25:
                int i11 = DeleteAccountActivity.N;
                tba.j((LinearLayout) ((e92) obj2).e, n35.TO_BOTTOM, 0L, 14);
                tba.i((LinearLayout) ((DeleteAccountActivity) obj).Q().b.b, m35.FROM_TOP, 0L, 6);
                break;
            case 26:
                fy4 fy4Var = (fy4) obj2;
                fy4Var.h(fy4Var.b, (APIBuzzerTile) obj);
                break;
            case 27:
                LeagueActivity.h0.z(((vh) obj2).b, ((td6) obj).a.getTournament());
                break;
            case 28:
                int i12 = EventInfoView.e;
                wxf wxfVar = EventActivity.h0;
                Context context10 = ((ConstraintLayout) obj2).getContext();
                context10.getClass();
                wxf.B(context10, ((Event) obj).getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            default:
                OddsProvider oddsProvider = (OddsProvider) obj;
                Context context11 = ((wd6) obj2).b;
                String slug = oddsProvider.getSlug();
                vmd vmdVar = vmd.EVENT_DETAILS;
                nv.x0(context11, slug, "provider_logo");
                bea.G(context11, oddsProvider.getDefaultBetSlipLink());
                break;
        }
    }

    public /* synthetic */ cn(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
