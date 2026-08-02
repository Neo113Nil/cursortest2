package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.webkit.WebSettings;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.impl.foreground.SystemForegroundService;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.ads.AdError;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.ironsource.C4427z5;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.dialog.ProposeFollowEntityDialog;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.bottomSheet.EventPlayerOfTheMatchVoteBottomSheet;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.event.dialog.PenaltyHistoryBottomSheet;
import com.sofascore.results.fantasy.comparison.FantasyPlayerComparisonActivity;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.service.PlayerOfTheMatchVoteWorker;
import com.sofascore.results.stagesport.fragments.category.StageCategoryOddsFragment;
import com.sofascore.results.stagesport.fragments.odds.StageOddsFragment;
import com.sofascore.results.team.details.TeamDetailsFragment;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class m61 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m61(dfh dfhVar, ku3 ku3Var, q50 q50Var, Function0 function0) {
        this.a = 16;
        this.c = dfhVar;
        this.b = ku3Var;
        this.d = q50Var;
        this.e = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x04d6, code lost:
    
        if (r14 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0669, code lost:
    
        if (r14 == null) goto L201;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        r9k r9kVar;
        Object obj;
        String str2;
        Unit showCompleted$lambda$12;
        v5i v5iVar;
        v5i v5iVar2;
        String str3;
        String str4;
        int i = 18;
        int i2 = 3;
        r4 = false;
        boolean z = false;
        int i3 = 1;
        rq3 rq3Var = null;
        rq3Var = null;
        switch (this.a) {
            case 0:
                ku3 ku3Var = (ku3) this.b;
                e1d e1dVar = (e1d) this.c;
                n29 n29Var = (n29) this.d;
                Function1 function1 = (Function1) this.e;
                if (!((Boolean) e1dVar.getValue()).booleanValue()) {
                    e1dVar.setValue(Boolean.TRUE);
                    xw3.L(ku3Var, null, null, new l0(n29Var, function1, rq3Var, 26), 3);
                }
                return Unit.a;
            case 1:
                nv.q((Context) this.b, (Integer) this.c, (BrandLocation) this.d, ((w22) this.e).b, BrandType.STRIPE);
                return Unit.a;
            case 2:
                ((Function1) ((z02) this.b).f).invoke(new x33((TextView) ((xz0) this.c).i, (Player) this.d, (Player) this.e));
                return Unit.a;
            case 3:
                CupTreeBlock cupTreeBlock = (CupTreeBlock) this.b;
                j84 j84Var = (j84) this.c;
                Integer num = (Integer) this.d;
                Function1 function12 = (Function1) this.e;
                List<Integer> events = cupTreeBlock.getEvents();
                if (events != null) {
                    if (events.size() == 1) {
                        wxf wxfVar = EventActivity.h0;
                        Context context = j84Var.getContext();
                        context.getClass();
                        wxf.B(context, events.get(0).intValue(), null, null, null, num, 60);
                    } else if (events.size() > 1) {
                        function12.invoke(events);
                    }
                }
                return Unit.a;
            case 4:
                EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = (EventPlayerOfTheMatchVoteBottomSheet) this.b;
                mte mteVar = (mte) this.d;
                znh znhVar = (znh) this.e;
                e1d e1dVar2 = (e1d) this.c;
                Context requireContext = eventPlayerOfTheMatchVoteBottomSheet.requireContext();
                requireContext.getClass();
                joa joaVar = eventPlayerOfTheMatchVoteBottomSheet.x;
                int intValue = ((Number) joaVar.getValue()).intValue();
                long longValue = ((Number) eventPlayerOfTheMatchVoteBottomSheet.y.getValue()).longValue();
                int i4 = mteVar.a;
                Pair[] pairArr = {new Pair("EVENT_ID", Integer.valueOf(intValue)), new Pair("EVENT_TIMESTAMP", Long.valueOf(longValue)), new Pair("PLAYER_ID", Integer.valueOf(i4))};
                hpo hpoVar = new hpo(18);
                for (int i5 = 0; i5 < 3; i5++) {
                    Pair pair = pairArr[i5];
                    hpoVar.B(pair.b, (String) pair.a);
                }
                md4 l = hpoVar.l();
                ktd g = vxd.g(PlayerOfTheMatchVoteWorker.class, l);
                if (Build.VERSION.SDK_INT >= 31) {
                    pwd pwdVar = pwd.a;
                    g.e();
                }
                vxd.h(requireContext).b("PlayerOfTheMatchVoteWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
                znhVar.i(i4);
                Context requireContext2 = eventPlayerOfTheMatchVoteBottomSheet.requireContext();
                requireContext2.getClass();
                nv.H(i4, lv.EVENT_DETAILS, requireContext2, "POTMVote");
                eventPlayerOfTheMatchVoteBottomSheet.getParentFragmentManager().h0(fz8.C(fz8.D(i4, "RESULT_VOTED_PLAYER_ID")), ljg.j(((Number) joaVar.getValue()).intValue(), "PLAYER_OF_THE_MATCH_VOTE_REQUEST_"));
                e1dVar2.setValue(null);
                eventPlayerOfTheMatchVoteBottomSheet.j();
                return Unit.a;
            case 5:
                String str5 = (String) this.b;
                String str6 = (String) this.d;
                e1d e1dVar3 = (e1d) this.c;
                e1d e1dVar4 = (e1d) this.e;
                if (!StringsKt.R((String) e1dVar3.getValue()) && (!Intrinsics.c((String) e1dVar3.getValue(), str5) || !Intrinsics.c((String) e1dVar4.getValue(), str6))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                Context context2 = (Context) this.b;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) this.c;
                ev6 ev6Var = (ev6) this.d;
                mj7 mj7Var = (mj7) this.e;
                nv.A(context2, "player_compare", "player_modal");
                int i6 = FantasyPlayerComparisonActivity.L;
                ml4.p0(context2, ev6Var.c, mj7Var.a, Integer.valueOf(fantasyRoundPlayerUiModel.a), ev6Var.A);
                return Unit.a;
            case 7:
                ComponentActivity componentActivity = (ComponentActivity) this.b;
                wb7 wb7Var = (wb7) this.d;
                k7d k7dVar = (k7d) this.e;
                e1d e1dVar5 = (e1d) this.c;
                nv.A(componentActivity, "discard_team", null);
                wb7Var.u(false);
                if (((Boolean) e1dVar5.getValue()).booleanValue()) {
                    componentActivity.finish();
                } else if (!k7dVar.d()) {
                    componentActivity.finish();
                }
                return Unit.a;
            case 8:
                FeaturedOddsView featuredOddsView = (FeaturedOddsView) this.b;
                xmd xmdVar = (xmd) this.c;
                fgf fgfVar = (fgf) this.d;
                String str7 = (String) this.e;
                int i7 = FeaturedOddsView.p;
                Context context3 = featuredOddsView.getContext();
                context3.getClass();
                String str8 = xmdVar.c.b;
                OddsCountryProvider oddsCountryProvider = xmdVar.b;
                if (fgfVar != null && (r9kVar = fgfVar.b) != null) {
                    Context context4 = featuredOddsView.getContext();
                    context4.getClass();
                    str = r9kVar.b(context4);
                    break;
                }
                str = "-";
                nv.c0(context3, str8, oddsCountryProvider, str, xmdVar.c.a, featuredOddsView.getLocation(), str7);
                return Unit.a;
            case 9:
                av8 av8Var = (av8) this.b;
                hn2 hn2Var = (hn2) this.c;
                ilh ilhVar = (ilh) this.d;
                twc twcVar = (twc) this.e;
                pf3 pf3Var = av8Var.M;
                hn2 hn2Var2 = pf3Var.b;
                try {
                    pf3Var.b = hn2Var;
                    ilh ilhVar2 = av8Var.G;
                    int[] iArr = av8Var.o;
                    uzc uzcVar = av8Var.v;
                    av8Var.o = null;
                    av8Var.v = null;
                    try {
                        av8Var.G = ilhVar;
                        boolean z2 = pf3Var.e;
                        try {
                            pf3Var.e = false;
                            av8Var.F(twcVar.a, twcVar.g, twcVar.b, true);
                            pf3Var.e = z2;
                            Unit unit = Unit.a;
                            av8Var.G = ilhVar2;
                            av8Var.o = iArr;
                            av8Var.v = uzcVar;
                            pf3Var.b = hn2Var2;
                            return Unit.a;
                        } catch (Throwable th) {
                            pf3Var.e = z2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        av8Var.G = ilhVar2;
                        av8Var.o = iArr;
                        av8Var.v = uzcVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    pf3Var.b = hn2Var2;
                    throw th3;
                }
            case 10:
                Context context5 = (Context) this.b;
                h0a h0aVar = (h0a) this.c;
                kae kaeVar = (kae) this.d;
                Gender gender = (Gender) this.e;
                if (h0aVar.m == oz9.GoalDetails) {
                    obj = dy0.y(kaeVar.a, kaeVar.c, kaeVar.d, h0aVar.a, "IncidentGoalDetailsModal", gender);
                } else {
                    gv9 gv9Var = kaeVar.a;
                    int i8 = kaeVar.d;
                    int i9 = kaeVar.c;
                    int id = ((FootballPassingNetworkSegment) CollectionsKt.h0(gv9Var)).getPlayer().getId();
                    Player goalkeeper = ((FootballPassingNetworkSegment) CollectionsKt.h0(kaeVar.a)).getGoalkeeper();
                    Integer valueOf = goalkeeper != null ? Integer.valueOf(goalkeeper.getId()) : null;
                    boolean z3 = h0aVar.a;
                    int i10 = z3 ? i9 : i8;
                    if (!z3) {
                        i8 = i9;
                    }
                    Integer valueOf2 = Integer.valueOf(i8);
                    PenaltyHistoryBottomSheet penaltyHistoryBottomSheet = new PenaltyHistoryBottomSheet();
                    penaltyHistoryBottomSheet.setArguments(fz8.C(fz8.D(id, "takerPlayerId"), fz8.G("goalkeeperPlayerId", valueOf), fz8.D(i10, "takerTeamId"), fz8.G("goalkeeperTeamId", valueOf2)));
                    obj = penaltyHistoryBottomSheet;
                }
                context5.getClass();
                if (context5 instanceof csk) {
                    context5 = ((csk) context5).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context5 instanceof AppCompatActivity ? (AppCompatActivity) context5 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(obj, appCompatActivity, rq3Var, i2));
                }
                return Unit.a;
            case 11:
                Number number = (Number) this.b;
                f2a f2aVar = (f2a) this.c;
                Number number2 = (Number) this.d;
                e2a e2aVar = (e2a) this.e;
                if (!number.equals(f2aVar.a) || !number2.equals(f2aVar.b)) {
                    f2aVar.a = number;
                    f2aVar.b = number2;
                    f2aVar.e = new vti(e2aVar, f2aVar.c, number, number2, null);
                    ((eoh) f2aVar.i.b).setValue(Boolean.TRUE);
                    f2aVar.f = false;
                    f2aVar.g = true;
                }
                return Unit.a;
            case 12:
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) this.b;
                bu7 bu7Var = (bu7) this.c;
                xmd xmdVar2 = (xmd) this.d;
                and andVar = (and) this.e;
                Context requireContext3 = leagueDetailsFragment.requireContext();
                requireContext3.getClass();
                String type = bu7Var.a.getStatus().getType();
                OddsCountryProvider oddsCountryProvider2 = xmdVar2.b;
                r9k r9kVar2 = andVar.b.b;
                if (r9kVar2 != null) {
                    Context requireContext4 = leagueDetailsFragment.requireContext();
                    requireContext4.getClass();
                    str2 = r9kVar2.b(requireContext4);
                    break;
                }
                str2 = "-";
                nv.c0(requireContext3, type, oddsCountryProvider2, str2, bu7Var.a.getId(), vmd.LEAGUE_DETAILS, null);
                return Unit.a;
            case 13:
                showCompleted$lambda$12 = LegacyShowUseCase.showCompleted$lambda$12((Listeners) this.b, (String) this.c, (ShowStatus) this.d, (LegacyShowUseCase) this.e);
                return showCompleted$lambda$12;
            case 14:
                v5b v5bVar = (v5b) this.b;
                de0 de0Var = (de0) this.c;
                String str9 = (String) this.d;
                y8 y8Var = (y8) this.e;
                k1l k1lVar = v5bVar.a;
                ida idaVar = new ida(y8Var, 15);
                k1lVar.getClass();
                k1lVar.d = idaVar;
                WebSettings settings = k1lVar.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setCacheMode(-1);
                k1lVar.addJavascriptInterface(k1lVar.f, "YouTubePlayerBridge");
                k1lVar.addJavascriptInterface(k1lVar.b, "YouTubePlayerCallbacks");
                InputStream openRawResource = k1lVar.getResources().openRawResource(R.raw.ayp_youtube_player);
                openRawResource.getClass();
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, C4427z5.O));
                        ArrayList arrayList = new ArrayList();
                        d7a.u(bufferedReader, new s80(arrayList, 6));
                        String f0 = CollectionsKt.f0(arrayList, "\n", null, null, null, 62);
                        openRawResource.close();
                        String r = c.r(c.r(f0, "<<injectedVideoId>>", str9 != null ? dmi.j('\'', "'", str9) : AdError.UNDEFINED_DOMAIN, false), "<<injectedPlayerVars>>", de0Var.toString(), false);
                        String string = ((JSONObject) de0Var.b).getString("origin");
                        string.getClass();
                        k1lVar.loadDataWithBaseURL(string, r, "text/html", C4427z5.O, null);
                        k1lVar.setWebChromeClient(new j1l(k1lVar));
                        return Unit.a;
                    } catch (Exception unused) {
                        throw new RuntimeException("Can't parse HTML file.");
                    }
                } finally {
                }
            case 15:
                dfh dfhVar = (dfh) this.b;
                g0i g0iVar = (g0i) this.c;
                g0i g0iVar2 = (g0i) this.d;
                g0i g0iVar3 = (g0i) this.e;
                dfhVar.e = g0iVar;
                dfhVar.f = g0iVar2;
                dfhVar.c = g0iVar3;
                return Unit.a;
            case 16:
                dfh dfhVar2 = (dfh) this.c;
                ku3 ku3Var2 = (ku3) this.b;
                q50 q50Var = (q50) this.d;
                Function0 function0 = (Function0) this.e;
                if (((efh) ((eoh) ((e1d) dfhVar2.d.c)).getValue()) == efh.b) {
                    if (dfhVar2.d.g().a.containsKey(efh.c)) {
                        xw3.L(ku3Var2, null, null, new w07(q50Var, rq3Var, i2), 3);
                        xw3.L(ku3Var2, null, null, new u87(dfhVar2, rq3Var, 4), 3);
                        return Unit.a;
                    }
                }
                xw3.L(ku3Var2, null, null, new u87(dfhVar2, rq3Var, 5), 3).n(new ma0(11, function0));
                return Unit.a;
            case 17:
                ProposeFollowEntityDialog proposeFollowEntityDialog = (ProposeFollowEntityDialog) this.b;
                qef qefVar = (qef) this.c;
                nr1 nr1Var = (nr1) this.d;
                s01 s01Var = (s01) this.e;
                proposeFollowEntityDialog.t(qefVar, av.CLOSE, false, ((MaterialCheckBox) nr1Var.f).isChecked());
                s01Var.dismiss();
                return Unit.a;
            case 18:
                o8d o8dVar = (o8d) this.b;
                urg urgVar = (urg) this.c;
                List list = (List) this.d;
                List list2 = (List) this.e;
                ((eoh) o8dVar.c).setValue(urgVar);
                ((eoh) o8dVar.b).setValue(list);
                ((eoh) o8dVar.d).setValue(list2);
                return Unit.a;
            case 19:
                bxg bxgVar = (bxg) this.b;
                List list3 = (List) this.c;
                String str10 = (String) this.d;
                hwg hwgVar = (hwg) this.e;
                return new owg(bxgVar.e, bxgVar.f, list3, str10, hwgVar, null, hwgVar.a);
            case 20:
                Function1 function13 = (Function1) this.e;
                e1d e1dVar6 = (e1d) this.c;
                wd8 wd8Var = (wd8) this.b;
                e1d e1dVar7 = (e1d) this.d;
                e1dVar6.setValue(Boolean.TRUE);
                function13.invoke(null);
                wd8.a(wd8Var);
                e1dVar7.setValue(Boolean.FALSE);
                return Unit.a;
            case 21:
                xw3.L((ku3) this.b, null, null, new u87((dfh) this.d, rq3Var, 13), 3).n(new aaf(i, (Function0) this.e, (e1d) this.c));
                return Unit.a;
            case 22:
                StageCategoryOddsFragment stageCategoryOddsFragment = (StageCategoryOddsFragment) this.b;
                Stage stage = (Stage) this.c;
                b6i b6iVar = (b6i) this.d;
                f6i f6iVar = (f6i) this.e;
                Context requireContext5 = stageCategoryOddsFragment.requireContext();
                requireContext5.getClass();
                String statusType = stage.getStatusType();
                OddsCountryProvider oddsCountryProvider3 = (OddsCountryProvider) CollectionsKt.Y(stageCategoryOddsFragment.D().f.c());
                ServerType serverType = (ServerType) CollectionsKt.Y(b6iVar.b);
                switch (serverType != null ? y5i.a[serverType.ordinal()] : -1) {
                    case 1:
                    case 2:
                        v5iVar = v5i.Practice;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        v5iVar = v5i.Qualifying;
                        break;
                    case 7:
                    default:
                        v5iVar = v5i.Race;
                        break;
                    case 8:
                        v5iVar = v5i.Season;
                        break;
                }
                nv.c0(requireContext5, statusType, oddsCountryProvider3, v5iVar.a, stage.getId(), f6iVar.g, null);
                return Unit.a;
            case 23:
                StageOddsFragment stageOddsFragment = (StageOddsFragment) this.b;
                Stage stage2 = (Stage) this.c;
                b6i b6iVar2 = (b6i) this.d;
                f6i f6iVar2 = (f6i) this.e;
                Context requireContext6 = stageOddsFragment.requireContext();
                requireContext6.getClass();
                String statusType2 = stage2.getStatusType();
                OddsCountryProvider oddsCountryProvider4 = (OddsCountryProvider) CollectionsKt.Y(stageOddsFragment.D().f.c());
                ServerType serverType2 = (ServerType) CollectionsKt.Y(b6iVar2.b);
                switch (serverType2 != null ? y5i.a[serverType2.ordinal()] : -1) {
                    case 1:
                    case 2:
                        v5iVar2 = v5i.Practice;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        v5iVar2 = v5i.Qualifying;
                        break;
                    case 7:
                    default:
                        v5iVar2 = v5i.Race;
                        break;
                    case 8:
                        v5iVar2 = v5i.Season;
                        break;
                }
                nv.c0(requireContext6, statusType2, oddsCountryProvider4, v5iVar2.a, stage2.getId(), f6iVar2.g, null);
                return Unit.a;
            case 24:
                cai caiVar = (cai) this.b;
                Function1 function14 = (Function1) this.e;
                e1d e1dVar8 = (e1d) this.c;
                e1d e1dVar9 = (e1d) this.d;
                e1dVar8.setValue(caiVar);
                e1dVar9.setValue(Boolean.FALSE);
                function14.invoke((cai) e1dVar8.getValue());
                return Unit.a;
            case 25:
                return new epi((fpi) this.b, (kx4) this.c, (Function1) this.e, (Function1) this.d);
            case 26:
                and andVar2 = (and) this.b;
                TeamDetailsFragment teamDetailsFragment = (TeamDetailsFragment) this.c;
                Event event = ((bu7) this.d).a;
                xmd xmdVar3 = (xmd) this.e;
                fgf fgfVar2 = andVar2.b;
                r9k r9kVar3 = fgfVar2.b;
                if (r9kVar3 != null) {
                    Context requireContext7 = teamDetailsFragment.requireContext();
                    requireContext7.getClass();
                    ?? b = r9kVar3.b(requireContext7);
                    if (b != null) {
                        rq3Var = (fgfVar2.f != ProviderOdds.Type.HANDICAP || (str3 = fgfVar2.g) == null) ? b : StringsKt.l0(((String) b) + " " + str3).toString();
                    }
                }
                Context requireContext8 = teamDetailsFragment.requireContext();
                requireContext8.getClass();
                String type2 = event.getStatus().getType();
                OddsCountryProvider oddsCountryProvider5 = xmdVar3.b;
                Object obj2 = rq3Var;
                if (rq3Var == null) {
                    obj2 = "-";
                }
                nv.c0(requireContext8, type2, oddsCountryProvider5, obj2, event.getId(), vmd.TEAM_DETAILS, null);
                return Unit.a;
            case 27:
                w3l w3lVar = (w3l) this.b;
                int i11 = w3lVar.c;
                sn3 sn3Var = (sn3) this.c;
                Function0 function02 = (Function0) this.d;
                if (((Boolean) ((cdi) this.e).getValue()).booleanValue() || (w3lVar.b == 0 && i11 > 0)) {
                    long j = w3lVar.a.b.c;
                    sn3Var.e = Integer.valueOf(i11);
                    sn3Var.f = Long.valueOf(j);
                    rn3 rn3Var = new rn3(sn3Var, i3);
                    BillingClient billingClient = sn3Var.g;
                    if (billingClient != null) {
                        if (sn3Var.h) {
                            rn3Var.invoke();
                        } else if (billingClient == null || !billingClient.isReady()) {
                            BillingClient billingClient2 = sn3Var.g;
                            if (billingClient2 != null) {
                                billingClient2.startConnection(new z41(16, sn3Var, rn3Var));
                            }
                        } else {
                            rn3Var.invoke();
                        }
                    }
                } else {
                    function02.invoke();
                }
                return Unit.a;
            case 28:
                pbl pblVar = (pbl) this.b;
                UUID uuid = (UUID) this.c;
                gm8 gm8Var = (gm8) this.d;
                Context context6 = (Context) this.e;
                String uuid2 = uuid.toString();
                lcl e = pblVar.c.e(uuid2);
                if (e == null || e.b.d()) {
                    a70.r("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    g8f g8fVar = pblVar.b;
                    synchronized (g8fVar.k) {
                        try {
                            rik.o().getClass();
                            gdl gdlVar = (gdl) g8fVar.g.remove(uuid2);
                            if (gdlVar != null) {
                                if (g8fVar.a == null) {
                                    PowerManager.WakeLock a = ozk.a(g8fVar.b);
                                    g8fVar.a = a;
                                    a.acquire();
                                }
                                g8fVar.f.put(uuid2, gdlVar);
                                g8fVar.b.startForegroundService(vqi.b(g8fVar.b, rha.p(gdlVar.a), gm8Var));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    qbl p = rha.p(e);
                    int i12 = vqi.k;
                    Intent intent = new Intent(context6, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", gm8Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gm8Var.b);
                    intent.putExtra("KEY_NOTIFICATION", gm8Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", p.a);
                    intent.putExtra("KEY_GENERATION", p.b);
                    context6.startService(intent);
                }
                return null;
            default:
                Function1 function15 = (Function1) this.e;
                xel xelVar = (xel) this.b;
                and andVar3 = (and) this.c;
                Context context7 = (Context) this.d;
                wn1 wn1Var = xelVar.a;
                String str11 = wn1Var.q;
                r9k r9kVar4 = andVar3.b.b;
                if (r9kVar4 == null || (str4 = r9kVar4.b(context7)) == null) {
                    str4 = "Full time";
                }
                function15.invoke(new cil(str11, str4, wn1Var.a));
                return Unit.a;
        }
    }

    public /* synthetic */ m61(cai caiVar, Function1 function1, e1d e1dVar, e1d e1dVar2) {
        this.a = 24;
        this.b = caiVar;
        this.e = function1;
        this.c = e1dVar;
        this.d = e1dVar2;
    }

    public /* synthetic */ m61(fpi fpiVar, kx4 kx4Var, Function1 function1, Function1 function12) {
        this.a = 25;
        this.b = fpiVar;
        this.c = kx4Var;
        this.e = function1;
        this.d = function12;
    }

    public /* synthetic */ m61(Object obj, Object obj2, Object obj3, e1d e1dVar, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = e1dVar;
    }

    public /* synthetic */ m61(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ m61(String str, String str2, e1d e1dVar, e1d e1dVar2) {
        this.a = 5;
        this.b = str;
        this.d = str2;
        this.c = e1dVar;
        this.e = e1dVar2;
    }

    public /* synthetic */ m61(Function1 function1, e1d e1dVar, wd8 wd8Var, e1d e1dVar2) {
        this.a = 20;
        this.e = function1;
        this.c = e1dVar;
        this.b = wd8Var;
        this.d = e1dVar2;
    }

    public /* synthetic */ m61(Function1 function1, xel xelVar, and andVar, Context context) {
        this.a = 29;
        this.e = function1;
        this.b = xelVar;
        this.c = andVar;
        this.d = context;
    }
}
