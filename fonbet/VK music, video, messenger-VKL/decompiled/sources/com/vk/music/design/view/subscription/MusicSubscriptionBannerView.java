package com.vk.music.design.view.subscription;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.drm0;
import xsna.gz80;
import xsna.h1j;
import xsna.j5g;
import xsna.l1i;
import xsna.msy;
import xsna.vt30;
import xsna.x850;
import xsna.y850;

/* compiled from: MusicSubscriptionBannerView.kt */
/* loaded from: classes3.dex */
public final class MusicSubscriptionBannerView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;

    /* compiled from: MusicSubscriptionBannerView.kt */
    public static final class b extends AnimatorListenerAdapter {
        public boolean b;
        public ViewGroup c;

        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.setClipChildren(this.b);
            }
            this.c = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.setClipChildren(this.b);
            }
            this.c = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewParent parent = MusicSubscriptionBannerView.this.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            this.b = viewGroup.getClipChildren();
            viewGroup.setClipChildren(false);
            this.c = viewGroup;
        }
    }

    public MusicSubscriptionBannerView(Context context) {
        this(context, null, 0, 14, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LottieAnimationView getAnimView() {
        return (LottieAnimationView) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final CardView getCardBackground() {
        return (CardView) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getSubtitle() {
        return (TextView) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTitle() {
        return (TextView) this.t.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAnimView().W();
        getAnimView().o0();
        getAnimView().setFailureListener(null);
    }

    public final void setAnimationUrl(String str) {
        if (str == null) {
            return;
        }
        getAnimView().W();
        getAnimView().o0();
        getAnimView().setFailureListener(new y850());
        getAnimView().s0(str, (String) j5g.k0(drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
        getAnimView().U(new b());
        if (isAttachedToWindow()) {
            getAnimView().m0();
        } else {
            addOnAttachStateChangeListener(new a(this));
        }
    }

    public final void setSubtitle(String str) {
        getSubtitle().setText(str);
    }

    public final void setTitle(String str) {
        getTitle().setText(str);
    }

    public MusicSubscriptionBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MusicSubscriptionBannerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MusicSubscriptionBannerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MusicSubscriptionBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        vt30 vt30Var = new vt30(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, vt30Var);
        this.u = msy.a(lazyThreadSafetyMode, new h1j(this, 29));
        this.v = msy.a(lazyThreadSafetyMode, new x850(this, 0));
        this.w = msy.a(lazyThreadSafetyMode, new l1i(this, 15));
        LayoutInflater.from(context).inflate(R.layout.catalog_music_small_banner_offer, (ViewGroup) this, true).setLayoutParams(new ConstraintLayout.b(-1, -2));
        if (gz80.a(28)) {
            getCardBackground().setOutlineSpotShadowColor(getCardBackground().getContext().getColor(R.color.vk_black_alpha20));
        }
    }

    /* compiled from: View.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ MusicSubscriptionBannerView c;

        public a(MusicSubscriptionBannerView musicSubscriptionBannerView) {
            this.c = musicSubscriptionBannerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            MusicSubscriptionBannerView.this.removeOnAttachStateChangeListener(this);
            this.c.getAnimView().m0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
