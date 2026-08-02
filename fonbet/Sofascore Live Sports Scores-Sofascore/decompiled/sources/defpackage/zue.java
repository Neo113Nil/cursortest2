package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zue extends o8 {
    public final nr1 d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zue(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.grid_positions;
        GridView gridView = (GridView) nq8.B(R.id.grid_positions, root);
        if (gridView != null) {
            i = R.id.player_position_field_holder;
            ImageView imageView = (ImageView) nq8.B(R.id.player_position_field_holder, root);
            if (imageView != null) {
                i = R.id.position_goalkeeper;
                View B = nq8.B(R.id.position_goalkeeper, root);
                if (B != null) {
                    yue a = yue.a(B);
                    i = R.id.strengths_content;
                    TextView textView = (TextView) nq8.B(R.id.strengths_content, root);
                    if (textView != null) {
                        i = R.id.strengths_title;
                        TextView textView2 = (TextView) nq8.B(R.id.strengths_title, root);
                        if (textView2 != null) {
                            i = R.id.weaknesses_content;
                            TextView textView3 = (TextView) nq8.B(R.id.weaknesses_content, root);
                            if (textView3 != null) {
                                i = R.id.weaknesses_title;
                                TextView textView4 = (TextView) nq8.B(R.id.weaknesses_title, root);
                                if (textView4 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) root;
                                    this.d = new nr1(constraintLayout, gridView, imageView, a, textView, textView2, textView3, textView4);
                                    constraintLayout.getClass();
                                    constraintLayout.setVisibility(8);
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
        return R.layout.player_position_layout;
    }
}
