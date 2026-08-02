package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.compose.runtime.e;
import com.inmobi.media.E3;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.network.response.DistributionItem;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.bettingtips.DroppingOddsResponse;
import com.sofascore.model.newNetwork.DefaultPinnedLeaguesResponse;
import com.sofascore.model.newNetwork.DistinctEventSet;
import com.sofascore.model.newNetwork.DraftPickLotteryProbability;
import com.sofascore.model.newNetwork.DraftProspect;
import com.sofascore.model.newNetwork.DriverRacesResponse;
import com.sofascore.model.newNetwork.ESportsBansResponse;
import com.sofascore.model.notifications.NotificationSetting;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wc4 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ wc4(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_8;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$4 = DartsEvent._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 1:
                fuf fufVar = duf.a;
                return new zvg("kotlinx.datetime.DateTimeUnit.DateBased", fufVar.getOrCreateKotlinClass(kk4.class), new KClass[]{fufVar.getOrCreateKotlinClass(mk4.class), fufVar.getOrCreateKotlinClass(ok4.class)}, new KSerializer[]{yk4.a, avc.a});
            case 2:
                return e.f(new wcj(7, 0L, (String) null));
            case 3:
                return e.f(Boolean.FALSE);
            case 4:
                return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 5:
                return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 6:
                fuf fufVar2 = duf.a;
                return new zvg("kotlinx.datetime.DateTimeUnit", fufVar2.getOrCreateKotlinClass(rk4.class), new KClass[]{fufVar2.getOrCreateKotlinClass(mk4.class), fufVar2.getOrCreateKotlinClass(ok4.class), fufVar2.getOrCreateKotlinClass(qk4.class)}, new KSerializer[]{yk4.a, avc.a, dhj.a});
            case 7:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.R("kotlinx.datetime.DayBased")) {
                    a70.p("Blank serial names are prohibited");
                    return null;
                }
                vv2 vv2Var = new vv2("kotlinx.datetime.DayBased");
                km5 km5Var = km5.a;
                a7a a7aVar = a7a.a;
                vv2Var.a("days", a7a.b, km5Var, false);
                Unit unit = Unit.a;
                return new m5h("kotlinx.datetime.DayBased", nii.f, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
            case 8:
                return b.j(new NotificationSetting(Sports.FOOTBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "lineups", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "penalty", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "redcard", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "halftime", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "player_rating_available", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "player_of_the_match_voting", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FOOTBALL, "ai_analyst", true, "channel_info", null, 16, null), new NotificationSetting(Sports.TENNIS, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.TENNIS, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.TENNIS, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.TENNIS, "break_point", true, "channel_score", null, 16, null), new NotificationSetting(Sports.TENNIS, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.TENNIS, "period_score", false, "channel_info", null, 16, null), new NotificationSetting(Sports.TENNIS, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BASKETBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BASKETBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BASKETBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BASKETBALL, "period_start", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BASKETBALL, "period_score", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BASKETBALL, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "goal_scorer", false, "channel_info", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "period_start", true, "channel_info", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "period_score", true, "channel_info", null, 16, null), new NotificationSetting(Sports.ICE_HOCKEY, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.VOLLEYBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.VOLLEYBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.VOLLEYBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.VOLLEYBALL, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.HANDBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.HANDBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.HANDBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.HANDBALL, "halftime", true, "channel_info", null, 16, null), new NotificationSetting(Sports.E_SPORTS, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.E_SPORTS, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.E_SPORTS, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MMA, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.MMA, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.MMA, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BASEBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BASEBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BASEBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BASEBALL, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.BASEBALL, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.CRICKET, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.CRICKET, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.CRICKET, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.CRICKET, "period_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.CRICKET, "period_start", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MOTORSPORT, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.MOTORSPORT, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.MOTORSPORT, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MOTORSPORT, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.AMERICAN_FOOTBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.AMERICAN_FOOTBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.AMERICAN_FOOTBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.AMERICAN_FOOTBALL, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.AMERICAN_FOOTBALL, "period_start", true, "channel_info", null, 16, null), new NotificationSetting(Sports.AMERICAN_FOOTBALL, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.RUGBY, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.RUGBY, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.RUGBY, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.RUGBY, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.RUGBY, "halftime", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BADMINTON, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BADMINTON, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BADMINTON, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BADMINTON, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.SNOOKER, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.SNOOKER, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.SNOOKER, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.SNOOKER, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.DARTS, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.DARTS, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.DARTS, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.DARTS, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.FUTSAL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.FUTSAL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.FUTSAL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FUTSAL, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.FUTSAL, "halftime", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "lineups", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "missed_penalty", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "redcard", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "halftime", true, "channel_info", null, 16, null), new NotificationSetting(Sports.MINI_FOOTBALL, "highlights", true, "channel_info", null, 16, null), new NotificationSetting(Sports.TABLE_TENNIS, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.TABLE_TENNIS, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.TABLE_TENNIS, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.TABLE_TENNIS, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.BEACH_VOLLEY, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BEACH_VOLLEY, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BEACH_VOLLEY, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BEACH_VOLLEY, "current_score", true, "channel_score", null, 16, null), new NotificationSetting(Sports.WATERPOLO, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.WATERPOLO, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.WATERPOLO, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.WATERPOLO, "current_score", false, "channel_score", null, 16, null), new NotificationSetting(Sports.WATERPOLO, "period_score", true, "channel_info", null, 16, null), new NotificationSetting(Sports.CYCLING, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.CYCLING, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.AUSSIE_RULES, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.AUSSIE_RULES, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.AUSSIE_RULES, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.AUSSIE_RULES, "current_score", false, "channel_score", null, 16, null), new NotificationSetting(Sports.AUSSIE_RULES, "period_score", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FLOORBALL, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.FLOORBALL, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.FLOORBALL, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.FLOORBALL, "current_score", false, "channel_score", null, 16, null), new NotificationSetting(Sports.FLOORBALL, "period_score", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BANDY, "start", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BANDY, "finish", true, "channel_start_finish", null, 16, null), new NotificationSetting(Sports.BANDY, "prestart", true, "channel_info", null, 16, null), new NotificationSetting(Sports.BANDY, "current_score", false, "channel_score", null, 16, null), new NotificationSetting(Sports.BANDY, "halftime", true, "channel_info", null, 16, null), new NotificationSetting(SearchResponseKt.PLAYER_ENTITY, "player_game", true, "channel_info", null, 16, null), new NotificationSetting(SearchResponseKt.PLAYER_ENTITY, "player_media", true, "channel_info", null, 16, null), new NotificationSetting("fantasy", "round_info", true, "channel_info", null, 16, null), new NotificationSetting("fantasy", "info", true, "channel_info", null, 16, null), new NotificationSetting("user", "weekly_challenge", true, "channel_info", null, 16, null), new NotificationSetting("user", "predictions", true, "channel_info", null, 16, null), new NotificationSetting("user", "suggestions", true, "channel_info", "other"), new NotificationSetting("other", "other", true, "channel_info", 0 == true ? 1 : 0, 16, null));
            case 9:
                _childSerializers$_anonymous_ = DefaultPinnedLeaguesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 10:
                return Float.valueOf(1.0f);
            case 11:
                return Unit.a;
            case 12:
                ia0 ia0Var = ia0.q;
                return ok3.p().e();
            case 13:
                return Boolean.valueOf(Build.VERSION.SDK_INT <= 28 && !Process.is64Bit());
            case 14:
                _childSerializers$_anonymous_2 = DistinctEventSet._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 15:
                _childSerializers$_anonymous_$0 = DistinctEventSet._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 16:
                _childSerializers$_anonymous_3 = DistributionItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 17:
                return ejb.b("io.ktor.client.plugins.SaveBody");
            case 18:
                _childSerializers$_anonymous_4 = DraftPickLotteryProbability._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 19:
                _childSerializers$_anonymous_$02 = DraftPickLotteryProbability._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 20:
                _childSerializers$_anonymous_5 = DraftProspect._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 21:
                return Boolean.TRUE;
            case 22:
                return Unit.a;
            case 23:
                return Unit.a;
            case 24:
                return new Handler(Looper.getMainLooper());
            case 25:
                _childSerializers$_anonymous_6 = DriverRacesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 26:
                _childSerializers$_anonymous_7 = DroppingOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 27:
                _childSerializers$_anonymous_$03 = DroppingOddsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 28:
                return E3.b();
            default:
                _childSerializers$_anonymous_8 = ESportsBansResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
        }
    }
}
