package defpackage;

import androidx.compose.runtime.e;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.model.Colors;
import com.sofascore.model.Sports;
import com.sofascore.model.buzzer.NewBuzzerTilesResponse;
import com.sofascore.model.crowdsourcing.MyContributionsResponse;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.NationalTeamStatisticsData;
import com.sofascore.model.newNetwork.NationalTeamStatisticsResponse;
import com.sofascore.model.newNetwork.NetworkUserSegmentation;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.model.newNetwork.commentary.NotableAction;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.unity3d.ads.BuildConfig;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ivc implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ivc(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = MonthlyUniqueTournamentItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = MonthlyUniqueTournamentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                _childSerializers$_anonymous_3 = MyContributionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 3:
                _childSerializers$_anonymous_4 = NationalTeamStatisticsData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 4:
                _childSerializers$_anonymous_5 = NationalTeamStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 5:
                return Unit.a;
            case 6:
                return new sqg();
            case 7:
                l3a l3aVar = new l3a(0);
                l3aVar.a(duf.a.getOrCreateKotlinClass(e6d.class), new clc(20));
                return l3aVar.b();
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return ff2.a;
            case 12:
                return w9k.a;
            case 13:
                _childSerializers$_anonymous_6 = NetworkUserSegmentation._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 14:
                _childSerializers$_anonymous_7 = NewBuzzerTilesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 15:
                return new ecd(1, "Greatest Rivalries in Football – Superclásico (Boca Juniors vs. River Plate) ", null, 1747828536L, "", "https://i.dailymail.co.uk/1s/2025/05/21/09/98598375-0-image-a-5_1747815523463.jpg", new NewsProvider(1, "Daily Mail"));
            case 16:
                return new OddsCountryProvider(new OddsProvider(1, "bet365", "bet365", new Colors("#017b5b", null, null), "https://www.bet365.com/olp/open-account?affiliate=365_01301314", "international", null, null), true, BuildConfig.FLAVOR, "https://www.bet365.com/dl/sportsbookredirect/?affiliate=365_842809&bs={parent.fid}-{sourceId}~{fractionalValue}~10&bet=1, betSlipLink=https://www.bet365.com/dl/sportsbookredirect/?affiliate=365_842809&bs={parent.fid}-{sourceId}~{fractionalValue}~10&bet=1, group=1, fallbackProvider=null, oddsOffset=null, impressionCostEncrypted=7n 7x39qJbXaYXFf3uiVAclDZm1t30tWtA==, sort=1, weight=100, oddsMayDiffer=null, signupLink=null", "https://www.bet365.com/dl/sportsbookredirect/?affiliate=365_842809&bs={parent.fid}-{sourceId}~{fractionalValue}~10&bet=1", null, null, null, null, null, 100, null, null, null, null, null);
            case 17:
                OddsChoice oddsChoice = new OddsChoice("23 / 20", "6 / 5", (Integer) 3517679, "1", (String) null, false, -1, (String) null, (Team) null, (Integer) null, 768, (DefaultConstructorMarker) null);
                Object[] objArr = null == true ? 1 : 0;
                Object[] objArr2 = null == true ? 1 : 0;
                Integer num = null;
                return new ProviderOdds(1985171216, 168936340, false, null, "Full time", 1, 1, 168936340, b.j(oddsChoice, new OddsChoice("5 / 2", "13 / 5", (Integer) 3517682, "X", (String) null, false, -1, (String) objArr, (Team) objArr2, (Integer) null, 768, (DefaultConstructorMarker) null), new OddsChoice("21 / 10", "2 / 1", (Integer) 3517683, "2", (String) null, false, 1, (String) (null == true ? 1 : 0), (Team) (null == true ? 1 : 0), num, 768, (DefaultConstructorMarker) null)), "Double chance", "Full time", null, null);
            case 18:
                return new FeaturedOddsWithProvider((OddsCountryProvider) ded.a.getValue(), (ProviderOdds) ded.b.getValue());
            case 19:
                _childSerializers$_anonymous_8 = NotableAction._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 20:
                return new vfd((b7) ufd.a.getValue(), 28);
            case 21:
                return l6g.K(new ghd("", (r9k) new q9k(R.string.weekly_challenge), (r9k) new q9k(R.string.deadlines_reminders_results), R.drawable.ic_trophy_16, true, true), new ghd("", (r9k) new q9k(R.string.weekly_challenge), (r9k) new q9k(R.string.deadlines_reminders_results), R.drawable.ic_trophy_16, false, true), new ghd("", (r9k) new q9k(R.string.weekly_challenge), (r9k) new q9k(R.string.deadlines_reminders_results), R.drawable.ic_trophy_16, true, false), new ghd("", new q9k(R.string.weekly_challenge), (q9k) null, R.drawable.ic_trophy_16, false, 4), new ghd("", (r9k) new q9k(R.string.weekly_challenge), (r9k) new q9k(R.string.deadlines_reminders_results), R.drawable.ic_trophy_16, true, true));
            case 22:
                return e.f(Boolean.FALSE);
            case 23:
                ia0 ia0Var = ia0.q;
                lzf lzfVar = (lzf) fz8.Q(lzf.class, ok3.p());
                lzfVar.getClass();
                return new yhd(((AppDatabase) ((mc4) lzfVar).z.get()).m());
            case 24:
                return b.j(new bsh("channel_score", R.string.score, 4, R.raw.notification_sound_score), new bsh("channel_start_finish", R.string.start_finish, 3, R.raw.notification_sound_start_finish), new bsh("channel_info", R.string.info, 3, R.raw.notification_sound_info), new bsh("channel_text_to_speech", R.string.background_service, 2, R.raw.notification_sound_info));
            case 25:
                return new unb(new hhd(l6g.K(new fhd(Sports.FOOTBALL, new q9k(R.string.football), null, new m9k("5/7"), R.drawable.ic_football), new fhd(Sports.TENNIS, new q9k(R.string.tennis), null, new m9k("5/7"), R.drawable.ic_tennis), new fhd(Sports.BASKETBALL, new q9k(R.string.basketball), null, new m9k("5/7"), R.drawable.ic_basketball), new fhd(Sports.AMERICAN_FOOTBALL, new q9k(R.string.american_football), null, new m9k("5/7"), R.drawable.ic_american_football), new fhd(Sports.BASEBALL, new q9k(R.string.baseball), null, new m9k("5/7"), R.drawable.ic_baseball), new fhd(Sports.MOTORSPORT, new q9k(R.string.motorsport), null, new m9k("5/7"), R.drawable.ic_motorsport), new fhd(SearchResponseKt.PLAYER_ENTITY, new q9k(R.string.notifications_player_driver_group), new q9k(R.string.performance_and_news), new m9k("5/7"), R.drawable.ic_players_notifications), new fhd("user", new q9k(R.string.gaming), new q9k(R.string.gaming_body), new m9k("5/7"), R.drawable.ic_trophy_16), new fhd("fantasy", new q9k(R.string.fantasy), null, new m9k("5/7"), R.drawable.ic_main_fantasy), new fhd("other", new q9k(R.string.other), new q9k(R.string.other_body), new m9k("5/7"), R.drawable.ic_crowdsourcing)), 26));
            case 26:
                return new qug(0);
            case 27:
                return Unit.a;
            case 28:
                _childSerializers$_anonymous_9 = OddsChoice._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            default:
                return new fgf(1, (r9k) new m9k("Full-time result"), 1, true, (gv9) nld.a.getValue(), ProviderOdds.Type.STANDARD, (String) null, 128);
        }
    }
}
