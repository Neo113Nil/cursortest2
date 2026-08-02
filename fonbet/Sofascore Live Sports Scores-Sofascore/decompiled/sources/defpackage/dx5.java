package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dx5 implements krk {
    public final LinearLayout a;
    public final TextView b;

    public dx5(LinearLayout linearLayout, TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    public static dx5 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.event_date_sticky_header, viewGroup, false);
        int i = R.id.date_text;
        TextView textView = (TextView) nq8.B(R.id.date_text, inflate);
        if (textView != null) {
            i = R.id.number_text;
            if (((TextView) nq8.B(R.id.number_text, inflate)) != null) {
                return new dx5((LinearLayout) inflate, textView);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
