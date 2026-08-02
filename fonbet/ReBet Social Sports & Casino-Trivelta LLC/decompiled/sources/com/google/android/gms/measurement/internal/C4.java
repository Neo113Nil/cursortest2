package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class C4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f33317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f33318b;

    public C4(W4 w42, Boolean bool) {
        this.f33317a = bool;
        Objects.requireNonNull(w42);
        this.f33318b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33318b.W(this.f33317a, true);
    }
}
