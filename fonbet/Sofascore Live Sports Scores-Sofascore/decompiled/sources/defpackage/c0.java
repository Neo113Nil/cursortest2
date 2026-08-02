package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Colors;
import com.sofascore.model.Sports;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.mvvm.model.ActiveTimeout;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.AbstractNetworkResponse;
import com.sofascore.model.network.response.AddedEventsResponse;
import com.sofascore.model.network.response.AiInsightsNextResponse;
import com.sofascore.model.newNetwork.AffiliateBannersResponse;
import com.sofascore.model.newNetwork.AiInsightsHalftimePredictions;
import com.sofascore.model.newNetwork.AiInsightsPredictions;
import com.sofascore.model.newNetwork.AiInsightsTennisPredictions;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class c0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _init_$_anonymous_;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$13;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = APIBuzzerTile._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_$0 = APIBuzzerTile._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 2:
                _childSerializers$_anonymous_$1 = APIBuzzerTile._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 3:
                _childSerializers$_anonymous_$2 = APIBuzzerTile._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 4:
                return new Handler(Looper.getMainLooper());
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                _init_$_anonymous_ = AbstractNetworkResponse._init_$_anonymous_();
                return _init_$_anonymous_;
            case 8:
                _init_$_anonymous_2 = AbstractPlayerSeasonStatistics._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 9:
                _childSerializers$_anonymous_2 = ActiveTimeout._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 10:
                glf.a.getClass();
                return Integer.valueOf(glf.b.k(2147418112) + C.DEFAULT_BUFFER_SEGMENT_SIZE);
            case 11:
                return UUID.randomUUID().toString();
            case 12:
                _childSerializers$_anonymous_3 = AddedEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 13:
                return new old(new yld(1, new Colors("#017b5b", null, null), "bet365"), "https://www.bet365.com/dl/sportsbookredirect", true, null, Boolean.TRUE, "", null);
            case 14:
                return new and((old) hi.a.getValue(), (fgf) hi.b.getValue());
            case 15:
                return new fgf(1, (r9k) new m9k("Full-time"), 1, false, (gv9) hi.d.getValue(), ProviderOdds.Type.STANDARD, (String) null, 128);
            case 16:
                return new fgf(1, (r9k) new m9k("Full-time"), 1, true, (gv9) hi.d.getValue(), ProviderOdds.Type.STANDARD, (String) null, 128);
            case 17:
                return l6g.K(new dld(false, new m9k("1"), 1, "1/5", "https://www.sofascore.com", null), new dld(false, new m9k("X"), -1, "3/20", "https://www.sofascore.com", null), new dld(false, new m9k("2"), 0, "4/50", "https://www.sofascore.com", null));
            case 18:
                return new ek(new OddsEventUIModel(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Integer.valueOf(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), StatusKt.STATUS_FINISHED, Sports.FOOTBALL, false), hi.c, l6g.K(new pj((fgf) hi.b.getValue())), rlh.b, new w22(1, "Brand", r13.f, null), true);
            case 19:
                _childSerializers$_anonymous_4 = AffiliateBannersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 20:
                _childSerializers$_anonymous_5 = AiInsightsHalftimePredictions._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 21:
                _childSerializers$_anonymous_6 = AiInsightsNextResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 22:
                _childSerializers$_anonymous_7 = AiInsightsPredictions._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 23:
                _childSerializers$_anonymous_8 = AiInsightsTennisPredictions._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 24:
                _childSerializers$_anonymous_$02 = AiInsightsTennisPredictions._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 25:
                _childSerializers$_anonymous_$12 = AiInsightsTennisPredictions._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 26:
                _childSerializers$_anonymous_9 = AllOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 27:
                _childSerializers$_anonymous_10 = AmericanFootballEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 28:
                _childSerializers$_anonymous_$03 = AmericanFootballEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            default:
                _childSerializers$_anonymous_$13 = AmericanFootballEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
        }
    }
}
