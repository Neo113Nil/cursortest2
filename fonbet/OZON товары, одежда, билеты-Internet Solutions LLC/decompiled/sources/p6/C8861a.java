package p6;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8861a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<byte[]> f80251a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f80252b = 0;

    /* renamed from: p6.a$b */
    /* loaded from: classes8.dex */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f80255a;

        /* renamed from: b, reason: collision with root package name */
        final int f80256b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f80257c;

        b(@NonNull byte[] bArr, int i11, int i12) {
            this.f80257c = bArr;
            this.f80255a = i11;
            this.f80256b = i12;
        }
    }

    @NonNull
    public static MappedByteBuffer a(@NonNull File file) throws IOException {
        Throwable th2;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return load;
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th2;
                    }
                    try {
                        randomAccessFile.close();
                        throw th2;
                    } catch (IOException unused4) {
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static ByteBuffer b(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f80251a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @NonNull
    public static byte[] d(@NonNull ByteBuffer byteBuffer) {
        b bVar = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (bVar != null && bVar.f80255a == 0) {
            if (bVar.f80256b == bVar.f80257c.length) {
                return byteBuffer.array();
            }
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void e(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        c(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static InputStream f(@NonNull ByteBuffer byteBuffer) {
        return new C1346a(byteBuffer);
    }

    /* renamed from: p6.a$a, reason: collision with other inner class name */
    private static class C1346a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final ByteBuffer f80253a;

        /* renamed from: b, reason: collision with root package name */
        private int f80254b = -1;

        C1346a(@NonNull ByteBuffer byteBuffer) {
            this.f80253a = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f80253a.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i11) {
            this.f80254b = this.f80253a.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f80253a;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i11 = this.f80254b;
            if (i11 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f80253a.position(i11);
        }

        @Override // java.io.InputStream
        public final long skip(long j11) {
            ByteBuffer byteBuffer = this.f80253a;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j11, byteBuffer.remaining());
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i11, int i12) {
            ByteBuffer byteBuffer = this.f80253a;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i12, byteBuffer.remaining());
            byteBuffer.get(bArr, i11, min);
            return min;
        }
    }
}
