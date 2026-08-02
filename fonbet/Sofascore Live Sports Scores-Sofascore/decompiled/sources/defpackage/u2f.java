package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u2f {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Integer f;

    static {
        ypa.b(new bxe(22));
    }

    public u2f(int i, String str, int i2, int i3, boolean z, Integer num) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2f)) {
            return false;
        }
        u2f u2fVar = (u2f) obj;
        return this.a == u2fVar.a && Intrinsics.c(this.b, u2fVar.b) && this.c == u2fVar.c && this.d == u2fVar.d && this.e == u2fVar.e && Intrinsics.c(this.f, u2fVar.f);
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.d, wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e);
        Integer num = this.f;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "PowerRankingUiModel(teamId=", ", teamName=", this.b, ", rank=");
        me4.q(t, this.c, ", points=", this.d, ", isDisabled=");
        t.append(this.e);
        t.append(", rankDiff=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }
}
