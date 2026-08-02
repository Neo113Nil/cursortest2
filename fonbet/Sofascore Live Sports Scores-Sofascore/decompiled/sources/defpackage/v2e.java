package defpackage;

import com.appsflyer.internal.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v2e implements w2e {
    public final int a;
    public final String b;

    public v2e(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2e)) {
            return false;
        }
        v2e v2eVar = (v2e) obj;
        return this.a == v2eVar.a && this.b.equals(v2eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "SeeAll(uniqueTournamentId=", ", uniqueTournamentName=", this.b, ")");
    }
}
