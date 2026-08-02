package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.ui.customviews.SalesIQFloatingActionButton;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66341a;

    /* renamed from: b, reason: collision with root package name */
    public final MobilistenTextView f66342b;

    /* renamed from: c, reason: collision with root package name */
    public final SalesIQFloatingActionButton f66343c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f66344d;

    public o(ConstraintLayout constraintLayout, MobilistenTextView mobilistenTextView, SalesIQFloatingActionButton salesIQFloatingActionButton, ConstraintLayout constraintLayout2) {
        this.f66341a = constraintLayout;
        this.f66342b = mobilistenTextView;
        this.f66343c = salesIQFloatingActionButton;
        this.f66344d = constraintLayout2;
    }

    public static o a(View view) {
        int i10 = q.f60483c1;
        MobilistenTextView mobilistenTextView = (MobilistenTextView) N2.a.a(view, i10);
        if (mobilistenTextView != null) {
            i10 = q.f60494d1;
            SalesIQFloatingActionButton salesIQFloatingActionButton = (SalesIQFloatingActionButton) N2.a.a(view, i10);
            if (salesIQFloatingActionButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new o(constraintLayout, mobilistenTextView, salesIQFloatingActionButton, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60749L0, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f66341a;
    }
}
