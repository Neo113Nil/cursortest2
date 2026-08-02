package defpackage;

import com.sofascore.model.mvvm.model.Tournament;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class ebi implements Serializable {

    @NotNull
    public static final dbi Companion = new dbi();
    public final int a;
    public final Tournament b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ ebi(int i, int i2, Tournament tournament, String str, boolean z, boolean z2, boolean z3) {
        if (63 != (i & 63)) {
            oea.z(i, 63, cbi.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = tournament;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebi)) {
            return false;
        }
        ebi ebiVar = (ebi) obj;
        return this.a == ebiVar.a && Intrinsics.c(this.b, ebiVar.b) && Intrinsics.c(this.c, ebiVar.c) && this.d == ebiVar.d && this.e == ebiVar.e && this.f == ebiVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dmi.e(dmi.e(dmi.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StandingsTournamentRow(tableId=");
        sb.append(this.a);
        sb.append(", tournament=");
        sb.append(this.b);
        sb.append(", name=");
        dmi.w(sb, this.c, ", isLive=", this.d, ", isFirstItem=");
        return w1l.i(", hasStandingsTracker=", ")", sb, this.e, this.f);
    }

    public ebi(int i, Tournament tournament, String str, boolean z, boolean z2, boolean z3) {
        tournament.getClass();
        str.getClass();
        this.a = i;
        this.b = tournament;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
