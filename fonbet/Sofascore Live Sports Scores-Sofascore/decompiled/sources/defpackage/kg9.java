package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kg9 extends hg9 {
    public long e;
    public final /* synthetic */ mg9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg9(mg9 mg9Var, jl9 jl9Var, long j) {
        super(mg9Var, jl9Var);
        jl9Var.getClass();
        this.f = mg9Var;
        this.e = j;
        if (j == 0) {
            e(q89.b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.c) {
            return;
        }
        if (this.e != 0) {
            TimeZone timeZone = yol.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = yol.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f.b.a();
                e(mg9.f);
            }
        }
        this.c = true;
    }

    @Override // defpackage.hg9, defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        long j2 = this.e;
        if (j2 == 0) {
            return -1L;
        }
        long read = super.read(x52Var, Math.min(j2, j));
        if (read == -1) {
            this.f.b.a();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            e(mg9.f);
            throw protocolException;
        }
        long j3 = this.e - read;
        this.e = j3;
        if (j3 == 0) {
            e(q89.b);
        }
        return read;
    }
}
