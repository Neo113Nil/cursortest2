package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pl7 {
    public final int a;
    public final int b;
    public final String c;

    public pl7(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl7)) {
            return false;
        }
        pl7 pl7Var = (pl7) obj;
        return this.a == pl7Var.a && this.b == pl7Var.b && Intrinsics.c(this.c, pl7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return mz1.o(lnb.s(this.a, this.b, "FantasyTOTGWTeamData(id=", ", score=", ", nameCode="), this.c, ")");
    }
}
