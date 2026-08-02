package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3397y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3406z0 f34391c;

    public RunnableC3397y(C3406z0 c3406z0, String str, long j10) {
        this.f34389a = str;
        this.f34390b = j10;
        Objects.requireNonNull(c3406z0);
        this.f34391c = c3406z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34391c.m(this.f34389a, this.f34390b);
    }
}
