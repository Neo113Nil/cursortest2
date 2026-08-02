package ti;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: ti.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6479i extends E, WritableByteChannel {
    InterfaceC6479i A();

    InterfaceC6479i I0(long j10);

    InterfaceC6479i T0(k kVar);

    OutputStream U1();

    InterfaceC6479i W();

    long Y(G g10);

    @Override // ti.E, java.io.Flushable
    void flush();

    C6478h h();

    InterfaceC6479i h0(String str);

    InterfaceC6479i q0(String str, int i10, int i11);

    InterfaceC6479i u1(long j10);

    InterfaceC6479i write(byte[] bArr);

    InterfaceC6479i write(byte[] bArr, int i10, int i11);

    InterfaceC6479i writeByte(int i10);

    InterfaceC6479i writeInt(int i10);

    InterfaceC6479i writeShort(int i10);
}
