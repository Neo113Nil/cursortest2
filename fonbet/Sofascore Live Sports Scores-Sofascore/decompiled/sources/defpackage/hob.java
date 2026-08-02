package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Barrier;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hob implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ hob(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                boolean z = MainActivity.n0;
                mainActivity.Y(hwg.c);
                return Unit.a;
            case 1:
                boolean z2 = MainActivity.n0;
                View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                int i2 = R.id.bottom_tabs_view;
                DynamicBottomNavigation dynamicBottomNavigation = (DynamicBottomNavigation) nq8.B(R.id.bottom_tabs_view, inflate);
                if (dynamicBottomNavigation != null) {
                    i2 = R.id.calendar_view;
                    CalendarView calendarView = (CalendarView) nq8.B(R.id.calendar_view, inflate);
                    if (calendarView != null) {
                        i2 = R.id.favourite_tabs;
                        SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.favourite_tabs, inflate);
                        if (sofaTabLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                            i2 = R.id.no_internet_view;
                            ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                            if (viewStub != null) {
                                i2 = R.id.snack_bar_anchor;
                                Barrier barrier = (Barrier) nq8.B(R.id.snack_bar_anchor, inflate);
                                if (barrier != null) {
                                    i2 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        djf a = djf.a(B);
                                        i2 = R.id.toolbar_holder;
                                        AppBarLayout appBarLayout = (AppBarLayout) nq8.B(R.id.toolbar_holder, inflate);
                                        if (appBarLayout != null) {
                                            i2 = R.id.view_pager;
                                            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                            if (viewPager2 != null) {
                                                return new od(coordinatorLayout, dynamicBottomNavigation, calendarView, sofaTabLayout, coordinatorLayout, viewStub, barrier, a, appBarLayout, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 2:
                mainActivity.l0.f(true);
                return Unit.a;
            case 3:
                mainActivity.l0.f(false);
                return Unit.a;
            case 4:
                boolean z3 = MainActivity.n0;
                iqb iqbVar = new iqb(mainActivity.Q().j, mainActivity.k(), mainActivity.getLifecycle());
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                iqbVar.q = lm5Var;
                iqbVar.n = false;
                return iqbVar;
            case 5:
                boolean z4 = MainActivity.n0;
                return new ldk(mainActivity, R.id.main_coordinator_layout);
            case 6:
                boolean z5 = MainActivity.n0;
                return new qob(mainActivity);
            case 7:
                boolean z6 = MainActivity.n0;
                return new hqb(mainActivity.U());
            default:
                boolean z7 = MainActivity.n0;
                return new nqb(mainActivity.U());
        }
    }
}
