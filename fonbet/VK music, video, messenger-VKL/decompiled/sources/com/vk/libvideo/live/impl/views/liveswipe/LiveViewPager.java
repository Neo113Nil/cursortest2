package com.vk.libvideo.live.impl.views.liveswipe;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.vk.libvideo.live.impl.views.live.b;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.lmz;
import xsna.nmz;
import xsna.oiz;
import xsna.ov;
import xsna.qyk0;
import xsna.y0m;

/* loaded from: classes3.dex */
public class LiveViewPager extends ViewPager {
    public final y0m b;
    public lmz c;
    public LiveView d;
    public boolean e;
    public boolean f;
    public LiveView g;
    public LiveSwipeView.d h;
    public final Rect i;
    public final List<Rect> j;

    public class a implements ViewPager.j {
        public boolean b;
        public int c;
        public boolean d;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            LiveViewPager liveViewPager = LiveViewPager.this;
            LiveView liveView = (LiveView) liveViewPager.findViewWithTag(liveViewPager.getLiveAdapter().h.get(liveViewPager.getCurrentItem()).c);
            if (i == 0) {
                liveViewPager.e = false;
                liveViewPager.f = true;
                liveViewPager.setStartPos(false);
                liveViewPager.c.m1(liveViewPager.getCurrentItem());
                liveViewPager.c.l1();
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                liveViewPager.e = true;
                liveViewPager.f = false;
                this.d = true;
                return;
            }
            liveViewPager.f = false;
            this.c = liveViewPager.getCurrentItem();
            liveViewPager.c.b();
            liveViewPager.d = liveView;
            liveView.a0();
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            if (this.b && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                LiveViewPager.this.setStartPos(false);
                this.b = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            LiveStatNew liveStatNew;
            this.b = true;
            if (this.c != i && this.d) {
                LiveViewPager liveViewPager = LiveViewPager.this;
                LiveView liveView = (LiveView) liveViewPager.findViewWithTag(liveViewPager.getLiveAdapter().h.get(liveViewPager.getCurrentItem()).c);
                if (liveView != null) {
                    oiz oizVar = liveView.Q;
                    if (oizVar != null && (oizVar instanceof b) && (liveStatNew = ((b) oizVar).W) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("action_type", "swipe");
                        liveStatNew.b(bundle);
                        qyk0.a().e("live_action", bundle);
                    }
                    liveView.U = true;
                }
            }
            this.d = false;
        }
    }

    public LiveViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        Rect rect = new Rect();
        this.i = rect;
        this.j = Collections.singletonList(rect);
        setClipToPadding(false);
        setClipChildren(false);
        y0m y0mVar = new y0m();
        this.b = y0mVar;
        setPageTransformer(true, y0mVar);
        addOnPageChangeListener(new a());
    }

    public LiveView getCurLiveView() {
        return this.g;
    }

    @Nullable
    public VideoFile getCurrentVideoFile() {
        return getLiveAdapter().h.get(getCurrentItem()).f;
    }

    public nmz getLiveAdapter() {
        return (nmz) getAdapter();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.i.set(getLeft(), getTop(), getRight(), getBottom());
            setSystemGestureExclusionRects(this.j);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCurLiveView(LiveView liveView) {
        LiveSwipeView.d dVar;
        boolean z = this.g == null;
        this.g = liveView;
        if (!z || liveView == null || (dVar = this.h) == null) {
            return;
        }
        ((LiveVideoDialog) dVar).ro();
    }

    public void setFirstInstItemListener(LiveSwipeView.d dVar) {
        this.h = dVar;
    }

    public void setPresenter(lmz lmzVar) {
        this.c = lmzVar;
    }

    public void setStartPos(boolean z) {
        if (z) {
            this.d = null;
        }
        LiveView liveView = (LiveView) findViewWithTag(getLiveAdapter().h.get(getCurrentItem()).c);
        if (liveView != null && liveView != this.g) {
            if (this.d != liveView) {
                Iterator it = getLiveAdapter().j.iterator();
                while (it.hasNext()) {
                    LiveView liveView2 = (LiveView) it.next();
                    if (liveView != liveView2) {
                        liveView2.getPresenter().setActive(false);
                        liveView2.pause();
                        liveView2.Q2(false);
                        liveView2.getPresenter().y();
                    }
                }
                liveView.getPresenter().setActive(true);
                liveView.getPresenter().B0();
                liveView.getPresenter().start();
                this.g = liveView;
            }
            post(new ov(this, 7));
        }
        this.b.transformPage(liveView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
