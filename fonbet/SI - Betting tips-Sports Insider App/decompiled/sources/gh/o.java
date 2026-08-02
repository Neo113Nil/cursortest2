package gh;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o implements b, u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o f10271c = new o();

    /* renamed from: d, reason: collision with root package name */
    public static final o f10272d = new o();

    public static final j a(o oVar, String str) {
        j jVar = new j(str);
        j.f10214d.put(str, jVar);
        return jVar;
    }

    public static l0 b(int i5, b0 b0Var, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        hh.e.a(bArr.length, 0, i5);
        return new l0(i5, b0Var, bArr);
    }

    public static l0 c(String str, b0 b0Var) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset charset = Charsets.UTF_8;
        if (b0Var != null) {
            Regex regex = b0.f10117d;
            Charset a7 = b0Var.a(null);
            if (a7 == null) {
                b0Var = a0.b(b0Var + "; charset=utf-8");
            } else {
                charset = a7;
            }
        }
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return b(bytes.length, b0Var, bytes);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static t0 e(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return t0.f10310e;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return t0.f10309d;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return t0.f10308c;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return t0.f10311f;
            }
        } else if (javaName.equals("SSLv3")) {
            return t0.f10312g;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static h0 f(String protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        h0 h0Var = h0.f10198c;
        if (Intrinsics.areEqual(protocol, "http/1.0")) {
            return h0Var;
        }
        h0 h0Var2 = h0.f10199d;
        if (Intrinsics.areEqual(protocol, "http/1.1")) {
            return h0Var2;
        }
        h0 h0Var3 = h0.f10202g;
        if (Intrinsics.areEqual(protocol, "h2_prior_knowledge")) {
            return h0Var3;
        }
        h0 h0Var4 = h0.f10201f;
        if (Intrinsics.areEqual(protocol, "h2")) {
            return h0Var4;
        }
        h0 h0Var5 = h0.f10200e;
        if (Intrinsics.areEqual(protocol, "spdy/3.1")) {
            return h0Var5;
        }
        h0 h0Var6 = h0.f10203h;
        if (Intrinsics.areEqual(protocol, "quic")) {
            return h0Var6;
        }
        h0 h0Var7 = h0.f10204i;
        if (kotlin.text.z.o(protocol, "h3", false)) {
            return h0Var7;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }

    public static String g(String str) {
        if (kotlin.text.z.o(str, "TLS_", false)) {
            StringBuilder sb2 = new StringBuilder("SSL_");
            String substring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb2.append(substring);
            return sb2.toString();
        }
        if (!kotlin.text.z.o(str, "SSL_", false)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder("TLS_");
        String substring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb3.append(substring2);
        return sb3.toString();
    }

    public synchronized j d(String javaName) {
        j jVar;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = j.f10214d;
            jVar = (j) linkedHashMap.get(javaName);
            if (jVar == null) {
                jVar = (j) linkedHashMap.get(g(javaName));
                if (jVar == null) {
                    jVar = new j(javaName);
                }
                linkedHashMap.put(javaName, jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar;
    }
}
