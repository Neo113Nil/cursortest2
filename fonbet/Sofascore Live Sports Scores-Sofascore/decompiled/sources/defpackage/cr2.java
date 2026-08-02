package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.textview.MaterialTextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cr2 implements krk {
    public final FrameLayout a;
    public final MaterialTextView b;

    public cr2(FrameLayout frameLayout, MaterialTextView materialTextView) {
        this.a = frameLayout;
        this.b = materialTextView;
    }

    public static cr2 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.chat_date_separator, viewGroup, false);
        MaterialTextView materialTextView = (MaterialTextView) nq8.B(R.id.date, inflate);
        if (materialTextView != null) {
            return new cr2((FrameLayout) inflate, materialTextView);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.date)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
