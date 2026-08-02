package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import y2.s;

/* loaded from: classes.dex */
final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppBarLayout f57965a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f57966b;

    e(AppBarLayout appBarLayout, boolean z11) {
        this.f57965a = appBarLayout;
        this.f57966b = z11;
    }

    @Override // y2.s
    public final boolean a(@NonNull View view) {
        this.f57965a.s(this.f57966b);
        return true;
    }
}
