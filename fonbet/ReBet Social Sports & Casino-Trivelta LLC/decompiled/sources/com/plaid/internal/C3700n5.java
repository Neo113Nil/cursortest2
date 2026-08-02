package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

/* renamed from: com.plaid.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3700n5 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40853a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f40854b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40855c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatButton f40856d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40857e;

    public C3700n5(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull AppCompatButton appCompatButton, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f40853a = linearLayout;
        this.f40854b = textView;
        this.f40855c = textView2;
        this.f40856d = appCompatButton;
        this.f40857e = linearLayout3;
    }

    @NonNull
    public final View getRoot() {
        return this.f40853a;
    }
}
