package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zaad;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.dynamic.RemoteCreator;
import defpackage.a70;
import defpackage.fn0;
import defpackage.x5n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public int a;
    public int b;
    public View c;
    public View.OnClickListener d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public final void a(int i, int i2) {
        this.a = i;
        this.b = i2;
        Context context = getContext();
        View view = this.c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.c = zaac.c(context, this.a, this.b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i3 = this.a;
            int i4 = this.b;
            zaad zaadVar = new zaad(context, null, android.R.attr.buttonStyle);
            Resources resources = context.getResources();
            zaadVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaadVar.setTextSize(14.0f);
            int i5 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaadVar.setMinHeight(i5);
            zaadVar.setMinWidth(i5);
            int a = zaad.a(i4, com.sofascore.results.R.drawable.common_google_signin_btn_icon_dark, com.sofascore.results.R.drawable.common_google_signin_btn_icon_light, com.sofascore.results.R.drawable.common_google_signin_btn_icon_light);
            int a2 = zaad.a(i4, com.sofascore.results.R.drawable.common_google_signin_btn_text_dark, com.sofascore.results.R.drawable.common_google_signin_btn_text_light, com.sofascore.results.R.drawable.common_google_signin_btn_text_light);
            if (i3 == 0 || i3 == 1) {
                a = a2;
            } else if (i3 != 2) {
                a70.r(x5n.l(fn0.a(i3, 21), i3, "Unknown button size: "));
                return;
            }
            Drawable drawable = resources.getDrawable(a);
            drawable.setTintList(resources.getColorStateList(com.sofascore.results.R.color.common_google_signin_btn_tint));
            drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
            zaadVar.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(zaad.a(i4, com.sofascore.results.R.color.common_google_signin_btn_text_dark, com.sofascore.results.R.color.common_google_signin_btn_text_light, com.sofascore.results.R.color.common_google_signin_btn_text_light));
            Preconditions.i(colorStateList);
            zaadVar.setTextColor(colorStateList);
            if (i3 == 0) {
                zaadVar.setText(resources.getString(com.sofascore.results.R.string.common_signin_button_text));
            } else if (i3 == 1) {
                zaadVar.setText(resources.getString(com.sofascore.results.R.string.common_signin_button_text_long));
            } else {
                if (i3 != 2) {
                    a70.r(x5n.l(fn0.a(i3, 21), i3, "Unknown button size: "));
                    return;
                }
                zaadVar.setText((CharSequence) null);
            }
            zaadVar.setTransformationMethod(null);
            if (DeviceProperties.b(zaadVar.getContext())) {
                zaadVar.setGravity(19);
            }
            this.c = zaadVar;
        }
        addView(this.c);
        this.c.setEnabled(isEnabled());
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.d;
        if (onClickListener == null || view != this.c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i) {
        a(this.a, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.d = onClickListener;
        View view = this.c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        a(this.a, this.b);
    }

    public void setSize(int i) {
        a(i, this.b);
    }
}
