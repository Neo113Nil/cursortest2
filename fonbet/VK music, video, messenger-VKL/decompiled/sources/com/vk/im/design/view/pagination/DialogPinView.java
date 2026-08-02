package com.vk.im.design.view.pagination;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;
import xsna.a50;
import xsna.abg0;
import xsna.an10;
import xsna.avj;
import xsna.be6;
import xsna.bwt0;
import xsna.dhr0;
import xsna.en9;
import xsna.gi8;
import xsna.gzs;
import xsna.hbh0;
import xsna.s3q0;
import xsna.srg;

/* compiled from: DialogPinView.kt */
/* loaded from: classes2.dex */
public final class DialogPinView extends FrameLayout {
    public static final /* synthetic */ int l = 0;
    public VkBlurView b;
    public View c;
    public View d;
    public VkImageSimple e;
    public VkButton f;
    public VkButton g;
    public gzs<s3q0> h;
    public gzs<s3q0> i;
    public gzs<s3q0> j;
    public gzs<s3q0> k;

    public DialogPinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private final void setupBackground(View view) {
        abg0 abg0Var = dhr0.u;
        int c = abg0Var.c(R.attr.vk_ui_stroke_contrast_secondary_alpha);
        float a = hbh0.a(getContext(), 12.0f);
        int b = an10.b(hbh0.a(getContext(), 1.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadius(a);
        gradientDrawable.setStroke(b, c);
        int c2 = abg0Var.c(R.attr.vk_ui_icon_contrast);
        int argb = Color.argb(an10.b(30.599998f), Color.red(c2), Color.green(c2), Color.blue(c2));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadius(a);
        view.setBackground(new RippleDrawable(ColorStateList.valueOf(argb), gradientDrawable, gradientDrawable2));
    }

    public final gzs<s3q0> getOnCloseClickListener() {
        return this.i;
    }

    public final gzs<s3q0> getOnDetachClickListener() {
        return this.h;
    }

    public final gzs<s3q0> getOnPinClickListener() {
        return this.j;
    }

    public final gzs<s3q0> getOnRetryClickListener() {
        return this.k;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (VkBlurView) findViewById(R.id.blur_view);
        this.c = findViewById(R.id.pin_container);
        this.d = findViewById(R.id.content_container);
        VkFadeText vkFadeText = (VkFadeText) findViewById(R.id.title);
        vkFadeText.setFade(true);
        vkFadeText.setMaxTextLines(1);
        vkFadeText.setSingleLine();
        VkFadeText vkFadeText2 = (VkFadeText) findViewById(R.id.subtitle);
        vkFadeText2.setFade(true);
        vkFadeText2.setMaxTextLines(1);
        vkFadeText2.setSingleLine();
        VkFadeText vkFadeText3 = (VkFadeText) findViewById(R.id.hidden_text);
        vkFadeText3.setFade(true);
        vkFadeText3.setMaxTextLines(2);
        VkFadeText vkFadeText4 = (VkFadeText) findViewById(R.id.pin_loading_text);
        vkFadeText4.setFade(true);
        vkFadeText4.setMaxTextLines(1);
        vkFadeText4.setSingleLine();
        VkFadeText vkFadeText5 = (VkFadeText) findViewById(R.id.error_text);
        vkFadeText5.setFade(true);
        vkFadeText5.setMaxTextLines(2);
        this.e = (VkImageSimple) findViewById(R.id.close_button);
        VkButton vkButton = (VkButton) findViewById(R.id.hidden_detach_button);
        this.f = vkButton;
        vkButton.setCornerRadius(Float.valueOf(hbh0.b(8, getContext())));
        VkButton vkButton2 = (VkButton) findViewById(R.id.error_retry_button);
        this.g = vkButton2;
        vkButton2.setCornerRadius(Float.valueOf(hbh0.b(8, getContext())));
        VkImageSimple vkImageSimple = this.e;
        if (vkImageSimple == null) {
            vkImageSimple = null;
        }
        vkImageSimple.setOnClickListener(new en9(this, 4));
        View view = this.c;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(new gi8(this, 3));
        VkButton vkButton3 = this.f;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        vkButton3.setOnClickListener(new be6(this, 3));
        VkButton vkButton4 = this.g;
        if (vkButton4 == null) {
            vkButton4 = null;
        }
        vkButton4.setOnClickListener(new a50(this, 3));
        View view2 = this.c;
        setupBackground(view2 != null ? view2 : null);
    }

    public final void setOnCloseClickListener(gzs<s3q0> gzsVar) {
        this.i = gzsVar;
    }

    public final void setOnDetachClickListener(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }

    public final void setOnPinClickListener(gzs<s3q0> gzsVar) {
        this.j = gzsVar;
    }

    public final void setOnRetryClickListener(gzs<s3q0> gzsVar) {
        this.k = gzsVar;
    }

    public final void setupBlurContent(VkBlurContentView vkBlurContentView) {
        float a = hbh0.a(getContext(), 12.0f);
        VkBlurView vkBlurView = this.b;
        if (vkBlurView == null) {
            vkBlurView = null;
        }
        vkBlurView.setBlurRadius(48.0f);
        vkBlurView.setupWithContent(vkBlurContentView);
        vkBlurView.setOutlineProvider(new avj(a));
        bwt0.S(vkBlurView, new srg(vkBlurView, this));
        vkBlurView.setVisibility(0);
    }
}
