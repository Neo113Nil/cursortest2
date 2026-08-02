package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.provider.CalendarContract;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.features.videos.inline.BlazeVideosInlinePlayer;
import com.blaze.blazesdk.features.videos.models.args.b;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.h;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.bettingtips.EventBetBoost;
import com.sofascore.model.newNetwork.PlayerHistoricalRating;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fighter.editfighter.MmaEditFighterDialog;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.service.StageWorker;
import com.sofascore.results.view.FeaturedMatchView;
import com.vungle.ads.internal.protos.Sdk;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class qh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qh(ote oteVar, Player player, Event event) {
        this.a = 25;
        this.b = oteVar;
        this.d = player;
        this.c = event;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Boolean hasXg;
        Tournament tournament;
        UniqueTournament uniqueTournament;
        int i = this.a;
        r6 = 0;
        r6 = 0;
        int i2 = 0;
        r6 = false;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                rh rhVar = (rh) obj3;
                Event event = (Event) obj2;
                Context context = rhVar.getContext();
                context.getClass();
                nv.z0(context, kv.CLICK, "add_to_calendar_button", "event_screen");
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setData(CalendarContract.Events.CONTENT_URI);
                Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                Context context2 = rhVar.getContext();
                context2.getClass();
                String A = tba.A(context2, homeTeam$default);
                Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                Context context3 = rhVar.getContext();
                context3.getClass();
                intent.putExtra("title", A + " - " + tba.A(context3, awayTeam$default));
                intent.putExtra("description", ((StringBuilder) obj).toString());
                intent.putExtra("beginTime", event.getStartTimestamp() * 1000);
                intent.putExtra("endTime", (event.getStartTimestamp() * 1000) + 7200000);
                if (intent.resolveActivity(rhVar.getContext().getPackageManager()) != null) {
                    try {
                        rhVar.getContext().startActivity(intent);
                        return;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                ImageView imageView = (ImageView) obj2;
                MissingPlayerData missingPlayerData = (MissingPlayerData) obj;
                ct8 ct8Var = (ct8) ((xh) obj3).a.d;
                if (ct8Var != null) {
                    ct8Var.invoke(imageView, -1, missingPlayerData);
                    return;
                }
                return;
            case 2:
                ((Stage) obj3).getTypeList().add(StageType.MUTED);
                ((Function0) obj2).invoke();
                ((PopupWindow) obj).dismiss();
                return;
            case 3:
                Stage stage = (Stage) obj3;
                au1 au1Var = (au1) obj;
                stage.getTypeList().remove(StageType.MY_STAGE);
                ((Function0) obj2).invoke();
                nv.y(au1Var.a, vu.REMOVE_FAVORITE, xu.STAGE, stage.getId(), wu.POPUP);
                Context context4 = au1Var.a;
                Pair[] pairArr = {wv8.t(context4, "ACTION", "REMOVE_STAGE"), new Pair("STAGE_ID", Integer.valueOf(stage.getId()))};
                hpo hpoVar = new hpo(18);
                for (int i3 = 0; i3 < 2; i3++) {
                    Pair pair = pairArr[i3];
                    hpoVar.B(pair.b, (String) pair.a);
                }
                md4 l = hpoVar.l();
                vxd.h(context4).b("StageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(StageWorker.class, l).a());
                PopupWindow popupWindow = au1Var.d;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    return;
                }
                return;
            case 4:
                au1 au1Var2 = (au1) obj3;
                a99.A(LeagueActivity.h0, au1Var2.a, Integer.valueOf(((UniqueTournament) obj2).getId()), Integer.valueOf(((Tournament) obj).getId()), null, null, null, null, 4088);
                PopupWindow popupWindow2 = au1Var2.d;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                    return;
                }
                return;
            case 5:
                Event event2 = (Event) obj2;
                yt1 yt1Var = (yt1) obj3;
                au1 au1Var3 = (au1) obj;
                Context context5 = au1Var3.a;
                HashSet<EventType> typeList = event2.getTypeList();
                if (typeList != null) {
                    typeList.remove(EventType.MY_GAMES);
                }
                yt1Var.invoke();
                nv.y(context5, vu.REMOVE_FAVORITE, xu.EVENT, event2.getId(), wu.POPUP);
                int id = event2.getId();
                qa6 qa6Var = su8.a;
                context5.getClass();
                f5p.E(context5, new ru8(id, null));
                PopupWindow popupWindow3 = au1Var3.d;
                if (popupWindow3 != null) {
                    popupWindow3.dismiss();
                    return;
                }
                return;
            case 6:
                Event event3 = (Event) obj2;
                yt1 yt1Var2 = (yt1) obj3;
                au1 au1Var4 = (au1) obj;
                Context context6 = au1Var4.a;
                HashSet<EventType> typeList2 = event3.getTypeList();
                if (typeList2 != null) {
                    typeList2.add(EventType.MUTED);
                }
                yt1Var2.invoke();
                su8.b(context6, event3);
                nv.y(context6, vu.MUTE_NOTIFICATION, xu.EVENT, event3.getId(), wu.POPUP);
                PopupWindow popupWindow4 = au1Var4.d;
                if (popupWindow4 != null) {
                    popupWindow4.dismiss();
                    return;
                }
                return;
            case 7:
                vh vhVar = (vh) obj3;
                EventBetBoost eventBetBoost = (EventBetBoost) obj2;
                wxf wxfVar = EventActivity.h0;
                wxf.B(vhVar.b, eventBetBoost.getEvent().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                zu1 zu1Var = ((lu1) obj).m;
                if (zu1Var != null) {
                    Context context7 = vhVar.b;
                    yu1[] yu1VarArr = yu1.a;
                    nv.n(context7, "bet_boost_event", zu1Var.a, Integer.valueOf(eventBetBoost.getEvent().getId()), null);
                    return;
                }
                return;
            case 8:
                ((BlazeVideosInlinePlayer) obj3).handlePlaceholderClicked((ImageView) obj2, (b) obj);
                return;
            case 9:
                Function1 function1 = (Function1) obj3;
                m22 m22Var = (m22) obj2;
                r9k r9kVar = m22Var.b;
                Context context8 = ((ConstraintLayout) ((p12) obj).b).getContext();
                context8.getClass();
                String b = r9kVar.b(context8);
                if (b == null) {
                    b = m22Var.a;
                }
                function1.invoke(b);
                return;
            case 10:
                fl2 fl2Var = (fl2) obj2;
                il2 il2Var = (il2) obj;
                PickerItem.Category category = (PickerItem.Category) ((PickerItem) obj3);
                boolean z2 = category.c;
                joa joaVar = category.d;
                boolean z3 = !z2;
                category.c = z3;
                z8e.s(fl2Var.b.c, z3);
                Drawable drawable = fl2Var.c;
                if (drawable != null) {
                    v9g.L(drawable, z2);
                }
                int indexOf = il2Var.o().indexOf(category) + 1;
                if (category.c) {
                    il2Var.o().addAll(indexOf, (List) joaVar.getValue());
                    il2Var.notifyItemRangeInserted(indexOf, ((List) joaVar.getValue()).size());
                    return;
                } else {
                    il2Var.o().removeAll((List) joaVar.getValue());
                    il2Var.notifyItemRangeRemoved(indexOf, ((List) joaVar.getValue()).size());
                    return;
                }
            case 11:
                ImageView imageView2 = (ImageView) obj3;
                ca3 ca3Var = (ca3) obj2;
                ba3 ba3Var = (ba3) obj;
                if (imageView2.isHapticFeedbackEnabled()) {
                    imageView2.performHapticFeedback(1);
                }
                ca3Var.q.invoke(Integer.valueOf(ba3Var.a));
                return;
            case 12:
                ImageView imageView3 = (ImageView) obj3;
                ca3 ca3Var2 = (ca3) obj2;
                PinnedTournament pinnedTournament = (PinnedTournament) obj;
                if (imageView3.isHapticFeedbackEnabled()) {
                    imageView3.performHapticFeedback(1);
                }
                ca3Var2.q.invoke(Integer.valueOf(pinnedTournament.getId()));
                return;
            case 13:
                PopupWindow popupWindow5 = new PopupWindow((FrameLayout) ((ed) obj3).b, -2, -2);
                popupWindow5.setFocusable(true);
                popupWindow5.showAsDropDown((View) obj2, ((dsf) obj).a, 0, 17);
                return;
            case 14:
                EditPlayerDialog editPlayerDialog = (EditPlayerDialog) obj3;
                Calendar calendar = (Calendar) obj2;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, -10);
                com.google.android.material.datepicker.b bVar = new com.google.android.material.datepicker.b();
                bVar.d = ug5.p(editPlayerDialog.getContext());
                bVar.a = -2208988800000L;
                bVar.b = calendar2.getTimeInMillis();
                h hVar = new h(new SingleDateSelector());
                hVar.c = R.string.edit_player_birth_date;
                hVar.d = Long.valueOf(calendar.getTimeInMillis());
                hVar.b = bVar.a();
                MaterialDatePicker a = hVar.a();
                a.q.add(new yg5(0, new fa(21, calendar, editPlayerDialog, (j15) obj)));
                a.p(editPlayerDialog.getChildFragmentManager(), "datePicker");
                return;
            case 15:
                f7a.w(((hb6) obj3).b, (String) obj2, (String) obj, "StatisticsInfoModal", null);
                return;
            case 16:
                f7a.w(((kb6) obj3).b, (String) obj2, (String) obj, "StatisticsInfoModal", null);
                return;
            case 17:
                LinearLayout linearLayout = (LinearLayout) obj3;
                Context context9 = linearLayout.getContext();
                context9.getClass();
                String slug = ((OddsCountryProvider) obj2).getProvider().getSlug();
                vmd vmdVar = vmd.EVENT_DETAILS;
                nv.x0(context9, slug, "odds_value");
                Context context10 = linearLayout.getContext();
                context10.getClass();
                bea.G(context10, (String) obj);
                return;
            case 18:
                Event event4 = (Event) obj2;
                int i4 = FeaturedMatchView.o;
                wxf wxfVar2 = EventActivity.h0;
                Context context11 = ((FeaturedMatchView) obj3).getContext();
                context11.getClass();
                wxf.B(context11, event4.getId(), null, null, null, Intrinsics.c((Boolean) obj, Boolean.TRUE) ? o3a.F(event4.getTournament()) : null, 60);
                return;
            case 19:
                ((Function0) obj3).invoke();
                SharedPreferences.Editor edit = ((SharedPreferences) obj2).edit();
                edit.getClass();
                edit.putBoolean("PREF_CHAT_SHOW_ANIMATED_CHAT_ICON", false);
                edit.apply();
                ((ExtendedFloatingActionButton) obj).y(2);
                return;
            case 20:
                HockeyIncident hockeyIncident = (HockeyIncident) obj;
                ((ee9) obj3).i.invoke((TextView) ((js2) obj2).o, kotlin.collections.b.j(new ge9(hockeyIncident.getPlayer(), hockeyIncident.getIsHome()), new ge9(hockeyIncident.getAssist1(), hockeyIncident.getIsHome()), new ge9(hockeyIncident.getAssist2(), hockeyIncident.getIsHome())));
                return;
            case 21:
                HockeyIncident hockeyIncident2 = (HockeyIncident) obj;
                ((ud9) obj3).i.invoke((TextView) ((js2) obj2).o, kotlin.collections.b.j(new ge9(hockeyIncident2.getPenalizedPlayer(), hockeyIncident2.getIsHome()), new ge9(hockeyIncident2.getPenaltyServedByPlayer(), hockeyIncident2.getIsHome()), new ge9(hockeyIncident2.getPenaltyDrawnByPlayer(), hockeyIncident2.getIsHome() != null ? Boolean.valueOf(!r6.booleanValue()) : null)));
                return;
            case 22:
                MmaEditFighterDialog mmaEditFighterDialog = (MmaEditFighterDialog) obj3;
                com.google.android.material.datepicker.b bVar2 = new com.google.android.material.datepicker.b();
                bVar2.d = ug5.p(mmaEditFighterDialog.getContext());
                LocalDate of = LocalDate.of(1900, 1, 1);
                of.getClass();
                bVar2.a = y6a.N(of);
                LocalDate minusYears = LocalDate.now().minusYears(10L);
                minusYears.getClass();
                bVar2.b = y6a.N(minusYears);
                h hVar2 = new h(new SingleDateSelector());
                hVar2.c = R.string.edit_player_birth_date;
                Object obj4 = ((fsf) obj2).a;
                obj4.getClass();
                hVar2.d = Long.valueOf(y6a.N((LocalDate) obj4));
                hVar2.b = bVar2.a();
                MaterialDatePicker a2 = hVar2.a();
                a2.q.add(new yg5(3, new lsb(5, mmaEditFighterDialog, (i15) obj)));
                a2.p(mmaEditFighterDialog.getChildFragmentManager(), "datePicker");
                return;
            case 23:
                Context context12 = ((ImageView) obj3).getContext();
                context12.getClass();
                f7a.w(context12, (String) obj2, (Spanned) obj, "MMAStatisticsModal", null);
                return;
            case 24:
                PlayerHistoricalRating playerHistoricalRating = (PlayerHistoricalRating) obj3;
                syg sygVar = (syg) obj2;
                hse hseVar = (hse) obj;
                int i5 = PlayerHistoricalRating.isHome$default(playerHistoricalRating, null, 1, null) ? 1 : 2;
                Player player = sygVar.a;
                xoe xoeVar = new xoe(player, playerHistoricalRating.getEvent(), playerHistoricalRating.getRating(), null, sygVar.d, i5, null);
                ArrayList arrayList = new ArrayList();
                arrayList.add(xoeVar);
                Context context13 = hseVar.getContext();
                context13.getClass();
                Integer valueOf = Integer.valueOf(playerHistoricalRating.getEventId());
                String sportSlug = player.getSportSlug();
                if (sportSlug == null) {
                    sportSlug = "";
                }
                String str = sportSlug;
                int id2 = player.getId();
                Event event5 = playerHistoricalRating.getEvent();
                int id3 = (event5 == null || (tournament = event5.getTournament()) == null || (uniqueTournament = tournament.getUniqueTournament()) == null) ? 0 : uniqueTournament.getId();
                Event event6 = playerHistoricalRating.getEvent();
                if (event6 != null && (hasXg = event6.getHasXg()) != null) {
                    z = hasXg.booleanValue();
                }
                Boolean valueOf2 = Boolean.valueOf(z);
                Event event7 = playerHistoricalRating.getEvent();
                long startTimestamp = event7 != null ? event7.getStartTimestamp() : 0L;
                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!((xoe) next).a.getDisabled()) {
                        arrayList2.add(next);
                    }
                }
                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(valueOf, null, arrayList2, str, false, false, id2, StatusKt.STATUS_FINISHED, id3, valueOf2, startTimestamp, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                if (context13 instanceof csk) {
                    context13 = ((csk) context13).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context13 instanceof AppCompatActivity ? (AppCompatActivity) context13 : null;
                if (appCompatActivity != null) {
                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                    return;
                }
                return;
            case 25:
                int i6 = PlayerActivity.Z;
                Context context14 = ((ote) obj3).getContext();
                context14.getClass();
                int id4 = ((Player) obj).getId();
                Integer F = o3a.F(((Event) obj2).getTournament());
                jle.q(context14, id4, F != null ? F.intValue() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return;
            case 26:
                f7a.w(((uih) obj3).b, (String) obj2, (String) obj, "StatisticsInfoModal", null);
                return;
            case 27:
                x9i x9iVar = (x9i) obj3;
                rfe rfeVar = (rfe) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                boolean z4 = !x9iVar.i;
                x9iVar.i = z4;
                z8e.s((ImageView) rfeVar.d, z4);
                LinearLayout linearLayout2 = (LinearLayout) rfeVar.e;
                if (!x9iVar.i || (x9iVar.d.isEmpty() && x9iVar.c.isEmpty() && arrayList3.isEmpty())) {
                    i2 = 8;
                }
                linearLayout2.setVisibility(i2);
                return;
            default:
                f7a.w(((lei) obj3).b, (String) obj2, (String) obj, "StatisticsInfoModal", null);
                return;
        }
    }

    public /* synthetic */ qh(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ qh(Event event, Function0 function0, au1 au1Var, int i) {
        this.a = i;
        this.c = event;
        this.b = function0;
        this.d = au1Var;
    }
}
