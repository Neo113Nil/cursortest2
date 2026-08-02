package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public InputStream f31598a;

    /* renamed from: b, reason: collision with root package name */
    public final ZipEntry f31599b;

    /* renamed from: c, reason: collision with root package name */
    public final ZipFile f31600c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31601d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31602e = true;

    /* renamed from: f, reason: collision with root package name */
    public long f31603f = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) {
        this.f31600c = zipFile;
        this.f31599b = zipEntry;
        this.f31601d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f31598a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.h
    public int Z(ByteBuffer byteBuffer, long j10) {
        if (this.f31598a == null) {
            throw new IOException("InputStream is null");
        }
        int remaining = byteBuffer.remaining();
        long j11 = this.f31601d - j10;
        if (j11 <= 0) {
            return -1;
        }
        int i10 = (int) j11;
        if (remaining > i10) {
            remaining = i10;
        }
        d(j10);
        if (byteBuffer.hasArray()) {
            this.f31598a.read(byteBuffer.array(), 0, remaining);
            byteBuffer.position(byteBuffer.position() + remaining);
        } else {
            byte[] bArr = new byte[remaining];
            this.f31598a.read(bArr, 0, remaining);
            byteBuffer.put(bArr, 0, remaining);
        }
        this.f31603f += remaining;
        return remaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f31598a;
        if (inputStream != null) {
            inputStream.close();
            this.f31602e = false;
        }
    }

    public h d(long j10) {
        InputStream inputStream = this.f31598a;
        if (inputStream == null) {
            throw new IOException(this.f31599b.getName() + "'s InputStream is null");
        }
        long j11 = this.f31603f;
        if (j10 == j11) {
            return this;
        }
        long j12 = this.f31601d;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j10 >= j11) {
            inputStream.skip(j10 - j11);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f31600c.getInputStream(this.f31599b);
            this.f31598a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f31599b.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j10);
        }
        this.f31603f = j10;
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f31602e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return Z(byteBuffer, this.f31603f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
