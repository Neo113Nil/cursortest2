package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3276i5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f34048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3268h5 f34049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3268h5 f34050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f34051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3332p5 f34052e;

    public RunnableC3276i5(C3332p5 c3332p5, Bundle bundle, C3268h5 c3268h5, C3268h5 c3268h52, long j10) {
        this.f34048a = bundle;
        this.f34049b = c3268h5;
        this.f34050c = c3268h52;
        this.f34051d = j10;
        Objects.requireNonNull(c3332p5);
        this.f34052e = c3332p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34052e.A(this.f34048a, this.f34049b, this.f34050c, this.f34051d);
    }
}
