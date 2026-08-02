package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l2d extends o8 {
    public final z82 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2d(Context context) {
        super(context, null, 0);
        context.getClass();
        int s = ao2.s(8, context);
        View root = getRoot();
        int i = R.id.button_statistics;
        Button button = (Button) nq8.B(R.id.button_statistics, root);
        if (button != null) {
            i = R.id.category_container;
            if (((LinearLayout) nq8.B(R.id.category_container, root)) != null) {
                i = R.id.category_icon_statistics;
                ImageView imageView = (ImageView) nq8.B(R.id.category_icon_statistics, root);
                if (imageView != null) {
                    i = R.id.facts_value_container;
                    if (((LinearLayout) nq8.B(R.id.facts_value_container, root)) != null) {
                        i = R.id.icon_statistics;
                        if (((ImageView) nq8.B(R.id.icon_statistics, root)) != null) {
                            i = R.id.ll_data;
                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.ll_data, root);
                            if (linearLayout != null) {
                                i = R.id.player_event_statistics_lower_divider;
                                View B = nq8.B(R.id.player_event_statistics_lower_divider, root);
                                if (B != null) {
                                    i = R.id.player_event_statistics_upper_divider;
                                    View B2 = nq8.B(R.id.player_event_statistics_upper_divider, root);
                                    if (B2 != null) {
                                        i = R.id.text_statistics_category;
                                        TextView textView = (TextView) nq8.B(R.id.text_statistics_category, root);
                                        if (textView != null) {
                                            i = R.id.text_statistics_value;
                                            TextView textView2 = (TextView) nq8.B(R.id.text_statistics_value, root);
                                            if (textView2 != null) {
                                                i = R.id.text_statistics_value_2;
                                                if (((TextView) nq8.B(R.id.text_statistics_value_2, root)) != null) {
                                                    this.d = new z82((RelativeLayout) root, button, imageView, linearLayout, B, B2, textView, textView2);
                                                    linearLayout.setPadding(0, s, 0, s);
                                                    v9g.K(button.getBackground().mutate(), context.getColor(R.color.sofaAccentOrange));
                                                    button.setTextColor(context.getColor(R.color.sofaBadgeText_1));
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
        return R.layout.player_event_statistics_row;
    }

    public final void j(String str, boolean z) {
        z82 z82Var = this.d;
        ((TextView) z82Var.g).setVisibility(0);
        TextView textView = (TextView) z82Var.g;
        if (!z) {
            textView.setText(str);
            return;
        }
        if (str == null) {
            str = "";
        }
        l4a.K(textView, str);
    }
}
