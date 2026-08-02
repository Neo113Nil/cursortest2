package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c5j implements re4 {
    public final re4 a;
    public final oe2 b;
    public boolean c;
    public long d;

    public c5j(re4 re4Var, oe2 oe2Var) {
        re4Var.getClass();
        this.a = re4Var;
        oe2Var.getClass();
        this.b = oe2Var;
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        long b = this.a.b(xe4Var);
        this.d = b;
        if (b == 0) {
            return 0L;
        }
        if (xe4Var.g == -1 && b != -1) {
            xe4Var = xe4Var.c(0L, b);
        }
        int i = xe4Var.i;
        this.c = true;
        oe2 oe2Var = this.b;
        oe2Var.getClass();
        xe4Var.h.getClass();
        if (xe4Var.g == -1 && (i & 2) == 2) {
            oe2Var.c = null;
        } else {
            oe2Var.c = xe4Var;
            oe2Var.d = (i & 4) == 4 ? oe2Var.b : Long.MAX_VALUE;
            oe2Var.h = 0L;
            try {
                oe2Var.b(xe4Var);
            } catch (IOException e) {
                throw new ne2(e);
            }
        }
        return this.d;
    }

    @Override // defpackage.re4
    public final void close() {
        oe2 oe2Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (oe2Var.c == null) {
                    return;
                }
                try {
                    oe2Var.a();
                } catch (IOException e) {
                    throw new ne2(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (oe2Var.c != null) {
                    try {
                        oe2Var.a();
                    } catch (IOException e2) {
                        throw new ne2(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.re4
    public final void f(tn4 tn4Var) {
        tn4Var.getClass();
        this.a.f(tn4Var);
    }

    @Override // defpackage.re4
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            oe2 oe2Var = this.b;
            xe4 xe4Var = oe2Var.c;
            if (xe4Var != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (oe2Var.g == oe2Var.d) {
                            oe2Var.a();
                            oe2Var.b(xe4Var);
                        }
                        int min = (int) Math.min(read - i3, oe2Var.d - oe2Var.g);
                        OutputStream outputStream = oe2Var.f;
                        String str = nik.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        oe2Var.g += j;
                        oe2Var.h += j;
                    } catch (IOException e) {
                        throw new ne2(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - read;
            }
        }
        return read;
    }
}
