package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.results.R;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.sofascore.results.player.details.view.PlayerPentagonSlider;
import com.sofascore.results.view.graph.AttributeOverviewGraph;
import java.util.Calendar;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class moe extends o8 {
    public final z82 d;
    public AttributeOverviewData e;
    public AttributeOverviewData f;
    public AttributeOverviewResponse g;
    public final mqi h;
    public final mqi i;
    public final mqi j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moe(Context context) {
        super(context, null, 0);
        Drawable mutate;
        context.getClass();
        Drawable drawable = null;
        View root = getRoot();
        int i = R.id.attribute_overview_graph;
        AttributeOverviewGraph attributeOverviewGraph = (AttributeOverviewGraph) nq8.B(R.id.attribute_overview_graph, root);
        if (attributeOverviewGraph != null) {
            i = R.id.legend_average_rating;
            View B = nq8.B(R.id.legend_average_rating, root);
            if (B != null) {
                gh5 c = gh5.c(B);
                i = R.id.player_compare_view;
                PlayerCompareView playerCompareView = (PlayerCompareView) nq8.B(R.id.player_compare_view, root);
                if (playerCompareView != null) {
                    i = R.id.player_pentagon_info_holder;
                    View B2 = nq8.B(R.id.player_pentagon_info_holder, root);
                    if (B2 != null) {
                        kqb b = kqb.b(B2);
                        i = R.id.player_pentagon_slider;
                        PlayerPentagonSlider playerPentagonSlider = (PlayerPentagonSlider) nq8.B(R.id.player_pentagon_slider, root);
                        if (playerPentagonSlider != null) {
                            LinearLayout linearLayout = (LinearLayout) root;
                            this.d = new z82(linearLayout, attributeOverviewGraph, c, playerCompareView, b, playerPentagonSlider, 23);
                            this.h = ypa.b(new nzd(context, 2));
                            this.i = ypa.b(new nzd(context, 3));
                            this.j = ypa.b(new nzd(context, 4));
                            o8.d(this, 0, 7);
                            linearLayout.getClass();
                            linearLayout.setVisibility(8);
                            ImageView imageView = c.c;
                            imageView.setVisibility(0);
                            Integer valueOf = (4 & 2) != 0 ? null : Integer.valueOf(R.color.n_lv_1);
                            Drawable drawable2 = context.getDrawable(R.drawable.ic_info);
                            if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
                                if (valueOf != null) {
                                    mutate.setTint(context.getColor(valueOf.intValue()));
                                }
                                drawable = mutate;
                            }
                            apf a = ajh.a(imageView.getContext());
                            ht9 ht9Var = new ht9(imageView.getContext());
                            ht9Var.c = drawable;
                            fc6.w(ht9Var, imageView, a);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final int getColorNeutralDefault() {
        return ((Number) this.i.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColorPrimaryDefault() {
        return ((Number) this.h.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColorValue() {
        return ((Number) this.j.getValue()).intValue();
    }

    public static final Unit o(moe moeVar, AttributeOverviewResponse attributeOverviewResponse, int i) {
        AttributeOverviewResponse attributeOverviewResponse2 = moeVar.g;
        z82 z82Var = moeVar.d;
        if (attributeOverviewResponse2 != null) {
            ((AttributeOverviewGraph) z82Var.f).c(attributeOverviewResponse.getPlayerAttributes().get(Integer.valueOf(i)));
            AttributeOverviewResponse attributeOverviewResponse3 = moeVar.g;
            attributeOverviewResponse3.getClass();
            AttributeOverviewData attributeOverviewData = attributeOverviewResponse3.getPlayerAttributes().get(Integer.valueOf(i));
            if (attributeOverviewData != null) {
                ((gh5) z82Var.d).d.setText(moeVar.getContext().getString(R.string.attribute_overview_displayed));
            } else {
                Calendar calendar = ke0.a;
                Context context = moeVar.getContext();
                context.getClass();
                ke0.g(context, moeVar.getContext().getString(R.string.no_data_for_comparison), 0);
            }
            AttributeOverviewGraph.d((AttributeOverviewGraph) z82Var.f, attributeOverviewData, moeVar.getColorPrimaryDefault(), qm0.c, true, 16);
        } else if (i == 0) {
            AttributeOverviewGraph.d((AttributeOverviewGraph) z82Var.f, moeVar.e, moeVar.getColorValue(), qm0.a, false, 16);
            ((gh5) z82Var.d).d.setText(R.string.football_attribute_overview_avg_values);
        } else {
            AttributeOverviewGraph.d((AttributeOverviewGraph) z82Var.f, attributeOverviewResponse.getPlayerAttributes().get(Integer.valueOf(i)), moeVar.getColorNeutralDefault(), qm0.b, true, 16);
            ((gh5) z82Var.d).d.setText(R.string.player_pentagon_history_legend);
        }
        return Unit.a;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_details_pentagon_layout;
    }

    public final void n(Player player, AttributeOverviewResponse attributeOverviewResponse) {
        Drawable mutate;
        player.getClass();
        attributeOverviewResponse.getClass();
        AttributeOverviewData currentAttributes = attributeOverviewResponse.getCurrentAttributes();
        Drawable drawable = null;
        if (currentAttributes != null) {
            z82 z82Var = this.d;
            LinearLayout linearLayout = (LinearLayout) z82Var.b;
            kqb kqbVar = (kqb) z82Var.e;
            AttributeOverviewGraph attributeOverviewGraph = (AttributeOverviewGraph) z82Var.f;
            PlayerPentagonSlider playerPentagonSlider = (PlayerPentagonSlider) z82Var.g;
            linearLayout.getClass();
            linearLayout.setVisibility(0);
            if (!this.k) {
                this.k = true;
                Set<Integer> keySet = attributeOverviewResponse.getPlayerAttributes().keySet();
                if (keySet.size() <= 1) {
                    keySet = null;
                }
                if (keySet != null) {
                    playerPentagonSlider.setVisibility(0);
                    playerPentagonSlider.o(CollectionsKt.S0(keySet), new ord(14, this, attributeOverviewResponse));
                } else {
                    playerPentagonSlider.setVisibility(8);
                }
                ((PlayerCompareView) z82Var.c).l(player);
                ((gh5) z82Var.d).d.setText(R.string.football_attribute_overview_avg_values);
                attributeOverviewGraph.c(currentAttributes);
                AttributeOverviewData currentAverage = attributeOverviewResponse.getCurrentAverage();
                if (currentAverage != null) {
                    AttributeOverviewGraph.d(attributeOverviewGraph, currentAverage, getColorValue(), qm0.a, false, 16);
                } else {
                    currentAverage = null;
                }
                this.e = currentAverage;
                kqbVar.d.setText(getContext().getString(R.string.football_attribute_overview_title));
                ImageView imageView = kqbVar.c;
                imageView.setVisibility(0);
                aba.y(imageView, 0, 1);
                Context context = imageView.getContext();
                context.getClass();
                Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                if ((4 & 2) != 0) {
                    valueOf = null;
                }
                Drawable drawable2 = context.getDrawable(R.drawable.ic_info);
                if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
                    if (valueOf != null) {
                        mutate.setTint(context.getColor(valueOf.intValue()));
                    }
                    drawable = mutate;
                }
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = drawable;
                vt9.f(ht9Var, imageView);
                a.a(ht9Var.a());
                z8e.a0(imageView, 1000L, new zbe(3, imageView, currentAttributes));
            }
        } else {
            currentAttributes = null;
        }
        this.f = currentAttributes;
    }

    public final void setPlayerAttributeOverview(@Nullable AttributeOverviewResponse attributeOverviewResponse) {
        ((PlayerCompareView) this.d.c).setPlayerAttributeOverview(attributeOverviewResponse);
    }
}
