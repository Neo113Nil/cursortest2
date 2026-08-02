package io.sentry.instrumentation.file;

import com.google.firebase.messaging.x;
import io.sentry.b6;
import io.sentry.i1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends FileInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileInputStream f16507a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16508b;

    public e(x xVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f16508b = new b((i1) xVar.f6183b, (File) xVar.f6182a, (b6) xVar.f6185d);
        this.f16507a = (FileInputStream) xVar.f6184c;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16508b.b(this.f16507a);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f16508b.d(new com.google.firebase.messaging.g(14, this, atomicInteger));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return ((Long) this.f16508b.d(new c(this, j))).longValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(x xVar) {
        super(r0.getFD());
        FileInputStream fileInputStream = (FileInputStream) xVar.f6184c;
        try {
            this.f16508b = new b((i1) xVar.f6183b, (File) xVar.f6182a, (b6) xVar.f6185d);
            this.f16507a = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.f16508b.d(new com.google.firebase.messaging.g(13, this, bArr))).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        return ((Integer) this.f16508b.d(new d(this, bArr, i5, i10, 0))).intValue();
    }
}
