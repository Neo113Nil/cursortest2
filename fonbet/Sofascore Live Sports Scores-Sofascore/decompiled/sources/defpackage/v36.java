package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v36 {
    public final String a;
    public final long b;
    public final Map c;

    public v36(long j, String str, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v36)) {
            return false;
        }
        v36 v36Var = (v36) obj;
        return this.a.equals(v36Var.a) && this.b == v36Var.b && Intrinsics.c(this.c, v36Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ljg.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(sessionId=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", additionalCustomKeys=");
        return dmi.s(sb, this.c, ')');
    }
}
