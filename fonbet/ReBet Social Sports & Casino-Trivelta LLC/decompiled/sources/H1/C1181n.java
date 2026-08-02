package H1;

import H1.O;
import b1.InterfaceC2358l;
import java.io.EOFException;

/* renamed from: H1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181n implements O {
    private final byte[] readBuffer = new byte[4096];

    @Override // H1.O
    public int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11) {
        int read = interfaceC2358l.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // H1.O
    public void f(e1.J j10, int i10, int i11) {
        j10.c0(i10);
    }

    @Override // H1.O
    public void c(androidx.media3.common.a aVar) {
    }

    @Override // H1.O
    public void g(long j10, int i10, int i11, int i12, O.a aVar) {
    }
}
