package defpackage;

import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.firebase.SurveyConfigData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.network.response.TeamEventShotmapResponse;
import com.sofascore.model.newNetwork.SuggestedPlayersResponse;
import com.sofascore.model.newNetwork.Survey;
import com.sofascore.model.newNetwork.SurveyAnswer;
import com.sofascore.model.newNetwork.SurveyAnswersPost;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.TeamEventShotmapWrapper;
import com.sofascore.model.newNetwork.TeamFeaturedPlayersResponse;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class egi implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ egi(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_$14;
        KSerializer _childSerializers$_anonymous_11;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return new Regex("https?://(?:m.)?(?:www.)?youtu(?:.be/|(?:be-nocookie|be).com/(?:watch|[\\w]+\\?(?:feature=[\\w]+.[\\w]+&)?v=|v/|e/|embed/|user/(?:[\\w#]+/)+))([^&#?\\n]+)");
            case 2:
                return new Regex("(?:(?:https|http)://)?(?:www\\.)?(?:youtube\\.com|youtu\\.be).*?(?:/|v/|u/|embed/|shorts/|watch\\?v=|(?<username>user/))(?<id>[\\w\\-]{11})(?:\\?|&|$)");
            case 3:
                return new Regex("\\p{InCombiningDiacriticalMarks}");
            case 4:
                return new Regex("\\s+");
            case 5:
                yea yeaVar = j58.a;
                return j58.d();
            case 6:
                _init_$_anonymous_ = SuggestStatus._init_$_anonymous_();
                return _init_$_anonymous_;
            case 7:
                _childSerializers$_anonymous_ = SuggestedPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 8:
                return new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 9:
                _childSerializers$_anonymous_2 = Survey._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 10:
                _childSerializers$_anonymous_3 = SurveyAnswer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 11:
                _childSerializers$_anonymous_4 = SurveyAnswersPost._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 12:
                _childSerializers$_anonymous_5 = SurveyConfigData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 13:
                _childSerializers$_anonymous_$0 = SurveyConfigData._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 14:
                _childSerializers$_anonymous_$1 = SurveyConfigData._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 15:
                _childSerializers$_anonymous_6 = Team._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 16:
                _childSerializers$_anonymous_$02 = Team._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 17:
                _childSerializers$_anonymous_$12 = Team._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 18:
                _childSerializers$_anonymous_$2 = Team._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 19:
                _childSerializers$_anonymous_7 = TeamAchievementsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 20:
                _childSerializers$_anonymous_$03 = TeamAchievementsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 21:
                _init_$_anonymous_2 = TeamAverageRatingVersion._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 22:
                _childSerializers$_anonymous_8 = TeamDetailsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 23:
                _childSerializers$_anonymous_$04 = TeamDetailsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 24:
                _childSerializers$_anonymous_$13 = TeamDetailsResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 25:
                _childSerializers$_anonymous_9 = TeamEventShotmapResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 26:
                _childSerializers$_anonymous_10 = TeamEventShotmapWrapper._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 27:
                _childSerializers$_anonymous_$05 = TeamEventShotmapWrapper._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            case 28:
                _childSerializers$_anonymous_$14 = TeamEventShotmapWrapper._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$14;
            default:
                _childSerializers$_anonymous_11 = TeamFeaturedPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
        }
    }
}
