package defpackage;

import com.sofascore.model.mvvm.model.ESportsEvent;
import com.sofascore.model.mvvm.model.bettingtips.EventBetBoost;
import com.sofascore.model.newNetwork.ESportsBansResponse;
import com.sofascore.model.newNetwork.ESportsGameLineupsResponse;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.model.newNetwork.EsportsGameStatistics;
import com.sofascore.model.newNetwork.EsportsGamesResponse;
import com.sofascore.model.newNetwork.EventAiInsightsResponse;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.profile.EditorEventOpeningsGraphResponse;
import com.sofascore.model.profile.EditorsPopularEventsResponse;
import com.sofascore.model.profile.EditorsTournamentsResponse;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ag5 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ag5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$04;
        Integer indicatorsLOL$lambda$0;
        Integer indicatorsLOL$lambda$1;
        Integer indicatorsLOL$lambda$2;
        Integer indicatorsLOL$lambda$3;
        Integer indicatorsLOL$lambda$4;
        Integer indicatorsLOL$lambda$5;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$0 = ESportsBansResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 1:
                _childSerializers$_anonymous_ = ESportsEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_$02 = ESportsEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 3:
                _childSerializers$_anonymous_$1 = ESportsEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 4:
                _childSerializers$_anonymous_$2 = ESportsEvent._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 5:
                _childSerializers$_anonymous_$3 = ESportsEvent._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 6:
                _childSerializers$_anonymous_$4 = ESportsEvent._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 7:
                _childSerializers$_anonymous_2 = ESportsGameLineupsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 8:
                _childSerializers$_anonymous_$03 = ESportsGameLineupsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 9:
                _childSerializers$_anonymous_3 = ESportsGameRoundsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 10:
                _childSerializers$_anonymous_$04 = ESportsGameRoundsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 11:
                indicatorsLOL$lambda$0 = fg5.getIndicatorsLOL$lambda$0();
                return indicatorsLOL$lambda$0;
            case 12:
                indicatorsLOL$lambda$1 = fg5.getIndicatorsLOL$lambda$1();
                return indicatorsLOL$lambda$1;
            case 13:
                indicatorsLOL$lambda$2 = fg5.getIndicatorsLOL$lambda$2();
                return indicatorsLOL$lambda$2;
            case 14:
                indicatorsLOL$lambda$3 = fg5.getIndicatorsLOL$lambda$3();
                return indicatorsLOL$lambda$3;
            case 15:
                indicatorsLOL$lambda$4 = fg5.getIndicatorsLOL$lambda$4();
                return indicatorsLOL$lambda$4;
            case 16:
                indicatorsLOL$lambda$5 = fg5.getIndicatorsLOL$lambda$5();
                return indicatorsLOL$lambda$5;
            case 17:
                _childSerializers$_anonymous_4 = EditorEventOpeningsGraphResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 18:
                _childSerializers$_anonymous_5 = EditorsPopularEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 19:
                _childSerializers$_anonymous_6 = EditorsTournamentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 20:
                ff5 ff5Var = cj5.a;
                return wo4.a;
            case 21:
                return new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 22:
                return Boolean.FALSE;
            case 23:
                _childSerializers$_anonymous_7 = EsportsGameStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 24:
                _childSerializers$_anonymous_8 = EsportsGamesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 25:
                _childSerializers$_anonymous_9 = EventAiInsightsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 26:
                _childSerializers$_anonymous_$05 = EventAiInsightsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            case 27:
                _childSerializers$_anonymous_10 = EventBestPlayer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 28:
                _childSerializers$_anonymous_11 = EventBestPlayersSummaryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            default:
                _childSerializers$_anonymous_12 = EventBetBoost._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
        }
    }
}
