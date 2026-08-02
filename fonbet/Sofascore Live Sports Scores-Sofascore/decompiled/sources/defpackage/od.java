package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Barrier;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import com.sofascore.results.mvvm.base.SofaTabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class od implements krk {
    public final CoordinatorLayout a;
    public final DynamicBottomNavigation b;
    public final CalendarView c;
    public final SofaTabLayout d;
    public final CoordinatorLayout e;
    public final ViewStub f;
    public final Barrier g;
    public final djf h;
    public final AppBarLayout i;
    public final ViewPager2 j;

    public od(CoordinatorLayout coordinatorLayout, DynamicBottomNavigation dynamicBottomNavigation, CalendarView calendarView, SofaTabLayout sofaTabLayout, CoordinatorLayout coordinatorLayout2, ViewStub viewStub, Barrier barrier, djf djfVar, AppBarLayout appBarLayout, ViewPager2 viewPager2) {
        this.a = coordinatorLayout;
        this.b = dynamicBottomNavigation;
        this.c = calendarView;
        this.d = sofaTabLayout;
        this.e = coordinatorLayout2;
        this.f = viewStub;
        this.g = barrier;
        this.h = djfVar;
        this.i = appBarLayout;
        this.j = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
