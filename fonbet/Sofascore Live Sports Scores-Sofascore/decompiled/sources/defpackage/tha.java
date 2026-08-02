package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class tha implements Closeable {
    public final boolean a;
    public boolean b;
    public int c;
    public final ReentrantLock d = new ReentrantLock();
    public final RandomAccessFile e;

    public tha(boolean z, RandomAccessFile randomAccessFile) {
        this.a = z;
        this.e = randomAccessFile;
    }

    public static z08 e(tha thaVar) {
        if (!thaVar.a) {
            a70.r("file handle is read-only");
            return null;
        }
        ReentrantLock reentrantLock = thaVar.d;
        reentrantLock.lock();
        try {
            if (thaVar.b) {
                throw new IllegalStateException("closed");
            }
            thaVar.c++;
            reentrantLock.unlock();
            return new z08(thaVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c != 0) {
                return;
            }
            Unit unit = Unit.a;
            synchronized (this) {
                this.e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final a18 f(long j) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            this.c++;
            reentrantLock.unlock();
            return new a18(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.a) {
            a70.r("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.a;
            synchronized (this) {
                this.e.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.a;
            synchronized (this) {
                length = this.e.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
