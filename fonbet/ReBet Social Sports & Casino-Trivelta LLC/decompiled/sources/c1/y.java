package c1;

import c1.p;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class y implements p {

    /* renamed from: b, reason: collision with root package name */
    public final Object f26845b;

    /* renamed from: c, reason: collision with root package name */
    public final v f26846c;

    public y(Object obj, boolean z10) {
        this.f26845b = obj;
        this.f26846c = new v(z10);
    }

    @Override // c1.p
    public final ByteBuffer a() {
        ByteBuffer a10;
        synchronized (this.f26845b) {
            a10 = this.f26846c.a();
        }
        return a10;
    }

    @Override // c1.p
    public final boolean b() {
        boolean b10;
        synchronized (this.f26845b) {
            b10 = this.f26846c.b();
        }
        return b10;
    }

    @Override // c1.p
    public final p.a c(p.a aVar) {
        p.a c10;
        synchronized (this.f26845b) {
            c10 = this.f26846c.c(aVar);
        }
        return c10;
    }

    @Override // c1.p
    public final void d(ByteBuffer byteBuffer) {
        synchronized (this.f26845b) {
            this.f26846c.d(byteBuffer);
        }
    }

    @Override // c1.p
    public final void e() {
        synchronized (this.f26845b) {
            this.f26846c.e();
        }
    }

    @Override // c1.p
    public long f(long j10) {
        return g(j10);
    }

    @Override // c1.p
    public final void flush() {
        synchronized (this.f26845b) {
            this.f26846c.flush();
        }
    }

    public final long g(long j10) {
        long i10;
        synchronized (this.f26845b) {
            i10 = this.f26846c.i(j10);
        }
        return i10;
    }

    public final void h(float f10) {
        synchronized (this.f26845b) {
            this.f26846c.k(f10);
        }
    }

    public final void i(float f10) {
        synchronized (this.f26845b) {
            this.f26846c.l(f10);
        }
    }

    @Override // c1.p
    public final boolean isActive() {
        boolean isActive;
        synchronized (this.f26845b) {
            isActive = this.f26846c.isActive();
        }
        return isActive;
    }

    @Override // c1.p
    public final void reset() {
        synchronized (this.f26845b) {
            this.f26846c.reset();
        }
    }
}
