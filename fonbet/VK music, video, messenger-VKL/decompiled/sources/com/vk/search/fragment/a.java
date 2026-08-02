package com.vk.search.fragment;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.search.ui.impl.widget.FirstFixedTabsLayout;
import xsna.cg1;
import xsna.f5z;
import xsna.fpf0;
import xsna.m7m;
import xsna.mf3;
import xsna.nhl;
import xsna.q7v0;

/* compiled from: ChannelOnboardingController.kt */
/* loaded from: classes5.dex */
public final class a implements nhl {
    public final FirstFixedTabsLayout b;
    public final ViewPager2 c;
    public final Context d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final VkOnboardingComponent f;
    public final q7v0 g;

    public a(DiscoverSearchFragment discoverSearchFragment, FirstFixedTabsLayout firstFixedTabsLayout, ViewPager2 viewPager2) {
        this.b = firstFixedTabsLayout;
        this.c = viewPager2;
        this.d = discoverSearchFragment.requireContext();
        VkOnboardingComponent vkOnboardingComponent = (VkOnboardingComponent) m7m.d(discoverSearchFragment).a(fpf0.a(VkOnboardingComponent.class));
        this.f = vkOnboardingComponent;
        q7v0 p3 = vkOnboardingComponent.p3();
        this.g = p3;
        if (!p3.isReady()) {
            p3.init();
        }
        p3.c(new cg1(4, this, discoverSearchFragment));
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        this.e.removeCallbacksAndMessages(null);
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        Handler handler = this.e;
        handler.removeCallbacksAndMessages(null);
        handler.post(new mf3(this, 1));
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
