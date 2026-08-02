package defpackage;

import com.appsflyer.internal.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j4c implements k4c {
    public final int a;
    public final String b;

    public j4c(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4c)) {
            return false;
        }
        j4c j4cVar = (j4c) obj;
        return this.a == j4cVar.a && this.b.equals(j4cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "TeamMediaEntity(teamId=", ", sport=", this.b, ")");
    }
}
