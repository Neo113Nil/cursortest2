package defpackage;

import androidx.compose.runtime.e;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.BaseballTopPerformer;
import com.sofascore.model.newNetwork.BaseballTopPerformerRole;
import com.sofascore.model.newNetwork.commentary.BaseballPitchType;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.model.newNetwork.statistics.BaseballPitchesResponse;
import com.sofascore.model.newNetwork.topperformance.response.BaseballTopPlayersStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class i91 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ i91(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$18;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$19;
        KSerializer _childSerializers$_anonymous_$20;
        KSerializer _childSerializers$_anonymous_$21;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$23;
        KSerializer _childSerializers$_anonymous_$24;
        KSerializer _childSerializers$_anonymous_$25;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$9;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$42;
        KSerializer _childSerializers$_anonymous_$52;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_$10;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$4 = BaseballPitch._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 1:
                _childSerializers$_anonymous_$5 = BaseballPitch._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 2:
                _init_$_anonymous_ = BaseballPitchType._init_$_anonymous_();
                return _init_$_anonymous_;
            case 3:
                _childSerializers$_anonymous_ = BaseballPitchesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 4:
                joa joaVar = ek1.a;
                am1 am1Var = (am1) joaVar.getValue();
                am1 am1Var2 = (am1) joaVar.getValue();
                int i = am1Var2.a;
                int i2 = am1Var2.b;
                gv9 gv9Var = am1Var2.d;
                gv9Var.getClass();
                b7 K = l6g.K(am1Var, new am1(i, i2, "2024", gv9Var));
                am1 am1Var3 = (am1) joaVar.getValue();
                Season.SubSeasonType subSeasonType = Season.SubSeasonType.REGULAR_SEASON;
                b7 K2 = l6g.K(wj1.b, wj1.c);
                kp5<vj1> kp5Var = vj1.w;
                int i3 = 10;
                ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                for (vj1 vj1Var : kp5Var) {
                    kp5 kp5Var2 = uj1.C1;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : kp5Var2) {
                        if (((uj1) obj).a == vj1Var) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, i3));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        uj1 uj1Var = (uj1) it.next();
                        uj1 uj1Var2 = uj1.I;
                        flf flfVar = glf.a;
                        flfVar.getClass();
                        int k = glf.b.k(100);
                        Float f = null;
                        Integer valueOf = k < 25 ? null : Integer.valueOf(k);
                        int i4 = uj1Var2.c;
                        String str = (String) CollectionsKt.A0(ph0.a0(new String[]{"123", "1.23", "12.3%", ".123"}), flfVar);
                        if (valueOf != null) {
                            f = Float.valueOf(valueOf.intValue() / 100.0f);
                        }
                        arrayList3.add(new bm1(i4, uj1Var.b, str, valueOf, 100, f));
                    }
                    arrayList.add(new Pair(vj1Var, l6g.W(arrayList3)));
                    i3 = 10;
                }
                return new fk1(K, am1Var3, subSeasonType, K2, l6g.W(arrayList), PsExtractor.AUDIO_STREAM);
            case 5:
                return new am1(1, 1, "2025", l6g.K(Season.SubSeasonType.REGULAR_SEASON, Season.SubSeasonType.PLAYOFFS));
            case 6:
                return e.f(Boolean.TRUE);
            case 7:
                _childSerializers$_anonymous_2 = BaseballTopPerformer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 8:
                _childSerializers$_anonymous_$0 = BaseballTopPerformer._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 9:
                _init_$_anonymous_2 = BaseballTopPerformerRole._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 10:
                _childSerializers$_anonymous_3 = BaseballTopPlayersStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 11:
                _childSerializers$_anonymous_$18 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$18();
                return _childSerializers$_anonymous_$18;
            case 12:
                _childSerializers$_anonymous_$02 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 13:
                _childSerializers$_anonymous_$19 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$19();
                return _childSerializers$_anonymous_$19;
            case 14:
                _childSerializers$_anonymous_$20 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$20();
                return _childSerializers$_anonymous_$20;
            case 15:
                _childSerializers$_anonymous_$21 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$21();
                return _childSerializers$_anonymous_$21;
            case 16:
                _childSerializers$_anonymous_$22 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$22();
                return _childSerializers$_anonymous_$22;
            case 17:
                _childSerializers$_anonymous_$23 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$23();
                return _childSerializers$_anonymous_$23;
            case 18:
                _childSerializers$_anonymous_$24 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$24();
                return _childSerializers$_anonymous_$24;
            case 19:
                _childSerializers$_anonymous_$25 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$25();
                return _childSerializers$_anonymous_$25;
            case 20:
                _childSerializers$_anonymous_$1 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 21:
                _childSerializers$_anonymous_$9 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$9();
                return _childSerializers$_anonymous_$9;
            case 22:
                _childSerializers$_anonymous_$2 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 23:
                _childSerializers$_anonymous_$3 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 24:
                _childSerializers$_anonymous_$42 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$42;
            case 25:
                _childSerializers$_anonymous_$52 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$52;
            case 26:
                _childSerializers$_anonymous_$6 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 27:
                _childSerializers$_anonymous_$7 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 28:
                _childSerializers$_anonymous_$8 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            default:
                _childSerializers$_anonymous_$10 = BaseballTopPlayersStatistics._childSerializers$_anonymous_$10();
                return _childSerializers$_anonymous_$10;
        }
    }
}
