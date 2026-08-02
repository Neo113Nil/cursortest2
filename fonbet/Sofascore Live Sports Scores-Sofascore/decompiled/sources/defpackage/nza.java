package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nza implements krk {
    public final TextView a;
    public final TextView b;

    public nza(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public static nza a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.league_spinner_item_dropdown, viewGroup, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            return new nza(textView, textView);
        }
        yhk.s("rootView");
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
