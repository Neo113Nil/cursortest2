package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public final class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f31613a;

    /* renamed from: b, reason: collision with root package name */
    public final FileLock f31614b;

    public n(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f31613a = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f31614b = lock;
        } catch (Throwable th2) {
            this.f31613a.close();
            throw th2;
        }
    }

    public static n d(File file) {
        return new n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            FileLock fileLock = this.f31614b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f31613a.close();
        }
    }
}
