package com.google.android.gms.common;

import N9.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3197v;
import com.google.android.gms.common.internal.S;

/* renamed from: com.google.android.gms.common.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC3205m extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public int f32777a;

    /* renamed from: b, reason: collision with root package name */
    public int f32778b;

    /* renamed from: c, reason: collision with root package name */
    public View f32779c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f32780d;

    public ViewOnClickListenerC3205m(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11) {
        this.f32777a = i10;
        this.f32778b = i11;
        b(getContext());
    }

    public final void b(Context context) {
        View view = this.f32779c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f32779c = S.c(context, this.f32777a, this.f32778b);
        } catch (f.a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i10 = this.f32777a;
            int i11 = this.f32778b;
            C3197v c3197v = new C3197v(context, null);
            c3197v.a(context.getResources(), i10, i11);
            this.f32779c = c3197v;
        }
        addView(this.f32779c);
        this.f32779c.setEnabled(isEnabled());
        this.f32779c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f32780d;
        if (onClickListener == null || view != this.f32779c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        a(this.f32777a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f32779c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f32780d = onClickListener;
        View view = this.f32779c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        a(this.f32777a, this.f32778b);
    }

    public void setSize(int i10) {
        a(i10, this.f32778b);
    }

    public ViewOnClickListenerC3205m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC3205m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32780d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9.d.SignInButton, 0, 0);
        try {
            this.f32777a = obtainStyledAttributes.getInt(C9.d.f1537a, 0);
            this.f32778b = obtainStyledAttributes.getInt(C9.d.f1538b, 2);
            obtainStyledAttributes.recycle();
            a(this.f32777a, this.f32778b);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
