package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.R;
import com.sofascore.results.view.FootballPlayAreasView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class b56 extends o8 {
    public static final /* synthetic */ int j = 0;
    public final tj8 d;
    public gc6 e;
    public boolean f;
    public Integer g;
    public Integer h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b56(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.graph_view;
        View B = nq8.B(R.id.graph_view, root);
        if (B != null) {
            ez0 b = ez0.b(B);
            SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, root);
            if (segmentedButtonsView != null) {
                this.d = new tj8((ConstraintLayout) root, b, segmentedButtonsView);
                setVisibility(8);
                this.i = true;
                return;
            }
            i = R.id.team_selector;
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @NotNull
    public final tj8 getBinding() {
        return this.d;
    }

    @Nullable
    public final Integer getFirstTeamId() {
        return this.g;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.football_home_away_play_areas;
    }

    @Nullable
    public final Integer getSecondTeamId() {
        return this.h;
    }

    public void j(gc6 gc6Var, Status status, Time time, boolean z) {
        status.getClass();
        if (gc6Var == null || !tgj.N(status, time)) {
            gc6Var = null;
        }
        this.e = gc6Var;
        setVisibility(gc6Var != null ? 0 : 8);
        setHomeSelected(z);
    }

    public final void l(int i, int i2) {
        this.g = Integer.valueOf(i);
        this.h = Integer.valueOf(i2);
        SegmentedButtonsView segmentedButtonsView = this.d.c;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        fv2 fv2Var = new fv2(this, 21);
        t1h[] t1hVarArr = {new r1h("First", new tc3(-1643907029, new nv5(i, 2), true)), new r1h("Second", new tc3(-1407737206, new nv5(i2, 3), true))};
        rlh rlhVar = rlh.b;
        rlhVar.getClass();
        hfe d = rlhVar.d();
        o13.w(d, t1hVarArr);
        b7 d2 = d.d();
        segmentedButtonsView.k = fv2Var;
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        if (d2 == null) {
            d2 = rlh.b;
        }
        if (d2.isEmpty()) {
            return;
        }
        SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
    }

    public final void setFirstTeamId(@Nullable Integer num) {
        this.g = num;
    }

    public final void setHomeSelected(boolean z) {
        int i;
        this.i = z;
        gc6 gc6Var = this.e;
        if (gc6Var != null) {
            tj8 tj8Var = this.d;
            if (z) {
                ((FootballPlayAreasView) tj8Var.b.e).h(gc6Var, jk8.a, this.f);
                i = R.color.home_primary;
            } else {
                ((FootballPlayAreasView) tj8Var.b.e).h(gc6Var, jk8.b, this.f);
                i = R.color.away_primary;
            }
            ez0 ez0Var = tj8Var.b;
            ((View) ez0Var.c).setAlpha(0.3f);
            ((View) ez0Var.c).setBackgroundColor(getContext().getColor(i));
            ((ImageView) ez0Var.d).setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
        }
    }

    public final void setSecondTeamId(@Nullable Integer num) {
        this.h = num;
    }

    public final void setShareMode(boolean z) {
        this.f = z;
    }
}
