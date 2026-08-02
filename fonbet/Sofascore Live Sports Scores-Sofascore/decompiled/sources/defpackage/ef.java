package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.mvvm.base.SofaTabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ef implements krk {
    public final CoordinatorLayout a;
    public final ViewStub b;
    public final SofaTabLayout c;
    public final UnderlinedToolbar d;
    public final ViewPager2 e;

    public ef(CoordinatorLayout coordinatorLayout, ViewStub viewStub, SofaTabLayout sofaTabLayout, UnderlinedToolbar underlinedToolbar, ViewPager2 viewPager2) {
        this.a = coordinatorLayout;
        this.b = viewStub;
        this.c = sofaTabLayout;
        this.d = underlinedToolbar;
        this.e = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
