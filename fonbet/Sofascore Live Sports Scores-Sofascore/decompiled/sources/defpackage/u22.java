package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u22 implements krk {
    public final /* synthetic */ int a;
    public final TextView b;

    public /* synthetic */ u22(TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    public static u22 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_race_updates_info, viewGroup, false);
        if (inflate != null) {
            return new u22((TextView) inflate, 3);
        }
        yhk.s("rootView");
        return null;
    }

    public static u22 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.player_league_career_stats_header_item, viewGroup, false);
        if (inflate != null) {
            return new u22((TextView) inflate, 5);
        }
        yhk.s("rootView");
        return null;
    }

    public static u22 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.player_league_career_stats_item, viewGroup, false);
        if (inflate != null) {
            return new u22((TextView) inflate, 6);
        }
        yhk.s("rootView");
        return null;
    }

    public static u22 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.sub_section_center, viewGroup, false);
        if (inflate != null) {
            return new u22((TextView) inflate, 8);
        }
        yhk.s("rootView");
        return null;
    }

    public static u22 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.tournament_group_list_item_layout, viewGroup, false);
        if (inflate != null) {
            return new u22((TextView) inflate, 9);
        }
        yhk.s("rootView");
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
