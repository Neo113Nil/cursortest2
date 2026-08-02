package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class td implements krk {
    public final LinearLayout a;
    public final AdBannerView b;
    public final ViewStub c;
    public final CollapsibleProfileHeaderView d;
    public final xk8 e;
    public final SwipeRefreshLayout f;
    public final UnderlinedToolbar g;

    public td(LinearLayout linearLayout, AdBannerView adBannerView, ViewStub viewStub, CollapsibleProfileHeaderView collapsibleProfileHeaderView, xk8 xk8Var, SwipeRefreshLayout swipeRefreshLayout, UnderlinedToolbar underlinedToolbar) {
        this.a = linearLayout;
        this.b = adBannerView;
        this.c = viewStub;
        this.d = collapsibleProfileHeaderView;
        this.e = xk8Var;
        this.f = swipeRefreshLayout;
        this.g = underlinedToolbar;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
