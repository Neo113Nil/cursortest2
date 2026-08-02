package com.vk.core.view.components.tabs;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.tabs.VkTabs;
import com.vkontakte.android.R;
import xsna.byn0;
import xsna.e3m;
import xsna.f4m;
import xsna.s3q0;
import xsna.tmr;

/* compiled from: FixedTabView.kt */
/* loaded from: classes17.dex */
public final class a extends ConstraintLayout {
    public VkTabs.c t;
    public final tmr u;
    public final VkTabsIndicator v;
    public final FrameLayout w;

    public a(Context context) {
        super(context, null, 0);
        tmr tmrVar = new tmr(context);
        tmrVar.setId(R.id.ds_internal_tabs_divider);
        tmrVar.setVisibility(8);
        this.u = tmrVar;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.i = 0;
        bVar.l = 0;
        bVar.v = 0;
        s3q0 s3q0Var = s3q0.a;
        addView(tmrVar, bVar);
        VkTabsIndicator vkTabsIndicator = new VkTabsIndicator(context, null, 0, 14, 0);
        this.v = vkTabsIndicator;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(vkTabsIndicator, new FrameLayout.LayoutParams(-1, -1));
        this.w = frameLayout;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, 0);
        bVar2.t = 0;
        bVar2.v = 0;
        bVar2.i = 0;
        bVar2.l = 0;
        addView(frameLayout, bVar2);
        setVisibility(8);
        setClipChildren(false);
    }

    public final VkTabs.c getTab() {
        return this.t;
    }

    public final void setDividerVisible(boolean z) {
        this.u.setVisibility(z ? 0 : 8);
    }

    public final void setIndicatorVisible(boolean z) {
        FrameLayout frameLayout = this.w;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
    }

    public final void setMode(Tab$Mode tab$Mode) {
        VkTabsIndicator vkTabsIndicator = this.v;
        if (vkTabsIndicator != null) {
            vkTabsIndicator.setMode(tab$Mode);
        }
        int a = byn0.$EnumSwitchMapping$0[tab$Mode.ordinal()] == 1 ? 0 : e3m.a(R.dimen.vk_ui_spacing_size_s, getContext());
        f4m.u(this, 0, 0, a, 0);
        this.u.setTranslationX(a / 2.0f);
    }

    public final void setTab(VkTabs.c cVar) {
        VkTabs.c cVar2 = this.t;
        if (cVar2 != null) {
            removeView(cVar2.a);
        }
        this.t = cVar;
        if (cVar != null) {
            View view = cVar.a;
            view.setId(R.id.ds_internal_tabs_fixed_tab_view);
            ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
            bVar.t = 0;
            bVar.i = 0;
            bVar.l = 0;
            s3q0 s3q0Var = s3q0.a;
            addView(view, bVar);
        }
        setVisibility(cVar != null ? 0 : 8);
    }
}
