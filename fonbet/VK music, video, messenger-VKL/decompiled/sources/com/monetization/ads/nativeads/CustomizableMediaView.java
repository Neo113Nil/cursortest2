package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import yads.c13;
import yads.hk;
import yads.mw2;
import yads.ok3;
import yads.pk3;
import yads.pw2;
import yads.x20;

/* loaded from: classes14.dex */
public class CustomizableMediaView extends FrameLayout {
    private static final int f = R$layout.monetization_ads_internal_outstream_controls_default;
    private int a;
    private int b;
    private int c;
    private final ok3 d;
    private x20 e;

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            this.a = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f);
            this.d = pk3.a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        } else {
            this.a = f;
            this.d = null;
        }
        addOnAttachStateChangeListener(new hk(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.rpk
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(CustomizableMediaView.this);
            }
        }));
    }

    public final void a(int i) {
        this.a = i;
    }

    public final int getHeightMeasureSpec() {
        return this.c;
    }

    public final x20 getOnSizeChangedListener$mobileads_externalRelease() {
        return this.e;
    }

    public final int getVideoControlsLayoutId() {
        return this.a;
    }

    public final ok3 getVideoScaleType() {
        return this.d;
    }

    public final int getWidthMeasureSpec() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        pw2 pw2Var;
        super.onSizeChanged(i, i2, i3, i4);
        x20 x20Var = this.e;
        if (x20Var == null || (pw2Var = (pw2) ((mw2) x20Var).a.get()) == null) {
            return;
        }
        c13 c13Var = pw2Var.f;
        if (i < c13Var.b || i2 < c13Var.c) {
            pw2Var.i.setValue(pw2Var, pw2.j[2], pw2Var.e);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(x20 x20Var) {
        this.e = x20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        x20 x20Var = customizableMediaView.e;
        if (x20Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            pw2 pw2Var = (pw2) ((mw2) x20Var).a.get();
            if (pw2Var != null) {
                c13 c13Var = pw2Var.f;
                if (width < c13Var.b || height < c13Var.c) {
                    pw2Var.i.setValue(pw2Var, pw2.j[2], pw2Var.e);
                }
            }
        }
    }

    public CustomizableMediaView(Context context) {
        this(context, null);
    }

    public CustomizableMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
