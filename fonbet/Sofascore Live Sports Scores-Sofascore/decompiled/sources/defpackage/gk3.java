package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gk3 {
    public static final List e;
    public static final List f;
    public static final gk3 g;
    public static final gk3 h;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        tu2 tu2Var = tu2.r;
        tu2 tu2Var2 = tu2.s;
        tu2 tu2Var3 = tu2.t;
        tu2 tu2Var4 = tu2.l;
        tu2 tu2Var5 = tu2.n;
        tu2 tu2Var6 = tu2.m;
        tu2 tu2Var7 = tu2.o;
        tu2 tu2Var8 = tu2.q;
        tu2 tu2Var9 = tu2.p;
        List j = b.j(tu2Var, tu2Var2, tu2Var3, tu2Var4, tu2Var5, tu2Var6, tu2Var7, tu2Var8, tu2Var9);
        e = j;
        List j2 = b.j(tu2Var, tu2Var2, tu2Var3, tu2Var4, tu2Var5, tu2Var6, tu2Var7, tu2Var8, tu2Var9, tu2.j, tu2.k, tu2.h, tu2.i, tu2.f, tu2.g, tu2.e);
        f = j2;
        fk3 fk3Var = new fk3();
        tu2[] tu2VarArr = (tu2[]) j.toArray(new tu2[0]);
        fk3Var.b((tu2[]) Arrays.copyOf(tu2VarArr, tu2VarArr.length));
        ljj ljjVar = ljj.TLS_1_3;
        ljj ljjVar2 = ljj.TLS_1_2;
        fk3Var.d(ljjVar, ljjVar2);
        fk3Var.d = true;
        fk3Var.a();
        fk3 fk3Var2 = new fk3();
        tu2[] tu2VarArr2 = (tu2[]) j2.toArray(new tu2[0]);
        fk3Var2.b((tu2[]) Arrays.copyOf(tu2VarArr2, tu2VarArr2.length));
        fk3Var2.d(ljjVar, ljjVar2);
        fk3Var2.d = true;
        g = fk3Var2.a();
        fk3 fk3Var3 = new fk3();
        tu2[] tu2VarArr3 = (tu2[]) j2.toArray(new tu2[0]);
        fk3Var3.b((tu2[]) Arrays.copyOf(tu2VarArr3, tu2VarArr3.length));
        fk3Var3.d(ljjVar, ljjVar2, ljj.TLS_1_1, ljj.TLS_1_0);
        fk3Var3.d = true;
        fk3Var3.a();
        h = new gk3(false, false, null, null);
    }

    public gk3(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = wol.k(tu2.c, strArr, enabledCipherSuites);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            w5d w5dVar = w5d.a;
            w5dVar.getClass();
            enabledProtocols = wol.k(w5dVar, enabledProtocols2, strArr2);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        qe8 qe8Var = tu2.c;
        byte[] bArr = wol.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (qe8Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            a70.p("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            a70.p("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            a70.p("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            a70.p("At least one TLS version is required");
            return;
        }
        gk3 gk3Var = new gk3(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (gk3Var.c() != null) {
            sSLSocket.setEnabledProtocols(gk3Var.d);
        }
        if (gk3Var.b() != null) {
            sSLSocket.setEnabledCipherSuites(gk3Var.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(tu2.b.s(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            ljj.b.getClass();
            arrayList.add(ubf.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gk3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        gk3 gk3Var = (gk3) obj;
        boolean z = gk3Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, gk3Var.c) && Arrays.equals(this.d, gk3Var.d) && this.b == gk3Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return lnb.r(sb, this.b, ')');
    }
}
