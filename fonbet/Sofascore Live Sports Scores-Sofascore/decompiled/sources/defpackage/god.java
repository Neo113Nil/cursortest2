package defpackage;

import java.util.EnumSet;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class god extends kda {
    public static final hk3 n;
    public static final e3c o;
    public final rrb b;
    public SSLSocketFactory f;
    public final omf c = j0l.d;
    public final e3c d = o;
    public final e3c e = new e3c(n49.q, 12);
    public final hk3 g = n;
    public final int h = 1;
    public final long i = Long.MAX_VALUE;
    public final long j = n49.l;
    public final int k = 65535;
    public final int l = 4194304;
    public final int m = Integer.MAX_VALUE;

    static {
        Logger.getLogger(god.class.getName());
        fk3 fk3Var = new fk3(hk3.e);
        fk3Var.c(uu2.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, uu2.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, uu2.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, uu2.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, uu2.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, uu2.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        fk3Var.e(mjj.TLS_1_2);
        if (!fk3Var.a) {
            a70.r("no TLS extensions for cleartext connections");
            return;
        }
        fk3Var.d = true;
        n = new hk3(fk3Var);
        o = new e3c(new inb(29), 12);
        EnumSet.of(kjj.a, kjj.b);
    }

    public god(String str) {
        this.b = new rrb(str, new d4a(this, 9), new bka(this, 8));
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.b, "delegate");
        return I.toString();
    }
}
