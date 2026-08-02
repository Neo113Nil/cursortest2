package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final Queue f30140c = l.g(0);

    /* renamed from: a, reason: collision with root package name */
    public InputStream f30141a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f30142b;

    public static d k(InputStream inputStream) {
        d dVar;
        Queue queue = f30140c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.B(inputStream);
        return dVar;
    }

    public void B(InputStream inputStream) {
        this.f30141a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f30141a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30141a.close();
    }

    public IOException d() {
        return this.f30142b;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f30141a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f30141a.markSupported();
    }

    public void r() {
        this.f30142b = null;
        this.f30141a = null;
        Queue queue = f30140c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f30141a.read();
        } catch (IOException e10) {
            this.f30142b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f30141a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f30141a.skip(j10);
        } catch (IOException e10) {
            this.f30142b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f30141a.read(bArr);
        } catch (IOException e10) {
            this.f30142b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f30141a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f30142b = e10;
            throw e10;
        }
    }
}
