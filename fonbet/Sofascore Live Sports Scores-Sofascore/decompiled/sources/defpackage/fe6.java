package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fe6 extends kn8 {
    public final long b;
    public final boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ ge6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe6(ge6 ge6Var, cwh cwhVar, long j, boolean z) {
        super(cwhVar);
        cwhVar.getClass();
        this.h = ge6Var;
        this.b = j;
        this.c = z;
        this.e = true;
        if (j == 0) {
            e(null);
        }
    }

    @Override // defpackage.kn8, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
            e(null);
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }

    public final IOException e(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
            ((pof) this.h.c).d.getClass();
        }
        return ge6.a(this.h, this.c, iOException, 8);
    }

    @Override // defpackage.kn8, defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        if (this.g) {
            a70.r("closed");
            return 0L;
        }
        try {
            long read = delegate().read(x52Var, j);
            if (this.e) {
                this.e = false;
                ((pof) this.h.c).d.getClass();
            }
            if (read == -1) {
                e(null);
                return -1L;
            }
            long j2 = this.d + read;
            long j3 = this.b;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.b + " bytes but received " + j2);
            }
            this.d = j2;
            if (((ie6) this.h.e).e()) {
                e(null);
            }
            return read;
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }
}
