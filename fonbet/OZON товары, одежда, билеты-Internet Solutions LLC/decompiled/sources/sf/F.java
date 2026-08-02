package sf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class F implements InterfaceC9682h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final K f98662a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C9681g f98663b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f98664c;

    public F(@NotNull K sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f98662a = sink;
        this.f98663b = new C9681g();
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h P0() {
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        C9681g c9681g = this.f98663b;
        long size = c9681g.size();
        if (size > 0) {
            this.f98662a.z0(c9681g, size);
        }
        return this;
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h P1(int i11, int i12, @NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.D0(i11, i12, string);
        c();
        return this;
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h Q1(@NotNull C9684j byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.X(byteString);
        c();
        return this;
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h U(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.Z(source);
        c();
        return this;
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h Y(long j11) {
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.l0(j11);
        c();
        return this;
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h Y1(int i11, int i12, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.b0(source, i11, i12);
        c();
        return this;
    }

    @NotNull
    public final InterfaceC9682h c() {
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        C9681g c9681g = this.f98663b;
        long j11 = c9681g.j();
        if (j11 > 0) {
            this.f98662a.z0(c9681g, j11);
        }
        return this;
    }

    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        K k11 = this.f98662a;
        C9681g c9681g = this.f98663b;
        if (this.f98664c) {
            return;
        }
        try {
            if (c9681g.size() > 0) {
                k11.z0(c9681g, c9681g.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            k11.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f98664c = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public final OutputStream d() {
        return new a();
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final C9681g f() {
        return this.f98663b;
    }

    @Override // sf.InterfaceC9682h, sf.K, java.io.Flushable
    public final void flush() {
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        C9681g c9681g = this.f98663b;
        long size = c9681g.size();
        K k11 = this.f98662a;
        if (size > 0) {
            k11.z0(c9681g, c9681g.size());
        }
        k11.flush();
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h h0(int i11) {
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.d0(i11);
        c();
        return this;
    }

    @Override // sf.InterfaceC9682h
    @NotNull
    public final InterfaceC9682h h1(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.H0(string);
        c();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f98664c;
    }

    @NotNull
    public final InterfaceC9682h j(int i11) {
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.r0(i11);
        c();
        return this;
    }

    @Override // sf.K
    @NotNull
    public final N timeout() {
        return this.f98662a.timeout();
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.f98662a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f98663b.write(source);
        c();
        return write;
    }

    @Override // sf.InterfaceC9682h
    public final long y0(@NotNull M source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j11 = 0;
        while (true) {
            long read = source.read(this.f98663b, 8192L);
            if (read == -1) {
                return j11;
            }
            j11 += read;
            c();
        }
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f98664c) {
            throw new IllegalStateException("closed");
        }
        this.f98663b.z0(source, j11);
        c();
    }

    /* loaded from: classes10.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            F.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            F f7 = F.this;
            if (f7.f98664c) {
                return;
            }
            f7.flush();
        }

        @NotNull
        public final String toString() {
            return F.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i11) {
            F f7 = F.this;
            if (f7.f98664c) {
                throw new IOException("closed");
            }
            f7.f98663b.d0((byte) i11);
            f7.c();
        }

        @Override // java.io.OutputStream
        public final void write(@NotNull byte[] data, int i11, int i12) {
            Intrinsics.checkNotNullParameter(data, "data");
            F f7 = F.this;
            if (!f7.f98664c) {
                f7.f98663b.b0(data, i11, i12);
                f7.c();
                return;
            }
            throw new IOException("closed");
        }
    }
}
