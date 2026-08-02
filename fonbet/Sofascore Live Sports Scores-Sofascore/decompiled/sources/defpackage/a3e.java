package defpackage;

import com.appsflyer.internal.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a3e implements b3e {
    public final int a;
    public final String b;
    public final String c;

    public a3e(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = ljg.j(i, "TournamentUiModel: ");
    }

    @Override // defpackage.b3e
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3e)) {
            return false;
        }
        a3e a3eVar = (a3e) obj;
        return this.a == a3eVar.a && this.b.equals(a3eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "TournamentUiModel(uniqueTournamentId=", ", name=", this.b, ")");
    }
}
