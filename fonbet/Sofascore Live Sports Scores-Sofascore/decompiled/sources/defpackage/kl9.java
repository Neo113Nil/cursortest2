package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kl9 {
    public final String a;
    public final int b;
    public final String c;

    public kl9(b10 b10Var) {
        String str = (String) b10Var.c;
        this.a = (String) b10Var.d;
        int i = b10Var.b;
        this.b = i == -1 ? str.equals("http") ? 80 : str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1 : i;
        this.c = b10Var.toString();
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kl9) && ((kl9) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
