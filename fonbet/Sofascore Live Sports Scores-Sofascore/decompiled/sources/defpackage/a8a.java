package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a8a {
    public final String a;
    public final z7a b;
    public final long c;
    public final e8a d;

    public a8a(String str, z7a z7aVar, long j, t8a t8aVar) {
        this.a = str;
        this.b = z7aVar;
        this.c = j;
        this.d = t8aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a8a)) {
            return false;
        }
        a8a a8aVar = (a8a) obj;
        return sha.r(this.a, a8aVar.a) && sha.r(this.b, a8aVar.b) && this.c == a8aVar.c && sha.r(null, null) && sha.r(this.d, a8aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.d});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "description");
        I.e(this.b, "severity");
        I.c(this.c, "timestampNanos");
        I.e(null, "channelRef");
        I.e(this.d, "subchannelRef");
        return I.toString();
    }
}
