package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3330p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f34218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N3 f34219e;

    public RunnableC3330p3(N3 n32, String str, String str2, String str3, long j10) {
        this.f34215a = str;
        this.f34216b = str2;
        this.f34217c = str3;
        this.f34218d = j10;
        Objects.requireNonNull(n32);
        this.f34219e = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f34215a;
        if (str == null) {
            N3 n32 = this.f34219e;
            n32.O0().t0(this.f34216b, null);
        } else {
            C3268h5 c3268h5 = new C3268h5(this.f34217c, str, this.f34218d);
            N3 n33 = this.f34219e;
            n33.O0().t0(this.f34216b, c3268h5);
        }
    }
}
