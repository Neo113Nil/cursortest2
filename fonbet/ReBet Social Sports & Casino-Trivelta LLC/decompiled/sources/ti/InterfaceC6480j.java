package ti;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: ti.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6480j extends G, ReadableByteChannel {
    byte[] B0(long j10);

    void E(C6478h c6478h, long j10);

    void G0(long j10);

    String G1();

    long K1(E e10);

    long N0(k kVar);

    k O0(long j10);

    byte[] W0();

    long W1();

    String X(long j10);

    boolean X0();

    InputStream X1();

    boolean b1(long j10, k kVar);

    int d0(w wVar);

    long d1();

    long f1(k kVar);

    C6478h h();

    InterfaceC6480j peek();

    String q1(Charset charset);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    boolean v0(long j10);

    k v1();

    C6478h y();

    String y0();
}
