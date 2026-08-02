package defpackage;

import com.sofascore.model.buzzer.Race;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.model.newNetwork.RaceDetailsResponse;
import com.sofascore.model.newNetwork.RaceDriverResults;
import com.sofascore.model.newNetwork.RankingItem;
import com.sofascore.model.newNetwork.RecentStageIdsResponse;
import com.sofascore.model.newNetwork.RecentTeamTournamentsResponse;
import com.sofascore.model.newNetwork.RefereeStatisticsResponse;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.newNetwork.newRankings.RankingsSummaryResponse;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.profile.ProfileData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s8f implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ s8f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_$9;
        KSerializer _childSerializers$_anonymous_$10;
        KSerializer _childSerializers$_anonymous_$11;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        int i = 0;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$8 = ProfileData._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            case 1:
                _childSerializers$_anonymous_$9 = ProfileData._childSerializers$_anonymous_$9();
                return _childSerializers$_anonymous_$9;
            case 2:
                _childSerializers$_anonymous_$10 = ProfileData._childSerializers$_anonymous_$10();
                return _childSerializers$_anonymous_$10;
            case 3:
                _childSerializers$_anonymous_$11 = ProfileData._childSerializers$_anonymous_$11();
                return _childSerializers$_anonymous_$11;
            case 4:
                _childSerializers$_anonymous_$12 = ProfileData._childSerializers$_anonymous_$12();
                return _childSerializers$_anonymous_$12;
            case 5:
                _childSerializers$_anonymous_$0 = ProfileData._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 6:
                _childSerializers$_anonymous_$1 = ProfileData._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 7:
                _childSerializers$_anonymous_$2 = ProfileData._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 8:
                _childSerializers$_anonymous_$3 = ProfileData._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 9:
                _childSerializers$_anonymous_$4 = ProfileData._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 10:
                ia0 ia0Var = ia0.q;
                return ok3.p().e();
            case 11:
                return Unit.a;
            case 12:
                _childSerializers$_anonymous_ = ProviderOdds._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 13:
                return new xhf(new q50(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), lz.f, null, 12));
            case 14:
                _childSerializers$_anonymous_2 = Question._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 15:
                _childSerializers$_anonymous_$02 = Question._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 16:
                _childSerializers$_anonymous_3 = Race._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 17:
                _childSerializers$_anonymous_4 = RaceDetailsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 18:
                _childSerializers$_anonymous_5 = RaceDriverResults._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 19:
                _childSerializers$_anonymous_6 = Ranking._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 20:
                _childSerializers$_anonymous_7 = RankingItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 21:
                _childSerializers$_anonymous_8 = RankingRow._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 22:
                _childSerializers$_anonymous_9 = RankingsSummaryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 23:
                List H0 = CollectionsKt.H0((List) v6h.a.getValue(), new laf(6));
                ArrayList arrayList = new ArrayList();
                int size = H0.size();
                while (i < size) {
                    ((qod) H0.get(i)).getClass();
                    z9d z9dVar = new z9d(new ild(5), null, 14);
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(eek.class);
                    Pair pair = orCreateKotlinClass == null ? null : new Pair(z9dVar, orCreateKotlinClass);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i++;
                }
                return arrayList;
            case 24:
                List H02 = CollectionsKt.H0((List) v6h.b.getValue(), new laf(7));
                ArrayList arrayList2 = new ArrayList();
                int size2 = H02.size();
                while (i < size2) {
                    arrayList2.add(((mm4) H02.get(i)).a());
                    i++;
                }
                return arrayList2;
            case 25:
                return null;
            case 26:
                _childSerializers$_anonymous_10 = RecentStageIdsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 27:
                _childSerializers$_anonymous_11 = RecentTeamTournamentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 28:
                return new fgf(1, (r9k) new m9k("Full-time result"), 1, false, (gv9) l6g.K(new dld(new m9k("1"), 0, "2/10"), new dld(new m9k("X"), 0, "3/40"), new dld(new m9k("2"), 0, "3/20")), ProviderOdds.Type.STANDARD, (String) null, 128);
            default:
                _childSerializers$_anonymous_12 = RefereeStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
        }
    }
}
