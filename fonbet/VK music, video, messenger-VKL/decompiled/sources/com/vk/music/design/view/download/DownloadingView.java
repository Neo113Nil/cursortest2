package com.vk.music.design.view.download;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.ProgressView;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.design.ui.themehelper.R$styleable;
import com.vk.movika.sdk.base.model.props.d;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bi40;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.iah0;
import xsna.m33;

/* compiled from: DownloadingView.kt */
/* loaded from: classes3.dex */
public final class DownloadingView extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public boolean b;
    public final Drawable c;
    public Drawable d;
    public final Drawable e;
    public int f;
    public final int g;
    public int h;
    public final AppCompatImageView i;
    public final AppCompatImageView j;
    public final ProgressView k;
    public final VkSpinner l;

    public DownloadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void b(int i, Drawable drawable, ImageView imageView) {
        drawable.clearColorFilter();
        drawable.setTint(i);
        imageView.setImageDrawable(drawable);
    }

    public final void a(bi40 bi40Var, boolean z) {
        boolean z2 = bi40Var instanceof bi40.c;
        bwt0.p0(this, !z2 || this.b);
        bwt0.p0(this.i, z2);
        boolean z3 = bi40Var instanceof bi40.b;
        ProgressView progressView = this.k;
        bwt0.p0(progressView, z3);
        bwt0.p0(this.j, bi40Var instanceof bi40.a);
        bwt0.p0(this.l, bi40Var instanceof bi40.d);
        bi40.b bVar = z3 ? (bi40.b) bi40Var : null;
        if (bVar == null) {
            progressView.setProgressValueWithoutAnim(0);
            return;
        }
        int i = (int) (bVar.a * 100);
        if (z) {
            progressView.setProgressValue(i);
        } else {
            progressView.setProgressValueWithoutAnim(i);
        }
    }

    public final boolean getShowNotLoaded() {
        return this.b;
    }

    public final void setDownloadedIcon(int i) {
        Drawable a = m33.a(i, getContext());
        if (a != null) {
            this.d = a;
            b(this.f, a, this.j);
        }
    }

    public final void setDownloadingTint(int i) {
        Drawable drawable = this.c;
        if (drawable != null) {
            b(i, drawable, this.j);
        }
        this.k.setLineColor(i);
        this.h = i;
    }

    public final void setNotLoadedIcon(int i) {
        Drawable a = m33.a(i, getContext());
        if (a != null) {
            this.d = a;
            b(this.f, a, this.i);
        }
    }

    public final void setTint(int i) {
        this.f = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DownloadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        bpn0 bpn0Var = new bpn0(new d(20));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        Drawable drawable = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDrawable(1) : null;
        this.c = drawable;
        Drawable drawable2 = obtainStyledAttributes.hasValue(7) ? obtainStyledAttributes.getDrawable(7) : null;
        this.e = drawable2;
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        this.b = z;
        this.d = z ? obtainStyledAttributes.getDrawable(5) : null;
        abg0 abg0Var = dhr0.t;
        this.f = obtainStyledAttributes.getColor(0, abg0Var.c(R.attr.vk_ui_icon_accent));
        this.h = obtainStyledAttributes.getColor(2, abg0Var.c(R.attr.vk_ui_stroke_accent));
        int color = obtainStyledAttributes.getColor(8, context.getColor(R.color.vk_steel_gray_300));
        int color2 = obtainStyledAttributes.getColor(6, abg0Var.c(R.attr.vk_ui_icon_accent));
        this.g = color2;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, iah0.a(2));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        bwt0.p0(this, this.b);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet, 0);
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            b(color2, drawable3, appCompatImageView);
        }
        appCompatImageView.setContentDescription(context.getString(R.string.music_talkback_download_track));
        this.i = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, attributeSet, 0);
        if (drawable != null) {
            b(this.h, drawable, appCompatImageView2);
        }
        appCompatImageView2.setContentDescription(context.getString(R.string.music_talkback_downloaded_track));
        this.j = appCompatImageView2;
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, attributeSet, 0);
        if (drawable2 != null) {
            b(color, drawable2, appCompatImageView3);
        }
        appCompatImageView3.setContentDescription(context.getString(R.string.music_talkback_pending_downloading_track));
        ProgressView progressView = new ProgressView(context, attributeSet, 0);
        progressView.setProgressMovement(false);
        progressView.setProgressMax(100);
        progressView.setLayerColor(0);
        progressView.setLineColor(this.h);
        progressView.setLineWidth(dimensionPixelSize);
        progressView.setContentDescription(context.getString(R.string.music_talkback_downloading_track));
        this.k = progressView;
        VkSpinner vkSpinner = new VkSpinner(context, attributeSet, 0);
        vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size16);
        vkSpinner.setIndeterminateTintList(ColorStateList.valueOf(this.h));
        vkSpinner.setContentDescription(context.getString(R.string.music_talkback_pending_downloading_track));
        this.l = vkSpinner;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(appCompatImageView2, layoutParams);
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            addView(vkSpinner, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.gravity = 17;
            addView(appCompatImageView3, layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        layoutParams4.gravity = 17;
        addView(progressView, layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams5.gravity = 17;
        addView(appCompatImageView, layoutParams5);
    }
}
