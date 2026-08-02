package com.vk.libvideo.design.view.recommended;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.live.impl.views.gifts.LiveBottomSheetBehavior;
import com.vkontakte.android.R;
import xsna.bcf0;
import xsna.ccf0;
import xsna.e3m;
import xsna.gv5;
import xsna.iah0;
import xsna.k3p;
import xsna.vcf0;
import xsna.wcf0;

/* loaded from: classes2.dex */
public class RecommendedBottomView extends CoordinatorLayout implements wcf0, gv5 {
    public final FrameLayout A;
    public final LiveBottomSheetBehavior B;
    public int C;
    public boolean D;
    public boolean E;
    public vcf0 F;
    public int G;
    public int H;
    public final RecommendedView z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecommendedBottomView recommendedBottomView = RecommendedBottomView.this;
            RecommendedView recommendedView = recommendedBottomView.z;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) recommendedView.getLayoutParams();
            layoutParams.height = recommendedBottomView.C - iah0.a(55.0f);
            recommendedView.setLayoutParams(layoutParams);
            LiveBottomSheetBehavior liveBottomSheetBehavior = recommendedBottomView.B;
            liveBottomSheetBehavior.E(recommendedBottomView.C);
            if (recommendedBottomView.E) {
                if (recommendedBottomView.D) {
                    liveBottomSheetBehavior.G(5);
                } else {
                    liveBottomSheetBehavior.G(4);
                }
            }
        }
    }

    public RecommendedBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_recommended_bottom, (ViewGroup) this, true);
        this.z = (RecommendedView) inflate.findViewById(R.id.liveRecommendedView);
        setClipChildren(false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.liveRecommendedHolder);
        this.A = frameLayout;
        ((FrameLayout) inflate.findViewById(R.id.liveRecommendedBacker)).setOnTouchListener(new bcf0(this));
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (!(cVar instanceof LiveBottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        LiveBottomSheetBehavior liveBottomSheetBehavior = (LiveBottomSheetBehavior) cVar;
        this.B = liveBottomSheetBehavior;
        liveBottomSheetBehavior.d = true;
        liveBottomSheetBehavior.F(5);
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        liveBottomSheetBehavior.u = new ccf0(this);
        post(new k3p(this, 1));
        this.D = true;
    }

    @Override // xsna.wcf0
    public final void V0(int i) {
        this.z.V0(i);
    }

    @Override // xsna.gv5
    public final boolean a0() {
        if (this.D) {
            return false;
        }
        this.B.F(5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.B.e == 5) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        getHeight();
        getWidth();
        if (this.G != size2 && this.H != size) {
            e3m.h(getContext()).getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            float f = r0.heightPixels * 0.7f;
            float a2 = (f > ((float) iah0.a(276.0f)) ? iah0.a(276.0f) : (int) f) - iah0.a(55.0f);
            int i3 = (int) (0.63f * a2);
            if (i3 == 0) {
                i3 = iah0.a(176.0f);
            }
            int floor = (int) Math.floor(size2 / i3);
            if (floor == 0) {
                floor = 1;
            }
            this.C = iah0.a(55.0f) + ((int) ((size2 / ((floor + 0.4f) * i3)) * a2));
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.G != i && this.H != i2) {
            FrameLayout frameLayout = this.A;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) frameLayout.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) fVar).height = this.C;
            frameLayout.setLayoutParams(fVar);
            post(new a());
        }
        this.G = i;
        this.H = i2;
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // xsna.rr6
    public final void pause() {
        RecommendedView recommendedView = this.z;
        if (recommendedView != null) {
            recommendedView.pause();
        }
        vcf0 vcf0Var = this.F;
        if (vcf0Var != null) {
            vcf0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        vcf0 vcf0Var = this.F;
        if (vcf0Var != null) {
            vcf0Var.release();
            this.F = null;
        }
        RecommendedView recommendedView = this.z;
        if (recommendedView != null) {
            recommendedView.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        RecommendedView recommendedView = this.z;
        if (recommendedView != null) {
            recommendedView.resume();
        }
        vcf0 vcf0Var = this.F;
        if (vcf0Var != null) {
            vcf0Var.resume();
        }
    }

    @Override // xsna.wcf0
    public void setAdapter(RecyclerView.Adapter<RecyclerView.e0> adapter) {
        this.z.setAdapter(adapter);
    }

    @Override // xsna.wcf0
    public void setErrorVisibility(boolean z) {
        this.z.setErrorVisibility(z);
    }

    @Override // xsna.wcf0
    public void setHidden(boolean z) {
        this.D = z;
        LiveBottomSheetBehavior liveBottomSheetBehavior = this.B;
        if (z) {
            liveBottomSheetBehavior.F(5);
            return;
        }
        liveBottomSheetBehavior.F(4);
        FrameLayout frameLayout = this.A;
        if (frameLayout.getTranslationY() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            frameLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.wcf0
    public void setProgressVisibility(boolean z) {
        this.z.setProgressVisibility(z);
    }

    @Override // xsna.wcf0
    public void setSelectedPosition(int i) {
        this.z.setSelectedPosition(i);
    }

    @Override // xsna.rr6
    public vcf0 getPresenter() {
        return this.F;
    }

    @Override // xsna.rr6
    public void setPresenter(vcf0 vcf0Var) {
        this.F = vcf0Var;
        this.z.setPresenter(vcf0Var);
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
