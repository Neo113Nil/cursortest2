package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class em {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final gv9 e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public em(int i, int i2, int i3, int i4, gv9 gv9Var, boolean z, String str, boolean z2) {
        gv9Var.getClass();
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = gv9Var;
        this.f = z;
        this.g = str;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return this.a == emVar.a && this.b == emVar.b && this.c == emVar.c && this.d == emVar.d && Intrinsics.c(this.e, emVar.e) && this.f == emVar.f && Intrinsics.c(this.g, emVar.g) && this.h == emVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + dmi.c(dmi.e(ljg.d(wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "AiInsightsLockedScreenUiState(iconRes=", ", titleRes=", ", descriptionRes=");
        me4.q(s, this.c, ", buttonTextRes=", this.d, ", bulletPoints=");
        s.append(this.e);
        s.append(", hasViewAllPlansButton=");
        s.append(this.f);
        s.append(", perMonthString=");
        s.append(this.g);
        s.append(", hasLearnMore=");
        s.append(this.h);
        s.append(")");
        return s.toString();
    }
}
