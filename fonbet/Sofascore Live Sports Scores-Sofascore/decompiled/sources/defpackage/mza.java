package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mza implements krk {
    public final FrameLayout a;
    public final TextView b;

    public mza(FrameLayout frameLayout, TextView textView) {
        this.a = frameLayout;
        this.b = textView;
    }

    public static mza a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.league_spinner_item, viewGroup, false);
        TextView textView = (TextView) nq8.B(R.id.title, inflate);
        if (textView != null) {
            return new mza((FrameLayout) inflate, textView);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
