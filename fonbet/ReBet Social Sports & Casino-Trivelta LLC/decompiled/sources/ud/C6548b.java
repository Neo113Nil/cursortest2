package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import od.q;
import od.r;

/* renamed from: ud.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6548b {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66262a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f66263b;

    /* renamed from: c, reason: collision with root package name */
    public final AppBarLayout f66264c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f66265d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialToolbar f66266e;

    public C6548b(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, MaterialToolbar materialToolbar) {
        this.f66262a = constraintLayout;
        this.f66263b = fragmentContainerView;
        this.f66264c = appBarLayout;
        this.f66265d = constraintLayout2;
        this.f66266e = materialToolbar;
    }

    public static C6548b a(View view) {
        int i10 = q.f60646s;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) N2.a.a(view, i10);
        if (fragmentContainerView != null) {
            i10 = q.f60236D6;
            AppBarLayout appBarLayout = (AppBarLayout) N2.a.a(view, i10);
            if (appBarLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = q.f60266G6;
                MaterialToolbar materialToolbar = (MaterialToolbar) N2.a.a(view, i10);
                if (materialToolbar != null) {
                    return new C6548b(constraintLayout, fragmentContainerView, appBarLayout, constraintLayout, materialToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C6548b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6548b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60774b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f66262a;
    }
}
