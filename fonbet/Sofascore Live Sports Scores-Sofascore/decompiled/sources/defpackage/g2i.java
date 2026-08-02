package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.media3.ui.PlayerView;
import com.blaze.blazesdk.features.stories.players.ui.StoriesPlayerActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.ironsource.C4435zd;
import com.ironsource.U3;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.StageTeamPlacement;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.SurveyActivity;
import com.sofascore.results.main.matches.StageSeriesFragment;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import com.sofascore.results.stagesport.StageTeamOddsView;
import com.sofascore.results.stagesport.fragments.media.StageMediaFragment;
import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorDetailsFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverDetailsFragment;
import com.sofascore.results.team.details.view.TeamRecentFormView;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.team.lastnext.calendar.monthpicker.TeamEventsCalendarMonthPickerBottomSheet;
import com.sofascore.results.team.transfers.TeamTransfersModal;
import com.sofascore.results.tv.TVScheduleActivity;
import com.sofascore.results.tv.fragments.NewChannelsDialog;
import com.sofascore.results.tv.fragments.TVScheduleFragment;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g2i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g2i(g2i g2iVar, chf chfVar) {
        this.a = 26;
        this.b = g2iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0544, code lost:
    
        if (r2 == null) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v189, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        GambleRegulationFooterView gambleRegulationFooterView;
        Team team;
        String alpha2;
        nt9 a;
        GambleRegulationFooterView gambleRegulationFooterView2;
        String string;
        Unit unit;
        ale player;
        int i = this.a;
        int i2 = 22;
        int i3 = 2;
        String str = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                StageConstructorDetailsFragment stageConstructorDetailsFragment = (StageConstructorDetailsFragment) obj2;
                joa joaVar = stageConstructorDetailsFragment.w;
                n8i n8iVar = (n8i) obj;
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(stageConstructorDetailsFragment.D().f.c());
                joa joaVar2 = stageConstructorDetailsFragment.v;
                StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) joaVar2.getValue();
                if (stageTeamOddsView != null) {
                    stageTeamOddsView.n(oddsCountryProvider, n8iVar);
                }
                if (n8iVar != null && stageConstructorDetailsFragment.y == null) {
                    g6b lifecycle = stageConstructorDetailsFragment.getLifecycle();
                    lifecycle.getClass();
                    zsk zskVar = new zsk(lifecycle, 45);
                    StageTeamOddsView stageTeamOddsView2 = (StageTeamOddsView) joaVar2.getValue();
                    if (stageTeamOddsView2 != null) {
                        stageTeamOddsView2.m = false;
                        zskVar.b(stageTeamOddsView2, new fl8(0, stageTeamOddsView2, StageTeamOddsView.class, "trackEvent", "trackEvent()V", 0, 22), null);
                    }
                    stageConstructorDetailsFragment.y = zskVar;
                } else if (n8iVar == null) {
                    zsk zskVar2 = stageConstructorDetailsFragment.y;
                    if (zskVar2 != null) {
                        zskVar2.a();
                    }
                    stageConstructorDetailsFragment.y = null;
                }
                boolean z = n8iVar != null;
                GambleRegulationFooterView gambleRegulationFooterView3 = (GambleRegulationFooterView) joaVar.getValue();
                if (gambleRegulationFooterView3 != null) {
                    gambleRegulationFooterView3.setVisibility(z ? 0 : 8);
                }
                if (z) {
                    GambleRegulationFooterView gambleRegulationFooterView4 = (GambleRegulationFooterView) joaVar.getValue();
                    if (Intrinsics.c(gambleRegulationFooterView4 != null ? Boolean.valueOf(gambleRegulationFooterView4.d.e.length() > 0) : null, Boolean.FALSE) && (gambleRegulationFooterView = (GambleRegulationFooterView) joaVar.getValue()) != null) {
                        r9 = oddsCountryProvider != null ? oddsCountryProvider.getOddsMayDiffer() : 0;
                        int i4 = GambleRegulationFooterView.e;
                        gambleRegulationFooterView.j(r9, false);
                    }
                }
                StageTeamOddsView stageTeamOddsView3 = (StageTeamOddsView) joaVar2.getValue();
                if (stageTeamOddsView3 != null) {
                    stageTeamOddsView3.n((OddsCountryProvider) CollectionsKt.firstOrNull(stageConstructorDetailsFragment.D().f.c()), n8iVar);
                }
                return Unit.a;
            case 1:
                a3i a3iVar = (a3i) obj2;
                return a3i.a((a3i) obj, a3iVar.b, a3iVar.c, a3iVar.d, null, null, null, a3iVar.h, a3iVar.i, a3iVar.j, 0, null, null, null, 15473);
            case 2:
                StageTeamPlacement stageTeamPlacement = (StageTeamPlacement) obj;
                stageTeamPlacement.getClass();
                Integer teamId = stageTeamPlacement.getTeamId();
                int id = ((StageStandingsItem) obj2).getTeam().getId();
                if (teamId != null && teamId.intValue() == id) {
                    r8 = true;
                }
                return Boolean.valueOf(r8);
            case 3:
                StageDriverActivity stageDriverActivity = (StageDriverActivity) obj2;
                mqi mqiVar = stageDriverActivity.M;
                e8i e8iVar = (e8i) obj;
                int i5 = StageDriverActivity.R;
                stageDriverActivity.Q().l.setRefreshing(false);
                ImageView R = stageDriverActivity.R();
                int i6 = stageDriverActivity.X().g;
                boolean z2 = as9.a;
                String R2 = pco.R(i6);
                apf a2 = ajh.a(R.getContext());
                ht9 ht9Var = new ht9(R.getContext());
                ht9Var.c = R2;
                vt9.f(ht9Var, R);
                Context context = R.getContext();
                context.getClass();
                wt9 I = rfo.I(R);
                z8e.Q(ht9Var, context, R.drawable.player_photo_placeholder, (I == null || (a = I.a()) == null) ? null : a.e, null);
                awj[] awjVarArr = {new urh()};
                sl6 sl6Var = st9.a;
                st9.b(ht9Var, ph0.X(awjVarArr));
                a2.a(ht9Var.a());
                if (e8iVar != null && (team = e8iVar.a) != null && !stageDriverActivity.P) {
                    stageDriverActivity.P = true;
                    NotificationsActionButton notificationsActionButton = stageDriverActivity.Q;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.i(team, (FavoritesEventsData) stageDriverActivity.X().t.a.getValue(), true);
                    }
                    int id2 = team.getId();
                    Intent intent = stageDriverActivity.getIntent();
                    intent.getClass();
                    nv.h0(stageDriverActivity, id2, intent);
                    new q4i(stageDriverActivity, i3);
                    stageDriverActivity.Q().l.setEnabled(false);
                    PlayerTeamInfo playerTeamInfo = team.getPlayerTeamInfo();
                    String Q = (playerTeamInfo == null || playerTeamInfo.getDeceased() == null) ? null : hkg.Q(stageDriverActivity, R.string.deceased, team.getGender(), new Object[0]);
                    stageDriverActivity.S(team, tba.p(stageDriverActivity, team), team.getCountry(), Q, Q != null);
                    Country country = team.getCountry();
                    if (country != null && (alpha2 = country.getAlpha2()) != null) {
                        stageDriverActivity.Q().d.setBackground(new uy0(alpha2));
                    }
                    stageDriverActivity.Q().k.setAdapter((c5i) mqiVar.getValue());
                    kp5 kp5Var = b5i.g;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : kp5Var) {
                        if (((Boolean) ((b5i) obj3).b.invoke(e8iVar)).booleanValue()) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d41.w((c5i) mqiVar.getValue(), (b5i) it.next());
                    }
                    b5i b5iVar = stageDriverActivity.O;
                    if (b5iVar != null) {
                        stageDriverActivity.O = null;
                        int D = ((c5i) mqiVar.getValue()).D(b5iVar);
                        Integer valueOf = D >= 0 ? Integer.valueOf(D) : null;
                        if (valueOf != null) {
                            stageDriverActivity.Q().k.c(valueOf.intValue(), false);
                        }
                    }
                }
                return Unit.a;
            case 4:
                StageDriverDetailsFragment stageDriverDetailsFragment = (StageDriverDetailsFragment) obj2;
                joa joaVar3 = stageDriverDetailsFragment.u;
                n8i n8iVar2 = (n8i) obj;
                otk otkVar = stageDriverDetailsFragment.s;
                OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) CollectionsKt.firstOrNull(((o8i) otkVar.getValue()).f.c());
                stageDriverDetailsFragment.D().b.n(oddsCountryProvider2, n8iVar2);
                if (n8iVar2 != null && stageDriverDetailsFragment.x == null) {
                    g6b lifecycle2 = stageDriverDetailsFragment.getLifecycle();
                    lifecycle2.getClass();
                    zsk zskVar3 = new zsk(lifecycle2, 45);
                    StageTeamOddsView stageTeamOddsView4 = stageDriverDetailsFragment.D().b;
                    stageTeamOddsView4.m = true;
                    zskVar3.b(stageTeamOddsView4, new fl8(0, stageTeamOddsView4, StageTeamOddsView.class, "trackEvent", "trackEvent()V", 0, 22), null);
                    stageDriverDetailsFragment.x = zskVar3;
                } else if (n8iVar2 == null) {
                    zsk zskVar4 = stageDriverDetailsFragment.x;
                    if (zskVar4 != null) {
                        zskVar4.a();
                    }
                    stageDriverDetailsFragment.x = null;
                }
                boolean z3 = n8iVar2 != null;
                GambleRegulationFooterView gambleRegulationFooterView5 = (GambleRegulationFooterView) joaVar3.getValue();
                if (gambleRegulationFooterView5 != null) {
                    gambleRegulationFooterView5.setVisibility(z3 ? 0 : 8);
                }
                if (z3) {
                    GambleRegulationFooterView gambleRegulationFooterView6 = (GambleRegulationFooterView) joaVar3.getValue();
                    if (Intrinsics.c(gambleRegulationFooterView6 != null ? Boolean.valueOf(gambleRegulationFooterView6.d.e.length() > 0) : null, Boolean.FALSE) && (gambleRegulationFooterView2 = (GambleRegulationFooterView) joaVar3.getValue()) != null) {
                        Boolean oddsMayDiffer = oddsCountryProvider2 != null ? oddsCountryProvider2.getOddsMayDiffer() : null;
                        int i7 = GambleRegulationFooterView.e;
                        gambleRegulationFooterView2.j(oddsMayDiffer, false);
                    }
                }
                stageDriverDetailsFragment.D().b.n((OddsCountryProvider) CollectionsKt.firstOrNull(((o8i) otkVar.getValue()).f.c()), n8iVar2);
                return Unit.a;
            case 5:
                StageMediaFragment stageMediaFragment = (StageMediaFragment) obj2;
                List list = (List) obj;
                stageMediaFragment.n();
                y4c y4cVar = (y4c) stageMediaFragment.s.getValue();
                list.getClass();
                y4cVar.F(list);
                return Unit.a;
            case 6:
                j6i j6iVar = (j6i) obj2;
                xa xaVar = (xa) obj;
                xaVar.getClass();
                if (xaVar instanceof ua) {
                    j6iVar.l(true);
                } else if (xaVar instanceof va) {
                    b6i b6iVar = ((va) xaVar).a;
                    j6iVar.getClass();
                    xw3.L(un0.z(j6iVar), null, null, new big(j6iVar, b6iVar, r9, i2), 3);
                } else {
                    if (!(xaVar instanceof ta)) {
                        zzl.b();
                        return null;
                    }
                    a6i a6iVar = ((ta) xaVar).a;
                    j6iVar.getClass();
                    xw3.L(un0.z(j6iVar), null, null, new big(j6iVar, a6iVar, r9, 21), 3);
                }
                return Unit.a;
            case 7:
                r6i r6iVar = (r6i) obj2;
                d8i d8iVar = (d8i) obj;
                d8iVar.getClass();
                r6iVar.s = d8iVar == d8i.o;
                r6iVar.G(r6iVar.u, r6iVar.t);
                nv.z0(r6iVar.b, kv.CLICK, r6iVar.s ? "gap" : "interval", "race_table");
                return Unit.a;
            case 8:
                StageSeriesFragment stageSeriesFragment = (StageSeriesFragment) obj2;
                Calendar calendar = (Calendar) ((pn3) obj).a();
                if (calendar != null) {
                    LocalDate with = LocalDate.of(calendar.get(1), calendar.get(2) + 1, calendar.get(5)).with(TemporalAdjusters.previousOrSame(hwc.a));
                    p7i p7iVar = (p7i) stageSeriesFragment.t.getValue();
                    with.getClass();
                    p7iVar.getClass();
                    int between = (int) ChronoUnit.DAYS.between(p7iVar.k, with);
                    int i8 = between / 7;
                    if ((between ^ 7) < 0 && i8 * 7 != between) {
                        i8--;
                    }
                    int i9 = 1073741823 + i8;
                    krk krkVar = stageSeriesFragment.l;
                    krkVar.getClass();
                    ((wq8) krkVar).f.setText(stageSeriesFragment.D(with));
                    krk krkVar2 = stageSeriesFragment.l;
                    krkVar2.getClass();
                    ((wq8) krkVar2).g.c(i9, true);
                }
                return Unit.a;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                Set set = f5k.a;
                Context context2 = ((gai) obj2).b;
                context2.getClass();
                rv8 rv8Var = rv8.b;
                if (str2.equals(U3.i.l)) {
                    string = context2.getString(R.string.all);
                } else if (str2.equals("home")) {
                    string = context2.getString(R.string.home);
                } else if (str2.equals("away")) {
                    string = context2.getString(R.string.away);
                } else if (str2.equals(ip.c.a)) {
                    string = context2.getString(R.string.am_football_AFC_conference);
                } else if (str2.equals(ip.d.a)) {
                    string = context2.getString(R.string.am_football_NFC_conference);
                } else if (str2.equals(ip.e.a)) {
                    string = context2.getString(R.string.am_football_overall_standings);
                } else if (str2.equals(t52.c.a)) {
                    string = context2.getString(R.string.any_sport_conferences);
                } else if (str2.equals(t52.d.a)) {
                    string = context2.getString(R.string.any_sport_divisions);
                } else if (str2.equals(t52.e.a)) {
                    string = context2.getString(R.string.league);
                } else {
                    if (!str2.equals(t52.f.a)) {
                        ilg.c();
                        return str;
                    }
                    string = context2.getString(R.string.whole_season);
                }
                str = string;
                str.getClass();
                return str;
            case 10:
                StartActivity startActivity = (StartActivity) obj2;
                v8d v8dVar = (v8d) obj;
                int i10 = StartActivity.q;
                if (v8dVar instanceof t8d) {
                    startActivity.v(true, ((t8d) v8dVar).a);
                } else if (v8dVar instanceof s8d) {
                    txb e = new Regex(".*/competition/(\\d+)#tab:fantasy_leagues,joinCode:([A-Z0-9]{5})").e(((s8d) v8dVar).a);
                    if (e != null) {
                        String str3 = (String) ((sxb) e.a()).get(1);
                        String str4 = (String) ((sxb) e.a()).get(2);
                        Integer intOrNull = StringsKt.toIntOrNull(str3);
                        if (intOrNull != null) {
                            startActivity.q().h = new pv6(intOrNull.intValue(), str4);
                            z8e.x(startActivity, startActivity.q().g, new m1f(startActivity, r9, i2));
                            if (c5n.A(startActivity)) {
                                yv6 q = startActivity.q();
                                xw3.L(un0.z(q), null, null, new q3(q, r9, 25), 3);
                            } else {
                                boolean z4 = MainActivity.n0;
                                f8h.z(startActivity, fz8.C(fz8.J("FANTASY_UNSUPPORTED_COUNTRY_ERROR", true)), 4);
                                startActivity.finishAfterTransition();
                            }
                            unit = Unit.a;
                            break;
                        } else {
                            unit = null;
                            break;
                        }
                    }
                    boolean z5 = MainActivity.n0;
                    f8h.z(startActivity, null, 6);
                    startActivity.finishAfterTransition();
                } else {
                    startActivity.w();
                }
                if (!(v8dVar instanceof s8d)) {
                    startActivity.finishAfterTransition();
                }
                return Unit.a;
            case 11:
                ((Boolean) obj).getClass();
                obm obmVar = ((StoriesPlayerActivity) obj2).m;
                if (obmVar != null) {
                    obmVar.v();
                }
                return Unit.a;
            case 12:
                bhi bhiVar = (bhi) obj2;
                ibd ibdVar = (ibd) obj;
                bhiVar.m = ibdVar;
                if (Intrinsics.c(ibdVar, fbd.a) && bhiVar.l && (player = ((PlayerView) bhiVar.f.l).getPlayer()) != null) {
                    player.a();
                }
                return Unit.a;
            case 13:
                SurveyActivity surveyActivity = (SurveyActivity) obj2;
                Question question = (Question) obj;
                int i11 = SurveyActivity.L;
                if (question != null) {
                    surveyActivity.N().f.setText(question.getText());
                    surveyActivity.N().b.setVisibility(0);
                    surveyActivity.N().b.setEnabled(false);
                    String type = question.getType();
                    int hashCode = type.hashCode();
                    if (hashCode == -902265784) {
                        if (type.equals(C4435zd.d)) {
                            surveyActivity.N().d.setVisibility(0);
                            surveyActivity.N().c.setVisibility(8);
                            surveyActivity.N().e.setVisibility(8);
                            surveyActivity.N().d.removeAllViews();
                            surveyActivity.N().d.setOnCheckedChangeListener(new sr2(i3, surveyActivity, question));
                            List<String> answers = question.getAnswers();
                            if (answers == null) {
                                answers = km5.a;
                            }
                            for (String str5 : answers) {
                                View inflate = LayoutInflater.from(surveyActivity).inflate(R.layout.survey_radio, (ViewGroup) surveyActivity.N().d, false);
                                inflate.getClass();
                                RadioButton radioButton = (RadioButton) inflate;
                                radioButton.setText(str5);
                                surveyActivity.N().d.addView(radioButton);
                            }
                            surveyActivity.N().b.setOnClickListener(new eyd(23, surveyActivity, question));
                        }
                        surveyActivity.N().d.setVisibility(8);
                        surveyActivity.N().c.setVisibility(8);
                        surveyActivity.N().e.setVisibility(8);
                        surveyActivity.M(true, question.getId(), null, null);
                        surveyActivity.N().b.setOnClickListener(new eyd(23, surveyActivity, question));
                    } else if (hashCode != 3556653) {
                        if (hashCode == 653829648 && type.equals("multiple")) {
                            surveyActivity.N().d.setVisibility(8);
                            surveyActivity.N().c.setVisibility(0);
                            surveyActivity.N().e.setVisibility(8);
                            surveyActivity.N().c.removeAllViews();
                            List<String> answers2 = question.getAnswers();
                            if (answers2 == null) {
                                answers2 = km5.a;
                            }
                            for (String str6 : answers2) {
                                View inflate2 = LayoutInflater.from(surveyActivity).inflate(R.layout.survey_checkbox, (ViewGroup) surveyActivity.N().c, false);
                                inflate2.getClass();
                                CheckBox checkBox = (CheckBox) inflate2;
                                checkBox.setText(str6);
                                checkBox.setOnCheckedChangeListener(new fjf(2, surveyActivity, question));
                                surveyActivity.N().c.addView(checkBox);
                            }
                            surveyActivity.N().b.setOnClickListener(new eyd(23, surveyActivity, question));
                        }
                        surveyActivity.N().d.setVisibility(8);
                        surveyActivity.N().c.setVisibility(8);
                        surveyActivity.N().e.setVisibility(8);
                        surveyActivity.M(true, question.getId(), null, null);
                        surveyActivity.N().b.setOnClickListener(new eyd(23, surveyActivity, question));
                    } else {
                        if (type.equals("text")) {
                            surveyActivity.N().d.setVisibility(8);
                            surveyActivity.N().c.setVisibility(8);
                            surveyActivity.N().e.setVisibility(0);
                            TextInputEditText textInputEditText = surveyActivity.N().e;
                            Context context3 = textInputEditText.getContext();
                            context3.getClass();
                            InputMethodManager inputMethodManager = (InputMethodManager) context3.getSystemService(InputMethodManager.class);
                            if (inputMethodManager != null) {
                                inputMethodManager.showSoftInput(textInputEditText, 0);
                            }
                            surveyActivity.M(true, question.getId(), null, "text");
                            surveyActivity.N().b.setOnClickListener(new eyd(23, surveyActivity, question));
                        }
                        surveyActivity.N().d.setVisibility(8);
                        surveyActivity.N().c.setVisibility(8);
                        surveyActivity.N().e.setVisibility(8);
                        surveyActivity.M(true, question.getId(), null, null);
                        surveyActivity.N().b.setOnClickListener(new eyd(23, surveyActivity, question));
                    }
                } else {
                    surveyActivity.finish();
                }
                return Unit.a;
            case 14:
                ((Float) obj).getClass();
                return Float.valueOf(((kx4) obj2).H0(56.0f));
            case 15:
                TVScheduleActivity tVScheduleActivity = (TVScheduleActivity) obj2;
                Pair pair = (Pair) obj;
                int i12 = TVScheduleActivity.O;
                List list2 = (List) pair.a;
                int intValue = ((Number) pair.b).intValue();
                if (!list2.isEmpty()) {
                    NewChannelsDialog newChannelsDialog = new NewChannelsDialog();
                    newChannelsDialog.setArguments(fz8.C(fz8.D(intValue, "TOTAL_SELECTED_CHANNELS"), fz8.G("NEW_CHANNELS", list2.toArray(new TvChannel[0]))));
                    newChannelsDialog.p(tVScheduleActivity.k(), "NewChannelsDialog");
                }
                return Unit.a;
            case 16:
                TVScheduleFragment tVScheduleFragment = (TVScheduleFragment) obj2;
                Map map = (Map) obj;
                if (tVScheduleFragment.getActivity() == null || !tVScheduleFragment.isAdded()) {
                    return Unit.a;
                }
                map.getClass();
                Object obj4 = map.get((Calendar) tVScheduleFragment.t.getValue());
                Object obj5 = obj4;
                if (obj4 == null) {
                    obj5 = km5.a;
                }
                List list3 = (List) obj5;
                View view = tVScheduleFragment.u;
                if (view != null) {
                    view.setVisibility(list3.isEmpty() ? 0 : 8);
                }
                ((csi) tVScheduleFragment.s.getValue()).F(list3);
                krk krkVar3 = tVScheduleFragment.l;
                krkVar3.getClass();
                ((sq8) krkVar3).c.scrollToPosition(0);
                return Unit.a;
            case 17:
                s8 s8Var = (s8) obj2;
                Enum r1 = (Enum) obj;
                r1.getClass();
                return Boolean.valueOf(q5a.K(s8Var.j, s8Var.D(r1)));
            case 18:
                TeamEventsCalendarMonthPickerBottomSheet teamEventsCalendarMonthPickerBottomSheet = (TeamEventsCalendarMonthPickerBottomSheet) obj2;
                YearMonth yearMonth = (YearMonth) obj;
                yearMonth.getClass();
                ((xwi) teamEventsCalendarMonthPickerBottomSheet.D.getValue()).m(yearMonth);
                teamEventsCalendarMonthPickerBottomSheet.j();
                return Unit.a;
            case 19:
                ((View) obj).getClass();
                ((TeamEventsFragment) obj2).H();
                return Unit.a;
            case 20:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                ha5.X0(ha5Var, (b20) obj2, hkg.d(4294966304L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                return Unit.a;
            case 21:
                int intValue2 = ((Integer) obj).intValue();
                int i13 = TeamRecentFormView.l;
                wxf wxfVar = EventActivity.h0;
                Context context4 = ((TeamRecentFormView) obj2).getContext();
                context4.getClass();
                wxf.B(context4, intValue2, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 22:
                d2j d2jVar = (d2j) obj;
                d2jVar.getClass();
                return d2j.a(d2jVar, ((g1j) ((h1j) obj2)).a, null, 5);
            case 23:
                TeamTransfersModal teamTransfersModal = (TeamTransfersModal) obj2;
                p3j p3jVar = (p3j) obj;
                SegmentedButtonsView segmentedButtonsView = teamTransfersModal.D;
                if (segmentedButtonsView != null) {
                    SegmentedButtonsView segmentedButtonsView2 = segmentedButtonsView.getHeaderTypes().isEmpty() ? segmentedButtonsView : null;
                    if (segmentedButtonsView2 != null) {
                        String string2 = teamTransfersModal.getString(R.string.arrivals);
                        string2.getClass();
                        s1h s1hVar = new s1h("true", string2, p3jVar.a);
                        String string3 = teamTransfersModal.getString(R.string.departures);
                        string3.getClass();
                        List j = b.j(s1hVar, new s1h("false", string3, p3jVar.b));
                        segmentedButtonsView2.s(j, (String) ((s1h) j.get(!p3jVar.a ? 1 : 0)).a, true);
                    }
                }
                ((rvj) teamTransfersModal.C.getValue()).G(p3jVar.c);
                return Unit.a;
            case 24:
                Drawable drawable = (Drawable) obj2;
                ha5 ha5Var2 = (ha5) obj;
                uj2 t = ha5Var2.L0().t();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (ha5Var2.n() >> 32)), (int) Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)));
                drawable.draw(xx.b(t));
                return Unit.a;
            case 25:
                ((Function1) obj).invoke((d8j) obj2);
                return Unit.a;
            case 26:
                g2i g2iVar = (g2i) obj2;
                jyj jyjVar = (jyj) obj;
                if (jyjVar instanceof nh) {
                    g2iVar.invoke(((nh) jyjVar).o);
                    return Boolean.TRUE;
                }
                a70.r("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 27:
                r9j r9jVar = (r9j) obj2;
                dma dmaVar = (dma) obj;
                oqf oqfVar = (oqf) r9jVar.u.x.getValue();
                if (oqfVar == null) {
                    oqfVar = oqf.e;
                }
                dma e2 = r9jVar.s.e();
                if (e2 != null) {
                    return u6h.V(oqfVar, e2, dmaVar);
                }
                u3a.d("Required value was null.");
                pvd.x();
                return null;
            case 28:
                ClipDescription clipDescription = ((a85) obj).a.getClipDescription();
                Iterable<aec> iterable = (Iterable) ((w9j) obj2).invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (aec aecVar : iterable) {
                        if (Intrinsics.c(aecVar, aec.c) || (clipDescription != null && clipDescription.hasMimeType(aecVar.a))) {
                            r8 = true;
                        }
                    }
                }
                return Boolean.valueOf(r8);
            default:
                mbj mbjVar = (mbj) obj2;
                float floatValue = ((Float) obj).floatValue();
                xnh xnhVar = mbjVar.a;
                float h = xnhVar.h() + floatValue;
                xnh xnhVar2 = mbjVar.b;
                if (h > xnhVar2.h()) {
                    floatValue = xnhVar2.h() - xnhVar.h();
                } else if (h < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    floatValue = -xnhVar.h();
                }
                xnhVar.i(xnhVar.h() + floatValue);
                return Float.valueOf(floatValue);
        }
    }

    public /* synthetic */ g2i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
