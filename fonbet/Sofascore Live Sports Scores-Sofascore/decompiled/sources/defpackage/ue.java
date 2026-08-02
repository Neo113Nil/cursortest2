package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ue implements krk {
    public final LinearLayout a;
    public final z3f b;

    public ue(LinearLayout linearLayout, z3f z3fVar) {
        this.a = linearLayout;
        this.b = z3fVar;
    }

    public static ue a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_settings, (ViewGroup) null, false);
        int i = R.id.container;
        if (((FragmentContainerView) nq8.B(R.id.container, inflate)) != null) {
            i = R.id.toolbar;
            View B = nq8.B(R.id.toolbar, inflate);
            if (B != null) {
                return new ue((LinearLayout) inflate, z3f.b(B));
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
