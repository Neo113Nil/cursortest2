package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenToggleFAB;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66345a;

    /* renamed from: b, reason: collision with root package name */
    public final MobilistenToggleFAB f66346b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f66347c;

    /* renamed from: d, reason: collision with root package name */
    public final View f66348d;

    public p(ConstraintLayout constraintLayout, MobilistenToggleFAB mobilistenToggleFAB, ConstraintLayout constraintLayout2, View view) {
        this.f66345a = constraintLayout;
        this.f66346b = mobilistenToggleFAB;
        this.f66347c = constraintLayout2;
        this.f66348d = view;
    }

    public static p a(View view) {
        int i10 = q.f60541h4;
        MobilistenToggleFAB mobilistenToggleFAB = (MobilistenToggleFAB) N2.a.a(view, i10);
        if (mobilistenToggleFAB != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = q.f60275H5;
            View a10 = N2.a.a(view, i11);
            if (a10 != null) {
                return new p(constraintLayout, mobilistenToggleFAB, constraintLayout, a10);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static p c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60747K0, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f66345a;
    }
}
