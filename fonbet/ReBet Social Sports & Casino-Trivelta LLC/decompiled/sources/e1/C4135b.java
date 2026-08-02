package e1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4135b {

    /* renamed from: a, reason: collision with root package name */
    public final File f45513a;

    /* renamed from: b, reason: collision with root package name */
    public final File f45514b;

    /* renamed from: e1.b$a */
    public static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final FileOutputStream f45515a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f45516b = false;

        public a(File file) {
            this.f45515a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f45516b) {
                return;
            }
            this.f45516b = true;
            flush();
            try {
                this.f45515a.getFD().sync();
            } catch (IOException e10) {
                AbstractC4156x.j("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f45515a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f45515a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f45515a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f45515a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f45515a.write(bArr, i10, i11);
        }
    }

    public C4135b(File file) {
        this.f45513a = file;
        this.f45514b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.f45513a.delete();
        this.f45514b.delete();
    }

    public void b(OutputStream outputStream) {
        outputStream.close();
        this.f45514b.delete();
    }

    public boolean c() {
        return this.f45513a.exists() || this.f45514b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f45513a);
    }

    public final void e() {
        if (this.f45514b.exists()) {
            this.f45513a.delete();
            this.f45514b.renameTo(this.f45513a);
        }
    }

    public OutputStream f() {
        if (this.f45513a.exists()) {
            if (this.f45514b.exists()) {
                this.f45513a.delete();
            } else if (!this.f45513a.renameTo(this.f45514b)) {
                AbstractC4156x.i("AtomicFile", "Couldn't rename file " + this.f45513a + " to backup file " + this.f45514b);
            }
        }
        try {
            return new a(this.f45513a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f45513a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f45513a, e10);
            }
            try {
                return new a(this.f45513a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f45513a, e11);
            }
        }
    }
}
