package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o16 implements krk {
    public final /* synthetic */ int a;
    public final FrameLayout b;
    public final TextView c;

    public /* synthetic */ o16(FrameLayout frameLayout, TextView textView, int i) {
        this.a = i;
        this.b = frameLayout;
        this.c = textView;
    }

    public static o16 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.round_layout, viewGroup, false);
        TextView textView = (TextView) nq8.B(R.id.round_text, inflate);
        if (textView != null) {
            return new o16((FrameLayout) inflate, textView, 4);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.round_text)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
