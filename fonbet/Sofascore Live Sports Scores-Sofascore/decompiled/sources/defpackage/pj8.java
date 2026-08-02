package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.model.newNetwork.FeaturedPlayer;
import com.sofascore.results.R;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.graph.AttributeOverviewGraph;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class pj8 extends k3 {
    public final vu7 d;
    public final wt7 e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj8(Context context) {
        super(context, null, 0);
        context.getClass();
        vu7 a = vu7.a(getRoot());
        this.d = a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.featured_football_player_layout, (ViewGroup) a.c, false);
        int i = R.id.attribute_overview_graph;
        AttributeOverviewGraph attributeOverviewGraph = (AttributeOverviewGraph) nq8.B(R.id.attribute_overview_graph, inflate);
        if (attributeOverviewGraph != null) {
            i = R.id.featured_football_player_versus;
            if (((TextView) nq8.B(R.id.featured_football_player_versus, inflate)) != null) {
                i = R.id.first_player_layout;
                View B = nq8.B(R.id.first_player_layout, inflate);
                if (B != null) {
                    z82 c = z82.c(B);
                    i = R.id.legend_first_player;
                    View B2 = nq8.B(R.id.legend_first_player, inflate);
                    if (B2 != null) {
                        pu1 b = pu1.b(B2);
                        i = R.id.legend_second_player;
                        View B3 = nq8.B(R.id.legend_second_player, inflate);
                        if (B3 != null) {
                            pu1 b2 = pu1.b(B3);
                            i = R.id.second_player_layout;
                            View B4 = nq8.B(R.id.second_player_layout, inflate);
                            if (B4 != null) {
                                this.e = new wt7((ConstraintLayout) inflate, attributeOverviewGraph, c, b, b2, z82.c(B4));
                                LinearLayout linearLayout = a.a;
                                linearLayout.getClass();
                                linearLayout.setVisibility(8);
                                return;
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @NotNull
    public final vu7 getBinding() {
        return this.d;
    }

    @NotNull
    public final wt7 getFeaturedFootballPlayerBinding() {
        return this.e;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.featured_player_base_layout;
    }

    @Override // defpackage.k3
    public final void l(ky5 ky5Var, boolean z) {
        final FeaturedPlayer featuredPlayer;
        if (ky5Var == null) {
            setVisibility(8);
            return;
        }
        final FeaturedPlayer featuredPlayer2 = ky5Var.a;
        if (featuredPlayer2 == null || (featuredPlayer = ky5Var.b) == null || this.f) {
            return;
        }
        final int i = 1;
        this.f = true;
        vu7 vu7Var = this.d;
        vu7Var.b.d.setText(getContext().getString(z ? R.string.featured_players_female : R.string.featured_players));
        FrameLayout frameLayout = vu7Var.c;
        wt7 wt7Var = this.e;
        ConstraintLayout constraintLayout = wt7Var.a;
        AttributeOverviewGraph attributeOverviewGraph = wt7Var.b;
        z82 z82Var = wt7Var.f;
        z82 z82Var2 = wt7Var.c;
        frameLayout.addView(constraintLayout);
        ConstraintLayout constraintLayout2 = wt7Var.a;
        constraintLayout2.getClass();
        final int i2 = 0;
        constraintLayout2.setVisibility(0);
        as9.l((ImageView) z82Var2.g, featuredPlayer2.getPlayer().getId(), null);
        as9.l((ImageView) z82Var.g, featuredPlayer.getPlayer().getId(), null);
        ((TextView) z82Var2.d).setText(tba.t(featuredPlayer2.getPlayer()));
        ((TextView) z82Var.d).setText(tba.t(featuredPlayer.getPlayer()));
        Double rating = featuredPlayer2.getStatistics().getRating();
        double doubleValue = rating != null ? rating.doubleValue() : 0.0d;
        SofascoreSmallRatingView.l((SofascoreSmallRatingView) z82Var2.c, doubleValue > 0.001d ? Math.abs(doubleValue - 10.0d) < 0.001d ? "10" : String.valueOf(doubleValue) : "-");
        Double rating2 = featuredPlayer.getStatistics().getRating();
        double doubleValue2 = rating2 != null ? rating2.doubleValue() : 0.0d;
        SofascoreSmallRatingView.l((SofascoreSmallRatingView) z82Var.c, doubleValue2 > 0.001d ? Math.abs(doubleValue2 - 10.0d) < 0.001d ? "10" : String.valueOf(doubleValue2) : "-");
        attributeOverviewGraph.c(featuredPlayer2.getAttributeOverview());
        AttributeOverviewData attributeOverview = featuredPlayer.getAttributeOverview();
        if (attributeOverview != null) {
            AttributeOverviewGraph.d(attributeOverviewGraph, attributeOverview, 0, qm0.c, false, 26);
        }
        ((ShapeableImageView) z82Var2.f).setOnClickListener(new View.OnClickListener(this) { // from class: oj8
            public final /* synthetic */ pj8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                FeaturedPlayer featuredPlayer3 = featuredPlayer2;
                pj8 pj8Var = this.b;
                switch (i3) {
                    case 0:
                        int i4 = PlayerActivity.Z;
                        Context context = pj8Var.getContext();
                        context.getClass();
                        jle.q(context, featuredPlayer3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                    default:
                        int i5 = PlayerActivity.Z;
                        Context context2 = pj8Var.getContext();
                        context2.getClass();
                        jle.q(context2, featuredPlayer3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                }
            }
        });
        ((ShapeableImageView) z82Var.f).setOnClickListener(new View.OnClickListener(this) { // from class: oj8
            public final /* synthetic */ pj8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                FeaturedPlayer featuredPlayer3 = featuredPlayer;
                pj8 pj8Var = this.b;
                switch (i3) {
                    case 0:
                        int i4 = PlayerActivity.Z;
                        Context context = pj8Var.getContext();
                        context.getClass();
                        jle.q(context, featuredPlayer3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                    default:
                        int i5 = PlayerActivity.Z;
                        Context context2 = pj8Var.getContext();
                        context2.getClass();
                        jle.q(context2, featuredPlayer3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                }
            }
        });
        pu1 pu1Var = wt7Var.d;
        pu1Var.d.setText(tba.t(featuredPlayer2.getPlayer()));
        pu1Var.c.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.home_primary)));
        pu1 pu1Var2 = wt7Var.e;
        pu1Var2.d.setText(tba.t(featuredPlayer.getPlayer()));
        pu1Var2.c.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.away_primary)));
        LinearLayout linearLayout = vu7Var.a;
        linearLayout.getClass();
        linearLayout.setVisibility(0);
    }
}
