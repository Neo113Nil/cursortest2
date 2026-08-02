package defpackage;

import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jch extends b56 {
    @Override // defpackage.b56
    public final void j(gc6 gc6Var, Status status, Time time, boolean z) {
        status.getClass();
        setShareMode(true);
        Integer firstTeamId = getFirstTeamId();
        Integer secondTeamId = getSecondTeamId();
        if (firstTeamId != null && secondTeamId != null) {
            r1h r1hVar = z ? new r1h("FIRST", new tc3(-752975708, new nv5(firstTeamId.intValue(), 4), true)) : new r1h("SECOND", new tc3(471016699, new nv5(secondTeamId.intValue(), 5), true));
            SegmentedButtonsView segmentedButtonsView = getBinding().c;
            Boolean bool = Boolean.FALSE;
            Pair pair = new Pair(bool, bool);
            vqg vqgVar = new vqg(29);
            segmentedButtonsView.k = null;
            segmentedButtonsView.g = false;
            segmentedButtonsView.h = pair;
            segmentedButtonsView.j = v1h.f;
            segmentedButtonsView.i = vqgVar;
            rlh rlhVar = rlh.b;
            if (!rlhVar.isEmpty()) {
                SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
            }
            SegmentedButtonsView.t(getBinding().c, a.c(r1hVar), null, 6);
        }
        super.j(gc6Var, status, time, z);
    }
}
