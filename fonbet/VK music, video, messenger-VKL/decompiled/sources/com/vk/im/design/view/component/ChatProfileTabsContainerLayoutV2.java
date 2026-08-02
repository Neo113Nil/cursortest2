package com.vk.im.design.view.component;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.e;
import com.vk.im.design.view.component.ChatProfileTabsContainerLayoutV2;
import com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bwt0;
import xsna.dyn0;
import xsna.eyn0;
import xsna.kkm;
import xsna.nwb;
import xsna.sxb;

/* compiled from: ChatProfileTabsContainerLayoutV2.kt */
/* loaded from: classes2.dex */
public final class ChatProfileTabsContainerLayoutV2 extends ConstraintLayout implements NestedVerticalRecyclerViewContainer.b, eyn0 {
    public static final /* synthetic */ int y = 0;
    public final VkTabs t;
    public final ViewPager2 u;
    public dyn0 v;
    public a w;
    public final Rect x;

    public ChatProfileTabsContainerLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = new Rect();
        bwt0.I(R.layout.vkim_chat_profile_tabs_layout_v2, this, true);
        this.t = (VkTabs) findViewById(R.id.vkim_chat_profile_tabs__tab_layout);
        this.u = (ViewPager2) findViewById(R.id.vkim_chat_profile_tabs__viewpager);
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.b
    public final void L() {
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
        final dyn0 dyn0Var = this.v;
        ViewPager2 viewPager2 = this.u;
        if (dyn0Var == null) {
            dyn0Var = new dyn0();
            viewPager2.setAdapter(dyn0Var);
            this.v = dyn0Var;
        }
        e.d dVar = new e.d() { // from class: xsna.wxb
            @Override // com.vk.core.view.components.tabs.e.d
            public final void a(VkTabs.c cVar, int i) {
                int i2 = ChatProfileTabsContainerLayoutV2.y;
                cVar.a.Y4(dyn0.this.getCurrentList().get(i).a.Y0(), null);
            }
        };
        VkTabs vkTabs = this.t;
        e eVar = new e(vkTabs, viewPager2, false, dVar);
        dyn0Var.submitList(list);
        viewPager2.setOffscreenPageLimit(list.size());
        eVar.a();
        a aVar = this.w;
        if (aVar != null) {
            vkTabs.e.remove(aVar);
        }
        a aVar2 = new a(this, lVar);
        this.w = aVar2;
        vkTabs.a(aVar2);
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.b
    public final void w() {
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

    /* compiled from: ChatProfileTabsContainerLayoutV2.kt */
    public static final class a implements VkTabs.b {
        public final /* synthetic */ nwb.l a;

        public a(ChatProfileTabsContainerLayoutV2 chatProfileTabsContainerLayoutV2, nwb.l lVar) {
            this.a = lVar;
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void c(VkTabs.c cVar) {
            ArrayList arrayList = this.a.c;
            int i = ChatProfileTabsContainerLayoutV2.y;
            int i2 = cVar.b;
            if (!arrayList.isEmpty() && i2 >= 0 && i2 < arrayList.size()) {
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) arrayList.get(i2);
                UiTracker uiTracker = UiTracker.a;
                UiTracker.i.j(new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen), true);
            } else {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.w, new Object[]{"No screens provided for tracking"});
            }
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void b() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void a(VkTabs.c cVar) {
        }
    }

    @Override // xsna.eyn0
    public View getView() {
        return this;
    }

    @Override // xsna.eyn0
    public final void n(kkm kkmVar) {
    }

    @Override // xsna.eyn0
    public final void o(kkm kkmVar) {
    }
}
