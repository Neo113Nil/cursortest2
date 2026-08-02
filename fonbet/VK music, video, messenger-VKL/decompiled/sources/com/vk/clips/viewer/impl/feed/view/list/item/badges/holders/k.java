package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.animation.ValueAnimator;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import xsna.cn70;
import xsna.epx;
import xsna.hfj0;
import xsna.hfz;
import xsna.ifj0;
import xsna.jfj0;
import xsna.mih0;
import xsna.ofc0;

/* compiled from: ShopsMoreBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class k extends BaseBadgeHolder<mih0.p> {
    public static final /* synthetic */ int r = 0;
    public ValueAnimator p;
    public mih0.p q;

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        mih0.p pVar = (mih0.p) hfzVar;
        if (epx.f(this.q, pVar)) {
            return;
        }
        this.q = pVar;
        ClipBadge clipBadge = this.l;
        BaseBadgeHolder.j6(clipBadge, pVar);
        i6(clipBadge, pVar);
        BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.LEFT, new Size(cn70.b(20), cn70.b(20)), new ofc0(pVar, 9));
        BaseBadgeHolder.m6(clipBadge, pVar.i.a(this.itemView.getContext()), pVar.f);
        BaseBadgeHolder.s6(clipBadge, pVar);
        if (pVar.l) {
            return;
        }
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            if (!clipBadge.isLaidOut() || clipBadge.isLayoutRequested()) {
                clipBadge.addOnLayoutChangeListener(new hfj0(clipBadge, this, pVar));
                return;
            }
            clipBadge.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            clipBadge.setPivotY(clipBadge.getHeight() / 2.0f);
            clipBadge.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            clipBadge.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            clipBadge.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ValueAnimator valueAnimator2 = this.p;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, clipBadge.getWidth());
            ofInt.addUpdateListener(new ifj0(clipBadge));
            ofInt.setDuration(250L);
            this.p = ofInt;
            ofInt.addListener(new jfj0(clipBadge, this, pVar));
            ValueAnimator valueAnimator3 = this.p;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    @Override // com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder, xsna.vfz
    public final void a6() {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.p = null;
        super.a6();
    }

    @Override // xsna.vfz
    public final void g6() {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.p = null;
    }
}
