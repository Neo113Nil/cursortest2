package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wak {
    public final int a;
    public final String b;
    public final List c;

    public wak(int i, String str, xbb xbbVar) {
        xbbVar.getClass();
        this.a = i;
        this.b = str;
        this.c = xbbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wak)) {
            return false;
        }
        wak wakVar = (wak) obj;
        return this.a == wakVar.a && Intrinsics.c(this.b, wakVar.b) && Intrinsics.c(this.c, wakVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return mz1.p(dmi.t(this.a, "UniqueTournamentSeasonsWrapper(uniqueTournamentId=", ", uniqueTournamentName=", this.b, ", seasons="), this.c, ")");
    }
}
