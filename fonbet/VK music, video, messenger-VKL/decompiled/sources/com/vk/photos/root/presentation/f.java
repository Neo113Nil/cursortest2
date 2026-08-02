package com.vk.photos.root.presentation;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.photos.root.presentation.a;

/* compiled from: PhotosRootView.kt */
/* loaded from: classes4.dex */
public final class f extends ViewPager2.g {
    public final /* synthetic */ h d;

    public f(h hVar) {
        this.d = hVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.d.d.invoke(new a.e(i));
    }
}
