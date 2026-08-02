package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tei implements re4 {
    public final re4 a;
    public long b;
    public Uri c;
    public Map d;

    public tei(re4 re4Var) {
        re4Var.getClass();
        this.a = re4Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        re4 re4Var = this.a;
        this.c = xe4Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return re4Var.b(xe4Var);
        } finally {
            Uri uri = re4Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = re4Var.getResponseHeaders();
        }
    }

    @Override // defpackage.re4
    public final void close() {
        this.a.close();
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
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
