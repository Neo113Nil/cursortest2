package sf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC9683i extends M, ReadableByteChannel {
    long F0(@NotNull C9684j c9684j) throws IOException;

    @NotNull
    String G0() throws IOException;

    int R0(@NotNull C9674B c9674b) throws IOException;

    void a0(@NotNull C9681g c9681g, long j11) throws IOException;

    @NotNull
    InputStream a2();

    long b1(byte b11, long j11, long j12) throws IOException;

    @NotNull
    C9681g f();

    @NotNull
    byte[] g0() throws IOException;

    boolean n(long j11) throws IOException;

    long n0(@NotNull C9684j c9684j) throws IOException;

    long o1(@NotNull InterfaceC9682h interfaceC9682h) throws IOException;

    @NotNull
    G peek();

    void r1(long j11) throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j11) throws IOException;

    @NotNull
    String t0(@NotNull Charset charset) throws IOException;

    @NotNull
    C9684j v0() throws IOException;

    boolean w1(long j11, @NotNull C9684j c9684j) throws IOException;
}
