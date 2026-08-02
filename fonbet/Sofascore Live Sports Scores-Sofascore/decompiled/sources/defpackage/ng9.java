package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ng9 implements cwh {
    public final lof a;
    public int b;
    public byte c;
    public int d;
    public int e;
    public short f;

    public ng9(lof lofVar) {
        this.a = lofVar;
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.e;
            lof lofVar = this.a;
            if (i2 == 0) {
                lofVar.skip(this.f);
                this.f = (short) 0;
                if ((this.c & 4) == 0) {
                    i = this.d;
                    int c = sg9.c(lofVar);
                    this.e = c;
                    this.b = c;
                    byte readByte = (byte) (lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    this.c = (byte) (lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    Logger logger = sg9.a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(og9.a(true, this.d, this.b, readByte, this.c));
                    }
                    readInt = lofVar.readInt() & Integer.MAX_VALUE;
                    this.d = readInt;
                    if (readByte != 9) {
                        sg9.a("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                }
            } else {
                long read = lofVar.read(x52Var, Math.min(j, i2));
                if (read != -1) {
                    this.e -= (int) read;
                    return read;
                }
            }
            return -1L;
        } while (readInt == i);
        sg9.a("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.a.a.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
