package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n4a implements qnf {
    public final InputStream a;

    public n4a(InputStream inputStream) {
        inputStream.getClass();
        this.a = inputStream;
    }

    @Override // defpackage.qnf
    public final long X(w52 w52Var, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            ogj.h(vxd.m("byteCount (", j, ") < 0"));
            return 0L;
        }
        try {
            a1h k = w52Var.k();
            byte[] bArr = k.a;
            long read = this.a.read(bArr, k.c, (int) Math.min(j, bArr.length - r4));
            int i = read == -1 ? 0 : (int) read;
            boolean z = true;
            if (i == 1) {
                k.c += i;
                w52Var.c += i;
                return read;
            }
            if (i >= 0) {
                int length = bArr.length;
                int i2 = k.c;
                if (i <= length - i2) {
                    if (i != 0) {
                        k.c = i2 + i;
                        w52Var.c += i;
                        return read;
                    }
                    if (k.a() != 0) {
                        z = false;
                    }
                    if (z) {
                        a1h a1hVar = w52Var.b;
                        a1hVar.getClass();
                        a1h a1hVar2 = a1hVar.g;
                        w52Var.b = a1hVar2;
                        if (a1hVar2 == null) {
                            w52Var.a = null;
                        } else {
                            a1hVar2.f = null;
                        }
                        a1hVar.g = null;
                        p1h.a(a1hVar);
                    }
                    return read;
                }
            }
            throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + (bArr.length - k.c)).toString());
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? StringsKt.J(message, "getsockname failed", false) : false) {
                    throw new IOException(e);
                }
            }
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "RawSource(" + this.a + ')';
    }
}
