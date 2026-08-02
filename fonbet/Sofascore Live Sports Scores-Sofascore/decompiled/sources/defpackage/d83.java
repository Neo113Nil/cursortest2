package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d83 implements l83 {
    public final tee a;
    public final tee b;
    public final Set c;
    public final Set d;

    public d83(tee teeVar, tee teeVar2, Set set, Set set2) {
        teeVar.getClass();
        teeVar2.getClass();
        set.getClass();
        set2.getClass();
        this.a = teeVar;
        this.b = teeVar2;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d83)) {
            return false;
        }
        d83 d83Var = (d83) obj;
        return Intrinsics.c(this.a, d83Var.a) && Intrinsics.c(this.b, d83Var.b) && Intrinsics.c(this.c, d83Var.c) && Intrinsics.c(this.d, d83Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FootballShotmapRow(offTarget=" + this.a + ", onTarget=" + this.b + ", offTargetWinners=" + this.c + ", onTargetWinners=" + this.d + ")";
    }
}
