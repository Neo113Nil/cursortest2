package defpackage;

import com.sofascore.model.firebase.HiddenOddsTournaments;
import com.sofascore.model.network.response.Head2HeadEventsResponse;
import com.sofascore.model.network.response.bettingtips.HighValueStreaksResponse;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.HighlightsResponse;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopTeamsStatistics;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j69 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ j69(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$32;
        KSerializer _childSerializers$_anonymous_$42;
        KSerializer _childSerializers$_anonymous_$52;
        KSerializer _childSerializers$_anonymous_$62;
        KSerializer _childSerializers$_anonymous_$7;
        ExposedFunction readStorage;
        ExposedFunction deleteStorage;
        ExposedFunction showOfferwallAd;
        ExposedFunction clearStorage;
        ExposedFunction keysStorage;
        ExposedFunction writeStorage;
        ExposedFunction storage;
        ExposedFunction storage2;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$0 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 1:
                _childSerializers$_anonymous_$1 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 2:
                _childSerializers$_anonymous_$2 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 3:
                _childSerializers$_anonymous_$3 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 4:
                _childSerializers$_anonymous_$4 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 5:
                _childSerializers$_anonymous_$5 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 6:
                _childSerializers$_anonymous_$6 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 7:
                _childSerializers$_anonymous_ = HandballTopTeamsStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 8:
                _childSerializers$_anonymous_$02 = HandballTopTeamsStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 9:
                _childSerializers$_anonymous_$12 = HandballTopTeamsStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 10:
                _childSerializers$_anonymous_$22 = HandballTopTeamsStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 11:
                _childSerializers$_anonymous_$32 = HandballTopTeamsStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$32;
            case 12:
                _childSerializers$_anonymous_$42 = HandballTopTeamsStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$42;
            case 13:
                _childSerializers$_anonymous_$52 = HandballTopTeamsStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$52;
            case 14:
                _childSerializers$_anonymous_$62 = HandballTopTeamsStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$62;
            case 15:
                _childSerializers$_anonymous_$7 = HandballTopTeamsStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 16:
                readStorage = CommonAdViewerExposedFunctionsKt.readStorage();
                return readStorage;
            case 17:
                deleteStorage = CommonAdViewerExposedFunctionsKt.deleteStorage();
                return deleteStorage;
            case 18:
                showOfferwallAd = CommonAdViewerExposedFunctionsKt.showOfferwallAd();
                return showOfferwallAd;
            case 19:
                clearStorage = CommonAdViewerExposedFunctionsKt.clearStorage();
                return clearStorage;
            case 20:
                keysStorage = CommonAdViewerExposedFunctionsKt.getKeysStorage();
                return keysStorage;
            case 21:
                writeStorage = CommonAdViewerExposedFunctionsKt.writeStorage();
                return writeStorage;
            case 22:
                storage = CommonAdViewerExposedFunctionsKt.getStorage();
                return storage;
            case 23:
                storage2 = CommonAdViewerExposedFunctionsKt.setStorage();
                return storage2;
            case 24:
                _childSerializers$_anonymous_2 = Head2HeadEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 25:
                _childSerializers$_anonymous_3 = HiddenOddsTournaments._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 26:
                _childSerializers$_anonymous_4 = HighValueStreaksResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 27:
                _childSerializers$_anonymous_$03 = HighValueStreaksResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 28:
                _childSerializers$_anonymous_5 = Highlight._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            default:
                _childSerializers$_anonymous_6 = HighlightsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
        }
    }
}
