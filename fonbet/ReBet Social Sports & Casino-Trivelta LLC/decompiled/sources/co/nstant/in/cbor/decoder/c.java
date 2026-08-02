package co.nstant.in.cbor.decoder;

import g3.C4319a;
import g3.C4320b;
import h3.AbstractC4437f;
import h3.C4435d;
import h3.C4449r;
import h3.EnumC4441j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c extends a {
    public c(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public C4435d g(int i10) {
        long b10 = b(i10);
        if (b10 != -1) {
            return h(b10);
        }
        if (this.f27894b.h()) {
            return i();
        }
        C4435d c4435d = new C4435d(null);
        c4435d.g(true);
        return c4435d;
    }

    public final C4435d h(long j10) {
        return new C4435d(a(j10));
    }

    public final C4435d i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            AbstractC4437f e10 = this.f27894b.e();
            if (e10 == null) {
                throw new C4320b("Unexpected end of stream");
            }
            EnumC4441j a10 = e10.a();
            if (C4449r.f47680d.equals(e10)) {
                return new C4435d(byteArrayOutputStream.toByteArray());
            }
            if (a10 != EnumC4441j.BYTE_STRING) {
                throw new C4320b("Unexpected major type " + a10);
            }
            byte[] h10 = ((C4435d) e10).h();
            if (h10 != null) {
                byteArrayOutputStream.write(h10, 0, h10.length);
            }
        }
    }
}
