package c1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f3369a;

    public e1(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f3369a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f3369a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i5) {
        this.f3369a.write(i5);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) {
        Intrinsics.checkNotNullParameter(b10, "b");
        this.f3369a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i5, int i10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f3369a.write(bytes, i5, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
