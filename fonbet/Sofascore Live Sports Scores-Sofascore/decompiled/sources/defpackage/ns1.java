package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.SeasonShotAction;
import com.sofascore.model.newNetwork.ShotActionArea;
import com.sofascore.model.newNetwork.TeamEventShotmapWrapper;
import com.sofascore.results.R;
import com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ns1 extends t2 {
    public final nr1 j;
    public zve k;
    public zve l;
    public se5 m;
    public boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(Context context, ob6 ob6Var, qb6 qb6Var, pb6 pb6Var) {
        super(context);
        context.getClass();
        qb6Var.getClass();
        pb6Var.getClass();
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.basketball_play_areas_collapsable, (ViewGroup) getBinding().a, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i2 = R.id.first_team_logo;
        ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, inflate);
        if (imageView != null) {
            i2 = R.id.legend_colors;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.legend_colors, inflate);
            if (linearLayout != null) {
                i2 = R.id.legend_text;
                if (((TextView) nq8.B(R.id.legend_text, inflate)) != null) {
                    i2 = R.id.no_shots_icon;
                    View B = nq8.B(R.id.no_shots_icon, inflate);
                    if (B != null) {
                        i2 = R.id.no_shots_text;
                        TextView textView = (TextView) nq8.B(R.id.no_shots_text, inflate);
                        if (textView != null) {
                            i2 = R.id.play_areas_first_team;
                            BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph = (BasketballShotmapPlayAreasGraph) nq8.B(R.id.play_areas_first_team, inflate);
                            if (basketballShotmapPlayAreasGraph != null) {
                                i2 = R.id.play_areas_second_team;
                                BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph2 = (BasketballShotmapPlayAreasGraph) nq8.B(R.id.play_areas_second_team, inflate);
                                if (basketballShotmapPlayAreasGraph2 != null) {
                                    i2 = R.id.second_team_logo;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                    if (imageView2 != null) {
                                        i2 = R.id.swap_indicator;
                                        if (((ImageView) nq8.B(R.id.swap_indicator, inflate)) != null) {
                                            i2 = R.id.swap_text;
                                            if (((TextView) nq8.B(R.id.swap_text, inflate)) != null) {
                                                this.j = new nr1(constraintLayout, constraintLayout, imageView, linearLayout, B, textView, basketballShotmapPlayAreasGraph, basketballShotmapPlayAreasGraph2, imageView2);
                                                final int i3 = 1;
                                                this.n = true;
                                                this.o = ao2.s(582, context);
                                                this.p = ao2.s(40, context);
                                                this.q = ao2.s(24, context);
                                                this.r = ao2.s(4, context);
                                                setVisibility(8);
                                                linearLayout.setClipToOutline(true);
                                                Integer valueOf = Integer.valueOf(R.drawable.ic_shotmap_terrain);
                                                constraintLayout.getClass();
                                                t2.j(this, R.string.team_event_shot_map, valueOf, R.color.surface_1, constraintLayout, false, "BASKETBALL_TEAM_EVENT_SHOTMAP", new s1(20, pb6Var, ob6Var), new vi(13, qb6Var), 34);
                                                basketballShotmapPlayAreasGraph.setOnClickListener(new View.OnClickListener(this) { // from class: ms1
                                                    public final /* synthetic */ ns1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = i;
                                                        ns1 ns1Var = this.b;
                                                        switch (i4) {
                                                            case 0:
                                                                ns1Var.n();
                                                                break;
                                                            default:
                                                                ns1Var.n();
                                                                break;
                                                        }
                                                    }
                                                });
                                                basketballShotmapPlayAreasGraph2.setOnClickListener(new View.OnClickListener(this) { // from class: ms1
                                                    public final /* synthetic */ ns1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = i3;
                                                        ns1 ns1Var = this.b;
                                                        switch (i4) {
                                                            case 0:
                                                                ns1Var.n();
                                                                break;
                                                            default:
                                                                ns1Var.n();
                                                                break;
                                                        }
                                                    }
                                                });
                                                basketballShotmapPlayAreasGraph.setClickable(false);
                                                basketballShotmapPlayAreasGraph2.setClickable(false);
                                                setTopDividerVisibility(false);
                                                setBottomDividerVisibility(false);
                                                o8.d(this, 0, 7);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void n() {
        int i = this.n ? 1 : 3;
        nr1 nr1Var = this.j;
        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph = (BasketballShotmapPlayAreasGraph) nr1Var.h;
        zve zveVar = this.k;
        if (zveVar == null) {
            Intrinsics.i("firstTeamData");
            throw null;
        }
        se5 se5Var = this.m;
        if (se5Var == null) {
            Intrinsics.i("seasonShotActionAreaWrapper");
            throw null;
        }
        basketballShotmapPlayAreasGraph.c(zveVar, se5Var, i, false);
        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph2 = (BasketballShotmapPlayAreasGraph) nr1Var.i;
        zve zveVar2 = this.l;
        if (zveVar2 == null) {
            Intrinsics.i("secondTeamData");
            throw null;
        }
        se5 se5Var2 = this.m;
        if (se5Var2 == null) {
            Intrinsics.i("seasonShotActionAreaWrapper");
            throw null;
        }
        basketballShotmapPlayAreasGraph2.c(zveVar2, se5Var2, i, false);
        this.n = !this.n;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mm3 mm3Var = new mm3();
        nr1 nr1Var = this.j;
        mm3Var.e((ConstraintLayout) nr1Var.d);
        mm3Var.d(R.id.play_areas_first_team, 7);
        mm3Var.d(R.id.play_areas_second_team, 3);
        mm3Var.d(R.id.play_areas_second_team, 6);
        mm3Var.d(R.id.first_team_logo, 6);
        mm3Var.d(R.id.first_team_logo, 7);
        int i5 = this.o;
        int i6 = this.r;
        if (i > i5) {
            mm3Var.f(R.id.play_areas_first_team, 7, R.id.play_areas_second_team, 6);
            mm3Var.f(R.id.play_areas_second_team, 6, R.id.play_areas_first_team, 7);
            mm3Var.f(R.id.play_areas_second_team, 3, R.id.play_areas_first_team, 3);
            mm3Var.f(R.id.first_team_logo, 7, R.id.play_areas_first_team, 6);
            mm3Var.r(R.id.play_areas_second_team, 3, 0);
            int i7 = this.p;
            mm3Var.r(R.id.play_areas_second_team, 7, i7);
            mm3Var.r(R.id.play_areas_first_team, 6, i7);
            mm3Var.r(R.id.first_team_logo, 7, i6);
        } else {
            mm3Var.f(R.id.play_areas_first_team, 7, 0, 7);
            mm3Var.f(R.id.play_areas_second_team, 6, 0, 6);
            mm3Var.f(R.id.play_areas_second_team, 3, R.id.play_areas_first_team, 4);
            mm3Var.f(R.id.first_team_logo, 6, R.id.play_areas_first_team, 7);
            mm3Var.r(R.id.play_areas_second_team, 3, this.q);
            mm3Var.r(R.id.play_areas_second_team, 7, 0);
            mm3Var.r(R.id.play_areas_first_team, 6, 0);
            mm3Var.r(R.id.first_team_logo, 6, i6);
        }
        ((ConstraintLayout) nr1Var.c).post(new r0(23, mm3Var, this));
    }

    public final void setShotMapData(@Nullable TeamEventShotmapWrapper teamEventShotmapWrapper) {
        if (teamEventShotmapWrapper == null) {
            setVisibility(8);
            return;
        }
        List<SeasonShotAction> firstTeamShotmap = teamEventShotmapWrapper.getFirstTeamShotmap();
        List<SeasonShotAction> secondTeamShotmap = teamEventShotmapWrapper.getSecondTeamShotmap();
        List<ShotActionArea> shotActionAreas = teamEventShotmapWrapper.getShotActionAreas();
        if (firstTeamShotmap.size() <= 10 || secondTeamShotmap.size() <= 10) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        zve zveVar = new zve();
        zve zveVar2 = new zve();
        Iterator<SeasonShotAction> it = firstTeamShotmap.iterator();
        while (it.hasNext()) {
            zveVar.a(it.next());
        }
        Iterator<SeasonShotAction> it2 = secondTeamShotmap.iterator();
        while (it2.hasNext()) {
            zveVar2.a(it2.next());
        }
        this.k = zveVar;
        this.l = zveVar2;
        se5 se5Var = new se5(shotActionAreas);
        this.m = se5Var;
        int i = this.n ? 3 : 1;
        nr1 nr1Var = this.j;
        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph = (BasketballShotmapPlayAreasGraph) nr1Var.h;
        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph2 = (BasketballShotmapPlayAreasGraph) nr1Var.i;
        zve zveVar3 = this.k;
        if (zveVar3 == null) {
            Intrinsics.i("firstTeamData");
            throw null;
        }
        basketballShotmapPlayAreasGraph.b(zveVar3, se5Var, false);
        zve zveVar4 = this.k;
        if (zveVar4 == null) {
            Intrinsics.i("firstTeamData");
            throw null;
        }
        se5 se5Var2 = this.m;
        if (se5Var2 == null) {
            Intrinsics.i("seasonShotActionAreaWrapper");
            throw null;
        }
        basketballShotmapPlayAreasGraph.c(zveVar4, se5Var2, i, false);
        zve zveVar5 = this.l;
        if (zveVar5 == null) {
            Intrinsics.i("secondTeamData");
            throw null;
        }
        se5 se5Var3 = this.m;
        if (se5Var3 == null) {
            Intrinsics.i("seasonShotActionAreaWrapper");
            throw null;
        }
        basketballShotmapPlayAreasGraph2.b(zveVar5, se5Var3, false);
        zve zveVar6 = this.l;
        if (zveVar6 == null) {
            Intrinsics.i("secondTeamData");
            throw null;
        }
        se5 se5Var4 = this.m;
        if (se5Var4 == null) {
            Intrinsics.i("seasonShotActionAreaWrapper");
            throw null;
        }
        basketballShotmapPlayAreasGraph2.c(zveVar6, se5Var4, i, false);
        boolean hasEmptyLabels = basketballShotmapPlayAreasGraph.getHasEmptyLabels();
        boolean hasEmptyLabels2 = basketballShotmapPlayAreasGraph2.getHasEmptyLabels();
        nr1Var.g.setVisibility((hasEmptyLabels || hasEmptyLabels2) ? 0 : 8);
        nr1Var.b.setVisibility((hasEmptyLabels || hasEmptyLabels2) ? 0 : 8);
        ((BasketballShotmapPlayAreasGraph) nr1Var.h).setClickable(true);
        basketballShotmapPlayAreasGraph2.setClickable(true);
    }
}
