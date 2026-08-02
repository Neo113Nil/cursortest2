package com.vk.superapp.widget_settings.p004new;

import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.c;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import com.vk.superapp.widget_settings.p004new.WidgetSettingsTab;
import com.vkontakte.android.R;
import xsna.a5p0;
import xsna.ao50;
import xsna.awt0;
import xsna.bwt0;
import xsna.cn70;
import xsna.d410;
import xsna.dhr0;
import xsna.dox0;
import xsna.dw20;
import xsna.eox0;
import xsna.fpf0;
import xsna.g53;
import xsna.gm50;
import xsna.gzs;
import xsna.iah0;
import xsna.ikv0;
import xsna.km50;
import xsna.l960;
import xsna.m7m;
import xsna.m960;
import xsna.mk50;
import xsna.nwk;
import xsna.nzl;
import xsna.oox0;
import xsna.tl50;
import xsna.tlo0;
import xsna.tq;
import xsna.ulw;
import xsna.vk50;
import xsna.vnx0;
import xsna.w620;
import xsna.xn50;
import xsna.xnx0;
import xsna.y160;

/* compiled from: NewWidgetSettingsFragment.kt */
/* loaded from: classes6.dex */
public final class a extends tl50<xnx0, oox0, vnx0> {
    public static final int n1 = cn70.b(2);
    public VKTabLayout i1;
    public ViewPager2 j1;
    public VkPlaceholder k1;
    public FrameLayout l1;
    public Guideline m1;

    /* compiled from: NewWidgetSettingsFragment.kt */
    /* renamed from: com.vk.superapp.widget_settings.new.a$a, reason: collision with other inner class name */
    public static final class C1923a extends dw20.b {
        public final WidgetSettingsModalOpenSource e;

        public C1923a(Context context, float f, WidgetSettingsModalOpenSource widgetSettingsModalOpenSource) {
            super(context, null);
            this.e = widgetSettingsModalOpenSource;
            P0();
            c(new nzl(context, new nzl.a(f)));
            x(0);
            f0(new y160(1));
            B(cn70.c(12), true, true);
            l(dhr0.t.c(R.attr.vk_ui_background_content));
            this.d.C1 = true;
            F0(true);
        }

        public final void S0() {
            I0("_WidgetSettingsFragment");
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putInt("source", this.e.h());
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_new_widget_settings);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((oox0) ao50Var).a, new d410(this, 10));
        VkPlaceholder vkPlaceholder = (VkPlaceholder) view.findViewById(R.id.error_stub);
        this.k1 = vkPlaceholder;
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.vk_settings_load_error)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.vk_widget_settings_error_subtitle))));
        vkPlaceholder.setTop(new VkPlaceholder.c.C0860c(new ulw(dhr0.M() ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56), null, null, null, 30));
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vk_common_retry), (gzs) new m960(this, 0), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Medium, VkButton.Mode.Link, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
        this.m1 = (Guideline) view.findViewById(R.id.bottom_guideline);
        this.l1 = (FrameLayout) view.findViewById(R.id.error_container);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.header_top_bar);
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource = null;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.vk_widget_setting_dialog_title), null, null, null, b.a(null, new g53(29), 3), 14), null, null, null, 14));
        vkTopBar.setBefore(new VkTopBar.c.d(new tlo0.f(R.string.talkback_widget_settings_close), new nwk(this, 25), null, null, 12));
        vkTopBar.setShowBottomDivider(true);
        this.j1 = (ViewPager2) view.findViewById(R.id.view_pager);
        this.i1 = (VKTabLayout) view.findViewById(R.id.tab_layout);
        ViewPager2 viewPager2 = this.j1;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.setAdapter(new c(getChildFragmentManager(), getLifecycle()));
        VKTabLayout vKTabLayout = this.i1;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        ViewPager2 viewPager22 = this.j1;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        new c(vKTabLayout, viewPager22, new l960(this, 0)).a();
        VKTabLayout vKTabLayout2 = this.i1;
        if (vKTabLayout2 == null) {
            vKTabLayout2 = null;
        }
        int i = 0;
        ViewGroup viewGroup = (ViewGroup) vKTabLayout2.getChildAt(0);
        if (viewGroup != null) {
            for (View view2 : awt0.d(viewGroup)) {
                int i2 = n1;
                bwt0.e0(view2, i2, i2, i2, i2);
                a5p0.a.a(view2, null);
            }
        }
        VKTabLayout vKTabLayout3 = this.i1;
        if (vKTabLayout3 == null) {
            vKTabLayout3 = null;
        }
        bwt0.A(vKTabLayout3).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.n960
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                com.vk.superapp.widget_settings.p004new.a aVar = com.vk.superapp.widget_settings.p004new.a.this;
                VKTabLayout vKTabLayout4 = aVar.i1;
                if (vKTabLayout4 == null) {
                    vKTabLayout4 = null;
                }
                FrameLayout frameLayout = (FrameLayout) bwt0.A(vKTabLayout4).findViewById(R.id.design_bottom_sheet);
                if (frameLayout == null || frameLayout.getTop() >= frameLayout.getHeight()) {
                    return;
                }
                Guideline guideline = aVar.m1;
                (guideline != null ? guideline : null).setGuidelineEnd(frameLayout.getTop());
            }
        });
        VKTabLayout vKTabLayout4 = this.i1;
        if (vKTabLayout4 == null) {
            vKTabLayout4 = null;
        }
        WidgetSettingsTab.Companion.getClass();
        bwt0.p0(vKTabLayout4, WidgetSettingsTab.a.b() > 1);
        WidgetSettingsModalOpenSource.a aVar = WidgetSettingsModalOpenSource.Companion;
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("source")) : null;
        aVar.getClass();
        WidgetSettingsModalOpenSource[] values = WidgetSettingsModalOpenSource.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                break;
            }
            WidgetSettingsModalOpenSource widgetSettingsModalOpenSource2 = values[i];
            int h = widgetSettingsModalOpenSource2.h();
            if (valueOf != null && h == valueOf.intValue()) {
                widgetSettingsModalOpenSource = widgetSettingsModalOpenSource2;
                break;
            }
            i++;
        }
        xn50.a.c(this, new vnx0.a(widgetSettingsModalOpenSource));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((xnx0) vk50Var).g.a(new w620(this, 5), this);
    }

    public final void bo() {
        ikv0.a aVar = new ikv0.a(kn());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(getString(R.string.vk_mini_widget_cannot_save_changes), (String) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(iah0.a(16.0f));
        aVar.e = 3000L;
        FrameLayout frameLayout = this.l1;
        aVar.o(frameLayout != null ? frameLayout : null);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new xnx0(new dox0(new eox0(0)), ((SuperAppServicesComponent) m7m.d(this).mo408a(fpf0.a(SuperAppServicesComponent.class))).Tb());
    }
}
