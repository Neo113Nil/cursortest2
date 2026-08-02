package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ue4 extends InputStream {
    public final re4 a;
    public final xe4 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public ue4(re4 re4Var, xe4 xe4Var) {
        this.a = re4Var;
        this.b = xe4Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        z1a.E(!this.e);
        boolean z = this.d;
        re4 re4Var = this.a;
        if (!z) {
            re4Var.b(this.b);
            this.d = true;
        }
        int read = re4Var.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}
