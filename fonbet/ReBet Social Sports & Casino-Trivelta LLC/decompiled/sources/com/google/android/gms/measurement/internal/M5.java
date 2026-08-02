package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class M5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f33555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T5 f33556b;

    public M5(T5 t52, ComponentName componentName) {
        this.f33555a = componentName;
        Objects.requireNonNull(t52);
        this.f33556b = t52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33556b.f33671c.K(this.f33555a);
    }
}
