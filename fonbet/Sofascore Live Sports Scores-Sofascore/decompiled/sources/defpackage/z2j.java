package defpackage;

import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.newNetwork.TeamSuggestionResponse;
import com.sofascore.model.newNetwork.TeamTransfersResponse;
import com.sofascore.model.newNetwork.TeamUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.TennisGrandSlamPerformance;
import com.sofascore.model.newNetwork.TennisGrandSlamPerformanceResponse;
import com.sofascore.model.newNetwork.TennisPowerResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamYearlyStatisticsResponse;
import com.sofascore.model.newNetwork.topperformance.response.TennisTopTeamsStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z2j implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ z2j(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Integer, m9k] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        Integer num;
        f29 f29Var;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$32;
        KSerializer _childSerializers$_anonymous_$42;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        int i = 1;
        boolean z = false;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = TeamSuggestionResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = TeamTransfersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                _childSerializers$_anonymous_$0 = TeamTransfersResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 3:
                _childSerializers$_anonymous_3 = TeamUniqueTournamentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 4:
                _childSerializers$_anonymous_4 = TennisEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 5:
                _childSerializers$_anonymous_$02 = TennisEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 6:
                _childSerializers$_anonymous_$1 = TennisEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 7:
                _childSerializers$_anonymous_$2 = TennisEvent._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 8:
                _childSerializers$_anonymous_$3 = TennisEvent._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 9:
                _childSerializers$_anonymous_$4 = TennisEvent._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 10:
                _childSerializers$_anonymous_5 = TennisGrandSlamPerformance._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 11:
                _childSerializers$_anonymous_6 = TennisGrandSlamPerformanceResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 12:
                Integer valueOf = Integer.valueOf(R.color.primary_default);
                int i2 = 2021;
                int i3 = 2025;
                b7 Z = l6g.Z(new IntRange(2021, 2025, 1));
                List j = b.j("Australian Open", "Roland Garros", "Wimbledon", "US Open");
                int i4 = 10;
                ArrayList arrayList = new ArrayList(k13.r(j, 10));
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    m9k m9kVar = new m9k((String) it.next());
                    IntRange intRange = new IntRange(i2, i3, i);
                    ArrayList arrayList2 = new ArrayList(k13.r(intRange, i4));
                    v6a it2 = intRange.iterator();
                    ?? r2 = z;
                    while (it2.c) {
                        float f = 1.0f;
                        float f2 = 0.1f;
                        int i5 = 56;
                        if (it2.nextInt() == i3) {
                            f29Var = (f29) CollectionsKt.A0(b.j(new f29(r2, r2, f, 24), new f29(r2, Integer.valueOf(R.color.live), f2, i5)), glf.a);
                            num = valueOf;
                        } else {
                            num = valueOf;
                            f29Var = (f29) CollectionsKt.A0(b.j(new f29(new m9k("W"), valueOf, f, 48), new f29(new m9k("F"), valueOf, 0.4f, i5), new f29(new m9k("SF"), valueOf, 0.3f, i5), new f29(new m9k("QF"), valueOf, 0.2f, i5), new f29(new m9k("R4"), valueOf, f2, i5), new f29(new m9k("R3"), valueOf, f2, i5), new f29(new m9k("R2"), valueOf, f2, i5), new f29(new m9k("R1"), valueOf, f2, i5), new f29(new m9k("Q"), valueOf, f2, i5), new f29(new m9k("-"), Integer.valueOf(R.color.n_lv_1), 0.15f, i5)), glf.a);
                        }
                        arrayList2.add(f29Var);
                        valueOf = num;
                        r2 = 0;
                        i3 = 2025;
                    }
                    arrayList.add(new g29(m9kVar, 2380, l6g.W(arrayList2)));
                    valueOf = valueOf;
                    i = 1;
                    z = false;
                    i2 = 2021;
                    i3 = 2025;
                    i4 = 10;
                }
                return new y5j(Z, l6g.W(arrayList));
            case 13:
                return l6g.K(new e6j(c6j.e, new d6j(yid.p(6).concat(" (4230 PTS)"), (deh) null, 4), new d6j(yid.p(1).concat(" (04.07.2011)"), (deh) null, 6), new d6j("Wimbledon, Semifinals", (deh) null, 6)), new e6j(c6j.g, new d6j(yid.p(8).concat(" (15.59)"), (deh) null, 6), null, null));
            case 14:
                _childSerializers$_anonymous_7 = TennisPowerResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 15:
                _childSerializers$_anonymous_8 = TennisTeamYearlyStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 16:
                _childSerializers$_anonymous_9 = TennisTopTeamsStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 17:
                _childSerializers$_anonymous_$03 = TennisTopTeamsStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 18:
                _childSerializers$_anonymous_$12 = TennisTopTeamsStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 19:
                _childSerializers$_anonymous_$22 = TennisTopTeamsStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 20:
                _childSerializers$_anonymous_$32 = TennisTopTeamsStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$32;
            case 21:
                _childSerializers$_anonymous_$42 = TennisTopTeamsStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$42;
            case 22:
                _childSerializers$_anonymous_$5 = TennisTopTeamsStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 23:
                _childSerializers$_anonymous_$6 = TennisTopTeamsStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 24:
                _childSerializers$_anonymous_$7 = TennisTopTeamsStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 25:
            case 26:
                return null;
            case 27:
                return g7k.a;
            case 28:
                return e7k.a;
            default:
                return new r6a(0L);
        }
    }
}
