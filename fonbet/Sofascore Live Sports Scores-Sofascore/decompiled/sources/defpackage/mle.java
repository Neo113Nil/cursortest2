package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mle {
    public final UniqueTournament a;
    public final String b;
    public final String c;
    public final String d;

    public mle(UniqueTournament uniqueTournament, String str, String str2, String str3) {
        uniqueTournament.getClass();
        str.getClass();
        str2.getClass();
        this.a = uniqueTournament;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mle)) {
            return false;
        }
        mle mleVar = (mle) obj;
        return Intrinsics.c(this.a, mleVar.a) && Intrinsics.c(this.b, mleVar.b) && Intrinsics.c(this.c, mleVar.c) && Intrinsics.c(this.d, mleVar.d);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentSeasonSelection(uniqueTournament=");
        sb.append(this.a);
        sb.append(", year=");
        sb.append(this.b);
        sb.append(", subSeasonType=");
        return fc6.o(sb, this.c, ", statType=", this.d, ")");
    }
}
