package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3373v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q3 f34327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3381w f34328b;

    public RunnableC3373v(AbstractC3381w abstractC3381w, Q3 q32) {
        this.f34327a = q32;
        Objects.requireNonNull(abstractC3381w);
        this.f34328b = abstractC3381w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q3 q32 = this.f34327a;
        q32.c();
        if (C3246f.a()) {
            q32.b().t(this);
            return;
        }
        AbstractC3381w abstractC3381w = this.f34328b;
        boolean c10 = abstractC3381w.c();
        abstractC3381w.e(0L);
        if (c10) {
            abstractC3381w.a();
        }
    }
}
