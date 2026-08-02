package com.vk.libvideo.design.view.recommended;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vk.libvideo.live.impl.widgets.timeprogress.CircularTimeBar;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iah0;
import xsna.iut0;
import xsna.jec;
import xsna.ref0;
import xsna.som0;
import xsna.vcf0;
import xsna.wcf0;
import xsna.xcf0;

/* loaded from: classes2.dex */
public class RecommendedView extends FrameLayout implements wcf0 {
    public final LinearLayoutManager b;
    public final RecyclerView c;
    public final VkText d;
    public final VkSpinner e;
    public xcf0 f;
    public vcf0 g;

    public class a implements Runnable {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecommendedView recommendedView = RecommendedView.this;
            RecyclerView recyclerView = recommendedView.c;
            if (recyclerView.getAdapter().getItemCount() > 0) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (recommendedView.isAttachedToWindow()) {
                    int i = this.b;
                    if (recyclerView.findViewHolderForAdapterPosition(i) != null) {
                        xcf0 xcf0Var = (xcf0) recyclerView.findViewHolderForLayoutPosition(i).itemView;
                        recommendedView.f = xcf0Var;
                        int color = xcf0Var.getContext().getColor(R.color.vk_white);
                        int color2 = xcf0Var.getContext().getColor(R.color.vk_black_alpha45);
                        CircularTimeBar circularTimeBar = xcf0Var.e;
                        circularTimeBar.setVisibility(0);
                        jec circularTimeDrawable = circularTimeBar.getCircularTimeDrawable();
                        circularTimeDrawable.s = color2;
                        circularTimeDrawable.q = color;
                        circularTimeDrawable.r = color;
                        circularTimeDrawable.f = true;
                        circularTimeDrawable.a = new som0(xcf0Var);
                        float f = 2;
                        circularTimeDrawable.i = f;
                        circularTimeDrawable.k = f;
                        circularTimeDrawable.m = f;
                        circularTimeDrawable.a();
                        circularTimeDrawable.b = jec.a.STARTED;
                        circularTimeDrawable.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        circularTimeDrawable.n = System.currentTimeMillis();
                        circularTimeDrawable.o = 8000L;
                    }
                }
            }
        }
    }

    public class b extends RecyclerView.n {
        public int b;

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            rect.right = this.b;
        }
    }

    public RecommendedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_recommended, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.liveRecommendedRecycler);
        this.c = recyclerView;
        b bVar = new b();
        bVar.b = iah0.a(2.0f);
        recyclerView.addItemDecoration(bVar);
        this.d = (VkText) inflate.findViewById(R.id.liveRecommendedError);
        this.e = (VkSpinner) inflate.findViewById(R.id.liveRecommendedProgress);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.b = linearLayoutManager;
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnScrollListener(new ref0(this));
    }

    @Override // xsna.wcf0
    public final void V0(int i) {
        this.c.scrollToPosition(i);
        post(new a(i));
    }

    public final void a() {
        xcf0 xcf0Var = this.f;
        if (xcf0Var != null) {
            CircularTimeBar circularTimeBar = xcf0Var.e;
            circularTimeBar.setVisibility(8);
            jec circularTimeDrawable = circularTimeBar.getCircularTimeDrawable();
            circularTimeDrawable.b = jec.a.IDLE;
            circularTimeDrawable.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            circularTimeDrawable.n = 0L;
            circularTimeDrawable.o = 0L;
            circularTimeDrawable.a = null;
            this.f = null;
        }
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        vcf0 vcf0Var = this.g;
        if (vcf0Var != null) {
            vcf0Var.pause();
        }
        a();
    }

    @Override // xsna.rr6
    public final void release() {
        vcf0 vcf0Var = this.g;
        if (vcf0Var != null) {
            vcf0Var.release();
        }
        a();
    }

    @Override // xsna.rr6
    public final void resume() {
        vcf0 vcf0Var = this.g;
        if (vcf0Var != null) {
            vcf0Var.resume();
        }
    }

    @Override // xsna.wcf0
    public void setAdapter(RecyclerView.Adapter<RecyclerView.e0> adapter) {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.setAdapter(adapter);
        }
    }

    @Override // xsna.wcf0
    public void setErrorVisibility(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.wcf0
    public void setProgressVisibility(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.wcf0
    public void setSelectedPosition(int i) {
        this.b.K(i, 0);
    }

    @Override // xsna.rr6
    public vcf0 getPresenter() {
        return this.g;
    }

    @Override // xsna.rr6
    public void setPresenter(vcf0 vcf0Var) {
        this.g = vcf0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.wcf0
    public void setHidden(boolean z) {
    }
}
