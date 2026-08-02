package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uod extends f7 {
    public final x52 a;

    public uod(x52 x52Var) {
        this.a = x52Var;
    }

    @Override // defpackage.f7
    public final int C() {
        try {
            return this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } catch (EOFException e) {
            zzl.r(e.getMessage());
            return 0;
        }
    }

    @Override // defpackage.f7
    public final int H() {
        return (int) this.a.b;
    }

    @Override // defpackage.f7
    public final void M(int i) {
        try {
            this.a.skip(i);
        } catch (EOFException e) {
            zzl.r(e.getMessage());
        }
    }

    @Override // defpackage.f7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.k();
    }

    @Override // defpackage.f7
    public final f7 m(int i) {
        x52 x52Var = new x52();
        x52Var.W(this.a, i);
        return new uod(x52Var);
    }

    @Override // defpackage.f7
    public final void n(OutputStream outputStream, int i) {
        this.a.e1(outputStream, i);
    }

    @Override // defpackage.f7
    public final void p(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f7
    public final void t(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int read = this.a.read(bArr, i, i2);
            if (read == -1) {
                zzl.r(lnb.k(i2, "EOF trying to read ", " bytes"));
                return;
            } else {
                i2 -= read;
                i += read;
            }
        }
    }
}
