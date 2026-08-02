package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class P5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T5 f33592a;

    public P5(T5 t52) {
        Objects.requireNonNull(t52);
        this.f33592a = t52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33592a.f33671c;
        C3298l3 c3298l3 = z52.f33578a;
        Context d10 = c3298l3.d();
        c3298l3.c();
        z52.K(new ComponentName(d10, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
