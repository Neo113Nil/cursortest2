package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface l62 extends cwh, ReadableByteChannel {
    String C0(Charset charset);

    gc2 G0();

    boolean I(long j, gc2 gc2Var);

    String K();

    int K0();

    long R(long j, gc2 gc2Var);

    InputStream W0();

    long b0();

    int c0(wvd wvdVar);

    String k0(long j);

    gc2 l0(long j);

    void o(long j);

    byte[] q0();

    byte readByte();

    boolean request(long j);

    void skip(long j);

    x52 u();

    boolean w();

    long y0(k62 k62Var);
}
