package co.nstant.in.cbor.decoder;

import g3.C4319a;
import g3.C4320b;
import h3.AbstractC4437f;
import h3.C4442k;
import h3.C4449r;
import java.io.InputStream;

/* loaded from: classes.dex */
public class f extends a {
    public f(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public C4442k g(int i10) {
        long b10 = b(i10);
        return b10 == -1 ? i() : h(b10);
    }

    public final C4442k h(long j10) {
        C4442k c4442k = new C4442k(d(j10));
        for (long j11 = 0; j11 < j10; j11++) {
            AbstractC4437f e10 = this.f27894b.e();
            AbstractC4437f e11 = this.f27894b.e();
            if (e10 == null || e11 == null) {
                throw new C4320b("Unexpected end of stream");
            }
            if (this.f27894b.k() && c4442k.h(e10) != null) {
                throw new C4320b("Duplicate key found in map");
            }
            c4442k.j(e10, e11);
        }
        return c4442k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        throw new g3.C4320b("Unexpected end of stream");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4442k i() {
        C4442k c4442k = new C4442k();
        c4442k.g(true);
        if (this.f27894b.i()) {
            while (true) {
                AbstractC4437f e10 = this.f27894b.e();
                if (C4449r.f47680d.equals(e10)) {
                    break;
                }
                AbstractC4437f e11 = this.f27894b.e();
                if (e10 == null || e11 == null) {
                    break;
                }
                if (this.f27894b.k() && c4442k.h(e10) != null) {
                    throw new C4320b("Duplicate key found in map");
                }
                c4442k.j(e10, e11);
            }
        }
        return c4442k;
    }
}
