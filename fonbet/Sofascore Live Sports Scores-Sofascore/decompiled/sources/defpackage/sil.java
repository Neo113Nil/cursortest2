package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sil {
    public final String a;
    public final gv9 b;
    public final gv9 c;

    static {
        ypa.a(ysa.c, new wel(4));
    }

    public sil(gv9 gv9Var, gv9 gv9Var2, String str) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = str;
        this.b = gv9Var;
        this.c = gv9Var2;
    }

    public static sil a(sil silVar, String str, gv9 gv9Var, gv9 gv9Var2, int i) {
        if ((i & 1) != 0) {
            str = silVar.a;
        }
        if ((i & 2) != 0) {
            gv9Var = silVar.b;
        }
        silVar.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        return new sil(gv9Var, gv9Var2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sil)) {
            return false;
        }
        sil silVar = (sil) obj;
        return Intrinsics.c(this.a, silVar.a) && Intrinsics.c(this.b, silVar.b) && Intrinsics.c(this.c, silVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ljg.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "WorldCupStandingsUiModel(selectedGroup=" + this.a + ", groups=" + this.b + ", rows=" + this.c + ")";
    }
}
