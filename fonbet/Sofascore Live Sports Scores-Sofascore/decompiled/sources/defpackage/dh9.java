package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dh9 implements cwh {
    public final lof a;
    public int b;
    public int c;
    public int d;
    public int e;

    public dh9(lof lofVar) {
        this.a = lofVar;
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        int i;
        int readInt;
        x52Var.getClass();
        do {
            int i2 = this.d;
            lof lofVar = this.a;
            if (i2 == 0) {
                lofVar.skip(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int n = wol.n(lofVar);
                    this.d = n;
                    int readByte = lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    this.b = lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    Logger logger = eh9.d;
                    if (logger.isLoggable(Level.FINE)) {
                        gc2 gc2Var = rg9.a;
                        logger.fine(rg9.b(this.c, n, readByte, this.b, true));
                    }
                    readInt = lofVar.readInt() & Integer.MAX_VALUE;
                    this.c = readInt;
                    if (readByte != 9) {
                        is8.e(mz1.i(readByte, " != TYPE_CONTINUATION"));
                        return 0L;
                    }
                }
            } else {
                long read = lofVar.read(x52Var, Math.min(j, i2));
                if (read != -1) {
                    this.d -= (int) read;
                    return read;
                }
            }
            return -1L;
        } while (readInt == i);
        is8.e("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.a.a.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
