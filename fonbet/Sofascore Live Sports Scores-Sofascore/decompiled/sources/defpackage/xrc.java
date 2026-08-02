package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xrc extends y5 {
    public final drc B;
    public final TextView C;
    public final TextView D;
    public final hrc E;
    public final hrc F;
    public final hrc G;
    public final hrc H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final ImageView L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrc(Context context) {
        super(context, null);
        context.getClass();
        View root = getRoot();
        int i = R.id.leg_left_away;
        ImageView imageView = (ImageView) nq8.B(R.id.leg_left_away, root);
        if (imageView != null) {
            i = R.id.leg_left_home;
            ImageView imageView2 = (ImageView) nq8.B(R.id.leg_left_home, root);
            if (imageView2 != null) {
                i = R.id.leg_right_away;
                ImageView imageView3 = (ImageView) nq8.B(R.id.leg_right_away, root);
                if (imageView3 != null) {
                    i = R.id.leg_right_home;
                    ImageView imageView4 = (ImageView) nq8.B(R.id.leg_right_home, root);
                    if (imageView4 != null) {
                        i = R.id.legs_away_outline;
                        ImageView imageView5 = (ImageView) nq8.B(R.id.legs_away_outline, root);
                        if (imageView5 != null) {
                            i = R.id.legs_home_outline;
                            ImageView imageView6 = (ImageView) nq8.B(R.id.legs_home_outline, root);
                            if (imageView6 != null) {
                                i = R.id.text_box_primary;
                                View B = nq8.B(R.id.text_box_primary, root);
                                if (B != null) {
                                    e92 c = e92.c(B);
                                    hrc hrcVar = (hrc) c.c;
                                    hrc hrcVar2 = (hrc) c.f;
                                    ConstraintLayout constraintLayout = hrcVar2.a;
                                    View B2 = nq8.B(R.id.text_box_secondary, root);
                                    if (B2 != null) {
                                        e92 c2 = e92.c(B2);
                                        hrc hrcVar3 = (hrc) c2.c;
                                        hrc hrcVar4 = (hrc) c2.f;
                                        ConstraintLayout constraintLayout2 = hrcVar4.a;
                                        this.B = new drc((ConstraintLayout) root, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, c, c2);
                                        setupLayoutTransitions(hrcVar.a, constraintLayout, hrcVar3.a, constraintLayout2);
                                        m6.r(constraintLayout, hrcVar2.d.getId());
                                        m6.r(constraintLayout2, hrcVar4.d.getId());
                                        this.C = (TextView) c.d;
                                        this.D = (TextView) c2.d;
                                        this.E = hrcVar;
                                        this.F = hrcVar2;
                                        this.G = hrcVar3;
                                        this.H = hrcVar4;
                                        this.I = hkg.c0(context) ? imageView2 : imageView4;
                                        this.J = hkg.c0(context) ? imageView : imageView3;
                                        this.K = hkg.c0(context) ? imageView4 : imageView2;
                                        this.L = hkg.c0(context) ? imageView3 : imageView;
                                        return;
                                    }
                                    i = R.id.text_box_secondary;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_legs_rl_comparison_view;
    }

    @Override // defpackage.y5
    @NotNull
    public ImageView getPrimaryBodyPartAway() {
        return this.J;
    }

    @Override // defpackage.y5
    @NotNull
    public ImageView getPrimaryBodyPartHome() {
        return this.I;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.C;
    }

    @Override // defpackage.y5
    @NotNull
    public hrc getPrimaryTextLayoutAway() {
        return this.F;
    }

    @Override // defpackage.y5
    @NotNull
    public hrc getPrimaryTextLayoutHome() {
        return this.E;
    }

    @Override // defpackage.y5
    @NotNull
    public ImageView getSecondaryBodyPartAway() {
        return this.L;
    }

    @Override // defpackage.y5
    @NotNull
    public ImageView getSecondaryBodyPartHome() {
        return this.K;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getSecondaryLabel() {
        return this.D;
    }

    @Override // defpackage.y5
    @NotNull
    public hrc getSecondaryTextLayoutAway() {
        return this.H;
    }

    @Override // defpackage.y5
    @NotNull
    public hrc getSecondaryTextLayoutHome() {
        return this.G;
    }

    @Override // defpackage.y5
    public final void v() {
        Gender bodyGraphGender = getBodyGraphGender();
        Gender gender = Gender.Male;
        int i = bodyGraphGender == gender ? R.drawable.right_leg_zone_men : R.drawable.right_leg_zone_women;
        int i2 = getBodyGraphGender() == gender ? R.drawable.left_leg_zone_men : R.drawable.left_leg_zone_women;
        int i3 = getBodyGraphGender() == gender ? R.drawable.men_legs_outline : R.drawable.women_legs_outline;
        drc drcVar = this.B;
        drcVar.d.setImageResource(i3);
        drcVar.c.setImageResource(i3);
        getPrimaryBodyPartHome().setImageResource(i);
        getPrimaryBodyPartAway().setImageResource(i);
        getSecondaryBodyPartHome().setImageResource(i2);
        getSecondaryBodyPartAway().setImageResource(i2);
    }
}
