package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hk3 {
    public static final hk3 e;
    public final boolean a;
    public final String[] b;
    public final String[] c;
    public final boolean d;

    static {
        uu2[] uu2VarArr = {uu2.TLS_AES_128_GCM_SHA256, uu2.TLS_AES_256_GCM_SHA384, uu2.TLS_CHACHA20_POLY1305_SHA256, uu2.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, uu2.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, uu2.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, uu2.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, uu2.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, uu2.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, uu2.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, uu2.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, uu2.TLS_RSA_WITH_AES_128_GCM_SHA256, uu2.TLS_RSA_WITH_AES_256_GCM_SHA384, uu2.TLS_RSA_WITH_AES_128_CBC_SHA, uu2.TLS_RSA_WITH_AES_256_CBC_SHA, uu2.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        fk3 fk3Var = new fk3(true);
        fk3Var.c(uu2VarArr);
        mjj mjjVar = mjj.TLS_1_3;
        mjj mjjVar2 = mjj.TLS_1_2;
        fk3Var.e(mjjVar, mjjVar2);
        fk3Var.d = true;
        hk3 hk3Var = new hk3(fk3Var);
        e = hk3Var;
        mjj[] mjjVarArr = {mjjVar, mjjVar2, mjj.TLS_1_1, mjj.TLS_1_0};
        boolean z = hk3Var.a;
        if (!z) {
            a70.r("no TLS versions for cleartext connections");
            return;
        }
        if (mjjVarArr.length == 0) {
            a70.p("At least one TlsVersion is required");
            return;
        }
        String[] strArr = new String[mjjVarArr.length];
        for (int i = 0; i < mjjVarArr.length; i++) {
            strArr[i] = mjjVarArr[i].a;
        }
        if (z) {
            return;
        }
        a70.r("no TLS extensions for cleartext connections");
    }

    public hk3(fk3 fk3Var) {
        this.a = fk3Var.a;
        this.b = fk3Var.b;
        this.c = fk3Var.c;
        this.d = fk3Var.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hk3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        hk3 hk3Var = (hk3) obj;
        boolean z = hk3Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.b, hk3Var.b) && Arrays.equals(this.c, hk3Var.c) && this.d == hk3Var.d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.a) {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List unmodifiableList;
        mjj mjjVar;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.b;
        if (strArr == null) {
            unmodifiableList = null;
        } else {
            uu2[] uu2VarArr = new uu2[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                uu2VarArr[i] = str.startsWith("SSL_") ? uu2.valueOf("TLS_".concat(str.substring(4))) : uu2.valueOf(str);
            }
            String[] strArr2 = mik.a;
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) uu2VarArr.clone()));
        }
        StringBuilder q = wt3.q("ConnectionSpec(cipherSuites=", unmodifiableList == null ? "[use default]" : unmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.c;
        mjj[] mjjVarArr = new mjj[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                mjjVar = mjj.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                mjjVar = mjj.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                mjjVar = mjj.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                mjjVar = mjj.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    a70.p(dmi.q("Unexpected TLS version: ", str2));
                    return null;
                }
                mjjVar = mjj.SSL_3_0;
            }
            mjjVarArr[i2] = mjjVar;
        }
        String[] strArr4 = mik.a;
        q.append(Collections.unmodifiableList(Arrays.asList((Object[]) mjjVarArr.clone())));
        q.append(", supportsTlsExtensions=");
        return wt3.p(q, this.d, ")");
    }
}
