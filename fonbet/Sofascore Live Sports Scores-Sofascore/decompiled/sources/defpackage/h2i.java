package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorDetailsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h2i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageConstructorDetailsFragment b;
    public final /* synthetic */ Team c;

    public /* synthetic */ h2i(StageConstructorDetailsFragment stageConstructorDetailsFragment, Team team, int i) {
        this.a = i;
        this.b = stageConstructorDetailsFragment;
        this.c = team;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Team team = this.c;
        StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
        switch (i) {
            case 0:
                int i2 = StageConstructorActivity.R;
                Context requireContext = stageConstructorDetailsFragment.requireContext();
                requireContext.getClass();
                dff.g(team.getId(), requireContext);
                break;
            default:
                int i3 = StageDriverActivity.R;
                Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                requireContext2.getClass();
                pff.g(team.getId(), requireContext2);
                break;
        }
    }
}
