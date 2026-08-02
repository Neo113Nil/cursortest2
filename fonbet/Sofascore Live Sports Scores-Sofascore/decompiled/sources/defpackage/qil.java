package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qil implements ril {
    public final int a;
    public final int b;
    public final String c;
    public final gv9 d;
    public final Integer e;
    public final String f;

    public qil(int i, int i2, String str, gv9 gv9Var, Integer num) {
        str.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = gv9Var;
        this.e = num;
        this.f = String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qil)) {
            return false;
        }
        qil qilVar = (qil) obj;
        return this.a == qilVar.a && this.b == qilVar.b && Intrinsics.c(this.c, qilVar.c) && Intrinsics.c(this.d, qilVar.d) && Intrinsics.c(this.e, qilVar.e);
    }

    @Override // defpackage.ril
    public final String getKey() {
        return this.f;
    }

    public final int hashCode() {
        int d = ljg.d(dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        Integer num = this.e;
        return d + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "WorldCupStandingsTeamRow(position=", ", teamId=", ", teamName=");
        s.append(this.c);
        s.append(", statValues=");
        s.append(this.d);
        s.append(", promotionColor=");
        return vxd.n(s, this.e, ")");
    }
}
