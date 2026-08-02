package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e22 extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        d22 d22Var = (d22) obj;
        d22Var.getClass();
        if (d22Var instanceof c22) {
            return 0;
        }
        if (d22Var instanceof b22) {
            return 1;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        if (i == 0) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.boxscore_legend_section, viewGroup, false);
            if (inflate != null) {
                return new wh(new u22((TextView) inflate, 0));
            }
            yhk.s("rootView");
            return null;
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.boxscore_legend_category, viewGroup, false);
        int i2 = R.id.category_description;
        TextView textView = (TextView) nq8.B(R.id.category_description, inflate2);
        if (textView != null) {
            i2 = R.id.category_short_name;
            TextView textView2 = (TextView) nq8.B(R.id.category_short_name, inflate2);
            if (textView2 != null) {
                return new wh(new t22((LinearLayout) inflate2, textView, textView2, 0));
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        return null;
    }
}
