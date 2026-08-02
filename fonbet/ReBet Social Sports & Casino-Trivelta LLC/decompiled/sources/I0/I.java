package I0;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f5076a;

    public I(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f5076a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f5076a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f5076a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) {
        Intrinsics.checkNotNullParameter(b10, "b");
        this.f5076a.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f5076a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
