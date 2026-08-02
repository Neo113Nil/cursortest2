package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66280a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f66281b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressBar f66282c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f66283d;

    /* renamed from: e, reason: collision with root package name */
    public final View f66284e;

    /* renamed from: f, reason: collision with root package name */
    public final MobilistenTextView f66285f;

    public d(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, ConstraintLayout constraintLayout3, View view, MobilistenTextView mobilistenTextView) {
        this.f66280a = constraintLayout;
        this.f66281b = constraintLayout2;
        this.f66282c = progressBar;
        this.f66283d = constraintLayout3;
        this.f66284e = view;
        this.f66285f = mobilistenTextView;
    }

    public static d a(View view) {
        View a10;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = q.f60229D;
        ProgressBar progressBar = (ProgressBar) N2.a.a(view, i10);
        if (progressBar != null) {
            i10 = q.f60239E;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) N2.a.a(view, i10);
            if (constraintLayout2 != null && (a10 = N2.a.a(view, (i10 = q.f60249F))) != null) {
                i10 = q.f60448Y8;
                MobilistenTextView mobilistenTextView = (MobilistenTextView) N2.a.a(view, i10);
                if (mobilistenTextView != null) {
                    return new d(constraintLayout, constraintLayout, progressBar, constraintLayout2, a10, mobilistenTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60778d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f66280a;
    }
}
