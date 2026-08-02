package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.mvvm.base.SofaTabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bf implements krk {
    public final RelativeLayout a;
    public final AdBannerView b;
    public final FrameLayout c;
    public final ViewStub d;
    public final ViewStub e;
    public final SofaTabLayout f;
    public final z3f g;
    public final FrameLayout h;
    public final ViewPager2 i;

    public bf(RelativeLayout relativeLayout, AdBannerView adBannerView, FrameLayout frameLayout, ViewStub viewStub, ViewStub viewStub2, SofaTabLayout sofaTabLayout, z3f z3fVar, FrameLayout frameLayout2, ViewPager2 viewPager2) {
        this.a = relativeLayout;
        this.b = adBannerView;
        this.c = frameLayout;
        this.d = viewStub;
        this.e = viewStub2;
        this.f = sofaTabLayout;
        this.g = z3fVar;
        this.h = frameLayout2;
        this.i = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
