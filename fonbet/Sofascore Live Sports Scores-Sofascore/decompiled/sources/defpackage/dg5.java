package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dg5 extends o8 {
    public final dd d;
    public final int e;
    public final int f;
    public final List g;
    public final List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg5(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.first_team_stats_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.first_team_stats_container, root);
        if (linearLayout != null) {
            i = R.id.objective_first_1;
            View B = nq8.B(R.id.objective_first_1, root);
            if (B != null) {
                nq5 a = nq5.a(B);
                i = R.id.objective_first_2;
                View B2 = nq8.B(R.id.objective_first_2, root);
                if (B2 != null) {
                    nq5 a2 = nq5.a(B2);
                    i = R.id.objective_first_3;
                    View B3 = nq8.B(R.id.objective_first_3, root);
                    if (B3 != null) {
                        nq5 a3 = nq5.a(B3);
                        i = R.id.objective_first_4;
                        View B4 = nq8.B(R.id.objective_first_4, root);
                        if (B4 != null) {
                            nq5 a4 = nq5.a(B4);
                            i = R.id.objective_second_1;
                            View B5 = nq8.B(R.id.objective_second_1, root);
                            if (B5 != null) {
                                nq5 a5 = nq5.a(B5);
                                i = R.id.objective_second_2;
                                View B6 = nq8.B(R.id.objective_second_2, root);
                                if (B6 != null) {
                                    nq5 a6 = nq5.a(B6);
                                    i = R.id.objective_second_3;
                                    View B7 = nq8.B(R.id.objective_second_3, root);
                                    if (B7 != null) {
                                        nq5 a7 = nq5.a(B7);
                                        i = R.id.objective_second_4;
                                        View B8 = nq8.B(R.id.objective_second_4, root);
                                        if (B8 != null) {
                                            nq5 a8 = nq5.a(B8);
                                            i = R.id.second_team_stats_container;
                                            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.second_team_stats_container, root);
                                            if (linearLayout2 != null) {
                                                i = R.id.title;
                                                if (((TextView) nq8.B(R.id.title, root)) != null) {
                                                    this.d = new dd((ConstraintLayout) root, linearLayout, a, a2, a3, a4, a5, a6, a7, a8, linearLayout2);
                                                    this.e = ao2.s(4, context);
                                                    this.f = ao2.s(12, context);
                                                    this.g = b.j(a, a2, a3, a4);
                                                    this.h = b.j(a5, a6, a7, a8);
                                                    setVisibility(8);
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
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.esports_game_objectives_layout;
    }

    public final void j(nq5 nq5Var, Integer num, int i, int i2) {
        String str;
        Drawable drawable = getContext().getDrawable(i);
        if (drawable != null) {
            drawable.mutate().setTint(i2);
        } else {
            drawable = null;
        }
        ImageView imageView = nq5Var.c;
        TextView textView = nq5Var.b;
        imageView.setImageDrawable(drawable);
        if (num == null || (str = String.valueOf(num.intValue())) == null) {
            str = "0";
        }
        textView.setText(str);
        if ((num != null ? num.intValue() : 0) > 0) {
            haa.C(textView);
        } else {
            haa.D(textView);
        }
    }
}
