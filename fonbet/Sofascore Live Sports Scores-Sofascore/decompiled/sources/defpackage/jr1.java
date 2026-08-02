package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.newNetwork.FeaturedPlayer;
import com.sofascore.results.R;
import com.sofascore.results.view.graph.BasketballShotmapGraph;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jr1 extends k3 {
    public final vu7 d;
    public dd e;
    public final otk f;
    public boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jr1(Fragment fragment) {
        super(r0, null, 0);
        Context requireContext = fragment.requireContext();
        requireContext.getClass();
        vu7 a = vu7.a(getRoot());
        this.d = a;
        joa a2 = ypa.a(ysa.c, new w1(new w1(fragment, 17), 18));
        this.f = new otk(duf.a.getOrCreateKotlinClass(eu1.class), new x1(a2, 13), new y1(11, fragment, a2), new x1(a2, 14));
        LinearLayout linearLayout = a.a;
        linearLayout.getClass();
        linearLayout.setVisibility(8);
        getViewModel().g.e(fragment.getViewLifecycleOwner(), new y7(3, new u2(this, 22)));
    }

    private final eu1 getViewModel() {
        return (eu1) this.f.getValue();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.featured_player_base_layout;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.k3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ky5 ky5Var, boolean z) {
        FeaturedPlayer featuredPlayer;
        FeaturedPlayer featuredPlayer2;
        if (ky5Var == null || (featuredPlayer2 = ky5Var.a) == null) {
            if (ky5Var == null) {
                featuredPlayer = null;
                if (featuredPlayer != null) {
                    setVisibility(8);
                    return;
                }
                if (this.g) {
                    return;
                }
                this.g = true;
                vu7 vu7Var = this.d;
                kqb kqbVar = vu7Var.b;
                FrameLayout frameLayout = vu7Var.c;
                kqbVar.d.setText(getContext().getString(z ? R.string.featured_player_female : R.string.featured_player));
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.featured_basketball_player_layout, (ViewGroup) frameLayout, false);
                int i = R.id.chevron_image;
                if (((ImageView) nq8.B(R.id.chevron_image, inflate)) != null) {
                    i = R.id.clickable_area_end_barrier;
                    if (((Barrier) nq8.B(R.id.clickable_area_end_barrier, inflate)) != null) {
                        i = R.id.clickable_area_start_barrier;
                        if (((Barrier) nq8.B(R.id.clickable_area_start_barrier, inflate)) != null) {
                            i = R.id.featured_basketball_player_assists;
                            TextView textView = (TextView) nq8.B(R.id.featured_basketball_player_assists, inflate);
                            if (textView != null) {
                                i = R.id.featured_basketball_player_assists_label;
                                if (((TextView) nq8.B(R.id.featured_basketball_player_assists_label, inflate)) != null) {
                                    i = R.id.featured_basketball_player_click_area;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.featured_basketball_player_click_area, inflate);
                                    if (shapeableImageView != null) {
                                        i = R.id.featured_basketball_player_logo;
                                        ImageView imageView = (ImageView) nq8.B(R.id.featured_basketball_player_logo, inflate);
                                        if (imageView != null) {
                                            i = R.id.featured_basketball_player_name;
                                            TextView textView2 = (TextView) nq8.B(R.id.featured_basketball_player_name, inflate);
                                            if (textView2 != null) {
                                                i = R.id.featured_basketball_player_points;
                                                TextView textView3 = (TextView) nq8.B(R.id.featured_basketball_player_points, inflate);
                                                if (textView3 != null) {
                                                    i = R.id.featured_basketball_player_points_label;
                                                    if (((TextView) nq8.B(R.id.featured_basketball_player_points_label, inflate)) != null) {
                                                        i = R.id.featured_basketball_player_rebounds;
                                                        TextView textView4 = (TextView) nq8.B(R.id.featured_basketball_player_rebounds, inflate);
                                                        if (textView4 != null) {
                                                            i = R.id.featured_basketball_player_rebounds_label;
                                                            if (((TextView) nq8.B(R.id.featured_basketball_player_rebounds_label, inflate)) != null) {
                                                                i = R.id.featured_basketball_player_shot_map;
                                                                BasketballShotmapGraph basketballShotmapGraph = (BasketballShotmapGraph) nq8.B(R.id.featured_basketball_player_shot_map, inflate);
                                                                if (basketballShotmapGraph != null) {
                                                                    i = R.id.padding_view;
                                                                    View B = nq8.B(R.id.padding_view, inflate);
                                                                    if (B != null) {
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                        this.e = new dd(constraintLayout, textView, shapeableImageView, imageView, textView2, textView3, textView4, basketballShotmapGraph, B);
                                                                        frameLayout.addView(constraintLayout);
                                                                        constraintLayout.setVisibility(0);
                                                                        as9.l(imageView, featuredPlayer.getPlayer().getId(), null);
                                                                        textView2.setText(tba.t(featuredPlayer.getPlayer()));
                                                                        BasketballPlayerEventStatistics basketballStatistics = featuredPlayer.getBasketballStatistics();
                                                                        if (basketballStatistics != null) {
                                                                            textView3.setText(String.valueOf(basketballStatistics.getPoints()));
                                                                            textView4.setText(String.valueOf(basketballStatistics.getRebounds()));
                                                                            textView.setText(String.valueOf(basketballStatistics.getAssists()));
                                                                        }
                                                                        Integer eventId = featuredPlayer.getEventId();
                                                                        if (eventId != null) {
                                                                            int intValue = eventId.intValue();
                                                                            eu1 viewModel = getViewModel();
                                                                            int id = featuredPlayer.getPlayer().getId();
                                                                            viewModel.getClass();
                                                                            xw3.L(un0.z(viewModel), null, null, new du1(viewModel, intValue, id, null, 0), 3);
                                                                        } else {
                                                                            basketballShotmapGraph.setVisibility(8);
                                                                        }
                                                                        shapeableImageView.setOnClickListener(new cn(7, this, featuredPlayer));
                                                                        vu7Var.a.setVisibility(0);
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
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return;
            }
            featuredPlayer2 = ky5Var.b;
        }
        featuredPlayer = featuredPlayer2;
        if (featuredPlayer != null) {
        }
    }
}
