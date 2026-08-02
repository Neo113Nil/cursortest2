package com.swmansion.rnscreens;

import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3817h {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f41966a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.activity.F f41967b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41968c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41969d;

    public C3817h(Fragment fragment, androidx.activity.F onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f41966a = fragment;
        this.f41967b = onBackPressedCallback;
        this.f41969d = true;
    }

    public final boolean a() {
        return this.f41969d;
    }

    public final void b() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (this.f41968c || !this.f41969d) {
            return;
        }
        AbstractActivityC2168s activity = this.f41966a.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.i(this.f41966a, this.f41967b);
        }
        this.f41968c = true;
    }

    public final void c() {
        if (this.f41968c) {
            this.f41967b.remove();
            this.f41968c = false;
        }
    }

    public final void d(boolean z10) {
        this.f41969d = z10;
    }
}
