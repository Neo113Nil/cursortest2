package co.nstant.in.cbor.decoder;

import g3.C4319a;
import g3.C4320b;
import h3.AbstractC4437f;
import h3.C4449r;
import h3.C4452u;
import h3.EnumC4441j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public class k extends a {
    public k(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
    }

    public C4452u g(int i10) {
        long b10 = b(i10);
        if (b10 != -1) {
            return h(b10);
        }
        if (this.f27894b.j()) {
            return i();
        }
        C4452u c4452u = new C4452u(null);
        c4452u.g(true);
        return c4452u;
    }

    public final C4452u h(long j10) {
        return new C4452u(new String(a(j10), StandardCharsets.UTF_8));
    }

    public final C4452u i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            AbstractC4437f e10 = this.f27894b.e();
            if (e10 == null) {
                throw new C4320b("Unexpected end of stream");
            }
            EnumC4441j a10 = e10.a();
            if (C4449r.f47680d.equals(e10)) {
                return new C4452u(new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8));
            }
            if (a10 != EnumC4441j.UNICODE_STRING) {
                throw new C4320b("Unexpected major type " + a10);
            }
            byte[] bytes = ((C4452u) e10).toString().getBytes(StandardCharsets.UTF_8);
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
    }
}
