package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import defpackage.a70;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgrf {
    public final zzggk a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public long c = -1;
    public long d = -1;
    public Throwable e = null;
    public final int f;

    public zzgrf(int i, zzggk zzggkVar) {
        this.f = i;
        this.a = zzggkVar;
    }

    public final void a() {
        if (this.b.get()) {
            a70.r("Finished trace.");
        } else {
            this.c = SystemClock.uptimeMillis();
        }
    }

    public final void b(Throwable th) {
        if (this.b.get()) {
            a70.r("Finished trace.");
        } else {
            this.e = th;
        }
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.getAndSet(true)) {
            a70.r("Finished trace.");
            return;
        }
        this.d = SystemClock.uptimeMillis();
        this.a.c(this.f - 1, atomicBoolean.get() ? this.d - this.c : -1L, null, this.e);
    }
}
