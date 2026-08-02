package com.mbridge.msdk.thrid.okio;

import com.sofascore.model.mvvm.model.StatusKt;
import defpackage.a70;
import defpackage.vxd;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class t {
    public static final t d = new a();
    private boolean a;
    private long b;
    private long c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j) {
            return this;
        }
    }

    public t a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            a70.p(vxd.l(j, "timeout < 0: "));
            return null;
        }
        if (timeUnit != null) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        a70.p("unit == null");
        return null;
    }

    public t b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        a70.r("No deadline");
        return 0L;
    }

    public boolean d() {
        return this.a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(StatusKt.STATUS_INTERRUPTED);
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.c;
    }

    public t a(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public t a() {
        this.a = false;
        return this;
    }
}
