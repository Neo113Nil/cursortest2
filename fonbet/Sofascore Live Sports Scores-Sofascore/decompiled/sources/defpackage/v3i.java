package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.stagesport.StageDriverActivity;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class v3i implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDetailsResultsFragment b;

    public /* synthetic */ v3i(StageDetailsResultsFragment stageDetailsResultsFragment, int i) {
        this.a = i;
        this.b = stageDetailsResultsFragment;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                TvChannelData tvChannelData = (TvChannelData) obj2;
                o3k o3kVar = (o3k) obj3;
                tvChannelData.getClass();
                o3kVar.getClass();
                g4i G = stageDetailsResultsFragment.G();
                xw3.L(un0.z(G), null, null, new z23(G, intValue, tvChannelData, o3kVar, (rq3) null, 18), 3);
                break;
            default:
                ((Integer) obj2).getClass();
                m6i m6iVar = (m6i) obj3;
                ((View) obj).getClass();
                m6iVar.getClass();
                if (m6iVar instanceof o6i) {
                    int i2 = StageDriverActivity.R;
                    Context requireContext = stageDetailsResultsFragment.requireContext();
                    requireContext.getClass();
                    pff.g(((o6i) m6iVar).a.getTeam().getId(), requireContext);
                }
                break;
        }
        return Unit.a;
    }
}
