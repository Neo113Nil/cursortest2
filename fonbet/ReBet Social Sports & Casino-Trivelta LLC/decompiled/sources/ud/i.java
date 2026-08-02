package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenToggleFAB;
import com.zoho.livechat.android.ui.customviews.CustomViewPager;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f66302a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f66303b;

    /* renamed from: c, reason: collision with root package name */
    public final CoordinatorLayout f66304c;

    /* renamed from: d, reason: collision with root package name */
    public final AppBarLayout f66305d;

    /* renamed from: e, reason: collision with root package name */
    public final View f66306e;

    /* renamed from: f, reason: collision with root package name */
    public final View f66307f;

    /* renamed from: g, reason: collision with root package name */
    public final ProgressBar f66308g;

    /* renamed from: h, reason: collision with root package name */
    public final View f66309h;

    /* renamed from: i, reason: collision with root package name */
    public final MobilistenToggleFAB f66310i;

    /* renamed from: j, reason: collision with root package name */
    public final FragmentContainerView f66311j;

    /* renamed from: k, reason: collision with root package name */
    public final MaterialToolbar f66312k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f66313l;

    /* renamed from: m, reason: collision with root package name */
    public final TabLayout f66314m;

    /* renamed from: n, reason: collision with root package name */
    public final View f66315n;

    /* renamed from: o, reason: collision with root package name */
    public final Barrier f66316o;

    /* renamed from: p, reason: collision with root package name */
    public final CustomViewPager f66317p;

    public i(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout2, AppBarLayout appBarLayout, View view, View view2, ProgressBar progressBar, View view3, MobilistenToggleFAB mobilistenToggleFAB, FragmentContainerView fragmentContainerView, MaterialToolbar materialToolbar, TextView textView, TabLayout tabLayout, View view4, Barrier barrier, CustomViewPager customViewPager) {
        this.f66302a = coordinatorLayout;
        this.f66303b = constraintLayout;
        this.f66304c = coordinatorLayout2;
        this.f66305d = appBarLayout;
        this.f66306e = view;
        this.f66307f = view2;
        this.f66308g = progressBar;
        this.f66309h = view3;
        this.f66310i = mobilistenToggleFAB;
        this.f66311j = fragmentContainerView;
        this.f66312k = materialToolbar;
        this.f66313l = textView;
        this.f66314m = tabLayout;
        this.f66315n = view4;
        this.f66316o = barrier;
        this.f66317p = customViewPager;
    }

    public static i a(View view) {
        View a10;
        View a11;
        View a12;
        View a13;
        int i10 = q.f60525g;
        ConstraintLayout constraintLayout = (ConstraintLayout) N2.a.a(view, i10);
        if (constraintLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i10 = q.f60449Z;
            AppBarLayout appBarLayout = (AppBarLayout) N2.a.a(view, i10);
            if (appBarLayout != null && (a10 = N2.a.a(view, (i10 = q.f60588m1))) != null && (a11 = N2.a.a(view, (i10 = q.f60598n1))) != null) {
                i10 = q.f60497d4;
                ProgressBar progressBar = (ProgressBar) N2.a.a(view, i10);
                if (progressBar != null && (a12 = N2.a.a(view, (i10 = q.f60508e4))) != null) {
                    i10 = q.f60374R4;
                    MobilistenToggleFAB mobilistenToggleFAB = (MobilistenToggleFAB) N2.a.a(view, i10);
                    if (mobilistenToggleFAB != null) {
                        i10 = q.f60434X4;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) N2.a.a(view, i10);
                        if (fragmentContainerView != null) {
                            i10 = q.f60325M5;
                            MaterialToolbar materialToolbar = (MaterialToolbar) N2.a.a(view, i10);
                            if (materialToolbar != null) {
                                i10 = q.f60723z6;
                                TextView textView = (TextView) N2.a.a(view, i10);
                                if (textView != null) {
                                    i10 = q.f60575k8;
                                    TabLayout tabLayout = (TabLayout) N2.a.a(view, i10);
                                    if (tabLayout != null && (a13 = N2.a.a(view, (i10 = q.f60248E8))) != null) {
                                        i10 = q.f60258F8;
                                        Barrier barrier = (Barrier) N2.a.a(view, i10);
                                        if (barrier != null) {
                                            i10 = q.f60388S8;
                                            CustomViewPager customViewPager = (CustomViewPager) N2.a.a(view, i10);
                                            if (customViewPager != null) {
                                                return new i(coordinatorLayout, constraintLayout, coordinatorLayout, appBarLayout, a10, a11, progressBar, a12, mobilistenToggleFAB, fragmentContainerView, materialToolbar, textView, tabLayout, a13, barrier, customViewPager);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static i d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60788i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f66302a;
    }
}
