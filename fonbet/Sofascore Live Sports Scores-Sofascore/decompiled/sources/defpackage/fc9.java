package defpackage;

import com.sofascore.model.newNetwork.HistoricalSeasonComparisonResponse;
import com.sofascore.model.newNetwork.HockeyEventShotmapItem;
import com.sofascore.model.newNetwork.HockeyEventShotmapResponse;
import com.sofascore.model.newNetwork.HockeyPlayerShotmapResponse;
import com.sofascore.model.newNetwork.commentary.HockeyPlayByPlayResponse;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.HorizontalBarView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fc9 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ fc9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$18;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$19;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        KSerializer _childSerializers$_anonymous_$9;
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_$10;
        KSerializer _childSerializers$_anonymous_$11;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_$14;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = HistoricalSeasonComparisonResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = HockeyEventShotmapItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                _childSerializers$_anonymous_3 = HockeyEventShotmapResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 3:
                _childSerializers$_anonymous_4 = HockeyPlayByPlayResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 4:
                _childSerializers$_anonymous_5 = HockeyPlayerShotmapResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 5:
                int i = HorizontalBarView.e;
                return Unit.a;
            case 6:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 7:
                return new xh3();
            case 8:
                return new ArrayList();
            case 9:
                return new ArrayList();
            case 10:
                return new LinkedHashMap();
            case 11:
                return new i99(new g99(240, 102, 28), new h99(new int[]{R.color.heatmap_00, R.color.heatmap_10, R.color.heatmap_35, R.color.heatmap_80, R.color.heatmap_100}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f, 0.35f, 0.8f, 1.0f}, 1.0d, 6.0d), new k9(4, 14, 82));
            case 12:
                _childSerializers$_anonymous_6 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 13:
                _childSerializers$_anonymous_$18 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$18();
                return _childSerializers$_anonymous_$18;
            case 14:
                _childSerializers$_anonymous_$0 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 15:
                _childSerializers$_anonymous_$19 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$19();
                return _childSerializers$_anonymous_$19;
            case 16:
                _childSerializers$_anonymous_$1 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 17:
                _childSerializers$_anonymous_$2 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 18:
                _childSerializers$_anonymous_$3 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 19:
                _childSerializers$_anonymous_$4 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 20:
                _childSerializers$_anonymous_$5 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 21:
                _childSerializers$_anonymous_$6 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 22:
                _childSerializers$_anonymous_$7 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 23:
                _childSerializers$_anonymous_$9 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$9();
                return _childSerializers$_anonymous_$9;
            case 24:
                _childSerializers$_anonymous_$8 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            case 25:
                _childSerializers$_anonymous_$10 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$10();
                return _childSerializers$_anonymous_$10;
            case 26:
                _childSerializers$_anonymous_$11 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$11();
                return _childSerializers$_anonymous_$11;
            case 27:
                _childSerializers$_anonymous_$12 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$12();
                return _childSerializers$_anonymous_$12;
            case 28:
                _childSerializers$_anonymous_$13 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$13();
                return _childSerializers$_anonymous_$13;
            default:
                _childSerializers$_anonymous_$14 = IceHockeyTopPlayersStatistics._childSerializers$_anonymous_$14();
                return _childSerializers$_anonymous_$14;
        }
    }
}
