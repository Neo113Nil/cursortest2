package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o8k implements Serializable {
    public static final o8k c;
    public static final LinkedHashMap d;
    public final String a;
    public final int b;

    static {
        o8k o8kVar = new o8k("http", 80);
        c = o8kVar;
        List j = b.j(o8kVar, new o8k(HttpRequest.DEFAULT_SCHEME, 443), new o8k("ws", 80), new o8k("wss", 443), new o8k("socks", 1080));
        int c2 = sub.c(k13.r(j, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        for (Object obj : j) {
            linkedHashMap.put(((o8k) obj).a, obj);
        }
        d = linkedHashMap;
    }

    public o8k(String str, int i) {
        this.a = str;
        this.b = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.toLowerCase(charAt) != charAt) {
                a70.p("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8k)) {
            return false;
        }
        o8k o8kVar = (o8k) obj;
        return this.a.equals(o8kVar.a) && this.b == o8kVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.a);
        sb.append(", defaultPort=");
        return wv8.j(sb, this.b, ')');
    }
}
