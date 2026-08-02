package com.vk.newsfeed.common.views.clips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.Cnew;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d3m;
import xsna.f4m;
import xsna.fy20;
import xsna.gzs;
import xsna.i440;
import xsna.iah0;
import xsna.izs;
import xsna.j1;
import xsna.m130;
import xsna.msy;
import xsna.ou5;
import xsna.p5y;
import xsna.pu5;
import xsna.s3q0;
import xsna.x4u;
import xsna.xb60;
import xsna.xuu0;

/* compiled from: NewsFeedControlsLayout.kt */
/* loaded from: classes4.dex */
public final class NewsFeedControlsLayout extends ConstraintLayout implements xuu0, View.OnClickListener, xb60 {
    public static final /* synthetic */ int D = 0;
    public final bpn0 A;
    public final PathInterpolator B;
    public izs<? super Integer, s3q0> C;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final ArrayList y;
    public xuu0.a z;

    /* compiled from: ViewExt.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ NewsFeedControlsLayout e;

        public a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, NewsFeedControlsLayout newsFeedControlsLayout) {
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = newsFeedControlsLayout;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            NewsFeedControlsLayout newsFeedControlsLayout = NewsFeedControlsLayout.this;
            int measuredWidth = newsFeedControlsLayout.getMeasuredWidth();
            int measuredHeight = newsFeedControlsLayout.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                NewsFeedControlsLayout newsFeedControlsLayout2 = this.e;
                if (bwt0.K(newsFeedControlsLayout2.getClipProducts())) {
                    izs<? super Integer, s3q0> izsVar = newsFeedControlsLayout2.C;
                    if (izsVar != null) {
                        izsVar.invoke(Integer.valueOf(measuredHeight));
                    }
                } else {
                    izs<? super Integer, s3q0> izsVar2 = newsFeedControlsLayout2.C;
                    if (izsVar2 != null) {
                        izsVar2.invoke(0);
                    }
                }
            }
            return s3q0.a;
        }
    }

    public NewsFeedControlsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        x4u x4uVar = new x4u(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, x4uVar);
        this.u = msy.a(lazyThreadSafetyMode, new Cnew(this, 17));
        this.v = msy.a(lazyThreadSafetyMode, new m130(this, 9));
        this.w = msy.a(lazyThreadSafetyMode, new p5y(this, 14));
        this.x = msy.a(lazyThreadSafetyMode, new i440(this, 5));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.y = new ArrayList();
        this.A = new bpn0(new fy20(context, 1));
        this.B = new PathInterpolator(0.2f, 0.8f, 0.2f, 1.0f);
        if (atomicBoolean.compareAndSet(false, true)) {
            LayoutInflater.from(getContext()).inflate(R.layout.newsfeed_clips_control_layout, (ViewGroup) this, true);
            bwt0.h0(this, getProductControl());
            V4();
        }
        float f = 24;
        getProductControl().setMinimumWidth(iah0.a(f));
        getProductControl().setMinimumHeight(iah0.a(f));
        getSoundControl().setMinimumWidth(iah0.a(f));
        getSoundControl().setMinimumHeight(iah0.a(f));
    }

    public static void P4(NewsFeedControlsLayout newsFeedControlsLayout) {
        bwt0.p0(newsFeedControlsLayout.getClipProducts(), false);
        newsFeedControlsLayout.T4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final FrameLayout getClipProducts() {
        return (FrameLayout) this.t.getValue();
    }

    private final int getItemsControlContentDescription() {
        return getProductControl().isSelected() ? R.string.accessibility_clips_show_items_control : R.string.accessibility_clips_hide_items_control;
    }

    private final int getOverlaySecondaryColor() {
        return ((Number) this.A.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getProductControl() {
        return (ImageView) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkBlurView getProductControlBlur() {
        return (VkBlurView) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getSoundControl() {
        return (ImageView) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkBlurView getSoundControlBlur() {
        return (VkBlurView) this.x.getValue();
    }

    private final void setItemsSelected(boolean z) {
        ImageView productControl = getProductControl();
        productControl.setSelected(z);
        productControl.setContentDescription(productControl.getContext().getString(getItemsControlContentDescription()));
    }

    @Override // xsna.xb60
    public final void G(boolean z) {
        if (z) {
            d3m.c(this, (r15 & 1) != 0 ? 300L : 250L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(this, (r15 & 1) != 0 ? 300L : 250L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    @Override // xsna.xuu0
    public final void N(j1 j1Var) {
        this.y.add(j1Var);
    }

    public final void T4() {
        FrameLayout clipProducts = getClipProducts();
        d3m.b(clipProducts, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        clipProducts.setScaleX(1.0f);
        clipProducts.setScaleY(1.0f);
        clipProducts.setPivotX(clipProducts.getWidth() / 2.0f);
        clipProducts.setPivotY(clipProducts.getHeight() / 2.0f);
    }

    public final void U4(boolean z) {
        boolean isSelected = getProductControl().isSelected();
        setItemsSelected(!isSelected);
        PathInterpolator pathInterpolator = this.B;
        if (isSelected) {
            FrameLayout clipProducts = getClipProducts();
            bwt0.p0(getClipProducts(), true);
            clipProducts.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            clipProducts.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            clipProducts.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            clipProducts.setPivotY(clipProducts.getMeasuredHeight());
            getClipProducts().animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(pathInterpolator).setDuration(250L).withEndAction(new ou5(this, 8));
            izs<? super Integer, s3q0> izsVar = this.C;
            if (izsVar != null) {
                izsVar.invoke(Integer.valueOf(getMeasuredHeight()));
            }
        } else {
            FrameLayout clipProducts2 = getClipProducts();
            bwt0.p0(getClipProducts(), true);
            clipProducts2.setScaleX(1.0f);
            clipProducts2.setScaleY(1.0f);
            clipProducts2.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            clipProducts2.setPivotY(clipProducts2.getMeasuredHeight());
            getClipProducts().animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(250L).setInterpolator(pathInterpolator).withEndAction(new pu5(this, 11));
            izs<? super Integer, s3q0> izsVar2 = this.C;
            if (izsVar2 != null) {
                izsVar2.invoke(0);
            }
        }
        if (isSelected) {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                ((gzs) it.next()).invoke();
            }
        }
        xuu0.a aVar = this.z;
        if (aVar != null) {
            aVar.a(isSelected, z);
        }
    }

    public final void V4() {
        setItemsSelected(true);
        getClipProducts().setVisibility(4);
        izs<? super Integer, s3q0> izsVar = this.C;
        if (izsVar != null) {
            izsVar.invoke(0);
        }
    }

    @Override // xsna.xuu0
    public final void a1(boolean z, boolean z2) {
        if (z != bwt0.K(getClipProducts())) {
            U4(z2);
        }
    }

    @Override // xsna.xuu0
    public final boolean b4() {
        return bwt0.K(getClipProducts());
    }

    @Override // xsna.xb60
    public final void l4() {
        V4();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null && view.getId() == getProductControl().getId()) {
            U4(false);
        }
    }

    @Override // xsna.xuu0
    public void setOnCarouselHeightListener(izs<? super Integer, s3q0> izsVar) {
        this.C = izsVar;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = getMeasuredHeight();
        f4m.a(this, new a(ref$IntRef, ref$IntRef2, this));
    }

    @Override // xsna.xuu0
    public void setOnClickListener(xuu0.a aVar) {
        this.z = aVar;
    }

    @Override // xsna.xuu0
    public final void x3(View view, boolean z, boolean z2) {
        if (view != null && getClipProducts().indexOfChild(view) == -1) {
            getClipProducts().addView(view);
        }
        getSoundControl().setImageAlpha(z2 ? 255 : 128);
        V4();
        if (z) {
            d3m.c(getProductControl(), (r15 & 1) != 0 ? 300L : 250L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        f4m.j(getProductControl());
        f4m.j(getClipProducts());
        izs<? super Integer, s3q0> izsVar = this.C;
        if (izsVar != null) {
            izsVar.invoke(0);
        }
    }

    @Override // xsna.xuu0
    public void setupBlurContent(VkBlurContentView vkBlurContentView) {
    }
}
