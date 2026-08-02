package com.vk.newsfeed.common.recycler.holders.story.discover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.aex;
import xsna.afx;
import xsna.ai5;
import xsna.bpn0;
import xsna.cn70;
import xsna.dhh;
import xsna.fh5;
import xsna.gex;
import xsna.ni5;
import xsna.s0t0;
import xsna.sex;
import xsna.v98;
import xsna.y9t0;
import xsna.yg5;
import xsna.yor0;
import xsna.zex;

/* compiled from: InterestingStoriesHolderViewImpl.kt */
/* loaded from: classes4.dex */
public final class InterestingStoriesHolderViewImpl extends RecyclerPaginatedView implements afx, ai5, s0t0 {
    public static final int S = cn70.b(12);
    public static final int T = cn70.b(16);
    public final GestureDetector N;
    public final b O;
    public gex P;
    public zex Q;
    public final RecyclerView.k R;

    public InterestingStoriesHolderViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.N = new GestureDetector(context, new yor0(context));
        bpn0 bpn0Var = b.B;
        this.O = b.C1208b.a();
        this.R = this.x.getEdgeEffectFactory();
        sex sexVar = new sex(new dhh(this, 28));
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, this);
        dVar.f = 0;
        dVar.a();
        RecyclerView recyclerView = this.x;
        int i = S;
        int i2 = T;
        recyclerView.addItemDecoration(new v98(i, i2, i2, true));
        this.x.setNestedScrollingEnabled(true);
        this.x.setClipToPadding(false);
        this.x.setMotionEventSplittingEnabled(false);
        this.x.setHasFixedSize(true);
        this.x.addOnScrollListener(sexVar);
        setSwipeRefreshEnabled(false);
        setFooterLoadingViewProvider(null);
        setFooterErrorViewProvider(null);
    }

    @Override // xsna.ai5
    public final y9t0 Eh(int i) {
        gex gexVar = this.P;
        aex aexVar = gexVar != null ? (aex) gexVar.c.c(i) : null;
        aex.a.b bVar = aexVar instanceof aex.a.b ? (aex.a.b) aexVar : null;
        if (bVar == null) {
            return null;
        }
        VideoAttachment videoAttachment = bVar.e;
        VideoFile videoFile = videoAttachment.k;
        bpn0 bpn0Var = b.B;
        yg5 e = this.O.e(videoFile, null);
        gex gexVar2 = this.P;
        return new y9t0(e, new ni5(gexVar2 != null ? gexVar2.g : null, null, videoAttachment.k.r(), 10));
    }

    @Override // xsna.dkf0
    public int getAdapterOffset() {
        return 0;
    }

    @Override // xsna.dkf0
    public int getItemCount() {
        gex gexVar = this.P;
        if (gexVar != null) {
            return gexVar.getItemCount();
        }
        return 0;
    }

    @Override // xsna.ai5
    public VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zex zexVar = this.Q;
        if (zexVar != null) {
            zexVar.n = new io.reactivex.rxjava3.disposables.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zex zexVar = this.Q;
        if (zexVar != null) {
            io.reactivex.rxjava3.disposables.b bVar = zexVar.n;
            if (bVar != null) {
                bVar.dispose();
            }
            zexVar.n = null;
            zexVar.b.removeCallbacks(null);
        }
    }

    @Override // com.vk.lists.AbstractPaginatedView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        boolean onTouchEvent = this.N.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!onTouchEvent);
        }
        return onInterceptTouchEvent;
    }

    public void setRef(String str) {
        gex gexVar = this.P;
        if (gexVar != null) {
            gexVar.g = str;
        }
    }

    @Override // xsna.s0t0
    public final void a(fh5 fh5Var) {
    }

    @Override // xsna.afx
    public void setTrackCode(String str) {
    }
}
