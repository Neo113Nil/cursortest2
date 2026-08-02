package com.vk.im.ui.components.chat_profile.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.VKTabLayout;
import com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.abg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.dyn0;
import xsna.eyn0;
import xsna.kkm;
import xsna.nwb;
import xsna.ozl;
import xsna.sxb;
import xsna.t0w0;
import xsna.usn0;
import xsna.uxb;
import xsna.vxb;
import xsna.z1q0;

/* compiled from: ChatProfileTabsContainerLayout.kt */
@ozl
/* loaded from: classes2.dex */
public final class ChatProfileTabsContainerLayout extends ConstraintLayout implements NestedVerticalRecyclerViewContainer.b, eyn0 {
    public static final /* synthetic */ int A = 0;
    public final VKTabLayout t;
    public final ViewPager2 u;
    public dyn0 v;
    public a w;
    public final Rect x;
    public final float y;
    public float z;

    /* compiled from: ChatProfileTabsContainerLayout.kt */
    public static final class a extends z1q0 {
        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            super.Wd(gVar);
            if (BuildInfo.t()) {
                View view = gVar.f;
                TextView textView = view instanceof TextView ? (TextView) view : null;
                if (textView != null) {
                    textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_accent));
                }
            }
        }

        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
            if (BuildInfo.t()) {
                View view = gVar.f;
                TextView textView = view instanceof TextView ? (TextView) view : null;
                if (textView != null) {
                    textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_tertiary));
                }
            }
        }
    }

    public ChatProfileTabsContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = new Rect();
        float a2 = cn70.a() * 20.0f;
        this.y = a2;
        this.z = -1.0f;
        bwt0.I(BuildInfo.t() ? R.layout.vkim_chat_profile_tabs_layout_with_round_selector : R.layout.vkim_chat_profile_tabs_layout, this, true);
        P4(a2);
        View findViewById = findViewById(R.id.vkim_chat_profile_tabs__tab_layout);
        usn0.a((VKTabLayout) findViewById);
        this.t = (VKTabLayout) findViewById;
        this.u = (ViewPager2) findViewById(R.id.vkim_chat_profile_tabs__viewpager);
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.b
    public final void L() {
        Q4();
    }

    public final void P4(float f) {
        if (!BuildInfo.t() || this.z == f) {
            return;
        }
        this.z = f;
        setClipToOutline(true);
        setOutlineProvider(new t0w0(4, f, false, false));
    }

    public final void Q4() {
        P4(d() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.y);
        dyn0 dyn0Var = this.v;
        if (dyn0Var != null) {
            ViewPager2 viewPager2 = this.u;
            Rect rect = this.x;
            viewPager2.getGlobalVisibleRect(rect);
            int height = rect.height();
            Iterator<T> it = dyn0Var.getCurrentList().iterator();
            while (it.hasNext()) {
                ((sxb) it.next()).a.Z0(height);
            }
        }
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.b
    public final void c(int i, int[] iArr) {
        dyn0 dyn0Var = this.v;
        if (dyn0Var != null) {
            dyn0Var.getCurrentList().get(this.u.getCurrentItem()).a.a1(i, iArr);
        }
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.b
    public final boolean d() {
        return getTop() == 0;
    }

    @Override // xsna.eyn0
    public final void f3(nwb.l lVar) {
        List<sxb> list = lVar.b;
        dyn0 dyn0Var = this.v;
        VKTabLayout vKTabLayout = this.t;
        ViewPager2 viewPager2 = this.u;
        if (dyn0Var == null) {
            dyn0Var = new dyn0();
            viewPager2.setAdapter(dyn0Var);
            this.v = dyn0Var;
            new c(vKTabLayout, viewPager2, new vxb(this, dyn0Var)).a();
        }
        dyn0Var.submitList(list);
        viewPager2.setOffscreenPageLimit(list.size());
        a aVar = this.w;
        if (aVar != null) {
            vKTabLayout.M.remove(aVar);
        }
        a aVar2 = new a(lVar.c);
        this.w = aVar2;
        vKTabLayout.f(aVar2);
    }

    @Override // xsna.eyn0
    public final void n(kkm kkmVar) {
        boolean t = BuildInfo.t();
        VKTabLayout vKTabLayout = this.t;
        if (!t) {
            kkmVar.e(vKTabLayout, new uxb(kkmVar, 0));
            return;
        }
        abg0 abg0Var = dhr0.t;
        vKTabLayout.setSelectedTabIndicatorColor(abg0Var.c(R.attr.content));
        TabLayout.g b = vKTabLayout.b(vKTabLayout.getSelectedTabPosition());
        KeyEvent.Callback callback = b != null ? b.f : null;
        TextView textView = callback instanceof TextView ? (TextView) callback : null;
        if (textView != null) {
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_accent));
        }
    }

    @Override // xsna.eyn0
    public final void o(kkm kkmVar) {
        kkmVar.h(this.t);
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.b
    public final void w() {
        Q4();
    }

    @Override // xsna.eyn0
    public View getView() {
        return this;
    }
}
