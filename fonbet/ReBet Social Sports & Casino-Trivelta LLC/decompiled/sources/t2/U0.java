package t2;

import c1.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f65175a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f65176b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f65177c;

    public U0(p.a aVar) {
        this.f65175a = aVar;
        ByteBuffer order = ByteBuffer.allocateDirect(aVar.f26783d * 1024).order(ByteOrder.nativeOrder());
        this.f65176b = order;
        order.flip();
        this.f65177c = new AtomicLong();
    }

    public void a(long j10) {
        this.f65177c.addAndGet(this.f65175a.f26783d * e1.Z.E(j10, this.f65175a.f26780a));
    }

    public ByteBuffer b() {
        long j10 = this.f65177c.get();
        if (!this.f65176b.hasRemaining()) {
            this.f65176b.clear();
            if (j10 < this.f65176b.capacity()) {
                this.f65176b.limit((int) j10);
            }
            this.f65177c.addAndGet(-this.f65176b.remaining());
        }
        return this.f65176b;
    }

    public boolean c() {
        return this.f65176b.hasRemaining() || this.f65177c.get() > 0;
    }
}
