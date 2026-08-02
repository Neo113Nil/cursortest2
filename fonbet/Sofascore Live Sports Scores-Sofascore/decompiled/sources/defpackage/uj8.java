package defpackage;

import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uj8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ uj8(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                r8b r8bVar = (r8b) obj;
                r8bVar.getClass();
                function1.invoke(new wz5(r8bVar));
                return Unit.a;
            case 1:
                Float f = (Float) obj;
                f.getClass();
                int i2 = FootballShotmapView.O;
                function1.invoke(f);
                return Unit.a;
            case 2:
                Float f2 = (Float) obj;
                f2.getClass();
                int i3 = FootballShotmapView.O;
                function1.invoke(f2);
                return Unit.a;
            case 3:
                jyj jyjVar = (jyj) obj;
                if (!(jyjVar instanceof zw8)) {
                    a70.r("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) function1.invoke(((zw8) jyjVar).o);
                bool.getClass();
                return bool;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                function1.invoke(bool2);
                return Unit.a;
            case 5:
                function1.invoke(new bua(((Integer) obj).intValue()));
                return Unit.a;
            case 6:
                yva yvaVar = (yva) obj;
                yvaVar.getClass();
                function1.invoke(new pva(yvaVar));
                return Unit.a;
            case 7:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new qva(str));
                return Unit.a;
            case 8:
                function1.invoke(new mva(((Integer) obj).intValue()));
                return Unit.a;
            case 9:
                function1.invoke(new nva(((Integer) obj).intValue()));
                return Unit.a;
            case 10:
                rxa rxaVar = (rxa) obj;
                rxaVar.getClass();
                function1.invoke(rxaVar);
                return Unit.a;
            case 11:
                PowerRankingRound powerRankingRound = (PowerRankingRound) obj;
                powerRankingRound.getClass();
                function1.invoke(new qya(powerRankingRound));
                return Unit.a;
            case 12:
                sza szaVar = (sza) obj;
                szaVar.getClass();
                function1.invoke(szaVar);
                return Unit.a;
            case 13:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                function1.invoke(new b4b(y3bVar));
                return Unit.a;
            case 14:
                function1.invoke(new a4b((x3b) obj));
                return Unit.a;
            case 15:
                bpb bpbVar = (bpb) obj;
                bpbVar.getClass();
                function1.invoke(Integer.valueOf(bpbVar.a));
                return Unit.a;
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new bwb(str2));
                return Unit.a;
            case 17:
                gec gecVar = (gec) obj;
                gecVar.getClass();
                function1.invoke(gecVar);
                return Unit.a;
            case 18:
                throw fn0.h(obj);
            case 19:
                throw fn0.h(obj);
            case 20:
                mzd mzdVar = (mzd) obj;
                mzdVar.getClass();
                function1.invoke(mzdVar);
                return Unit.a;
            case 21:
                pzd pzdVar = (pzd) obj;
                pzdVar.getClass();
                function1.invoke(pzdVar);
                return Unit.a;
            case 22:
                mzd mzdVar2 = (mzd) obj;
                mzdVar2.getClass();
                function1.invoke(mzdVar2);
                return Unit.a;
            case 23:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(Boolean.valueOf(Intrinsics.c(str3, "Graph")));
                return Unit.a;
            case 24:
                pzd pzdVar2 = (pzd) obj;
                pzdVar2.getClass();
                function1.invoke(pzdVar2);
                return Unit.a;
            case 25:
                function1.invoke(new m0e((c1e) obj));
                return Unit.a;
            case 26:
                function1.invoke(new p0e((d1e) obj));
                return Unit.a;
            case 27:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new l0e(str4));
                return Unit.a;
            case 28:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new n0e(str5));
                return Unit.a;
            default:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new o0e(str6));
                return Unit.a;
        }
    }
}
