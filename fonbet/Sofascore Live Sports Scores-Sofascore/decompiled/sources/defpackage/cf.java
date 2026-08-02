package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.profile.view.ProfileClickableRowView;
import com.sofascore.results.view.CirclePageIndicator;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cf implements krk {
    public final LinearLayout a;
    public final CirclePageIndicator b;
    public final ViewPager2 c;
    public final woc d;
    public final ProfileClickableRowView e;
    public final ProfileClickableRowView f;
    public final djf g;
    public final ViewStub h;
    public final CollapsibleProfileHeaderView i;
    public final ComposeView j;
    public final ComposeView k;
    public final z3f l;
    public final dk2 m;

    public cf(LinearLayout linearLayout, CirclePageIndicator circlePageIndicator, ViewPager2 viewPager2, woc wocVar, ProfileClickableRowView profileClickableRowView, ProfileClickableRowView profileClickableRowView2, djf djfVar, ViewStub viewStub, CollapsibleProfileHeaderView collapsibleProfileHeaderView, ComposeView composeView, ComposeView composeView2, z3f z3fVar, dk2 dk2Var) {
        this.a = linearLayout;
        this.b = circlePageIndicator;
        this.c = viewPager2;
        this.d = wocVar;
        this.e = profileClickableRowView;
        this.f = profileClickableRowView2;
        this.g = djfVar;
        this.h = viewStub;
        this.i = collapsibleProfileHeaderView;
        this.j = composeView;
        this.k = composeView2;
        this.l = z3fVar;
        this.m = dk2Var;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
