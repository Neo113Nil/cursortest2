package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3323o4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f34201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W4 f34202e;

    public RunnableC3323o4(W4 w42, String str, String str2, Object obj, long j10) {
        this.f34198a = str;
        this.f34199b = str2;
        this.f34200c = obj;
        this.f34201d = j10;
        Objects.requireNonNull(w42);
        this.f34202e = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34202e.B(this.f34198a, this.f34199b, this.f34200c, this.f34201d);
    }
}
