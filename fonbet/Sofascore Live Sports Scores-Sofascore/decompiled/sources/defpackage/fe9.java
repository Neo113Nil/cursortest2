package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.hockey.HockeyEventMapView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fe9 extends t2 {
    public final Context j;
    public final ez0 k;
    public List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe9(Context context) {
        super(context);
        context.getClass();
        this.j = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.hockey_pesm_shotmap_collapsable, (ViewGroup) getBinding().a, false);
        int i = R.id.arrow;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow, inflate);
        if (imageView != null) {
            i = R.id.shot_type_tabs;
            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.shot_type_tabs, inflate);
            if (typeHeaderView != null) {
                i = R.id.shotmap;
                HockeyEventMapView hockeyEventMapView = (HockeyEventMapView) nq8.B(R.id.shotmap, inflate);
                if (hockeyEventMapView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.k = new ez0(constraintLayout, imageView, typeHeaderView, hockeyEventMapView, 15);
                    this.l = km5.a;
                    setVisibility(8);
                    Integer valueOf = Integer.valueOf(R.drawable.hockey_shotmap_icon);
                    constraintLayout.getClass();
                    t2.j(this, R.string.hockey_game_shotmap, valueOf, 0, constraintLayout, false, "HOCKEY_PESM_SHOTMAP", null, null, 426);
                    LinearLayout linearLayout = getBinding().a;
                    linearLayout.getClass();
                    aba.I(linearLayout);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void n(ArrayList arrayList, TeamSelection teamSelection) {
        teamSelection.getClass();
        if (!arrayList.isEmpty() || getVisibility() == 0) {
            this.l = arrayList;
            List q = i5h.q(i5h.n(new oh0(i5h.n(new a65(i5h.n(new oh0(arrayList, 1), new c69(24)), new gfg(11), 0), new c69(25)), 6), new c69(26)));
            TeamSelection teamSelection2 = TeamSelection.First;
            TeamSelection teamSelection3 = (teamSelection == teamSelection2) ^ hkg.c0(this.j) ? teamSelection2 : TeamSelection.Second;
            ez0 ez0Var = this.k;
            ((ImageView) ez0Var.c).setScaleX(teamSelection3 == teamSelection2 ? 1.0f : -1.0f);
            g5k g5kVar = new g5k((TypeHeaderView) ez0Var.d);
            p4h p4hVar = he9.f;
            g5kVar.a = CollectionsKt.w0(q, a.c(Season.YEAR_ALL_TIME));
            g5kVar.j = true;
            g5kVar.a();
            g5kVar.d = new yx7(this, 20);
            g5kVar.m = new u04(1, arrayList, this, teamSelection);
            g5kVar.b();
            setVisibility(0);
        }
    }
}
