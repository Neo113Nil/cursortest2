package com.vk.stories.design.view.editor.verticalization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.fyi0;
import xsna.gj80;
import xsna.gpr0;
import xsna.n8g;
import xsna.q8i0;

/* compiled from: VerticalizationBannerView.kt */
/* loaded from: classes6.dex */
public final class VerticalizationBannerView extends FrameLayout {
    public static final float h = cn70.a() * 30.0f;
    public static final float i = cn70.a() * 124.0f;
    public final View b;
    public final ConstraintLayout c;
    public final TextView d;
    public final VkButton e;
    public a f;
    public boolean g;

    /* compiled from: VerticalizationBannerView.kt */
    public interface a {
        void a();

        void b();

        void dismiss();
    }

    public VerticalizationBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.layout_story_editor_verticalization_banner_view, this);
        View findViewById = findViewById(R.id.gradient_bg);
        this.b = findViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.banner);
        this.c = constraintLayout;
        this.d = (TextView) findViewById(R.id.banner_title);
        VkButton vkButton = (VkButton) findViewById(R.id.banner_button_accept);
        this.e = vkButton;
        VkButton vkButton2 = (VkButton) findViewById(R.id.banner_button_dismiss);
        bwt0.i0(constraintLayout, new fyi0(8));
        bwt0.i0(vkButton, new gj80(this, 29));
        bwt0.i0(vkButton2, new q8i0(this, 18));
        int Y = dhr0.Y(R.attr.vk_ui_background_content, context);
        gpr0 gpr0Var = new gpr0(new int[]{n8g.l(Y, 0), n8g.l(Y, 12), n8g.l(Y, 51), n8g.l(Y, 204), n8g.l(Y, 242), n8g.l(Y, 255)}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.13f, 0.3f, 0.7f, 0.84f, 1.0f});
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(gpr0Var);
        findViewById.setBackground(paintDrawable);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        a aVar = this.f;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return false;
    }

    public final void setCallback(a aVar) {
        this.f = aVar;
    }
}
