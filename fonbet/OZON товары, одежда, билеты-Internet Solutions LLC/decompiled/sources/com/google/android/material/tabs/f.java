package com.google.android.material.tabs;

import B90.C2615q;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import ru.ozon.app.android.abtool.presentation.root.RootFragment;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final TabLayout f58597a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final ViewPager2 f58598b;

    /* renamed from: c, reason: collision with root package name */
    private final C2615q f58599c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView.g<?> f58600d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f58601e;

    private class a extends RecyclerView.i {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onChanged() {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i11, int i12) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i11, int i12) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i11, int i12, int i13) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i11, int i12) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i11, int i12, Object obj) {
            f.this.b();
        }
    }

    private static class b extends ViewPager2.g {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<TabLayout> f58603a;

        /* renamed from: c, reason: collision with root package name */
        private int f58605c = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f58604b = 0;

        b(TabLayout tabLayout) {
            this.f58603a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i11) {
            this.f58604b = this.f58605c;
            this.f58605c = i11;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i11, float f7, int i12) {
            TabLayout tabLayout = this.f58603a.get();
            if (tabLayout != null) {
                int i13 = this.f58605c;
                tabLayout.u(i11, f7, i13 != 2 || this.f58604b == 1, (i13 == 2 && this.f58604b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            TabLayout tabLayout = this.f58603a.get();
            if (tabLayout == null || tabLayout.j() == i11 || i11 >= tabLayout.l()) {
                return;
            }
            int i12 = this.f58605c;
            tabLayout.s(tabLayout.k(i11), i12 == 0 || (i12 == 2 && this.f58604b == 0));
        }
    }

    private static class c implements TabLayout.b {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager2 f58606a;

        c(ViewPager2 viewPager2) {
            this.f58606a = viewPager2;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void onTabReselected(TabLayout.e eVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void onTabSelected(@NonNull TabLayout.e eVar) {
            this.f58606a.t(eVar.d(), true);
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void onTabUnselected(TabLayout.e eVar) {
        }
    }

    public f(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull C2615q c2615q) {
        this.f58597a = tabLayout;
        this.f58598b = viewPager2;
        this.f58599c = c2615q;
    }

    public final void a() {
        if (this.f58601e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.f58598b;
        RecyclerView.g<?> e11 = viewPager2.e();
        this.f58600d = e11;
        if (e11 == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f58601e = true;
        TabLayout tabLayout = this.f58597a;
        viewPager2.p(new b(tabLayout));
        tabLayout.c(new c(viewPager2));
        this.f58600d.registerAdapterDataObserver(new a());
        b();
        tabLayout.u(viewPager2.f(), 0.0f, true, true);
    }

    final void b() {
        TabLayout tabLayout = this.f58597a;
        tabLayout.o();
        RecyclerView.g<?> gVar = this.f58600d;
        if (gVar != null) {
            int shimmersCount = gVar.getShimmersCount();
            for (int i11 = 0; i11 < shimmersCount; i11++) {
                TabLayout.e m11 = tabLayout.m();
                RootFragment.onViewCreated$lambda$0((String) this.f58599c.f3185b, m11, i11);
                tabLayout.e(m11, false);
            }
            if (shimmersCount > 0) {
                int min = Math.min(this.f58598b.f(), tabLayout.l() - 1);
                if (min != tabLayout.j()) {
                    tabLayout.s(tabLayout.k(min), true);
                }
            }
        }
    }
}
