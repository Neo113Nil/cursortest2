package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.baf0;
import xsna.dhr0;
import xsna.e3m;
import xsna.m33;
import xsna.omw;
import xsna.rdi;
import xsna.vo2;

/* compiled from: VoipActionVerticalButtonView.kt */
/* loaded from: classes7.dex */
public final class VoipActionVerticalButtonView extends ConstraintLayout {
    public final VKImageView t;
    public final AppCompatTextView u;
    public final ProgressBar v;
    public final View w;
    public final View x;

    public VoipActionVerticalButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
        View.inflate(context, R.layout.voip_action_button_vertical_view, this);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.icon);
        this.t = vKImageView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.title);
        this.u = appCompatTextView;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
        this.v = progressBar;
        View findViewById = findViewById(R.id.marker_view_box);
        this.w = findViewById;
        findViewById.setClipToOutline(true);
        this.x = findViewById(R.id.badge);
        vKImageView.setImportantForAccessibility(2);
        appCompatTextView.setImportantForAccessibility(2);
        progressBar.setImportantForAccessibility(2);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static void P4(VoipActionVerticalButtonView voipActionVerticalButtonView, Drawable drawable, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        VKImageView vKImageView = voipActionVerticalButtonView.t;
        if (drawable == null) {
            vKImageView.setVisibility(8);
            vKImageView.setImageDrawable(null);
        } else {
            vKImageView.setVisibility(0);
            if (!voipActionVerticalButtonView.isInEditMode()) {
                if (i != 0) {
                    omw.c(i, drawable, vKImageView);
                } else {
                    vKImageView.setImageDrawable(new baf0(drawable, dhr0.Y(R.attr.vk_ui_text_primary, voipActionVerticalButtonView.getContext())));
                }
            }
            vKImageView.setBackground(null);
        }
        voipActionVerticalButtonView.Q4();
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        P4(this, typedArray.getDrawable(0), 0, 14);
        setTitle(typedArray.getString(2));
        setTitleLines(typedArray.getInt(3, 1));
    }

    public final void Q4() {
        this.w.setVisibility(this.t.getVisibility() == 0 || this.v.getVisibility() == 0 ? 0 : 8);
    }

    public final void setBadgeVisible(boolean z) {
        View view = this.x;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        rdi.B(this.t, z);
        rdi.B(this.u, z);
    }

    public final void setIcon(int i) {
        Drawable a;
        if (i == 0) {
            a = null;
        } else {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            a = m33.a(i, context);
        }
        P4(this, a, 0, 14);
    }

    public final void setIconNoTint(Drawable drawable) {
        VKImageView vKImageView = this.t;
        if (drawable == null) {
            vKImageView.setVisibility(8);
            vKImageView.setImageDrawable(null);
        } else {
            vKImageView.setVisibility(0);
            vKImageView.setImageDrawable(drawable);
        }
        Q4();
    }

    public final void setProgressVisible(boolean z) {
        this.v.setVisibility(z ? 0 : 8);
        this.t.setVisibility(z ? 8 : 0);
        Q4();
    }

    public final void setTitle(CharSequence charSequence) {
        setContentDescription(charSequence);
        post(new vo2(8, this, charSequence));
    }

    public final void setTitleLines(int i) {
        this.u.setLines(i);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        this.u.setTextColor(colorStateList);
    }

    public final void setTitle(int i) {
        setTitle(i == 0 ? null : getContext().getString(i));
    }
}
