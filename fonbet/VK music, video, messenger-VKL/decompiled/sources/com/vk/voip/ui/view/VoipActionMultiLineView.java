package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.voip.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.aer0;
import xsna.baf0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.iut0;
import xsna.jjc;
import xsna.m33;
import xsna.omw;
import xsna.zmn0;

/* compiled from: VoipActionMultiLineView.kt */
/* loaded from: classes7.dex */
public class VoipActionMultiLineView extends LinearLayout implements Checkable {
    public final ImageView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final ProgressBar f;
    public final ImageView g;
    public final SwitchCompat h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;

    public VoipActionMultiLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(VoipActionMultiLineView voipActionMultiLineView, Drawable drawable, int i) {
        int i2 = (i & 2) != 0 ? 0 : R.attr.vk_ui_icon_accent;
        ImageView imageView = voipActionMultiLineView.b;
        if (drawable == null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
            return;
        }
        imageView.setVisibility(0);
        if (i2 != 0) {
            omw.c(i2, drawable, imageView);
        } else {
            imageView.setImageDrawable(new baf0(drawable, dhr0.Y(R.attr.vk_ui_text_primary, voipActionMultiLineView.getContext())));
        }
        imageView.setBackground(null);
    }

    public static void b(VoipActionMultiLineView voipActionMultiLineView, boolean z) {
        SwitchCompat switchCompat = voipActionMultiLineView.h;
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(z);
        switchCompat.setOnCheckedChangeListener(voipActionMultiLineView.i);
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(0);
        ImageView imageView = this.b;
        if (drawable != null) {
            int color = isInEditMode() ? -3355444 : typedArray.getColor(1, dhr0.Y(R.attr.vk_ui_text_primary, getContext()));
            imageView.setVisibility(0);
            imageView.setImageDrawable(new baf0(drawable, color));
        } else {
            imageView.setVisibility(8);
        }
        setTitle(typedArray.getString(11));
        setTitleLines(typedArray.getInt(12, 1));
        setSubtitleLines(typedArray.getInt(7, 1));
        setTitleMaxLines(typedArray.getInt(13, 1));
        setSubtitle(typedArray.getString(6));
        setStatus(typedArray.getString(5));
        setSubtitleStartIcon(typedArray.getDrawable(9));
        setProgressVisible(typedArray.getBoolean(4, false));
        setOpenIconVisible(typedArray.getBoolean(3, false));
        setSubtitleMaxLines(typedArray.getInt(8, 1));
        setSwitchVisible(typedArray.getBoolean(10, false));
        this.j = typedArray.getBoolean(2, false);
    }

    public final Drawable getIcon() {
        return this.b.getDrawable();
    }

    public final CharSequence getStatus() {
        return this.c.getText();
    }

    public final CharSequence getSubtitle() {
        return this.e.getText();
    }

    public final CharSequence getTitle() {
        return this.d.getText();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.h.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.h.setChecked(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        SwitchCompat switchCompat = this.h;
        switchCompat.setEnabled(z);
        float f = z ? 1.0f : 0.4f;
        this.b.setAlpha(f);
        this.d.setAlpha(f);
        this.e.setAlpha(f);
        this.f.setAlpha(f);
        this.g.setAlpha(f);
        switchCompat.setAlpha(f);
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
        a(this, a, 14);
    }

    public final void setOpenIconVisible(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public final void setProgressVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public final void setStatus(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setSubtitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.e;
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setSubtitleLines(int i) {
        this.e.setLines(i);
    }

    public final void setSubtitleMaxLines(int i) {
        this.e.setMaxLines(i);
    }

    public final void setSubtitleStartIcon(int i) {
        Drawable a;
        if (i == 0) {
            a = null;
        } else {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            a = m33.a(i, context);
        }
        setSubtitleStartIcon(a);
    }

    public final void setSwitchListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
        this.h.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setSwitchVisible(boolean z) {
        int i = z ? 0 : 8;
        SwitchCompat switchCompat = this.h;
        switchCompat.setVisibility(i);
        if (z) {
            jjc.g(this, new aer0(this, 7));
            iut0.q(this, new zmn0(switchCompat));
        } else {
            iut0.q(this, null);
            setOnClickListener(null);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.d.setText(charSequence);
        if (this.j) {
            return;
        }
        setContentDescription(charSequence);
    }

    public final void setTitleLines(int i) {
        this.d.setLines(i);
    }

    public final void setTitleMaxLines(int i) {
        this.d.setMaxLines(i);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        this.d.setTextColor(colorStateList);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.h.toggle();
    }

    public VoipActionMultiLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.voip_action_multiline_view, this);
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        this.b = imageView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.title);
        this.d = appCompatTextView;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById(R.id.subtitle);
        this.e = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) findViewById(R.id.status);
        this.c = appCompatTextView3;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
        this.f = progressBar;
        ImageView imageView2 = (ImageView) findViewById(R.id.open);
        this.g = imageView2;
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.switch_view);
        this.h = switchCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        float f = 16;
        f4m.x(iah0.a(f), this);
        f4m.w(iah0.a(f), this);
        imageView.setImportantForAccessibility(2);
        appCompatTextView.setImportantForAccessibility(2);
        appCompatTextView2.setImportantForAccessibility(2);
        appCompatTextView3.setImportantForAccessibility(2);
        progressBar.setImportantForAccessibility(2);
        imageView2.setImportantForAccessibility(2);
        switchCompat.setImportantForAccessibility(2);
    }

    public final void setStatus(int i) {
        setStatus(i == 0 ? null : getContext().getString(i));
    }

    public final void setSubtitle(int i) {
        setSubtitle(i == 0 ? null : getContext().getString(i));
    }

    public final void setSubtitleStartIcon(Drawable drawable) {
        AppCompatTextView appCompatTextView = this.e;
        if (drawable == null) {
            appCompatTextView.setCompoundDrawablePadding(0);
            appCompatTextView.setCompoundDrawables(null, null, null, null);
            return;
        }
        appCompatTextView.setCompoundDrawablePadding(iah0.a(4));
        ColorStateList valueOf = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_secondary, getContext()));
        if (valueOf != null) {
            drawable = drawable.mutate();
            drawable.setTintList(valueOf);
        }
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setTitle(int i) {
        setTitle(i == 0 ? null : getContext().getString(i));
    }
}
