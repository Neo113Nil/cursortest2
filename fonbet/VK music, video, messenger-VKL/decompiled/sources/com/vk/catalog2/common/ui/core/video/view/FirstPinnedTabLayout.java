package com.vk.catalog2.common.ui.core.video.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.core.view.VKTabLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.abg0;
import xsna.dhr0;
import xsna.epx;
import xsna.hz7;
import xsna.mlr;
import xsna.nlr;
import xsna.olr;
import xsna.qj80;
import xsna.rou0;
import xsna.ud6;
import xsna.usn0;
import xsna.wzs;
import xsna.xgr0;

/* compiled from: FirstPinnedTabLayout.kt */
/* loaded from: classes16.dex */
public class FirstPinnedTabLayout extends FrameLayout implements rou0 {
    public static final /* synthetic */ int h = 0;
    public final VKTabLayout b;
    public final VKTabLayout c;
    public final View d;
    public final ArrayList e;
    public int f;
    public int g;

    public FirstPinnedTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = new ArrayList();
        this.f = -1;
        this.g = 1;
        LayoutInflater.from(context).inflate(getLayoutResId(), (ViewGroup) this, true);
        VKTabLayout vKTabLayout = (VKTabLayout) findViewById(R.id.pinned_tabs);
        VKTabLayout vKTabLayout2 = null;
        if (vKTabLayout != null) {
            usn0.a(vKTabLayout);
        } else {
            vKTabLayout = null;
        }
        this.c = vKTabLayout;
        if (vKTabLayout != null) {
            vKTabLayout.f(new nlr(this));
        }
        VKTabLayout vKTabLayout3 = (VKTabLayout) findViewById(R.id.scroll_tabs);
        if (vKTabLayout3 != null) {
            usn0.a(vKTabLayout3);
            vKTabLayout2 = vKTabLayout3;
        }
        this.b = vKTabLayout2;
        if (vKTabLayout2 != null) {
            vKTabLayout2.f(new olr(this));
        }
        VKTabLayout vKTabLayout4 = this.b;
        if (vKTabLayout4 != null) {
            vKTabLayout4.e0.add(new VKTabLayout.c() { // from class: xsna.llr
                @Override // com.vk.core.view.VKTabLayout.c
                public final void a(int i) {
                    View view = FirstPinnedTabLayout.this.d;
                    if (view != null) {
                        view.setAlpha(Math.min(1.0f, Math.max(0, i) / 30.0f));
                    }
                }
            });
        }
        View findViewById = findViewById(R.id.tabsSeparator);
        this.d = findViewById;
        if (findViewById != null) {
            findViewById.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public static final void f(FirstPinnedTabLayout firstPinnedTabLayout, VKTabLayout vKTabLayout, TabLayout.g gVar) {
        int e = firstPinnedTabLayout.e(gVar);
        int i = firstPinnedTabLayout.f;
        int i2 = firstPinnedTabLayout.g;
        if ((i < i2 && e >= i2) || (i >= i2 && e < i2)) {
            VKTabLayout vKTabLayout2 = epx.f(vKTabLayout, firstPinnedTabLayout.c) ? firstPinnedTabLayout.b : firstPinnedTabLayout.c;
            j(vKTabLayout, true);
            j(vKTabLayout2, false);
            if (vKTabLayout2 != null) {
                vKTabLayout2.c(null, true);
            }
        }
        firstPinnedTabLayout.f = e;
    }

    public static void j(VKTabLayout vKTabLayout, boolean z) {
        View view;
        if (vKTabLayout == null) {
            return;
        }
        vKTabLayout.setSelectedTabIndicatorColor(z ? dhr0.t.c(R.attr.vk_ui_icon_accent_themed) : dhr0.t.c(R.attr.vk_ui_background_content));
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_text_primary);
        int c2 = abg0Var.c(R.attr.vk_ui_text_secondary);
        int[] iArr = FrameLayout.EMPTY_STATE_SET;
        int[] iArr2 = FrameLayout.SELECTED_STATE_SET;
        ColorStateList colorStateList = z ? new ColorStateList(new int[][]{iArr2, iArr}, new int[]{c, c2}) : new ColorStateList(new int[][]{iArr2, iArr}, new int[]{c2, c2});
        int tabCount = vKTabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.g b = vKTabLayout.b(i);
            TextView textView = (b == null || (view = b.f) == null) ? null : (TextView) view.findViewById(android.R.id.text1);
            if (textView != null) {
                textView.setTextColor(colorStateList);
            }
        }
        vKTabLayout.setTabTextColors(colorStateList);
        vKTabLayout.requestLayout();
        for (int i2 = 0; i2 < vKTabLayout.getChildCount(); i2++) {
            vKTabLayout.getChildAt(i2).requestLayout();
        }
    }

    @Override // xsna.rou0
    public final boolean a(TabLayout.g gVar) {
        return epx.f(gVar.g, this.c) && this.f > this.g;
    }

    @Override // xsna.rou0
    public final TabLayout.g b(int i) {
        int i2 = this.g;
        if (i < i2) {
            VKTabLayout vKTabLayout = this.c;
            if (vKTabLayout != null) {
                return vKTabLayout.b(i);
            }
            return null;
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            return vKTabLayout2.b(i - i2);
        }
        return null;
    }

    @Override // xsna.rou0
    public final void c(TabLayout.g gVar, boolean z) {
        if (epx.f(gVar.g, this.c)) {
            VKTabLayout vKTabLayout = this.c;
            if (vKTabLayout != null) {
                vKTabLayout.c(gVar, z);
                return;
            }
            return;
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            vKTabLayout2.c(gVar, z);
        }
    }

    @Override // xsna.rou0
    public final void d(int i, float f, boolean z, boolean z2) {
        VKTabLayout vKTabLayout;
        if (i < this.g) {
            VKTabLayout vKTabLayout2 = this.c;
            if (vKTabLayout2 != null) {
                vKTabLayout2.v(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, z2, true);
                return;
            }
            return;
        }
        int selectedTabPosition = getSelectedTabPosition();
        int i2 = this.g;
        if (selectedTabPosition >= i2 && (vKTabLayout = this.b) != null) {
            vKTabLayout.v(i - i2, f, z, z2, true);
        }
    }

    @Override // xsna.rou0
    public final int e(TabLayout.g gVar) {
        if (gVar.e == -1) {
            return -1;
        }
        return epx.f(gVar.g, this.c) ? gVar.e : gVar.e + this.g;
    }

    public final void g(TabLayout.d dVar) {
        this.e.add(dVar);
    }

    public int getLayoutResId() {
        return R.layout.catalog_first_pinned_tab_view;
    }

    public final int getPinnedTabsCount() {
        return this.g;
    }

    @Override // xsna.rou0
    public int getSelectedTabPosition() {
        VKTabLayout vKTabLayout = this.c;
        int selectedTabPosition = vKTabLayout != null ? vKTabLayout.getSelectedTabPosition() : -1;
        VKTabLayout vKTabLayout2 = this.b;
        int selectedTabPosition2 = vKTabLayout2 != null ? vKTabLayout2.getSelectedTabPosition() : -1;
        if (selectedTabPosition == -1 && selectedTabPosition2 == -1) {
            return -1;
        }
        return selectedTabPosition == -1 ? selectedTabPosition2 + this.g : selectedTabPosition;
    }

    @Override // xsna.rou0
    public int getTabCount() {
        VKTabLayout vKTabLayout;
        VKTabLayout vKTabLayout2 = this.c;
        Integer valueOf = (vKTabLayout2 == null || (vKTabLayout = this.b) == null) ? null : Integer.valueOf(vKTabLayout.getTabCount() + vKTabLayout2.getTabCount());
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final void h(TabLayout.g gVar, boolean z) {
        VKTabLayout vKTabLayout = this.c;
        if (vKTabLayout == null) {
            return;
        }
        if (vKTabLayout.getTabCount() >= this.g) {
            VKTabLayout vKTabLayout2 = this.b;
            if (vKTabLayout2 != null) {
                vKTabLayout2.i(gVar, z);
                return;
            }
            return;
        }
        vKTabLayout.i(gVar, z);
        int a0 = dhr0.a0(R.attr.tabBarTabPadding);
        View view = gVar.f;
        if (view == null) {
            return;
        }
        qj80.a(view, new mlr(view, vKTabLayout, a0));
    }

    public final TabLayout.g i(int i) {
        VKTabLayout vKTabLayout;
        VKTabLayout vKTabLayout2 = this.c;
        if (vKTabLayout2 == null || (vKTabLayout = this.b) == null) {
            throw new IllegalStateException("ERROR: VK tab");
        }
        return i < this.g ? vKTabLayout2.p() : vKTabLayout.p();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = this.f < this.g;
        j(this.c, z);
        j(this.b, !z);
    }

    public final void setCustomTabView(int i) {
        VKTabLayout vKTabLayout = this.c;
        if (vKTabLayout != null) {
            vKTabLayout.setCustomTabView(i);
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            vKTabLayout2.setCustomTabView(i);
        }
    }

    public final void setPinnedTabsCount(int i) {
        View view = this.d;
        if (view != null) {
            view.setVisibility(i > 0 ? 0 : 8);
        }
        this.g = i;
    }

    public final void setSelectTabInterceptor(xgr0 xgr0Var) {
        VKTabLayout vKTabLayout = this.b;
        if (vKTabLayout != null) {
            vKTabLayout.setSelectTabInterceptor(xgr0Var);
        }
    }

    public final void setSpreadTabsEvenly(boolean z) {
        VKTabLayout vKTabLayout = this.c;
        if (vKTabLayout != null) {
            vKTabLayout.setSpreadTabsEvenly(z);
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            vKTabLayout2.setSpreadTabsEvenly(z);
        }
    }

    public final void setTabIndicator(int i) {
        VKTabLayout vKTabLayout = this.c;
        if (vKTabLayout != null) {
            vKTabLayout.setSelectedTabIndicator(i);
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            vKTabLayout2.setSelectedTabIndicator(i);
        }
    }

    public final void setCustomTabView(wzs<? super Integer, ? super ViewGroup, ? extends View> wzsVar) {
        VKTabLayout vKTabLayout = this.c;
        if (vKTabLayout != null) {
            vKTabLayout.setCustomTabView(new ud6(6, this, wzsVar));
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            vKTabLayout2.setCustomTabView(new hz7(1, wzsVar, this));
        }
    }
}
