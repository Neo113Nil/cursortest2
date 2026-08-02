package com.plaid.internal;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Z5 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f39809a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f39810b;

    public Z5(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f39809a = frameLayout;
        this.f39810b = frameLayout2;
    }

    @NonNull
    public final View getRoot() {
        return this.f39809a;
    }
}
