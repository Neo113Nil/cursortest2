package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverEventsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w4i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDriverEventsFragment b;

    public /* synthetic */ w4i(StageDriverEventsFragment stageDriverEventsFragment, int i) {
        this.a = i;
        this.b = stageDriverEventsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        StageDriverEventsFragment stageDriverEventsFragment = this.b;
        switch (i) {
            case 0:
                e1d e1dVar = stageDriverEventsFragment.v;
                List list = (List) obj;
                krk krkVar = stageDriverEventsFragment.l;
                krkVar.getClass();
                ((oo8) krkVar).e.setRefreshing(false);
                if (list != null && !list.isEmpty()) {
                    ((eoh) e1dVar).setValue(list);
                    StageSeason stageSeason = (StageSeason) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue());
                    if (stageSeason != null) {
                        stageDriverEventsFragment.C().s();
                        ((h8i) stageDriverEventsFragment.s.getValue()).r = stageSeason;
                        stageDriverEventsFragment.u();
                    } else {
                        stageSeason = null;
                    }
                    ((eoh) stageDriverEventsFragment.w).setValue(stageSeason);
                    s7i C = stageDriverEventsFragment.C();
                    FrameLayout frameLayout = ((xhh) stageDriverEventsFragment.u.getValue()).a;
                    frameLayout.getClass();
                    C.p(C.g.size(), frameLayout);
                }
                break;
            case 1:
                joa joaVar = stageDriverEventsFragment.x;
                List list2 = (List) obj;
                krk krkVar2 = stageDriverEventsFragment.l;
                krkVar2.getClass();
                ((oo8) krkVar2).e.setRefreshing(false);
                if (list2 != null && !list2.isEmpty()) {
                    if (!stageDriverEventsFragment.C().h.isEmpty()) {
                        stageDriverEventsFragment.C().B((View) joaVar.getValue());
                    }
                    stageDriverEventsFragment.C().F(list2);
                } else if (stageDriverEventsFragment.C().i.isEmpty()) {
                    stageDriverEventsFragment.C().s();
                    if (stageDriverEventsFragment.C().h.isEmpty()) {
                        g7.o(stageDriverEventsFragment.C(), (View) joaVar.getValue(), 6);
                    }
                }
                break;
            default:
                StageSeason stageSeason2 = (StageSeason) obj;
                stageSeason2.getClass();
                ((eoh) stageDriverEventsFragment.w).setValue(stageSeason2);
                stageDriverEventsFragment.C().s();
                ((h8i) stageDriverEventsFragment.s.getValue()).r = stageSeason2;
                stageDriverEventsFragment.u();
                break;
        }
        return Unit.a;
    }
}
