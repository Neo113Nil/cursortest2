package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.main.matches.redesign.datematches.view.MatchesFilterBarView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class so8 implements krk {
    public final ConstraintLayout a;
    public final AdBannerView b;
    public final ExtendedFloatingActionButton c;
    public final ViewPager2 d;
    public final MatchesFilterBarView e;
    public final FrameLayout f;

    public so8(ConstraintLayout constraintLayout, AdBannerView adBannerView, ExtendedFloatingActionButton extendedFloatingActionButton, ViewPager2 viewPager2, MatchesFilterBarView matchesFilterBarView, FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.b = adBannerView;
        this.c = extendedFloatingActionButton;
        this.d = viewPager2;
        this.e = matchesFilterBarView;
        this.f = frameLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
