package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dmj {
    public final int a;
    public final Double b;

    public dmj(int i, Double d) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmj)) {
            return false;
        }
        dmj dmjVar = (dmj) obj;
        return this.a == dmjVar.a && Intrinsics.c(this.b, dmjVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Double d = this.b;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "TopPlayerInfo(playerId=" + this.a + ", rating=" + this.b + ")";
    }
}
