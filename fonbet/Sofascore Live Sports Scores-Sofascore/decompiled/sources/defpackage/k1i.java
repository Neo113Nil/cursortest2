package defpackage;

import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k1i implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageCategoryEventsFragment b;
    public final /* synthetic */ StageCategoryEventsFragment c;

    public /* synthetic */ k1i(StageCategoryEventsFragment stageCategoryEventsFragment, StageCategoryEventsFragment stageCategoryEventsFragment2, int i) {
        this.a = i;
        this.b = stageCategoryEventsFragment;
        this.c = stageCategoryEventsFragment2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        StageCategoryEventsFragment stageCategoryEventsFragment = this.b;
        StageCategoryEventsFragment stageCategoryEventsFragment2 = this.c;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                        break;
                    }
                } else {
                    if (Intrinsics.c(stageCategoryEventsFragment.toString(), ((i42) j52Var).a)) {
                    }
                    break;
                }
                krk krkVar = stageCategoryEventsFragment2.l;
                krkVar.getClass();
                ((xq8) krkVar).c.stopScroll();
                stageCategoryEventsFragment2.G((List) stageCategoryEventsFragment2.F().o.d());
            default:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                        break;
                    }
                } else {
                    if (Intrinsics.c(stageCategoryEventsFragment.toString(), ((i42) j52Var2).a)) {
                    }
                    break;
                }
                stageCategoryEventsFragment2.D().A();
        }
        return null;
    }
}
