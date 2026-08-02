package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ey7 {
    public final int a;
    public final String b;
    public final String c;

    public ey7(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey7)) {
            return false;
        }
        ey7 ey7Var = (ey7) obj;
        return this.a == ey7Var.a && this.b.equals(ey7Var.b) && Intrinsics.c(this.c, ey7Var.c);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return mz1.o(dmi.t(this.a, "FeedSubTeam(id=", ", translatedShortName=", this.b, ", countryAlpha2="), this.c, ")");
    }
}
