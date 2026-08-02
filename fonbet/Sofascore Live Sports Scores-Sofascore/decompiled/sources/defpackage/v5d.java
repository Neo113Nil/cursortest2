package defpackage;

import com.ironsource.U3;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v5d {
    public static final Pattern e = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
    public final URI a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        new v5d();
    }

    public v5d(String str, String str2) {
        String lowerCase;
        if (str2 == null) {
            lowerCase = "nats://";
        } else {
            lowerCase = str2.toLowerCase();
            if (!lowerCase.endsWith("://")) {
                lowerCase = lowerCase.concat("://");
            }
        }
        String trim = str.trim();
        k1d b = b(trim, lowerCase, true);
        String scheme = ((URI) b.c).getScheme();
        String path = ((URI) b.c).getPath();
        if (scheme == null) {
            if (path == null) {
                throw new URISyntaxException(trim, "Unable to parse URI string.");
            }
            b = e((String) b.b, lowerCase);
            scheme = ((URI) b.c).getScheme();
            path = ((URI) b.c).getPath();
        }
        String host = ((URI) b.c).getHost();
        if (host == null) {
            if (path != null) {
                throw new URISyntaxException(trim, "Unable to parse URI string.");
            }
            b = e((String) b.b, lowerCase);
            scheme = ((URI) b.c).getScheme();
            host = ((URI) b.c).getHost();
        }
        if (host == null) {
            throw new URISyntaxException(trim, "Unable to parse URI string.");
        }
        String lowerCase2 = scheme.toLowerCase();
        if (!t4d.a.contains(lowerCase2)) {
            throw new URISyntaxException(trim, "Unsupported NATS URI scheme.");
        }
        if (!lowerCase2.equals(scheme)) {
            b.b = ((String) b.b).replace(scheme, lowerCase2);
        }
        if (((URI) b.c).getPort() == -1) {
            this.a = new URI(mz1.o(new StringBuilder(), (String) b.b, ":4222"));
        } else {
            this.a = new URI((String) b.b);
        }
        c();
    }

    public static k1d b(String str, String str2, boolean z) {
        try {
            k1d k1dVar = new k1d(1, false);
            k1dVar.b = str;
            k1dVar.c = new URI(str);
            return k1dVar;
        } catch (URISyntaxException e2) {
            if (z && e2.getMessage().contains("Illegal character in scheme name at index")) {
                return e(str, str2);
            }
            throw e2;
        }
    }

    public static k1d e(String str, String str2) {
        return b(str2 + str, str2, false);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        URI uri = this.a;
        sb.append(uri.getHost().toLowerCase());
        sb.append(":");
        sb.append(uri.getPort());
        return sb.toString();
    }

    public final void c() {
        URI uri = this.a;
        String lowerCase = uri.getScheme().toLowerCase();
        this.b = t4d.b.contains(lowerCase);
        this.c = t4d.c.contains(lowerCase);
        String host = uri.getHost();
        this.d = e.matcher(host).matches() || (host.startsWith(U3.j.d) && host.endsWith(U3.j.e));
    }

    public final v5d d(String str) {
        String str2;
        if (str.contains(":") && !str.startsWith(U3.j.d)) {
            str = lnb.o(U3.j.d, str, U3.j.e);
        }
        URI uri = this.a;
        if (uri.getRawUserInfo() == null) {
            str2 = uri.getScheme() + "://" + str + ":" + uri.getPort();
        } else {
            str2 = uri.getScheme() + "://" + uri.getRawUserInfo() + "@" + str + ":" + uri.getPort();
        }
        return new v5d(str2, uri.getScheme());
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof v5d) {
            obj = ((v5d) obj).a;
        }
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public v5d() {
        try {
            this.a = new URI("nats://localhost:4222");
            c();
        } catch (URISyntaxException e2) {
            is8.h(e2);
            throw null;
        }
    }
}
