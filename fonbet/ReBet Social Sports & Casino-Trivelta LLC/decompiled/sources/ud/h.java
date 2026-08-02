package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66295a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f66296b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f66297c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialToolbar f66298d;

    /* renamed from: e, reason: collision with root package name */
    public final AppBarLayout f66299e;

    /* renamed from: f, reason: collision with root package name */
    public final CircularProgressIndicator f66300f;

    /* renamed from: g, reason: collision with root package name */
    public final View f66301g;

    public h(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, CircularProgressIndicator circularProgressIndicator, View view) {
        this.f66295a = constraintLayout;
        this.f66296b = constraintLayout2;
        this.f66297c = frameLayout;
        this.f66298d = materialToolbar;
        this.f66299e = appBarLayout;
        this.f66300f = circularProgressIndicator;
        this.f66301g = view;
    }

    public static h a(View view) {
        View a10;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = q.f60627q0;
        FrameLayout frameLayout = (FrameLayout) N2.a.a(view, i10);
        if (frameLayout != null) {
            i10 = q.f60687w0;
            MaterialToolbar materialToolbar = (MaterialToolbar) N2.a.a(view, i10);
            if (materialToolbar != null) {
                i10 = q.f60261G1;
                AppBarLayout appBarLayout = (AppBarLayout) N2.a.a(view, i10);
                if (appBarLayout != null) {
                    i10 = q.f60293J3;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) N2.a.a(view, i10);
                    if (circularProgressIndicator != null && (a10 = N2.a.a(view, (i10 = q.f60248E8))) != null) {
                        return new h(constraintLayout, constraintLayout, frameLayout, materialToolbar, appBarLayout, circularProgressIndicator, a10);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60786h, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f66295a;
    }
}
