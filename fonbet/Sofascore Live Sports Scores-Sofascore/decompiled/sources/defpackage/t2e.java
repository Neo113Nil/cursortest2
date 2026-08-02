package defpackage;

import com.sofascore.model.PlayerActiveSuspension;
import com.sofascore.model.mvvm.model.PerformanceGraphData;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.PickemResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSTopCompetitionsResponse;
import com.sofascore.model.newNetwork.PageInfo;
import com.sofascore.model.newNetwork.PerformanceGraphDataResponse;
import com.sofascore.model.newNetwork.PlayerAwardUpdatePayload;
import com.sofascore.model.newNetwork.PlayerCharacteristicsResponse;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMLMediaResponse;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPostsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticSeasonRaw;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticsResponse;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t2e implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ t2e(int i) {
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
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_$12;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = POTSTopCompetitionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = PageInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                List c = a.c(new zvj(0, km5.a));
                rfb rfbVar = rfb.f;
                c.getClass();
                rfbVar.getClass();
                return new z3e(sfb.a, c, 0, 0, rfbVar, null);
            case 3:
                b7 K = l6g.K(1, 4, 3);
                ArrayList arrayList = new ArrayList(9);
                for (int i = 0; i < 9; i++) {
                    arrayList.add(new n8b(new fk2(R.drawable.ic_card_yellow, false), Integer.valueOf(R.drawable.ic_swap), null));
                }
                return new j6c(K, l6g.Z(arrayList));
            case 4:
                return new zye("1", "0", true, l6g.K(new eze("15", "0", R.color.n_lv_1, R.color.n_lv_3), new eze("30", "0", R.color.n_lv_1, R.color.n_lv_3), new eze("30", "15", R.color.n_lv_3, R.color.n_lv_1), new eze("40", "15", R.color.secondary_default, R.color.n_lv_3)), l6g.K("Nadal"), -1, R.drawable.ic_ball_tennis, false, null);
            case 5:
                return new bze((gv9) qce.c.getValue(), "21", "15", false, true);
            case 6:
                return new eze("1", "0", R.color.n_lv_1, R.color.n_lv_3);
            case 7:
                return new eze("0", "1", R.color.n_lv_3, R.color.n_lv_1);
            case 8:
                ArrayList arrayList2 = new ArrayList(8);
                for (int i2 = 0; i2 < 8; i2++) {
                    arrayList2.add((eze) (i2 % 2 == 0 ? qce.a.getValue() : qce.b.getValue()));
                }
                return l6g.W(arrayList2);
            case 9:
                return tce.a;
            case 10:
                _childSerializers$_anonymous_3 = PerformanceGraphData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 11:
                _childSerializers$_anonymous_4 = PerformanceGraphDataResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 12:
                _childSerializers$_anonymous_5 = PersonalizedMLMediaResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 13:
                _childSerializers$_anonymous_6 = PersonalizedMediaPost._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 14:
                _childSerializers$_anonymous_7 = PersonalizedMediaPostsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 15:
                _childSerializers$_anonymous_8 = PickemResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 16:
                hs4 hs4Var = z45.a;
                return hq4.c;
            case 17:
                _childSerializers$_anonymous_9 = Player._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 18:
                _childSerializers$_anonymous_$0 = Player._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 19:
                _childSerializers$_anonymous_$1 = Player._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 20:
                _childSerializers$_anonymous_10 = PlayerActiveSuspension._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 21:
                _childSerializers$_anonymous_$02 = PlayerActiveSuspension._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 22:
                _childSerializers$_anonymous_11 = PlayerAwardUpdatePayload._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 23:
                _childSerializers$_anonymous_12 = PlayerCareerStatisticSeasonRaw._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 24:
                _childSerializers$_anonymous_$03 = PlayerCareerStatisticSeasonRaw._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 25:
                _childSerializers$_anonymous_13 = PlayerCareerStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 26:
                _childSerializers$_anonymous_$04 = PlayerCareerStatisticsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 27:
                _childSerializers$_anonymous_14 = PlayerCharacteristicsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 28:
                _childSerializers$_anonymous_$05 = PlayerCharacteristicsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            default:
                _childSerializers$_anonymous_$12 = PlayerCharacteristicsResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
        }
    }
}
