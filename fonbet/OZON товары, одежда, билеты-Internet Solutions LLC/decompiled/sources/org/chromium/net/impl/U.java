package org.chromium.net.impl;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class U extends E {

    /* renamed from: p, reason: collision with root package name */
    private static final AtomicLong f78893p = new AtomicLong(0);

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ org.chromium.net.m a(int i11, int i12, String str) {
        k(i11, i12, str);
        return this;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.i b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (w() == null) {
            H(v());
        }
        return new CronetUrlRequestContext(this, uptimeMillis);
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ void c(boolean z11) {
        n(z11);
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ org.chromium.net.m d(boolean z11) {
        o(z11);
        return this;
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ org.chromium.net.m e(int i11, long j11) {
        p(i11, j11);
        return this;
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ org.chromium.net.m f(boolean z11) {
        q(z11);
        return this;
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    protected final long g() {
        AtomicLong atomicLong = f78893p;
        atomicLong.compareAndSet(0L, this.f78802a.a());
        return atomicLong.get();
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ org.chromium.net.m h(String str) {
        F(str);
        return this;
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ org.chromium.net.m i(String str) {
        G(str);
        return this;
    }

    @Override // org.chromium.net.impl.E, org.chromium.net.m
    public final /* bridge */ /* synthetic */ org.chromium.net.m j(String str) {
        H(str);
        return this;
    }
}
