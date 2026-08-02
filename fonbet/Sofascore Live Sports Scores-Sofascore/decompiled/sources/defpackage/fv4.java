package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fv4 implements poh {
    public final ev4 a;
    public poh b;

    public fv4(ev4 ev4Var) {
        this.a = ev4Var;
    }

    @Override // defpackage.poh
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.poh
    public final String b(SSLSocket sSLSocket) {
        poh d = d(sSLSocket);
        if (d != null) {
            return d.b(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.poh
    public final void c(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        poh d = d(sSLSocket);
        if (d != null) {
            d.c(sSLSocket, str, list);
        }
    }

    public final synchronized poh d(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.d(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.poh
    public final boolean isSupported() {
        return true;
    }
}
