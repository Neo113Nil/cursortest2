package androidx.camera.core.impl;

import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.lh3;
import xsna.s100;
import xsna.snw;
import xsna.ub9;
import xsna.ugz;
import xsna.vrl;
import xsna.xo9;

/* loaded from: classes11.dex */
public abstract class DeferrableSurface {
    public static final AtomicInteger f = new AtomicInteger(0);
    public static final AtomicInteger g = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public ub9.a<Void> d;
    public final ub9.d e;

    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(@NonNull String str, @NonNull DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        @NonNull
        public final DeferrableSurface d() {
            return this.mDeferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
    }

    public DeferrableSurface() {
        ub9.d a = ub9.a(new lh3(this, 11));
        this.e = a;
        if (s100.b("DeferrableSurface")) {
            g.incrementAndGet();
            f.get();
            toString();
            a.c.addListener(new vrl(0, this, Log.getStackTraceString(new Exception())), xo9.g());
        }
    }

    public final void a() {
        ub9.a<Void> aVar;
        synchronized (this.a) {
            try {
                if (this.c) {
                    aVar = null;
                } else {
                    this.c = true;
                    if (this.b == 0) {
                        aVar = this.d;
                        this.d = null;
                    } else {
                        aVar = null;
                    }
                    if (s100.b("DeferrableSurface")) {
                        toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final void b() {
        ub9.a<Void> aVar;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    aVar = this.d;
                    this.d = null;
                } else {
                    aVar = null;
                }
                if (s100.b("DeferrableSurface")) {
                    toString();
                    if (this.b == 0) {
                        g.get();
                        f.decrementAndGet();
                        toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    @NonNull
    public final ugz<Surface> c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new snw.a(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() throws SurfaceClosedException {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (s100.b("DeferrableSurface")) {
                    if (this.b == 1) {
                        g.get();
                        f.incrementAndGet();
                        toString();
                    }
                    toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public abstract ugz<Surface> e();
}
