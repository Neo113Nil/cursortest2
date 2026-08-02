package defpackage;

import com.sofascore.model.mvvm.model.StatusKt;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class pij {
    public static final oij d = new oij();
    public boolean a;
    public long b;
    public long c;

    public pij a() {
        this.a = false;
        return this;
    }

    public pij b() {
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

    public pij d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException(StatusKt.STATUS_INTERRUPTED);
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public pij g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        ogj.h(vxd.l(j, "timeout < 0: "));
        return null;
    }
}
