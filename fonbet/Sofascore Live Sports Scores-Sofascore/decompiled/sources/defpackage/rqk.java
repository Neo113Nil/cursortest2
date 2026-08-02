package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rqk {
    public static final rqk c = new rqk(-1, -1);
    public final long a;
    public final long b;

    public rqk(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rqk.class != obj.getClass()) {
            return false;
        }
        rqk rqkVar = (rqk) obj;
        return this.a == rqkVar.a && this.b == rqkVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }
}
