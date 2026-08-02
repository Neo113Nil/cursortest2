package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uc implements krk {
    public final CoordinatorLayout a;
    public final ToolbarBackgroundAppBarLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final ConstraintLayout e;
    public final cv1 f;
    public final LinearLayout g;
    public final SofaTabLayout h;
    public final UnderlinedToolbar i;
    public final FrameLayout j;
    public final TutorialWizardView k;
    public final ViewPager2 l;
    public final ImageView m;

    public uc(CoordinatorLayout coordinatorLayout, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, FrameLayout frameLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout, cv1 cv1Var, LinearLayout linearLayout, SofaTabLayout sofaTabLayout, UnderlinedToolbar underlinedToolbar, FrameLayout frameLayout3, TutorialWizardView tutorialWizardView, ViewPager2 viewPager2, ImageView imageView) {
        this.a = coordinatorLayout;
        this.b = toolbarBackgroundAppBarLayout;
        this.c = frameLayout;
        this.d = frameLayout2;
        this.e = constraintLayout;
        this.f = cv1Var;
        this.g = linearLayout;
        this.h = sofaTabLayout;
        this.i = underlinedToolbar;
        this.j = frameLayout3;
        this.k = tutorialWizardView;
        this.l = viewPager2;
        this.m = imageView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
