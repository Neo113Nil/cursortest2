package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public File f31595a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f31596b;

    /* renamed from: c, reason: collision with root package name */
    public FileChannel f31597c;

    public i(File file) {
        this.f31595a = file;
        d();
    }

    @Override // com.facebook.soloader.h
    public int Z(ByteBuffer byteBuffer, long j10) {
        return this.f31597c.read(byteBuffer, j10);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31596b.close();
    }

    public void d() {
        FileInputStream fileInputStream = new FileInputStream(this.f31595a);
        this.f31596b = fileInputStream;
        this.f31597c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f31597c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f31597c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f31597c.write(byteBuffer);
    }
}
