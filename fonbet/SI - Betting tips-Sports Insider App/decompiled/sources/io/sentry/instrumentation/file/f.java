package io.sentry.instrumentation.file;

import com.google.firebase.messaging.x;
import io.sentry.b6;
import io.sentry.d4;
import io.sentry.i1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends FileOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f16509a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16510b;

    public f(x xVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f16510b = new b((i1) xVar.f6183b, (File) xVar.f6182a, (b6) xVar.f6185d);
        this.f16509a = (FileOutputStream) xVar.f6184c;
    }

    public static x c(File file, FileOutputStream fileOutputStream, boolean z5) {
        i1 n9 = io.sentry.util.h.f17164a ? d4.d().n() : d4.d().i();
        i1 r5 = n9 != null ? n9.r("file.write") : null;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z5);
        }
        return new x(file, r5, fileOutputStream, d4.d().m());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16510b.b(this.f16509a);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i5) {
        this.f16510b.d(new com.google.android.material.sidesheet.c(i5, this));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f16510b.d(new com.google.firebase.messaging.g(15, this, bArr));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) {
        this.f16510b.d(new d(this, bArr, i5, i10, 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(x xVar) {
        super(r0.getFD());
        FileOutputStream fileOutputStream = (FileOutputStream) xVar.f6184c;
        try {
            this.f16510b = new b((i1) xVar.f6183b, (File) xVar.f6182a, (b6) xVar.f6185d);
            this.f16509a = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }
}
