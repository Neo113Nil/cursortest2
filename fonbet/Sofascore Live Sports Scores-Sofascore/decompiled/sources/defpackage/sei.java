package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sei implements qe4 {
    public final qe4 a;
    public long b;
    public Uri c;

    public sei(qe4 qe4Var) {
        qe4Var.getClass();
        this.a = qe4Var;
        this.c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.qe4
    public final void c(sn4 sn4Var) {
        sn4Var.getClass();
        this.a.c(sn4Var);
    }

    @Override // defpackage.qe4
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.qe4
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.qe4
    public final long k(we4 we4Var) {
        this.c = we4Var.a;
        Map map = Collections.EMPTY_MAP;
        qe4 qe4Var = this.a;
        long k = qe4Var.k(we4Var);
        Uri uri = qe4Var.getUri();
        uri.getClass();
        this.c = uri;
        qe4Var.getResponseHeaders();
        return k;
    }

    @Override // defpackage.fe4, defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
