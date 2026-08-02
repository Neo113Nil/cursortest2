package com.vk.core.ui.bottomsheet.internal;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;

/* compiled from: BottomSheetViewPagerSwitchListener.java */
/* loaded from: classes17.dex */
public final class a extends ViewPager.m {
    public final CoordinatorLayout.c b;
    public ViewPager c;

    /* compiled from: BottomSheetViewPagerSwitchListener.java */
    /* renamed from: com.vk.core.ui.bottomsheet.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0786a {
        void c(@NonNull ViewPager viewPager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NonNull InterfaceC0786a interfaceC0786a) {
        this.b = (CoordinatorLayout.c) interfaceC0786a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout$c, com.vk.core.ui.bottomsheet.internal.a$a] */
    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.b.c(this.c);
    }
}
