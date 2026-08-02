package co.nstant.in.cbor.decoder;

import g3.C4319a;
import g3.C4320b;
import h3.AbstractC4437f;
import h3.C4434c;
import h3.C4449r;
import java.io.InputStream;

/* loaded from: classes.dex */
public class b extends a {
    public b(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public C4434c g(int i10) {
        long b10 = b(i10);
        return b10 == -1 ? i() : h(b10);
    }

    public final C4434c h(long j10) {
        C4434c c4434c = new C4434c(d(j10));
        for (long j11 = 0; j11 < j10; j11++) {
            AbstractC4437f e10 = this.f27894b.e();
            if (e10 == null) {
                throw new C4320b("Unexpected end of stream");
            }
            c4434c.h(e10);
        }
        return c4434c;
    }

    public final C4434c i() {
        C4434c c4434c = new C4434c();
        c4434c.g(true);
        if (!this.f27894b.g()) {
            return c4434c;
        }
        while (true) {
            AbstractC4437f e10 = this.f27894b.e();
            if (e10 == null) {
                throw new C4320b("Unexpected end of stream");
            }
            C4449r c4449r = C4449r.f47680d;
            if (c4449r.equals(e10)) {
                c4434c.h(c4449r);
                return c4434c;
            }
            c4434c.h(e10);
        }
    }
}
