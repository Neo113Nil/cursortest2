package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3206a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f33796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3406z0 f33797c;

    public RunnableC3206a(C3406z0 c3406z0, String str, long j10) {
        this.f33795a = str;
        this.f33796b = j10;
        Objects.requireNonNull(c3406z0);
        this.f33797c = c3406z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33797c.l(this.f33795a, this.f33796b);
    }
}
