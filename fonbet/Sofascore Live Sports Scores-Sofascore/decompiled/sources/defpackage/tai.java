package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class tai implements Serializable {

    @NotNull
    public static final sai Companion = new sai();
    public static final joa[] g = {null, null, null, ypa.a(ysa.b, new u9i(11)), null, null};
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final String e;
    public final boolean f;

    public /* synthetic */ tai(int i, boolean z, boolean z2, boolean z3, List list, String str, boolean z4) {
        if (63 != (i & 63)) {
            oea.z(i, 63, rai.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = str;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tai)) {
            return false;
        }
        tai taiVar = (tai) obj;
        return this.a == taiVar.a && this.b == taiVar.b && this.c == taiVar.c && Intrinsics.c(this.d, taiVar.d) && Intrinsics.c(this.e, taiVar.e) && this.f == taiVar.f;
    }

    public final int hashCode() {
        int d = dmi.d(dmi.e(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder k = w1l.k("StandingsSwitcherRow(homeAwayEnabled=", this.a, ", hasAmFootballStandingsSubtypes=", this.b, ", hasBucketSubtypes=");
        k.append(this.c);
        k.append(", types=");
        k.append(this.d);
        k.append(", selectedType=");
        k.append(this.e);
        k.append(", multipleTables=");
        k.append(this.f);
        k.append(")");
        return k.toString();
    }

    public tai(boolean z, boolean z2, boolean z3, ArrayList arrayList, String str, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = arrayList;
        this.e = str;
        this.f = z4;
    }
}
