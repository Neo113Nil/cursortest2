package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5963n extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<ByteBuffer> f60220a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f60221b;

    /* renamed from: c, reason: collision with root package name */
    private int f60222c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f60223d;

    /* renamed from: e, reason: collision with root package name */
    private int f60224e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f60225f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f60226g;

    /* renamed from: h, reason: collision with root package name */
    private int f60227h;

    /* renamed from: i, reason: collision with root package name */
    private long f60228i;

    C5963n(Iterable<ByteBuffer> iterable) {
        this.f60220a = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f60222c++;
        }
        this.f60223d = -1;
        if (c()) {
            return;
        }
        this.f60221b = Internal.f60127c;
        this.f60223d = 0;
        this.f60224e = 0;
        this.f60228i = 0L;
    }

    private boolean c() {
        ByteBuffer next;
        do {
            this.f60223d++;
            Iterator<ByteBuffer> it = this.f60220a;
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
            this.f60221b = next;
        } while (!next.hasRemaining());
        this.f60224e = this.f60221b.position();
        if (this.f60221b.hasArray()) {
            this.f60225f = true;
            this.f60226g = this.f60221b.array();
            this.f60227h = this.f60221b.arrayOffset();
        } else {
            this.f60225f = false;
            this.f60228i = UnsafeUtil.j(this.f60221b);
            this.f60226g = null;
        }
        return true;
    }

    private void d(int i11) {
        int i12 = this.f60224e + i11;
        this.f60224e = i12;
        if (i12 == this.f60221b.limit()) {
            c();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f60223d == this.f60222c) {
            return -1;
        }
        if (this.f60225f) {
            int i11 = this.f60226g[this.f60224e + this.f60227h] & 255;
            d(1);
            return i11;
        }
        int r11 = UnsafeUtil.r(this.f60224e + this.f60228i) & 255;
        d(1);
        return r11;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f60223d == this.f60222c) {
            return -1;
        }
        int limit = this.f60221b.limit();
        int i13 = this.f60224e;
        int i14 = limit - i13;
        if (i12 > i14) {
            i12 = i14;
        }
        if (this.f60225f) {
            System.arraycopy(this.f60226g, i13 + this.f60227h, bArr, i11, i12);
            d(i12);
            return i12;
        }
        int position = this.f60221b.position();
        this.f60221b.position(this.f60224e);
        this.f60221b.get(bArr, i11, i12);
        this.f60221b.position(position);
        d(i12);
        return i12;
    }
}
