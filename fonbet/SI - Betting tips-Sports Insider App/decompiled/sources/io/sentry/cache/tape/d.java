package io.sentry.cache.tape;

import com.logrocket.protobuf.e1;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final h f16256a;

    /* renamed from: b, reason: collision with root package name */
    public final c f16257b = new c();

    /* renamed from: c, reason: collision with root package name */
    public final i2.d f16258c;

    public d(h hVar, i2.d dVar) {
        this.f16256a = hVar;
        this.f16258c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3, types: [long] */
    /* JADX WARN: Type inference failed for: r28v4 */
    @Override // io.sentry.cache.tape.e
    public final void c(Object obj) {
        long j;
        boolean z5;
        long j6;
        long j10;
        long j11;
        long j12;
        c cVar = this.f16257b;
        cVar.reset();
        i2.d dVar = this.f16258c;
        dVar.getClass();
        io.sentry.e eVar = (io.sentry.e) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(cVar, io.sentry.cache.g.f16253c));
        try {
            ((io.sentry.cache.g) dVar.f10882b).f16254a.getSerializer().a(eVar, bufferedWriter);
            bufferedWriter.close();
            byte[] c2 = cVar.c();
            int size = cVar.size();
            h hVar = this.f16256a;
            hVar.getClass();
            byte[] bArr = hVar.f16273g;
            if (c2 == null) {
                throw new NullPointerException("data == null");
            }
            if (size < 0 || size > c2.length) {
                throw new IndexOutOfBoundsException();
            }
            if (hVar.j) {
                throw new IllegalStateException("closed");
            }
            int i5 = hVar.f16275i;
            if (i5 != -1 && hVar.f16270d == i5) {
                hVar.K(1);
            }
            long j13 = size + 4;
            long j14 = hVar.f16269c;
            long j15 = 32;
            if (hVar.f16270d == 0) {
                z5 = 1;
                j = 4;
                j6 = 32;
            } else {
                f fVar = hVar.f16272f;
                long j16 = fVar.f16260a;
                int i10 = fVar.f16261b;
                j = 4;
                long j17 = hVar.f16271e.f16260a;
                if (j16 >= j17) {
                    j6 = (j16 - j17) + 4 + i10 + 32;
                    z5 = 1;
                } else {
                    z5 = 1;
                    j6 = (((j16 + 4) + i10) + j14) - j17;
                }
            }
            long j18 = j14 - j6;
            if (j18 < j13) {
                do {
                    j18 += j14;
                    j14 <<= z5;
                } while (j18 < j13);
                hVar.f16267a.setLength(j14);
                hVar.f16267a.getChannel().force(z5);
                long W = hVar.W(hVar.f16272f.f16260a + j + r4.f16261b);
                if (W <= hVar.f16271e.f16260a) {
                    FileChannel channel = hVar.f16267a.getChannel();
                    channel.position(hVar.f16269c);
                    j10 = W - 32;
                    if (channel.transferTo(32L, j10, channel) != j10) {
                        throw new AssertionError("Copied insufficient number of bytes!");
                    }
                } else {
                    j10 = 0;
                }
                long j19 = hVar.f16272f.f16260a;
                long j20 = hVar.f16271e.f16260a;
                if (j19 < j20) {
                    j12 = 0;
                    long j21 = (hVar.f16269c + j19) - 32;
                    j11 = j14;
                    hVar.Y(j11, hVar.f16270d, j20, j21);
                    hVar.f16272f = new f(j21, hVar.f16272f.f16261b);
                } else {
                    j11 = j14;
                    j12 = 0;
                    hVar.Y(j11, hVar.f16270d, j20, j19);
                }
                hVar.f16269c = j11;
                long j22 = 32;
                long j23 = j10;
                while (j23 > j12) {
                    int min = (int) Math.min(j23, 4096);
                    hVar.U(min, j22, h.f16266k);
                    long j24 = min;
                    j23 -= j24;
                    j22 += j24;
                }
            }
            boolean z7 = hVar.f16270d == 0;
            if (!z7) {
                j15 = hVar.W(hVar.f16272f.f16260a + j + r4.f16261b);
            }
            long j25 = j15;
            f fVar2 = new f(j25, size);
            h.d0(bArr, 0, size);
            hVar.U(4, j25, bArr);
            hVar.U(size, j25 + j, c2);
            hVar.Y(hVar.f16269c, hVar.f16270d + 1, z7 ? j25 : hVar.f16271e.f16260a, j25);
            hVar.f16272f = fVar2;
            hVar.f16270d++;
            hVar.f16274h++;
            if (z7) {
                hVar.f16271e = fVar2;
            }
        } finally {
        }
    }

    @Override // io.sentry.cache.tape.e
    public final void clear() {
        this.f16256a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16256a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        h hVar = this.f16256a;
        hVar.getClass();
        return new e1(this, new g(hVar));
    }

    @Override // io.sentry.cache.tape.e
    public final int size() {
        return this.f16256a.f16270d;
    }

    @Override // io.sentry.cache.tape.e
    public final void t(int i5) {
        this.f16256a.K(i5);
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.f16256a + '}';
    }
}
