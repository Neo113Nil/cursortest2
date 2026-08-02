package com.vk.newsfeed.impl.feed.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.movika.sdk.base.hooks.f;
import com.vk.newsfeed.impl.R$styleable;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.cn70;
import xsna.d22;
import xsna.dhr0;
import xsna.ee;
import xsna.gxp;
import xsna.gzs;
import xsna.id;
import xsna.iv1;
import xsna.izs;
import xsna.jo3;
import xsna.kl2;
import xsna.msy;
import xsna.p5h;
import xsna.q5f;
import xsna.r3r;
import xsna.s3q0;
import xsna.t3r;
import xsna.v3r;
import xsna.vhp;
import xsna.whp;

/* compiled from: FeedRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public class FeedRecyclerPaginatedView extends RecyclerPaginatedView implements vhp {
    public static final /* synthetic */ int U = 0;
    public final Object N;
    public final Object O;
    public FeedRecyclerView P;
    public izs<? super Boolean, s3q0> Q;
    public UsableRecyclerPaginatedView.a R;
    public SwipeDrawableRefreshLayout S;
    public final int T;

    public FeedRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsViewerComponent getClipsViewerComponent() {
        return (ClipsViewerComponent) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final NewsfeedOptionalAdsComponent getOptionalAdsComponent() {
        return (NewsfeedOptionalAdsComponent) this.O.getValue();
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void Mk() {
        super.Mk();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.S;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setRefreshing(false);
        }
        izs<? super Boolean, s3q0> izsVar = this.Q;
        if (izsVar != null) {
            izsVar.invoke(Boolean.FALSE);
        }
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public View c(Context context, AttributeSet attributeSet) {
        return attributeSet != null ? x(context, (FrameLayout) super.c(context, attributeSet), attributeSet) : new Space(context);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public ee d(Context context, AttributeSet attributeSet) {
        return attributeSet != null ? super.d(context, attributeSet) : new a(context);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public void fj(Throwable th, gxp gxpVar) {
        View view = this.c;
        if (view instanceof a) {
            removeView(view);
            getContext();
            t3r t3rVar = new t3r(getContext());
            int b = cn70.b(16);
            t3rVar.setPadding(b, b, b, b);
            t3rVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            t3rVar.setVisibility(8);
            t3rVar.setRetryClickListener(this.t);
            addView(t3rVar);
            this.c = t3rVar;
        }
        super.fj(th, gxpVar);
    }

    public int getEmptyViewGravity() {
        return this.T;
    }

    public final FeedRecyclerView getFeedRecyclerView() {
        return this.P;
    }

    public final izs<Boolean, s3q0> getRefreshCallback() {
        return this.Q;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public View h(Context context) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setId(R.id.pb_loading);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateTintMode(PorterDuff.Mode.SRC_IN);
        progressBar.setIndeterminateTintList(dhr0.r(R.attr.vk_ui_icon_tertiary));
        progressBar.setLayoutParams(new ViewGroup.LayoutParams(cn70.b(50), cn70.b(50)));
        AbstractPaginatedView.l lVar = new AbstractPaginatedView.l(context);
        lVar.addView(progressBar);
        lVar.setLayoutParams(e());
        return lVar;
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public View q(Context context, AttributeSet attributeSet) {
        View view;
        if (attributeSet == null) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = new SwipeDrawableRefreshLayout(context, null);
            swipeDrawableRefreshLayout.setId(R.id.swipe_refresh_layout);
            swipeDrawableRefreshLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            swipeDrawableRefreshLayout.setFocusableInTouchMode(true);
            post(new kl2(swipeDrawableRefreshLayout, 2));
            FeedRecyclerView feedRecyclerView = new FeedRecyclerView(context, null, 6, 0);
            feedRecyclerView.setId(R.id.list);
            feedRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            swipeDrawableRefreshLayout.addView(feedRecyclerView);
            view = swipeDrawableRefreshLayout;
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.view_feed_recycler_paginated, (ViewGroup) this, false);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        this.x = recyclerView;
        this.P = recyclerView instanceof FeedRecyclerView ? (FeedRecyclerView) recyclerView : null;
        RecyclerPaginatedView.n nVar = new RecyclerPaginatedView.n((SwipeDrawableRefreshLayout) view.findViewById(R.id.swipe_refresh_layout));
        this.w = nVar;
        nVar.c(new d22(this, 15));
        return view;
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void qg(whp whpVar) {
        View view = this.d;
        if (view instanceof Space) {
            int indexOfChild = indexOfChild(view);
            removeView(view);
            r3r r3rVar = new r3r(getContext());
            post(new id(r3rVar, 5));
            r3rVar.setOnRefreshListener(new f(this, 18));
            this.S = r3rVar;
            r3rVar.setVisibility(8);
            addView(r3rVar, indexOfChild);
            this.d = r3rVar;
        }
        super.qg(whpVar);
    }

    public final void setFeedRecyclerView(FeedRecyclerView feedRecyclerView) {
        this.P = feedRecyclerView;
    }

    public final void setOnEmptyViewRefreshListener(UsableRecyclerPaginatedView.a aVar) {
        this.R = aVar;
    }

    public final void setOnPullToRefreshLoaderCallBack(izs<? super Boolean, s3q0> izsVar) {
        this.Q = izsVar;
    }

    public final void setRefreshCallback(izs<? super Boolean, s3q0> izsVar) {
        this.Q = izsVar;
    }

    public final View x(Context context, FrameLayout frameLayout, AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (!z) {
            return frameLayout;
        }
        v3r v3rVar = new v3r(context, null);
        post(new iv1(v3rVar, 4));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, getEmptyViewGravity()));
        v3rVar.addView(frameLayout2, -1, -1);
        v3rVar.setOnRefreshListener(new jo3(this, 13));
        this.S = v3rVar;
        return v3rVar;
    }

    public /* synthetic */ FeedRecyclerPaginatedView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public FeedRecyclerPaginatedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        p5h p5hVar = new p5h(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, p5hVar);
        this.O = msy.a(lazyThreadSafetyMode, new q5f(this, 19));
        this.T = 17;
    }

    /* compiled from: FeedRecyclerPaginatedView.kt */
    public static final class a extends ee {
        @Override // xsna.ee
        public final void b() {
        }

        @Override // xsna.ee
        public void setActionTitle(int i) {
        }

        @Override // xsna.ee
        public void setMessage(CharSequence charSequence) {
        }

        @Override // xsna.ee
        public void setRetryBtnVisible(boolean z) {
        }
    }

    public void setEmptyViewButtonListener(gzs<s3q0> gzsVar) {
    }
}
