package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.baf0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.iut0;
import xsna.jjc;
import xsna.lbt0;
import xsna.m33;
import xsna.zmn0;

/* compiled from: VoipActionSingleLineView.kt */
/* loaded from: classes7.dex */
public final class VoipActionSingleLineView extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public final VKImageView b;
    public final TextView c;
    public final TextView d;
    public final ProgressBar e;
    public final ImageView f;
    public final SwitchCompat g;
    public CompoundButton.OnCheckedChangeListener h;

    public VoipActionSingleLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.voip_action_singleline_view, this);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.icon);
        this.b = vKImageView;
        TextView textView = (TextView) findViewById(R.id.title);
        this.c = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.d = textView2;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
        this.e = progressBar;
        ImageView imageView = (ImageView) findViewById(R.id.open);
        this.f = imageView;
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.switch_view);
        this.g = switchCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.i, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        float f = 16;
        f4m.x(iah0.a(f), this);
        f4m.w(iah0.a(f), this);
        vKImageView.setImportantForAccessibility(2);
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        progressBar.setImportantForAccessibility(2);
        imageView.setImportantForAccessibility(2);
        switchCompat.setImportantForAccessibility(2);
    }

    public static void a(VoipActionSingleLineView voipActionSingleLineView, Drawable drawable) {
        VKImageView vKImageView = voipActionSingleLineView.b;
        if (drawable != null) {
            vKImageView.setImageDrawable(new baf0(drawable, dhr0.Y(R.attr.vk_ui_text_primary, voipActionSingleLineView.getContext())));
        }
        vKImageView.setVisibility(drawable != null ? 0 : 8);
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(0);
        if (drawable != null) {
            a(this, new baf0(drawable, isInEditMode() ? -3355444 : typedArray.getColor(1, dhr0.Y(R.attr.vk_ui_text_primary, getContext()))));
        } else {
            a(this, null);
        }
        setTitleLines(typedArray.getInt(7, 1));
        setTitle(typedArray.getString(6));
        setSubtitle(typedArray.getString(4));
        setProgressVisible(typedArray.getBoolean(3, false));
        setOpenIconVisible(typedArray.getBoolean(2, false));
        setSwitchVisible(typedArray.getBoolean(5, false));
    }

    public final void b(boolean z, boolean z2) {
        SwitchCompat switchCompat = this.g;
        if (!z2) {
            switchCompat.setChecked(z);
            return;
        }
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(z);
        switchCompat.setOnCheckedChangeListener(this.h);
    }

    public final Drawable getIcon() {
        return this.b.getDrawable();
    }

    public final CharSequence getSubtitle() {
        return this.d.getText();
    }

    public final CharSequence getTitle() {
        return this.c.getText();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        SwitchCompat switchCompat = this.g;
        ImageView imageView = this.f;
        ProgressBar progressBar = this.e;
        TextView textView = this.d;
        TextView textView2 = this.c;
        VKImageView vKImageView = this.b;
        if (z) {
            vKImageView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            progressBar.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            switchCompat.setAlpha(1.0f);
            return;
        }
        vKImageView.setAlpha(0.4f);
        textView2.setAlpha(0.4f);
        textView.setAlpha(0.4f);
        progressBar.setAlpha(0.4f);
        imageView.setAlpha(0.4f);
        switchCompat.setAlpha(0.4f);
    }

    public final void setIcon(int i2) {
        Drawable a;
        if (i2 == 0) {
            a = null;
        } else {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            a = m33.a(i2, context);
        }
        a(this, a);
    }

    public final void setIconUrl(String str) {
        ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_28DP;
        VKImageView vKImageView = this.b;
        vKImageView.O0(str, imageScreenSize);
        vKImageView.setColorFilter(dhr0.Y(R.attr.vk_ui_text_primary, getContext()), PorterDuff.Mode.SRC_IN);
        vKImageView.setVisibility(0);
    }

    public final void setOpenIconVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public final void setProgressVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.d;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setSwitchListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.h = onCheckedChangeListener;
        this.g.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setSwitchVisible(boolean z) {
        int i2 = z ? 0 : 8;
        SwitchCompat switchCompat = this.g;
        switchCompat.setVisibility(i2);
        if (z) {
            jjc.g(this, new lbt0(this, 3));
            iut0.q(this, new zmn0(switchCompat));
        } else {
            iut0.q(this, null);
            setOnClickListener(null);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
        setContentDescription(charSequence);
    }

    public final void setTitleLines(int i2) {
        this.c.setLines(i2);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        this.c.setTextColor(colorStateList);
    }

    public final void setTitleTextColor(int i2) {
        this.c.setTextColor(getContext().getColor(i2));
    }

    public final void setSubtitle(int i2) {
        setSubtitle(i2 == 0 ? null : getContext().getString(i2));
    }

    public final void setTitle(int i2) {
        setTitle(i2 == 0 ? null : getContext().getString(i2));
    }
}
