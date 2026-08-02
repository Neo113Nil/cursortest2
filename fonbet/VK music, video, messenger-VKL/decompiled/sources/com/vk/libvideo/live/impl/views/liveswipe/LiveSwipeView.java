package com.vk.libvideo.live.impl.views.liveswipe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.design.view.recommended.RecommendedBottomView;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vkontakte.android.R;
import xsna.diz;
import xsna.edp0;
import xsna.f3y0;
import xsna.fdp0;
import xsna.gv5;
import xsna.iah0;
import xsna.lmz;
import xsna.mmn0;
import xsna.mmz;
import xsna.nmz;
import xsna.oiz;
import xsna.pro0;
import xsna.qmz;
import xsna.wcf0;

/* loaded from: classes3.dex */
public class LiveSwipeView extends FrameLayout implements mmz, gv5, a.f {
    public final LiveViewPager b;
    public final RecommendedBottomView c;
    public lmz d;
    public Window e;
    public diz f;
    public float g;
    public final float h;
    public boolean i;
    public boolean j;
    public mmn0 k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LiveSwipeView.this.b.setStartPos(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LiveSwipeView liveSwipeView = LiveSwipeView.this;
            mmn0 mmn0Var = liveSwipeView.k;
            if (mmn0Var != null) {
                mmn0Var.animate().setListener(null).cancel();
                liveSwipeView.k.animate().alpha(1.0f).setDuration(500L).start();
            }
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LiveSwipeView liveSwipeView = LiveSwipeView.this;
            liveSwipeView.removeView(liveSwipeView.k);
            liveSwipeView.k = null;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public LiveSwipeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = iah0.a(48.0f);
        setClipToPadding(false);
        setClipChildren(false);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_swipe_view, (ViewGroup) this, true);
        LiveViewPager liveViewPager = (LiveViewPager) inflate.findViewById(R.id.liveSwipePager);
        this.b = liveViewPager;
        this.c = (RecommendedBottomView) inflate.findViewById(R.id.liveSwipeRecommended);
        liveViewPager.addOnPageChangeListener(new qmz(this));
    }

    @Override // xsna.mmz
    public final boolean I0() {
        if (!this.b.f) {
            return false;
        }
        RecommendedBottomView recommendedBottomView = this.c;
        return recommendedBottomView.z.c.getScrollState() == 0 && !recommendedBottomView.z.c.isComputingLayout();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.f
    public final boolean a() {
        return !this.j;
    }

    @Override // xsna.gv5
    public final boolean a0() {
        RecommendedBottomView recommendedBottomView = this.c;
        boolean a0 = recommendedBottomView != null ? recommendedBottomView.a0() : false;
        LiveView curLiveView = this.b.getCurLiveView();
        return (a0 || curLiveView == null) ? a0 : curLiveView.a0();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.f
    public final boolean b() {
        return !this.j;
    }

    public final void c() {
        LiveView curLiveView = this.b.getCurLiveView();
        if (curLiveView != null) {
            curLiveView.getPresenter().y0();
        }
    }

    public final boolean d() {
        f3y0 f3y0Var;
        float f = this.g;
        float f2 = this.h;
        if ((f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < f2) || f > getHeight() - f2) {
            return false;
        }
        LiveView curLiveView = this.b.getCurLiveView();
        boolean z = curLiveView == null || (f3y0Var = curLiveView.p) == null || !f3y0Var.J;
        RecommendedBottomView recommendedBottomView = this.c;
        if (recommendedBottomView == null || recommendedBottomView.D) {
            return z;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.j = fdp0.a(motionEvent.getRawX(), motionEvent.getRawY(), this, new edp0(false));
            this.g = motionEvent.getY();
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.j = false;
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.k != null) {
            if (getPresenter() != null) {
                getPresenter().k1();
            }
            getCurrentLiveView().setSkipUp(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        mmn0 mmn0Var = this.k;
        if (mmn0Var != null) {
            mmn0Var.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L).start();
        }
    }

    public final void f(String str) {
        LiveViewPager liveViewPager = this.b;
        LiveView liveView = (LiveView) liveViewPager.findViewWithTag(str);
        oiz presenter = liveView != null ? liveView.getPresenter() : null;
        if (presenter != null) {
            presenter.e2();
        }
        LiveView liveView2 = (LiveView) liveViewPager.findViewWithTag(str);
        oiz presenter2 = liveView2 != null ? liveView2.getPresenter() : null;
        if (presenter2 != null) {
            presenter2.a();
        }
    }

    public LiveView getCurrentLiveView() {
        return this.b.getCurLiveView();
    }

    @Override // xsna.mmz
    public int getCurrentPosition() {
        return this.b.getCurrentItem();
    }

    @Nullable
    public VideoFile getCurrentVideoFile() {
        return this.b.getCurrentVideoFile();
    }

    @Override // xsna.mmz
    public wcf0 getRecommendedView() {
        return this.c;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.mmz
    public Window getWindow() {
        return this.e;
    }

    public final void i() {
        mmn0 mmn0Var = this.k;
        if (mmn0Var != null) {
            mmn0Var.animate().alpha(1.0f).setDuration(100L).start();
        }
    }

    @Override // xsna.mmz
    public final void k2(boolean z) {
        mmn0 mmn0Var = this.k;
        if (mmn0Var == null || this.i) {
            return;
        }
        this.i = true;
        mmn0Var.animate().setListener(null).cancel();
        if (z) {
            this.k.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(500L).setListener(new c()).start();
        } else {
            removeView(this.k);
            this.k = null;
        }
    }

    @Override // xsna.mmz
    public final void l1() {
        if (this.k == null) {
            mmn0 mmn0Var = new mmn0(getContext());
            this.k = mmn0Var;
            float f = 250;
            int a2 = iah0.a(f);
            int a3 = iah0.a(f);
            int i = -iah0.a(40);
            int i2 = -iah0.a(80);
            VKAnimationView vKAnimationView = mmn0Var.b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vKAnimationView.getLayoutParams();
            layoutParams.width = a2;
            layoutParams.height = a3;
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i2;
            mmn0Var.c.setText(mmn0Var.getContext().getString(R.string.live_swipe_tooltip));
            vKAnimationView.setLayoutParams(layoutParams);
            vKAnimationView.setAnimation("live_tooltip.json");
            vKAnimationView.m0();
            vKAnimationView.f.c.setRepeatCount(-1);
            addView(this.k);
            this.k.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            pro0.c(new b());
        }
    }

    @Override // xsna.rr6
    public final void pause() {
        lmz lmzVar = this.d;
        if (lmzVar != null) {
            lmzVar.pause();
        }
        RecommendedBottomView recommendedBottomView = this.c;
        if (recommendedBottomView != null) {
            recommendedBottomView.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        lmz lmzVar = this.d;
        if (lmzVar != null) {
            lmzVar.release();
        }
        RecommendedBottomView recommendedBottomView = this.c;
        if (recommendedBottomView != null) {
            recommendedBottomView.release();
        }
        k2(false);
    }

    @Override // xsna.rr6
    public final void resume() {
        lmz lmzVar = this.d;
        if (lmzVar != null) {
            lmzVar.resume();
        }
        RecommendedBottomView recommendedBottomView = this.c;
        if (recommendedBottomView != null) {
            recommendedBottomView.resume();
        }
    }

    public void setFirstInstItemListener(d dVar) {
        this.b.setFirstInstItemListener(dVar);
    }

    public void setLiveAnimationController(diz dizVar) {
        this.f = dizVar;
    }

    @Override // xsna.mmz
    public void setPagerAdapter(nmz nmzVar) {
        LiveViewPager liveViewPager = this.b;
        nmzVar.o = liveViewPager;
        liveViewPager.setAdapter(nmzVar);
    }

    @Override // xsna.mmz
    public void setSelectedPosition(int i) {
        this.b.setCurrentItem(i, false);
        post(new a());
    }

    public void setWindow(Window window) {
        this.e = window;
    }

    @Override // xsna.rr6
    public lmz getPresenter() {
        return this.d;
    }

    @Override // xsna.rr6
    public void setPresenter(lmz lmzVar) {
        this.d = lmzVar;
        this.b.setPresenter(lmzVar);
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
