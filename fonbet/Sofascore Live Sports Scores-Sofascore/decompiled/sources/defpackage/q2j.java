package defpackage;

import com.sofascore.results.bettingtips.fragment.TeamStreaksFragment;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class q2j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamStreaksFragment b;

    public /* synthetic */ q2j(TeamStreaksFragment teamStreaksFragment, int i) {
        this.a = i;
        this.b = teamStreaksFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TeamStreaksFragment teamStreaksFragment = this.b;
        switch (i) {
            case 0:
                e1d e1dVar = teamStreaksFragment.z;
                zu1 zu1Var = (zu1) obj;
                mqi mqiVar = u2j.a;
                zu1Var.getClass();
                Object obj2 = (List) ((Map) u2j.a.getValue()).get(zu1Var);
                if (obj2 == null) {
                    obj2 = km5.a;
                }
                ((eoh) e1dVar).setValue(obj2);
                ((eoh) teamStreaksFragment.A).setValue((m2j) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                teamStreaksFragment.I();
                break;
            default:
                m2j m2jVar = (m2j) obj;
                m2jVar.getClass();
                ((eoh) teamStreaksFragment.A).setValue(m2jVar);
                if (!m2jVar.a.equals(teamStreaksFragment.w)) {
                    teamStreaksFragment.w = null;
                    teamStreaksFragment.I();
                }
                break;
        }
        return Unit.a;
    }
}
