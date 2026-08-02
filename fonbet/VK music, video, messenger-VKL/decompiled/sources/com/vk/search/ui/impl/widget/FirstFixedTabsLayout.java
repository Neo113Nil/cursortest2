package com.vk.search.ui.impl.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VKTabLayout;
import com.vk.search.ui.impl.widget.FirstFixedTabsLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.abg0;
import xsna.dhr0;
import xsna.epx;
import xsna.flr;
import xsna.glr;
import xsna.rou0;
import xsna.usn0;

/* compiled from: FirstFixedTabsLayout.kt */
/* loaded from: classes5.dex */
public final class FirstFixedTabsLayout extends FrameLayout implements rou0 {
    public final VKTabLayout b;
    public final VKTabLayout c;
    public final View d;
    public int e;
    public final ArrayList f;

    public FirstFixedTabsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = -1;
        LayoutInflater.from(context).inflate(R.layout.search_first_fixed_tabs_layout, (ViewGroup) this, true);
        VKTabLayout vKTabLayout = (VKTabLayout) findViewById(R.id.scroll_tabs);
        if (vKTabLayout != null) {
            usn0.a(vKTabLayout);
        }
        this.b = vKTabLayout;
        VKTabLayout vKTabLayout2 = (VKTabLayout) findViewById(R.id.fixed_tabs);
        if (vKTabLayout2 != null) {
            usn0.a(vKTabLayout2);
        }
        this.c = vKTabLayout2;
        View findViewById = findViewById(R.id.tabsSeparator);
        this.d = findViewById;
        if (vKTabLayout2 != null) {
            vKTabLayout2.f(new flr(this));
        }
        if (vKTabLayout != null) {
            vKTabLayout.f(new glr(this));
        }
        if (findViewById != null) {
            findViewById.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (vKTabLayout != null) {
            vKTabLayout.e0.add(new VKTabLayout.c() { // from class: xsna.elr
                @Override // com.vk.core.view.VKTabLayout.c
                public final void a(int i) {
                    View view = FirstFixedTabsLayout.this.d;
                    if (view != null) {
                        view.setAlpha(Math.min(1.0f, Math.max(0, i) / 30.0f));
                    }
                }
            });
        }
        this.f = new ArrayList();
    }

    public static final void f(FirstFixedTabsLayout firstFixedTabsLayout, TabLayout tabLayout, TabLayout.g gVar) {
        VKTabLayout vKTabLayout = firstFixedTabsLayout.c;
        int e = firstFixedTabsLayout.e(gVar);
        int i = firstFixedTabsLayout.e;
        if ((i < 1 && e >= 1) || (i >= 1 && e < 1)) {
            if (epx.f(tabLayout, vKTabLayout)) {
                vKTabLayout = firstFixedTabsLayout.b;
            }
            i(tabLayout, true);
            i(vKTabLayout, false);
            if (vKTabLayout != null) {
                vKTabLayout.c(null, true);
            }
        }
        firstFixedTabsLayout.e = e;
    }

    public static void i(TabLayout tabLayout, boolean z) {
        int c = z ? dhr0.t.c(R.attr.vk_ui_text_accent) : dhr0.t.c(R.attr.vk_ui_background_content);
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(c);
        }
        abg0 abg0Var = dhr0.t;
        int c2 = abg0Var.c(R.attr.vk_ui_text_primary);
        int c3 = abg0Var.c(R.attr.vk_ui_text_tertiary);
        if (z) {
            if (tabLayout != null) {
                tabLayout.setTabTextColors(TabLayout.n(c3, c2));
            }
        } else if (tabLayout != null) {
            tabLayout.setTabTextColors(TabLayout.n(c3, c3));
        }
        if (tabLayout != null) {
            tabLayout.requestLayout();
        }
        if (tabLayout != null) {
            for (int i = 0; i < tabLayout.getChildCount(); i++) {
                tabLayout.getChildAt(i).requestLayout();
            }
        }
    }

    @Override // xsna.rou0
    public final boolean a(TabLayout.g gVar) {
        return epx.f(gVar.g, this.c) && this.e > 1;
    }

    @Override // xsna.rou0
    public final TabLayout.g b(int i) {
        if (i < 1) {
            VKTabLayout vKTabLayout = this.c;
            if (vKTabLayout != null) {
                return vKTabLayout.b(i);
            }
            return null;
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            return vKTabLayout2.b(i - 1);
        }
        return null;
    }

    @Override // xsna.rou0
    public final void c(TabLayout.g gVar, boolean z) {
        TabLayout tabLayout = gVar.g;
        VKTabLayout vKTabLayout = this.c;
        if (epx.f(tabLayout, vKTabLayout)) {
            if (vKTabLayout != null) {
                vKTabLayout.c(gVar, z);
            }
        } else {
            VKTabLayout vKTabLayout2 = this.b;
            if (vKTabLayout2 != null) {
                vKTabLayout2.c(gVar, z);
            }
        }
    }

    @Override // xsna.rou0
    public final void d(int i, float f, boolean z, boolean z2) {
        VKTabLayout vKTabLayout;
        if (i < 1) {
            VKTabLayout vKTabLayout2 = this.c;
            if (vKTabLayout2 != null) {
                vKTabLayout2.v(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, z2, true);
                return;
            }
            return;
        }
        if (getSelectedTabPosition() >= 1 && (vKTabLayout = this.b) != null) {
            vKTabLayout.v(i - 1, f, z, z2, true);
        }
    }

    @Override // xsna.rou0
    public final int e(TabLayout.g gVar) {
        return epx.f(gVar.g, this.c) ? gVar.e : gVar.e + 1;
    }

    public final void g() {
        VKTabLayout vKTabLayout = this.c;
        if (vKTabLayout != null) {
            usn0.a(vKTabLayout);
        }
        VKTabLayout vKTabLayout2 = this.b;
        if (vKTabLayout2 != null) {
            usn0.a(vKTabLayout2);
        }
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
        return selectedTabPosition == -1 ? selectedTabPosition2 + 1 : selectedTabPosition;
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

    public final void h(TabLayout.d dVar) {
        this.f.add(dVar);
    }
}
