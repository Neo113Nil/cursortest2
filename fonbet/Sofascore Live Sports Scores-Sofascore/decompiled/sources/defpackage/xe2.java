package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xe2 implements cwh {
    public boolean a;
    public final /* synthetic */ l62 b;
    public final /* synthetic */ n72 c;
    public final /* synthetic */ kof d;

    public xe2(l62 l62Var, n72 n72Var, kof kofVar) {
        this.b = l62Var;
        this.c = n72Var;
        this.d = kofVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!this.a) {
            TimeZone timeZone = yol.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = yol.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.a = true;
                this.c.a();
            }
        }
        this.b.close();
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        try {
            long read = this.b.read(x52Var, j);
            kof kofVar = this.d;
            if (read != -1) {
                x52Var.p(kofVar.b, x52Var.b - read, read);
                kofVar.k();
                return read;
            }
            if (!this.a) {
                this.a = true;
                kofVar.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.a) {
                throw e;
            }
            this.a = true;
            this.c.a();
            throw e;
        }
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.b.timeout();
    }
}
