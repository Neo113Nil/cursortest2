package com.vk.core.view.components.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tabs.VkTabs;
import java.lang.ref.WeakReference;
import xsna.iuw;
import xsna.smk0;

/* compiled from: VkTabsMediator.kt */
/* loaded from: classes17.dex */
public final class e {
    public final VkTabs a;
    public final ViewPager2 b;
    public final boolean c;
    public final d d;
    public RecyclerView.Adapter<?> e;
    public boolean f;
    public a g;
    public b h;
    public c i;

    /* compiled from: VkTabsMediator.kt */
    public static final class a extends ViewPager2.g {
        public final WeakReference<VkTabs> d;
        public Integer e;

        public a(VkTabs vkTabs) {
            this.d = new WeakReference<>(vkTabs);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            this.e = Integer.valueOf(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            VkTabs vkTabs = this.d.get();
            if (vkTabs != null) {
                iuw iuwVar = vkTabs.l;
                smk0 smk0Var = iuwVar.d;
                if (smk0Var != null) {
                    smk0Var.d();
                }
                iuwVar.c = i + f;
                if (iuwVar.e) {
                    iuwVar.a.invoke();
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            VkTabs vkTabs = this.d.get();
            if (vkTabs != null) {
                VkTabs.c selectedTab = vkTabs.getSelectedTab();
                if ((selectedTab == null || selectedTab.b != i) && i < vkTabs.getTabsCount()) {
                    Integer num = this.e;
                    vkTabs.l(i, num != null && num.intValue() == 2);
                }
            }
        }
    }

    /* compiled from: VkTabsMediator.kt */
    public final class c extends RecyclerView.i {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            e.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            e.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            e.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            e.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            e.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            e.this.c();
        }
    }

    /* compiled from: VkTabsMediator.kt */
    public interface d {
        void a(VkTabs.c cVar, int i);
    }

    public /* synthetic */ e(VkTabs vkTabs, ViewPager2 viewPager2, d dVar) {
        this(vkTabs, viewPager2, true, dVar);
    }

    public final void a() {
        if (this.f) {
            throw new IllegalStateException("VkTabsMediator is already attached");
        }
        ViewPager2 viewPager2 = this.b;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null) {
            throw new IllegalStateException("VkTabsMediator attached before ViewPager2 has an adapter");
        }
        this.e = adapter;
        this.f = true;
        VkTabs vkTabs = this.a;
        a aVar = new a(vkTabs);
        viewPager2.b(aVar);
        this.g = aVar;
        b bVar = new b(viewPager2);
        vkTabs.a(bVar);
        this.h = bVar;
        if (this.c) {
            c cVar = new c();
            RecyclerView.Adapter<?> adapter2 = this.e;
            if (adapter2 != null) {
                adapter2.registerAdapterDataObserver(cVar);
            }
            this.i = cVar;
        }
        c();
        int currentItem = viewPager2.getCurrentItem();
        iuw iuwVar = vkTabs.l;
        smk0 smk0Var = iuwVar.d;
        if (smk0Var != null) {
            smk0Var.d();
        }
        iuwVar.c = currentItem + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (iuwVar.e) {
            iuwVar.a.invoke();
        }
    }

    public final void b() {
        RecyclerView.Adapter<?> adapter = this.e;
        c cVar = this.i;
        b bVar = this.h;
        if (bVar != null) {
            this.a.e.remove(bVar);
        }
        a aVar = this.g;
        if (aVar != null) {
            this.b.g(aVar);
        }
        if (adapter != null && cVar != null) {
            adapter.unregisterAdapterDataObserver(cVar);
        }
        this.h = null;
        this.g = null;
        this.e = null;
        this.i = null;
        this.f = false;
    }

    public final void c() {
        VkTabs vkTabs = this.a;
        vkTabs.h(false);
        RecyclerView.Adapter<?> adapter = this.e;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                VkTabs.c g = vkTabs.g();
                this.d.a(g, i);
                vkTabs.b(g, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.b.getCurrentItem(), vkTabs.getTabsCount() - 1);
                VkTabs.c selectedTab = vkTabs.getSelectedTab();
                if (selectedTab == null || min != selectedTab.b) {
                    vkTabs.l(min, true);
                }
            }
        }
    }

    public e(VkTabs vkTabs, ViewPager2 viewPager2, boolean z, d dVar) {
        this.a = vkTabs;
        this.b = viewPager2;
        this.c = z;
        this.d = dVar;
    }

    /* compiled from: VkTabsMediator.kt */
    public static final class b implements VkTabs.b {
        public final ViewPager2 a;

        public b(ViewPager2 viewPager2) {
            this.a = viewPager2;
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void c(VkTabs.c cVar) {
            this.a.setCurrentItem(cVar.b);
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void b() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void a(VkTabs.c cVar) {
        }
    }
}
