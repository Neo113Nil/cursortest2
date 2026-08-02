package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zd7 {
    public final Integer a;
    public final int b;
    public final String c;
    public final gv9 d;

    public zd7(Integer num, int i, String str, gv9 gv9Var) {
        str.getClass();
        gv9Var.getClass();
        this.a = num;
        this.b = i;
        this.c = str;
        this.d = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd7)) {
            return false;
        }
        zd7 zd7Var = (zd7) obj;
        return this.a.equals(zd7Var.a) && this.b == zd7Var.b && Intrinsics.c(this.c, zd7Var.c) && Intrinsics.c(this.d, zd7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "FantasyPlayerRoundFixtures(roundId=" + this.a + ", roundSequence=" + this.b + ", roundName=" + this.c + ", fixtures=" + this.d + ")";
    }
}
