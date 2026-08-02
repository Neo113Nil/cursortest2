package defpackage;

import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import com.sofascore.results.stagesport.StageTeamOddsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nb5 implements krk {
    public final LinearLayout a;
    public final StageTeamOddsView b;
    public final GridView c;
    public final xz0 d;

    public nb5(LinearLayout linearLayout, StageTeamOddsView stageTeamOddsView, GridView gridView, xz0 xz0Var) {
        this.a = linearLayout;
        this.b = stageTeamOddsView;
        this.c = gridView;
        this.d = xz0Var;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
