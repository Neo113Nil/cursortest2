package com.vk.story.viewer.impl.presentation.stories.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.vk.log.L;
import com.vk.story.viewer.impl.presentation.stories.view.ScrollerCustomDuration;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.StoriesFeatures;
import java.lang.reflect.Field;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bek0;
import xsna.eqy;
import xsna.pkk;
import xsna.pxo0;
import xsna.syo;

/* loaded from: classes6.dex */
public class StoriesViewPager extends syo {
    public final pxo0 d;
    public final ScrollerCustomDuration e;
    public boolean f;

    public StoriesViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Integer b;
        this.d = new pxo0(500L);
        this.e = null;
        int i = 0;
        this.f = false;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.e = new ScrollerCustomDuration(getContext(), new pkk(0.3d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0.3d, 1.0d));
            eqy<bek0> eqyVar = d.a;
            StoriesFeatures storiesFeatures = StoriesFeatures.CHANGE_ANIMATION_SPEED;
            storiesFeatures.getClass();
            b bVar = b.A;
            if (bVar.a(storiesFeatures)) {
                b.d j = bVar.j(storiesFeatures.getKey(), false);
                if (j != null && (b = j.b()) != null) {
                    Integer num = b.intValue() > 0 ? b : null;
                    if (num != null) {
                        i = num.intValue();
                    }
                }
                i = 130;
            }
            if (i > 0) {
                ScrollerCustomDuration scrollerCustomDuration = this.e;
                scrollerCustomDuration.a = ScrollerCustomDuration.Mode.Duration;
                scrollerCustomDuration.c = i;
            }
            declaredField.set(this, this.e);
        } catch (Exception unused) {
        }
    }

    public final boolean a() {
        return this.d.c() || this.f;
    }

    @Override // xsna.syo, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (a()) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            L.i(e);
            return false;
        }
    }

    public void setScrollDurationFactor(double d) {
        this.e.b = d;
    }
}
