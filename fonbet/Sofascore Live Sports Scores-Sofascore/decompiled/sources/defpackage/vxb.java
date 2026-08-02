package defpackage;

import com.sofascore.results.main.matches.redesign.datematches.view.MatchesFilterBarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vxb implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MatchesFilterBarView b;

    public /* synthetic */ vxb(MatchesFilterBarView matchesFilterBarView) {
        this.b = matchesFilterBarView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        MatchesFilterBarView matchesFilterBarView = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                return MatchesFilterBarView.l(matchesFilterBarView, of3Var, num.intValue());
            default:
                num.getClass();
                int i2 = MatchesFilterBarView.r;
                matchesFilterBarView.a(aba.K(1), of3Var);
                return Unit.a;
        }
    }

    public /* synthetic */ vxb(MatchesFilterBarView matchesFilterBarView, int i) {
        this.b = matchesFilterBarView;
    }
}
