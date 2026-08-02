package ti;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements InterfaceC6479i {

    /* renamed from: a, reason: collision with root package name */
    public final E f65901a;

    /* renamed from: b, reason: collision with root package name */
    public final C6478h f65902b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65903c;

    public z(E sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f65901a = sink;
        this.f65902b = new C6478h();
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i A() {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f65902b.size();
        if (size > 0) {
            this.f65901a.write(this.f65902b, size);
        }
        return this;
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i I0(long j10) {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.I0(j10);
        return W();
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i T0(k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.T0(byteString);
        return W();
    }

    @Override // ti.InterfaceC6479i
    public OutputStream U1() {
        return new a();
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i W() {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        long B10 = this.f65902b.B();
        if (B10 > 0) {
            this.f65901a.write(this.f65902b, B10);
        }
        return this;
    }

    @Override // ti.InterfaceC6479i
    public long Y(G source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long read = source.read(this.f65902b, 8192L);
            if (read == -1) {
                return j10;
            }
            j10 += read;
            W();
        }
    }

    @Override // ti.E, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f65903c) {
            return;
        }
        try {
            if (this.f65902b.size() > 0) {
                E e10 = this.f65901a;
                C6478h c6478h = this.f65902b;
                e10.write(c6478h, c6478h.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f65901a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f65903c = true;
        if (th != null) {
            throw th;
        }
    }

    public InterfaceC6479i d(int i10) {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.q2(i10);
        return W();
    }

    @Override // ti.InterfaceC6479i, ti.E, java.io.Flushable
    public void flush() {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        if (this.f65902b.size() > 0) {
            E e10 = this.f65901a;
            C6478h c6478h = this.f65902b;
            e10.write(c6478h, c6478h.size());
        }
        this.f65901a.flush();
    }

    @Override // ti.InterfaceC6479i
    public C6478h h() {
        return this.f65902b;
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i h0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.h0(string);
        return W();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f65903c;
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i q0(String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.q0(string, i10, i11);
        return W();
    }

    @Override // ti.E
    public H timeout() {
        return this.f65901a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f65901a + ')';
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i u1(long j10) {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.u1(j10);
        return W();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f65902b.write(source);
        W();
        return write;
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i writeByte(int i10) {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.writeByte(i10);
        return W();
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i writeInt(int i10) {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.writeInt(i10);
        return W();
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i writeShort(int i10) {
        if (this.f65903c) {
            throw new IllegalStateException("closed");
        }
        this.f65902b.writeShort(i10);
        return W();
    }

    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            z.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            z zVar = z.this;
            if (zVar.f65903c) {
                return;
            }
            zVar.flush();
        }

        public String toString() {
            return z.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            z zVar = z.this;
            if (zVar.f65903c) {
                throw new IOException("closed");
            }
            zVar.f65902b.writeByte((byte) i10);
            z.this.W();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            z zVar = z.this;
            if (!zVar.f65903c) {
                zVar.f65902b.write(data, i10, i11);
                z.this.W();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // ti.E
    public void write(C6478h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f65903c) {
            this.f65902b.write(source, j10);
            W();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f65903c) {
            this.f65902b.write(source);
            return W();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ti.InterfaceC6479i
    public InterfaceC6479i write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f65903c) {
            this.f65902b.write(source, i10, i11);
            return W();
        }
        throw new IllegalStateException("closed");
    }
}
