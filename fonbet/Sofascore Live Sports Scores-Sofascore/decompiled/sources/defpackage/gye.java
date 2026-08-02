package defpackage;

import com.sofascore.model.mvvm.model.ShirtColor;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gye implements Serializable {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Map g;
    public final ShirtColor h;
    public final ShirtColor i;
    public final ShirtColor j;
    public final ShirtColor k;
    public final boolean l;
    public final gv9 m;
    public final gv9 n;
    public final Pair o;

    public gye(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, LinkedHashMap linkedHashMap, ShirtColor shirtColor, ShirtColor shirtColor2, ShirtColor shirtColor3, ShirtColor shirtColor4, boolean z5, gv9 gv9Var, gv9 gv9Var2, Pair pair) {
        linkedHashMap.getClass();
        shirtColor.getClass();
        shirtColor2.getClass();
        shirtColor3.getClass();
        shirtColor4.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = linkedHashMap;
        this.h = shirtColor;
        this.i = shirtColor2;
        this.j = shirtColor3;
        this.k = shirtColor4;
        this.l = z5;
        this.m = gv9Var;
        this.n = gv9Var2;
        this.o = pair;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gye)) {
            return false;
        }
        gye gyeVar = (gye) obj;
        return this.a == gyeVar.a && this.b == gyeVar.b && this.c == gyeVar.c && this.d == gyeVar.d && this.e == gyeVar.e && this.f == gyeVar.f && Intrinsics.c(this.g, gyeVar.g) && Intrinsics.c(this.h, gyeVar.h) && Intrinsics.c(this.i, gyeVar.i) && Intrinsics.c(this.j, gyeVar.j) && Intrinsics.c(this.k, gyeVar.k) && this.l == gyeVar.l && Intrinsics.c(this.m, gyeVar.m) && Intrinsics.c(this.n, gyeVar.n) && Intrinsics.c(this.o, gyeVar.o);
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d(dmi.e((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + dmi.g(this.g, dmi.e(dmi.e(wv8.a(this.d, wv8.a(this.c, dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31)) * 31)) * 31)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n);
        Pair pair = this.o;
        return d + (pair == null ? 0 : pair.hashCode());
    }

    public final String toString() {
        StringBuilder k = w1l.k("PlayersAveragePositionsData(shouldShowAveragePositionsView=", this.a, ", hasEnoughData=", this.b, ", firstTeamId=");
        me4.q(k, this.c, ", secondTeamId=", this.d, ", hasFirstTeamSubstitutions=");
        vxd.t(", hasSecondTeamSubstitutions=", ", playerIdToShirtNumberMap=", k, this.e, this.f);
        k.append(this.g);
        k.append(", firstTeamColors=");
        k.append(this.h);
        k.append(", firstTeamGkColors=");
        k.append(this.i);
        k.append(", secondTeamColors=");
        k.append(this.j);
        k.append(", secondTeamGkColors=");
        k.append(this.k);
        k.append(", shouldReverseTeams=");
        k.append(this.l);
        k.append(", homeLineupsPlayerIds=");
        vxd.u(k, this.m, ", awayLineupsPlayerIds=", this.n, ", averagePositions=");
        k.append(this.o);
        k.append(")");
        return k.toString();
    }
}
