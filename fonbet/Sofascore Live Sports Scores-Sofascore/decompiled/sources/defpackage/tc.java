package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.mvvm.base.SofaTabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tc implements krk {
    public final ConstraintLayout a;
    public final AdBannerView b;
    public final ViewStub c;
    public final SofaTabLayout d;
    public final djf e;
    public final ViewPager2 f;

    public tc(ConstraintLayout constraintLayout, AdBannerView adBannerView, ViewStub viewStub, SofaTabLayout sofaTabLayout, djf djfVar, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = adBannerView;
        this.c = viewStub;
        this.d = sofaTabLayout;
        this.e = djfVar;
        this.f = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
