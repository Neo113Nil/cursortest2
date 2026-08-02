package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes13.dex */
public final class c {

    @NonNull
    public final TabLayout a;

    @NonNull
    public final ViewPager2 b;
    public final b c;

    @Nullable
    public RecyclerView.Adapter<?> d;
    public boolean e;

    @Nullable
    public C0126c f;

    @Nullable
    public d g;

    @Nullable
    public a h;

    /* compiled from: TabLayoutMediator.java */
    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, @Nullable Object obj) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            c.this.c();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    public interface b {
        void c(@NonNull TabLayout.g gVar, int i);
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.c$c, reason: collision with other inner class name */
    public static class C0126c extends ViewPager2.g {

        @NonNull
        public final WeakReference<TabLayout> d;
        public int f = 0;
        public int e = 0;

        public C0126c(TabLayout tabLayout) {
            this.d = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            this.e = this.f;
            this.f = i;
            TabLayout tabLayout = this.d.get();
            if (tabLayout != null) {
                tabLayout.V = this.f;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.d.get();
            if (tabLayout != null) {
                int i3 = this.f;
                boolean z2 = true;
                if (i3 != 2 || this.e == 1) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (i3 == 2 && this.e == 0) {
                    z = false;
                }
                tabLayout.v(i, f, z2, z, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            TabLayout tabLayout = this.d.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f;
            tabLayout.c(tabLayout.b(i), i2 == 0 || (i2 == 2 && this.e == 0));
        }
    }

    public c(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull b bVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = bVar;
    }

    public final void a() {
        if (this.e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.b;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        this.d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.e = true;
        TabLayout tabLayout = this.a;
        C0126c c0126c = new C0126c(tabLayout);
        this.f = c0126c;
        viewPager2.b(c0126c);
        d dVar = new d(viewPager2);
        this.g = dVar;
        tabLayout.g(dVar);
        a aVar = new a();
        this.h = aVar;
        this.d.registerAdapterDataObserver(aVar);
        c();
        tabLayout.d(viewPager2.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
    }

    public final void b() {
        RecyclerView.Adapter<?> adapter = this.d;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.h);
            this.h = null;
        }
        this.a.t(this.g);
        this.b.g(this.f);
        this.g = null;
        this.f = null;
        this.d = null;
        this.e = false;
    }

    public final void c() {
        TabLayout tabLayout = this.a;
        tabLayout.r();
        RecyclerView.Adapter<?> adapter = this.d;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.g p = tabLayout.p();
                this.c.c(p, i);
                tabLayout.i(p, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.c(tabLayout.b(min), true);
                }
            }
        }
    }

    /* compiled from: TabLayoutMediator.java */
    public static class d implements TabLayout.d {
        public final ViewPager2 b;

        public d(ViewPager2 viewPager2) {
            this.b = viewPager2;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(@NonNull TabLayout.g gVar) {
            this.b.e(gVar.e, true);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }
}
