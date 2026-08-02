package com.vk.core.view.components.bottombar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.GradientDirection;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.button.VkButton;
import java.util.ArrayList;
import xsna.an10;
import xsna.b3m0;
import xsna.epx;
import xsna.f4m;
import xsna.fpv0;
import xsna.gfu0;
import xsna.hbh0;
import xsna.j5g;
import xsna.krv0;
import xsna.n8g;
import xsna.too0;
import xsna.zwt0;

/* compiled from: VkBottomBar.kt */
/* loaded from: classes17.dex */
public final class VkBottomBar extends FrameLayout implements too0 {
    public static final /* synthetic */ int o = 0;
    public final FrameLayout b;
    public final fpv0 c;
    public final VkButton d;
    public final VkButton e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final LinearLayout h;
    public final VkBlurView i;
    public final a j;
    public final LinearLayout k;
    public boolean l;
    public boolean m;
    public VkBlurContentView n;

    /* compiled from: VkBottomBar.kt */
    public final class a extends View {
        public final Paint b;

        public a(Context context) {
            super(context);
            this.b = new Paint(1);
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.b);
        }
    }

    public VkBottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        LinearGradient linearGradient;
        boolean z = this.l;
        a aVar = this.j;
        if (!z) {
            aVar.setVisibility(8);
            return;
        }
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            b3m0 b3m0Var = new b3m0(this, 18);
            if (getMeasuredHeight() > 0 || getMeasuredWidth() > 0) {
                b3m0Var.invoke(this);
                return;
            } else {
                addOnLayoutChangeListener(new gfu0(this, b3m0Var));
                return;
            }
        }
        Context context = getContext();
        float measuredHeight = getMeasuredHeight();
        TypedValue typedValue = krv0.a;
        if (epx.f(krv0.i(context), Boolean.TRUE)) {
            float[] fArr = {0.4f, 0.4f, 0.39f, 0.37f, 0.35f, 0.33f, 0.3f, 0.27f, 0.24f, 0.2f, 0.17f, 0.13f, 0.1f, 0.06f, 0.03f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < 16; i++) {
                arrayList.add(Integer.valueOf(n8g.l(-16777216, an10.b(fArr[i] * 255))));
            }
            linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j5g.N0(arrayList), new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1179f, 0.2138f, 0.2912f, 0.3534f, 0.4037f, 0.4456f, 0.4824f, 0.5176f, 0.5544f, 0.5963f, 0.6466f, 0.7088f, 0.7862f, 0.8821f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            float[] fArr2 = {0.95f, 0.93f, 0.92f, 0.88f, 0.83f, 0.78f, 0.71f, 0.63f, 0.56f, 0.48f, 0.39f, 0.3f, 0.22f, 0.15f, 0.07f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            ArrayList arrayList2 = new ArrayList(16);
            for (int i2 = 0; i2 < 16; i2++) {
                arrayList2.add(Integer.valueOf(n8g.l(-1, an10.b(fArr2[i2] * 255))));
            }
            linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j5g.N0(arrayList2), new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1179f, 0.2138f, 0.2912f, 0.3534f, 0.4037f, 0.4456f, 0.4824f, 0.5176f, 0.5544f, 0.5963f, 0.6466f, 0.7088f, 0.7862f, 0.8821f, 1.0f}, Shader.TileMode.CLAMP);
        }
        aVar.b.setShader(linearGradient);
        aVar.invalidate();
        aVar.setVisibility(0);
    }

    public final VkButton getButton() {
        return this.d;
    }

    public final VkButton getSecondButton() {
        return this.e;
    }

    public final FrameLayout getSnackbarSlot() {
        return this.b;
    }

    public final fpv0 getTabBar() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.h.setVisibility(this.d.getVisibility() == 0 || this.e.getVisibility() == 0 ? 0 : 8);
        LinearLayout linearLayout = this.k;
        measureChildWithMargins(linearLayout, i, 0, i2, 0);
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + linearLayout.getMeasuredWidth(), i), View.resolveSize(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824);
        this.i.measure(makeMeasureSpec, makeMeasureSpec2);
        this.j.measure(makeMeasureSpec, makeMeasureSpec2);
        a();
    }

    public final void setBlurEnabled(boolean z) {
        this.m = z;
        this.i.setVisibility((!z || this.n == null) ? 8 : 0);
    }

    public final void setBottomSlot(View view) {
        FrameLayout frameLayout = this.g;
        frameLayout.removeAllViews();
        if (view == null) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.addView(view);
            frameLayout.setVisibility(0);
        }
    }

    public final void setOverlayEnabled(boolean z) {
        this.l = z;
        a();
    }

    public final void setTopSlot(View view) {
        FrameLayout frameLayout = this.f;
        frameLayout.removeAllViews();
        if (view == null) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.addView(view);
            frameLayout.setVisibility(0);
        }
    }

    public final void setupWithBlurContentView(VkBlurContentView vkBlurContentView) {
        this.n = vkBlurContentView;
        VkBlurView vkBlurView = this.i;
        vkBlurView.setupWithContent(vkBlurContentView);
        vkBlurView.setVisibility((!this.m || this.n == null) ? 8 : 0);
    }

    public VkBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setVisibility(0);
        this.b = frameLayout;
        fpv0 fpv0Var = new fpv0(context);
        fpv0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.c = fpv0Var;
        VkButton vkButton = new VkButton(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginEnd(hbh0.b(8, context));
        vkButton.setLayoutParams(layoutParams);
        VkButton.Mode mode = VkButton.Mode.Primary;
        vkButton.setMode(mode);
        VkButton.Appearance appearance = VkButton.Appearance.Neutral;
        vkButton.setAppearance(appearance);
        VkButton.Size size = VkButton.Size.Large;
        vkButton.setSize(size);
        vkButton.setVisibility(8);
        this.d = vkButton;
        VkButton vkButton2 = new VkButton(context, null, 6, 0);
        vkButton2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        vkButton2.setMode(mode);
        vkButton2.setAppearance(appearance);
        vkButton2.setSize(size);
        vkButton2.setVisibility(8);
        this.e = vkButton2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout2.setVisibility(8);
        this.f = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout3.setVisibility(8);
        this.g = frameLayout3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        int b = hbh0.b(16, context);
        int b2 = hbh0.b(12, context);
        linearLayout.setPadding(b, b2, b, b2);
        linearLayout.addView(vkButton);
        linearLayout.addView(vkButton2);
        this.h = linearLayout;
        VkBlurView vkBlurView = new VkBlurView(context, null, 6);
        vkBlurView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        vkBlurView.setVisibility(8);
        vkBlurView.setGradientDirection(GradientDirection.TopBottom);
        this.i = vkBlurView;
        a aVar = new a(context);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        aVar.setVisibility(8);
        this.j = aVar;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        f4m.y(hbh0.b(42, context), linearLayout2);
        f4m.v(zwt0.b(context), linearLayout2);
        a();
        linearLayout2.addView(frameLayout);
        linearLayout2.addView(frameLayout2);
        linearLayout2.addView(linearLayout);
        linearLayout2.addView(frameLayout3);
        linearLayout2.addView(fpv0Var);
        this.k = linearLayout2;
        this.l = true;
        this.m = true;
        addView(vkBlurView);
        addView(aVar);
        addView(linearLayout2);
    }
}
