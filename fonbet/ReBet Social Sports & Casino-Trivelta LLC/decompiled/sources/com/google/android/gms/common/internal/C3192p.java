package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3192p {

    /* renamed from: b, reason: collision with root package name */
    public static C3192p f32745b;

    /* renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f32746c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public RootTelemetryConfiguration f32747a;

    public static synchronized C3192p b() {
        C3192p c3192p;
        synchronized (C3192p.class) {
            try {
                if (f32745b == null) {
                    f32745b = new C3192p();
                }
                c3192p = f32745b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3192p;
    }

    public RootTelemetryConfiguration a() {
        return this.f32747a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f32747a = f32746c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f32747a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.k() < rootTelemetryConfiguration.k()) {
            this.f32747a = rootTelemetryConfiguration;
        }
    }
}
