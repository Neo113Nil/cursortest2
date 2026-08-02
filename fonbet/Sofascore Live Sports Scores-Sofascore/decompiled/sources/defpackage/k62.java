package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface k62 extends ejh, WritableByteChannel {
    k62 G(long j);

    long M0(cwh cwhVar);

    k62 R0(int i, int i2, byte[] bArr);

    k62 S(String str);

    @Override // defpackage.ejh, java.io.Flushable
    void flush();

    k62 i0(gc2 gc2Var);

    k62 t0(int i);

    x52 u();

    k62 write(byte[] bArr);

    k62 writeByte(int i);
}
