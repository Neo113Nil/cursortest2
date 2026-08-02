package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.newNetwork.Vote;
import com.sofascore.model.newNetwork.Votes;
import com.sofascore.model.newNetwork.WSCGameData;
import com.sofascore.model.newNetwork.WSCStoriesResponse;
import com.sofascore.model.newNetwork.WSCStory;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopTeamsStatistics;
import com.sofascore.model.profile.VoteRankingResponse;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pxk implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ pxk(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$32;
        KSerializer _childSerializers$_anonymous_$42;
        KSerializer _childSerializers$_anonymous_$52;
        KSerializer _childSerializers$_anonymous_$62;
        KSerializer _childSerializers$_anonymous_$72;
        KSerializer _childSerializers$_anonymous_$82;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$3 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 1:
                _childSerializers$_anonymous_$4 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 2:
                _childSerializers$_anonymous_$5 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 3:
                _childSerializers$_anonymous_$6 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 4:
                _childSerializers$_anonymous_$7 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 5:
                _childSerializers$_anonymous_$8 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            case 6:
                _childSerializers$_anonymous_ = VolleyballTopStatsPerGameStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 7:
                _childSerializers$_anonymous_$0 = VolleyballTopStatsPerGameStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 8:
                _childSerializers$_anonymous_$1 = VolleyballTopStatsPerGameStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 9:
                _childSerializers$_anonymous_$2 = VolleyballTopStatsPerGameStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 10:
                _childSerializers$_anonymous_2 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 11:
                _childSerializers$_anonymous_$02 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 12:
                _childSerializers$_anonymous_$12 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 13:
                _childSerializers$_anonymous_$22 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 14:
                _childSerializers$_anonymous_$32 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$32;
            case 15:
                _childSerializers$_anonymous_$42 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$42;
            case 16:
                _childSerializers$_anonymous_$52 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$52;
            case 17:
                _childSerializers$_anonymous_$62 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$62;
            case 18:
                _childSerializers$_anonymous_$72 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$72;
            case 19:
                _childSerializers$_anonymous_$82 = VolleyballTopTeamsStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$82;
            case 20:
                _childSerializers$_anonymous_3 = Vote._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 21:
                _childSerializers$_anonymous_$03 = Vote._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 22:
                _childSerializers$_anonymous_4 = VoteRankingResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 23:
                _init_$_anonymous_ = VoteType._init_$_anonymous_();
                return _init_$_anonymous_;
            case 24:
                _childSerializers$_anonymous_5 = Votes._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 25:
                _childSerializers$_anonymous_$04 = Votes._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 26:
                _childSerializers$_anonymous_$13 = Votes._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 27:
                _childSerializers$_anonymous_6 = WSCGameData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 28:
                _childSerializers$_anonymous_7 = WSCStoriesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            default:
                _childSerializers$_anonymous_8 = WSCStory._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
        }
    }
}
