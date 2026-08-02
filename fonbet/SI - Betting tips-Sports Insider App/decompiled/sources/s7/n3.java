package s7;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n3 extends k3 {
    public static final boolean m(String str) {
        String str2 = (String) x.f23217t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(StringUtils.COMMA)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m3 k(String str) {
        f1 f1Var = (f1) this.f3328a;
        r3 r3Var = this.f22859b;
        j jVar = r3Var.f22989c;
        z0 z0Var = r3Var.f22987a;
        r3.U(jVar);
        s0 l02 = jVar.l0(str);
        k2 k2Var = k2.GOOGLE_ANALYTICS;
        m3 m3Var = null;
        if (l02 == null || !l02.y()) {
            return new m3(l(str), Collections.EMPTY_MAP, k2Var, null);
        }
        com.google.android.gms.internal.measurement.o3 q = com.google.android.gms.internal.measurement.p3.q();
        q.b();
        ((com.google.android.gms.internal.measurement.p3) q.f5041b).v(2);
        int c2 = androidx.appcompat.widget.c1.c(l02.t());
        if (c2 == 0) {
            throw new NullPointerException("null reference");
        }
        q.i(c2);
        String E = l02.E();
        r3.U(z0Var);
        com.google.android.gms.internal.measurement.e2 v5 = z0Var.v(str);
        if (v5 != null) {
            j jVar2 = r3Var.f22989c;
            r3.U(jVar2);
            s0 l03 = jVar2.l0(str);
            if (l03 != null) {
                if (!v5.D() || v5.E().p() != 100) {
                    v3 v3Var = f1Var.f22748i;
                    f1.k(v3Var);
                    if (!v3Var.L(str, l03.C())) {
                        if (!TextUtils.isEmpty(E)) {
                        }
                    }
                }
                String D = l02.D();
                q.b();
                ((com.google.android.gms.internal.measurement.p3) q.f5041b).v(2);
                r3.U(z0Var);
                com.google.android.gms.internal.measurement.e2 v10 = z0Var.v(l02.D());
                if (v10 == null || !v10.D()) {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22910n.b(D, "[sgtm] Missing sgtm_setting in remote config. appId");
                    q.b();
                    ((com.google.android.gms.internal.measurement.p3) q.f5041b).w(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(l02.C())) {
                        hashMap.put("x-gtm-server-preview", l02.C());
                    }
                    String q3 = v10.E().q();
                    int c8 = androidx.appcompat.widget.c1.c(l02.t());
                    if (c8 != 0 && c8 != 2) {
                        q.i(c8);
                    } else if (m(l02.D())) {
                        q.i(11);
                    } else if (TextUtils.isEmpty(q3)) {
                        q.i(12);
                    } else {
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22910n.b(D, "[sgtm] Eligible for client side upload. appId");
                        q.b();
                        ((com.google.android.gms.internal.measurement.p3) q.f5041b).v(3);
                        q.i(2);
                        m3Var = new m3(q3, hashMap, k2.SGTM_CLIENT, (com.google.android.gms.internal.measurement.p3) q.f());
                    }
                    v10.E().getClass();
                    v10.E().getClass();
                    f1Var.getClass();
                    n0 n0Var3 = f1Var.f22745f;
                    if (TextUtils.isEmpty(q3)) {
                        q.b();
                        ((com.google.android.gms.internal.measurement.p3) q.f5041b).w(6);
                        f1.m(n0Var3);
                        n0Var3.f22910n.b(l02.D(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        f1.m(n0Var3);
                        n0Var3.f22910n.b(D, "[sgtm] Eligible for local service direct upload. appId");
                        q.b();
                        ((com.google.android.gms.internal.measurement.p3) q.f5041b).v(5);
                        q.b();
                        ((com.google.android.gms.internal.measurement.p3) q.f5041b).w(2);
                        m3Var = new m3(q3, hashMap, k2.SGTM, (com.google.android.gms.internal.measurement.p3) q.f());
                    }
                }
                return m3Var != null ? m3Var : new m3(l(str), Collections.EMPTY_MAP, k2Var, (com.google.android.gms.internal.measurement.p3) q.f());
            }
        }
        q.b();
        ((com.google.android.gms.internal.measurement.p3) q.f5041b).w(3);
        return new m3(l(str), Collections.EMPTY_MAP, k2Var, (com.google.android.gms.internal.measurement.p3) q.f());
    }

    public final String l(String str) {
        z0 z0Var = this.f22859b.f22987a;
        r3.U(z0Var);
        String w10 = z0Var.w(str);
        if (TextUtils.isEmpty(w10)) {
            return (String) x.f23213r.a(null);
        }
        Uri parse = Uri.parse((String) x.f23213r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(w10).length() + 1 + String.valueOf(authority).length());
        sb2.append(w10);
        sb2.append(".");
        sb2.append(authority);
        buildUpon.authority(sb2.toString());
        return buildUpon.build().toString();
    }
}
