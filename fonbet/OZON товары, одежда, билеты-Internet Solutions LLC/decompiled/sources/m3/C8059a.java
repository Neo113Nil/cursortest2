package m3;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8059a {

    /* renamed from: a, reason: collision with root package name */
    private final File f74302a;

    /* renamed from: b, reason: collision with root package name */
    private final File f74303b;

    /* renamed from: m3.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private static final class C1253a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f74304a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f74305b = false;

        public C1253a(File file) throws FileNotFoundException {
            this.f74304a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileOutputStream fileOutputStream = this.f74304a;
            if (this.f74305b) {
                return;
            }
            this.f74305b = true;
            flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e11) {
                s.g("AtomicFile", "Failed to sync file descriptor:", e11);
            }
            fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f74304a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i11) throws IOException {
            this.f74304a.write(i11);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f74304a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i11, int i12) throws IOException {
            this.f74304a.write(bArr, i11, i12);
        }
    }

    public C8059a(File file) {
        this.f74302a = file;
        this.f74303b = new File(file.getPath() + ".bak");
    }

    public final void a() {
        this.f74302a.delete();
        this.f74303b.delete();
    }

    public final void b(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f74303b.delete();
    }

    public final boolean c() {
        return this.f74302a.exists() || this.f74303b.exists();
    }

    public final FileInputStream d() throws FileNotFoundException {
        File file = this.f74303b;
        boolean exists = file.exists();
        File file2 = this.f74302a;
        if (exists) {
            file2.delete();
            file.renameTo(file2);
        }
        return new FileInputStream(file2);
    }

    public final OutputStream e() throws IOException {
        File file = this.f74302a;
        if (file.exists()) {
            File file2 = this.f74303b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                s.f("AtomicFile", "Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new C1253a(file);
        } catch (FileNotFoundException e11) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e11);
            }
            try {
                return new C1253a(file);
            } catch (FileNotFoundException e12) {
                throw new IOException("Couldn't create " + file, e12);
            }
        }
    }
}
