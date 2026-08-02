package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t22 implements krk {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;

    public /* synthetic */ t22(LinearLayout linearLayout, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = textView;
        this.d = textView2;
    }

    public static t22 a(View view) {
        int i = R.id.zone_name;
        TextView textView = (TextView) nq8.B(R.id.zone_name, view);
        if (textView != null) {
            i = R.id.zone_value;
            TextView textView2 = (TextView) nq8.B(R.id.zone_value, view);
            if (textView2 != null) {
                return new t22((LinearLayout) view, textView, textView2, 2);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static t22 b(View view) {
        int i = R.id.label;
        TextView textView = (TextView) nq8.B(R.id.label, view);
        if (textView != null) {
            i = R.id.value;
            TextView textView2 = (TextView) nq8.B(R.id.value, view);
            if (textView2 != null) {
                return new t22((LinearLayout) view, textView, textView2, 5);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static t22 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.league_details_info_grid, viewGroup, false);
        viewGroup.addView(inflate);
        int i = R.id.bottom_text;
        TextView textView = (TextView) nq8.B(R.id.bottom_text, inflate);
        if (textView != null) {
            i = R.id.top_text;
            TextView textView2 = (TextView) nq8.B(R.id.top_text, inflate);
            if (textView2 != null) {
                return new t22((LinearLayout) inflate, textView, textView2, 7);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
