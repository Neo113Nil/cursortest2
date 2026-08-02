package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ee6 extends jn8 {
    public final long b;
    public final boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ ge6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee6(ge6 ge6Var, ejh ejhVar, long j, boolean z) {
        super(ejhVar);
        ejhVar.getClass();
        this.h = ge6Var;
        this.b = j;
        this.c = z;
        this.f = z;
    }

    @Override // defpackage.jn8, defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        if (this.g) {
            a70.r("closed");
            return;
        }
        long j2 = this.b;
        if (j2 != -1 && this.e + j > j2) {
            throw new ProtocolException("expected " + this.b + " bytes but received " + (this.e + j));
        }
        try {
            if (this.f) {
                this.f = false;
                ((pof) this.h.c).d.getClass();
            }
            this.a.W(x52Var, j);
            this.e += j;
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }

    @Override // defpackage.jn8, defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        long j = this.b;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
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
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return ge6.a(this.h, this.c, iOException, 4);
    }

    @Override // defpackage.jn8, defpackage.ejh, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }
}
