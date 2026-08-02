package defpackage;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s4d implements Runnable {
    public final p4d a;
    public Future c;
    public Future d;
    public soh e;
    public byte[] i;
    public final AtomicInteger j;
    public final jml k;
    public final jml l;
    public final ReentrantLock b = new ReentrantLock();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicReference g = new AtomicReference(r4d.a);
    public final ReentrantLock h = new ReentrantLock();

    public s4d(p4d p4dVar) {
        this.a = p4dVar;
        CompletableFuture completableFuture = new CompletableFuture();
        this.c = completableFuture;
        completableFuture.complete(Boolean.TRUE);
        vvd vvdVar = p4dVar.a;
        vvdVar.getClass();
        int d = o92.d(C.DEFAULT_BUFFER_SEGMENT_SIZE, NotificationCompat.FLAG_LOCAL_ONLY);
        this.j = new AtomicInteger(d);
        this.i = new byte[d];
        Duration duration = vvdVar.m;
        this.k = new jml(5000, duration);
        this.l = new jml(-1, duration);
    }

    public final void a(g5d g5dVar, soh sohVar, dx dxVar) {
        AtomicInteger atomicInteger = this.j;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i = atomicInteger.get();
            int i2 = 0;
            while (true) {
                if (g5dVar == null) {
                    break;
                }
                if (g5dVar == avb.o) {
                    this.g.set(r4d.a);
                    break;
                }
                long d = g5dVar.d();
                long j = i;
                if (i2 + d > j) {
                    if (i2 > 0) {
                        sohVar.e(i2, this.i);
                        dxVar.getClass();
                        i2 = 0;
                    }
                    if (d > j) {
                        i = o92.d((int) d, NotificationCompat.FLAG_LOCAL_ONLY);
                        atomicInteger.set(i);
                        this.i = new byte[i];
                    }
                }
                o92 c = g5dVar.c();
                int position = c.c.position();
                System.arraycopy(c.c.array(), 0, this.i, i2, position);
                int i3 = i2 + position;
                byte[] bArr = this.i;
                int i4 = i3 + 1;
                bArr[i3] = 13;
                i2 = i3 + 2;
                bArr[i4] = 10;
                if (!(g5dVar instanceof sff)) {
                    int b = i2 + g5dVar.b(i2, bArr);
                    byte[] bArr2 = g5dVar.c;
                    if (bArr2.length > 0) {
                        System.arraycopy(bArr2, 0, this.i, b, bArr2.length);
                        b += bArr2.length;
                    }
                    byte[] bArr3 = this.i;
                    int i5 = b + 1;
                    bArr3[b] = 13;
                    i2 = b + 2;
                    bArr3[i5] = 10;
                }
                ((AtomicLong) dxVar.c).incrementAndGet();
                ((AtomicLong) dxVar.h).addAndGet(d);
                g5dVar = g5dVar.l;
            }
            if (i2 > 0) {
                sohVar.e(i2, this.i);
                dxVar.getClass();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(CompletableFuture completableFuture) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.d = completableFuture;
            this.f.set(true);
            ((AtomicInteger) this.k.d).set(1);
            ((AtomicInteger) this.l.d).set(1);
            this.c = this.a.M.submit(this, Boolean.TRUE);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Future c() {
        jml jmlVar = this.k;
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                jmlVar.b();
                this.l.b();
                jmlVar.d();
            } finally {
                reentrantLock.unlock();
            }
        }
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:4:0x0011, B:5:0x001d, B:7:0x0023, B:9:0x0029, B:12:0x0035, B:15:0x0054, B:19:0x0047, B:31:0x0069, B:33:0x006f, B:34:0x005e), top: B:2:0x0011, inners: #4, #4 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        p4d p4dVar = this.a;
        AtomicBoolean atomicBoolean = this.f;
        Duration ofMinutes = Duration.ofMinutes(2L);
        Duration ofMillis = Duration.ofMillis(1L);
        try {
            try {
                try {
                    this.e = (soh) this.d.get();
                    dx dxVar = p4dVar.b;
                    while (atomicBoolean.get() && !Thread.interrupted()) {
                        Object obj = this.g.get();
                        r4d r4dVar = r4d.a;
                        AtomicInteger atomicInteger = this.j;
                        g5d c = obj == r4dVar ? this.k.c(atomicInteger.get(), ofMinutes) : this.l.c(atomicInteger.get(), ofMillis);
                        if (c != null) {
                            a(c, this.e, dxVar);
                        }
                    }
                    atomicBoolean.set(false);
                } catch (CancellationException | ExecutionException unused) {
                    atomicBoolean.set(false);
                }
            } catch (IOException e) {
                e = e;
                if (atomicBoolean.get()) {
                    p4dVar.t(e);
                }
                atomicBoolean.set(false);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                atomicBoolean.set(false);
            } catch (BufferOverflowException e2) {
                e = e2;
                if (atomicBoolean.get()) {
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }
}
