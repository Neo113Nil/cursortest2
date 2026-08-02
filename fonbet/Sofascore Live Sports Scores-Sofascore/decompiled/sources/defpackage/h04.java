package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h04 implements krk {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;

    public /* synthetic */ h04(ConstraintLayout constraintLayout, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
    }

    public static h04 a(View view) {
        int i = R.id.category_description;
        TextView textView = (TextView) nq8.B(R.id.category_description, view);
        if (textView != null) {
            i = R.id.category_short_name;
            TextView textView2 = (TextView) nq8.B(R.id.category_short_name, view);
            if (textView2 != null) {
                return new h04((ConstraintLayout) view, textView, textView2, 3);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static h04 b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_info, (ViewGroup) null, false);
        int i = R.id.info_text;
        TextView textView = (TextView) nq8.B(R.id.info_text, inflate);
        if (textView != null) {
            i = R.id.info_title;
            TextView textView2 = (TextView) nq8.B(R.id.info_title, inflate);
            if (textView2 != null) {
                return new h04((ConstraintLayout) inflate, textView, textView2, 1);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static h04 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_item_label, viewGroup, false);
        int i = R.id.label_end_text;
        TextView textView = (TextView) nq8.B(R.id.label_end_text, inflate);
        if (textView != null) {
            i = R.id.label_new;
            if (((TextView) nq8.B(R.id.label_new, inflate)) != null) {
                i = R.id.label_start_text;
                TextView textView2 = (TextView) nq8.B(R.id.label_start_text, inflate);
                if (textView2 != null) {
                    return new h04((ConstraintLayout) inflate, textView, textView2, 2);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static h04 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater.inflate(R.layout.player_league_career_stats_legend_item, viewGroup, false));
    }

    public static h04 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.subtitle_micro, viewGroup, false);
        int i = R.id.text_end;
        TextView textView = (TextView) nq8.B(R.id.text_end, inflate);
        if (textView != null) {
            i = R.id.text_start;
            TextView textView2 = (TextView) nq8.B(R.id.text_start, inflate);
            if (textView2 != null) {
                return new h04((ConstraintLayout) inflate, textView, textView2, 5);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
