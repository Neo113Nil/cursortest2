package defpackage;

import com.sofascore.results.event.odds.model.OddsEventUIModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cj {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final gv9 d;
    public final OddsEventUIModel e;
    public final String f;
    public final String g;
    public final boolean h;

    public cj(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, OddsEventUIModel oddsEventUIModel, String str, String str2, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = gv9Var4;
        this.e = oddsEventUIModel;
        this.f = str;
        this.g = str2;
        this.h = z;
    }

    public static cj a(cj cjVar, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, String str, String str2, int i) {
        if ((i & 2) != 0) {
            gv9Var2 = cjVar.b;
        }
        gv9 gv9Var4 = gv9Var2;
        gv9 gv9Var5 = cjVar.c;
        if ((i & 8) != 0) {
            gv9Var3 = cjVar.d;
        }
        gv9 gv9Var6 = gv9Var3;
        OddsEventUIModel oddsEventUIModel = cjVar.e;
        if ((i & 32) != 0) {
            str = cjVar.f;
        }
        String str3 = str;
        if ((i & 64) != 0) {
            str2 = cjVar.g;
        }
        boolean z = cjVar.h;
        gv9Var.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        return new cj(gv9Var, gv9Var4, gv9Var5, gv9Var6, oddsEventUIModel, str3, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        return Intrinsics.c(this.a, cjVar.a) && Intrinsics.c(this.b, cjVar.b) && Intrinsics.c(this.c, cjVar.c) && Intrinsics.c(this.d, cjVar.d) && this.e.equals(cjVar.e) && Intrinsics.c(this.f, cjVar.f) && Intrinsics.c(this.g, cjVar.g) && this.h == cjVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ljg.d(ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("AdditionalOddsComparisonState(additionalOdds=", this.a, ", signupLinks=", this.b, ", markets=");
        vxd.u(l, this.c, ", marketPeriods=", this.d, ", event=");
        l.append(this.e);
        l.append(", selectedMarket=");
        l.append(this.f);
        l.append(", selectedMarketPeriod=");
        l.append(this.g);
        l.append(", oddsMayDiffer=");
        l.append(this.h);
        l.append(")");
        return l.toString();
    }
}
