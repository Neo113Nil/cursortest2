package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.database.MediaReactionType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c56 extends w31 implements kre, axi, a1i, v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final ux7 m;
    public final fy7 n;
    public final x43 o;
    public final Double p;
    public final List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c56(int i, String str, String str2, long j, String str3, bx7 bx7Var, ux7 ux7Var, fy7 fy7Var, x43 x43Var, Double d, List list) {
        super(str, str2, str3, bx7Var, true, x43Var);
        str3.getClass();
        bx7Var.getClass();
        ux7Var.getClass();
        fy7Var.getClass();
        list.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = ux7Var;
        this.n = fy7Var;
        this.o = x43Var;
        this.p = d;
        this.q = list;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        String str = this.k;
        str.getClass();
        bx7 bx7Var = this.l;
        bx7Var.getClass();
        ux7 ux7Var = this.m;
        ux7Var.getClass();
        fy7 fy7Var = this.n;
        fy7Var.getClass();
        List list = this.q;
        list.getClass();
        return new c56(this.g, this.h, this.i, this.j, str, bx7Var, ux7Var, fy7Var, x43Var, this.p, list);
    }

    @Override // defpackage.axi
    public final fy7 c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c56)) {
            return false;
        }
        c56 c56Var = (c56) obj;
        return this.g == c56Var.g && Intrinsics.c(this.h, c56Var.h) && Intrinsics.c(this.i, c56Var.i) && this.j == c56Var.j && Intrinsics.c(this.k, c56Var.k) && Intrinsics.c(this.l, c56Var.l) && Intrinsics.c(this.m, c56Var.m) && Intrinsics.c(this.n, c56Var.n) && Intrinsics.c(this.o, c56Var.o) && Intrinsics.c(this.p, c56Var.p) && Intrinsics.c(this.q, c56Var.q);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.o;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
    }

    @Override // defpackage.kre
    public final ux7 getPlayer() {
        return this.m;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.g) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode3 = (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + fn0.d(this.l, dmi.c(ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k), 31)) * 31)) * 31)) * 31;
        Double d = this.p;
        return this.q.hashCode() + ((hashCode3 + (d != null ? d.hashCode() : 0)) * 31);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.k;
    }

    @Override // defpackage.w31
    public final String k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "EventPlayerFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", player=");
        t.append(this.m);
        t.append(", team=");
        t.append(this.n);
        t.append(", additionalData=");
        t.append(this.o);
        t.append(", rating=");
        t.append(this.p);
        t.append(", statistics=");
        t.append(this.q);
        t.append(")");
        return t.toString();
    }

    public /* synthetic */ c56(int i, String str, String str2, long j, String str3, bx7 bx7Var, ux7 ux7Var, fy7 fy7Var, Double d, List list) {
        this(i, str, str2, j, str3, bx7Var, ux7Var, fy7Var, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), d, list);
    }
}
