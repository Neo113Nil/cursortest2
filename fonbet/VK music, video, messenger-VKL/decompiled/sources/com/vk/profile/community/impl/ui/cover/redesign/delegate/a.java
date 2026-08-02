package com.vk.profile.community.impl.ui.cover.redesign.delegate;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.util.Size;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.profile.community.impl.livecover.LiveCoverType;
import com.vk.profile.community.impl.ui.cover.redesign.delegate.BaseCommunityLiveCoverItemDelegate;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$LiveCoverEvent;
import xsna.b780;
import xsna.b8h;
import xsna.c8h;
import xsna.iah0;
import xsna.k15;
import xsna.kci;
import xsna.o8h;
import xsna.p8h;
import xsna.r8h;
import xsna.s3q0;
import xsna.s8h;
import xsna.sa30;
import xsna.siz;
import xsna.sjw;
import xsna.wzs;
import xsna.z8m0;

/* compiled from: CommunityLiveCoverImageDelegate.kt */
/* loaded from: classes5.dex */
public final class a extends BaseCommunityLiveCoverItemDelegate<sjw> {
    public sjw e;
    public r8h f;
    public c8h g;
    public final z8m0 h;
    public ValueAnimator i;
    public final k15 j;
    public boolean k;
    public boolean l;
    public final C1562a m;
    public final sjw.a n;

    public a(b8h b8hVar, sjw sjwVar, r8h r8hVar, c8h c8hVar, wzs<? super Integer, ? super Float, s3q0> wzsVar) {
        super(b8hVar, wzsVar);
        this.e = sjwVar;
        this.f = r8hVar;
        this.g = c8hVar;
        this.h = z8m0.e;
        this.j = new k15();
        this.m = new C1562a();
        this.n = sjwVar.a;
    }

    @Override // xsna.q8h
    public final void C(boolean z) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.pause();
            if (z) {
                valueAnimator.setCurrentFraction(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    @Override // xsna.q8h
    public final void a(Float f) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator == null || f == null) {
            return;
        }
        valueAnimator.setCurrentFraction(f.floatValue());
    }

    public final void d(b8h b8hVar) {
        Size size = new Size(iah0.f().widthPixels, iah0.f().widthPixels);
        String b = s8h.b(this.e);
        if (b == null || b.length() == 0) {
            b8hVar.getImageView().setVkPostprocessor(null);
            b8hVar.getImageView().o0(s8h.a(this.e), size);
            return;
        }
        b8hVar.getImageView().setVkPostprocessor(null);
        VkImage imageView = b8hVar.getImageView();
        Uri parse = Uri.parse(s8h.b(this.e));
        Uri parse2 = Uri.parse(s8h.a(this.e));
        imageView.getClass();
        sa30.K(imageView, parse);
        sa30.K(imageView, parse2);
        imageView.getBackend().G(parse, size, parse2, size);
    }

    public final void e() {
        b8h b8hVar = this.a;
        b8hVar.getVideoTextureView().setVisibility(8);
        int i = 0;
        b8hVar.getImageView().setVisibility(0);
        if (this.c != BaseCommunityLiveCoverItemDelegate.ViewState.COMMON) {
            f();
            return;
        }
        if (!this.l) {
            LiveCoverType liveCoverType = LiveCoverType.PHOTO;
            Long valueOf = Long.valueOf(this.f.b.b);
            this.j.getClass();
            siz.b(valueOf, MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.START_PLAY, siz.a(liveCoverType), null, null);
        }
        this.l = true;
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            if (valueAnimator.isPaused()) {
                valueAnimator.resume();
                return;
            } else if (valueAnimator.isRunning()) {
                return;
            }
        }
        if (this.d) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(6000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new o8h(this, i));
            ofFloat.addListener(new p8h(this));
            ofFloat.start();
            this.i = ofFloat;
        }
    }

    public final void f() {
        String a;
        b(BaseCommunityLiveCoverItemDelegate.ViewState.COMMON);
        String b = s8h.b(this.e);
        b8h b8hVar = this.a;
        if (b != null && b.length() != 0 && ((a = s8h.a(this.e)) == null || a.length() == 0)) {
            b8hVar.getImageView().setOnLoadCallback(null);
            kci.o(b8hVar.getImageView(), this.h);
            b8hVar.getImageView().o0(s8h.b(this.e), new Size(iah0.f().widthPixels, iah0.f().widthPixels));
            return;
        }
        String a2 = s8h.a(this.e);
        if (a2 == null || a2.length() == 0) {
            b8hVar.getImageView().clear();
            return;
        }
        if (this.n.a.Sb()) {
            b(BaseCommunityLiveCoverItemDelegate.ViewState.PROGRESS);
            b8hVar.getImageView().setOnLoadCallback(this.m);
        } else {
            b8hVar.getImageView().setOnLoadCallback(null);
        }
        d(b8hVar);
    }

    public final void g(boolean z) {
        b8h b8hVar = this.a;
        b8hVar.getImageView().setOnLoadCallback(null);
        LiveCoverType liveCoverType = LiveCoverType.PHOTO;
        Long valueOf = Long.valueOf(this.f.b.b);
        ValueAnimator valueAnimator = this.i;
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        float floatValue = f != null ? f.floatValue() : 0.0f;
        this.j.getClass();
        k15.y(liveCoverType, valueOf, true, 6000L, floatValue);
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 != null) {
            valueAnimator2.pause();
            valueAnimator2.removeAllUpdateListeners();
            this.i = null;
        }
        if (z) {
            boolean z2 = this.n.b;
            b8hVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.l = false;
    }

    @Override // xsna.q8h
    public final Float getCurrentProgress() {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            return Float.valueOf(valueAnimator.getAnimatedFraction());
        }
        return null;
    }

    @Override // xsna.q8h
    public final r8h getModel() {
        return this.f;
    }

    /* compiled from: CommunityLiveCoverImageDelegate.kt */
    /* renamed from: com.vk.profile.community.impl.ui.cover.redesign.delegate.a$a, reason: collision with other inner class name */
    public static final class C1562a implements b780 {
        public C1562a() {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            BaseCommunityLiveCoverItemDelegate.ViewState viewState = BaseCommunityLiveCoverItemDelegate.ViewState.ERROR;
            a aVar = a.this;
            aVar.b(viewState);
            k15 k15Var = aVar.j;
            LiveCoverType liveCoverType = LiveCoverType.PHOTO;
            Long valueOf = Long.valueOf(aVar.f.b.b);
            k15Var.getClass();
            siz.b(valueOf, MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.DOWNLOADING_ERROR, siz.a(liveCoverType), null, null);
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            BaseCommunityLiveCoverItemDelegate.ViewState viewState = BaseCommunityLiveCoverItemDelegate.ViewState.COMMON;
            a aVar = a.this;
            aVar.b(viewState);
            aVar.k = true;
            if (aVar.e.b.a) {
                aVar.e();
            }
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }
    }
}
