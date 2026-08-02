package com.vk.photogallery;

import androidx.viewpager.widget.ViewPager;

/* compiled from: PhotoGalleryView.kt */
/* loaded from: classes4.dex */
public final class a implements ViewPager.j {
    public final /* synthetic */ PhotoGalleryView b;

    public a(PhotoGalleryView photoGalleryView) {
        this.b = photoGalleryView;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        this.b.j.onPageSelected(i);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
