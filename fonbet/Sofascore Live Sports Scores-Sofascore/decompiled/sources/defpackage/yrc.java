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
/* loaded from: classes6.dex */
public final class yrc extends z5 {
    public final ImageView A;
    public final up9 u;
    public final TextView v;
    public final TextView w;
    public final hrc x;
    public final hrc y;
    public final ImageView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrc(Context context) {
        super(context, false);
        context.getClass();
        View root = getRoot();
        int i = R.id.label_primary;
        TextView textView = (TextView) nq8.B(R.id.label_primary, root);
        if (textView != null) {
            i = R.id.label_secondary;
            TextView textView2 = (TextView) nq8.B(R.id.label_secondary, root);
            if (textView2 != null) {
                i = R.id.leg_left;
                ImageView imageView = (ImageView) nq8.B(R.id.leg_left, root);
                if (imageView != null) {
                    i = R.id.leg_right;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.leg_right, root);
                    if (imageView2 != null) {
                        i = R.id.legs_outline;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.legs_outline, root);
                        if (imageView3 != null) {
                            i = R.id.text_layout_primary;
                            View B = nq8.B(R.id.text_layout_primary, root);
                            if (B != null) {
                                hrc a = hrc.a(B);
                                i = R.id.text_layout_secondary;
                                View B2 = nq8.B(R.id.text_layout_secondary, root);
                                if (B2 != null) {
                                    hrc a2 = hrc.a(B2);
                                    this.u = new up9((ConstraintLayout) root, textView, textView2, imageView, imageView2, imageView3, a, a2);
                                    setupLayoutTransitions(a.a, a2.a);
                                    this.v = textView;
                                    this.w = textView2;
                                    this.x = a;
                                    this.y = a2;
                                    this.z = hkg.c0(context) ? imageView : imageView2;
                                    this.A = hkg.c0(context) ? imageView2 : imageView;
                                    return;
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
        return R.layout.mma_statistics_legs_rl_view;
    }

    @Override // defpackage.z5
    @NotNull
    public ImageView getPrimaryBodyPart() {
        return this.z;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.v;
    }

    @Override // defpackage.z5
    @NotNull
    public hrc getPrimaryTextLayout() {
        return this.x;
    }

    @Override // defpackage.z5
    @NotNull
    public ImageView getSecondaryBodyPart() {
        return this.A;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getSecondaryLabel() {
        return this.w;
    }

    @Override // defpackage.z5
    @NotNull
    public hrc getSecondaryTextLayout() {
        return this.y;
    }

    @Override // defpackage.z5
    public final void q() {
        Gender bodyGraphGender = getBodyGraphGender();
        Gender gender = Gender.Male;
        int i = bodyGraphGender == gender ? R.drawable.right_leg_zone_men : R.drawable.right_leg_zone_women;
        int i2 = getBodyGraphGender() == gender ? R.drawable.left_leg_zone_men : R.drawable.left_leg_zone_women;
        this.u.c.setImageResource(getBodyGraphGender() == gender ? R.drawable.men_legs_outline : R.drawable.women_legs_outline);
        getPrimaryBodyPart().setImageResource(i);
        getSecondaryBodyPart().setImageResource(i2);
    }
}
