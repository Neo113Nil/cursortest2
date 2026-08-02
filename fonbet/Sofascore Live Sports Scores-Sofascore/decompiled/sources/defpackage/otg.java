package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventGraphResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class otg extends w31 implements uak, v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final bx7 k;
    public final String l;
    public final iy7 m;
    public final gv9 n;
    public final EventGraphResponse o;
    public final Event p;
    public final x43 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otg(int i, String str, String str2, long j, bx7 bx7Var, String str3, iy7 iy7Var, gv9 gv9Var, EventGraphResponse eventGraphResponse, Event event, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        bx7Var.getClass();
        str3.getClass();
        eventGraphResponse.getClass();
        event.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = bx7Var;
        this.l = str3;
        this.m = iy7Var;
        this.n = gv9Var;
        this.o = eventGraphResponse;
        this.p = event;
        this.q = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        bx7 bx7Var = this.k;
        bx7Var.getClass();
        String str = this.l;
        str.getClass();
        EventGraphResponse eventGraphResponse = this.o;
        eventGraphResponse.getClass();
        Event event = this.p;
        event.getClass();
        return new otg(this.g, this.h, this.i, this.j, bx7Var, str, this.m, this.n, eventGraphResponse, event, x43Var);
    }

    @Override // defpackage.uak
    public final iy7 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otg)) {
            return false;
        }
        otg otgVar = (otg) obj;
        return this.g == otgVar.g && Intrinsics.c(this.h, otgVar.h) && Intrinsics.c(this.i, otgVar.i) && this.j == otgVar.j && Intrinsics.c(this.k, otgVar.k) && Intrinsics.c(this.l, otgVar.l) && Intrinsics.c(this.m, otgVar.m) && Intrinsics.c(this.n, otgVar.n) && Intrinsics.c(this.o, otgVar.o) && Intrinsics.c(this.p, otgVar.p) && Intrinsics.c(this.q, otgVar.q);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.q;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.g) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int c = dmi.c(fn0.d(this.k, ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31), 31, this.l);
        iy7 iy7Var = this.m;
        int hashCode3 = (c + (iy7Var == null ? 0 : iy7Var.hashCode())) * 31;
        gv9 gv9Var = this.n;
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((hashCode3 + (gv9Var != null ? gv9Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.l;
    }

    @Override // defpackage.w31
    public final String k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "ScoreMomentumFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", event=");
        t.append(this.k);
        t.append(", sport=");
        t.append(this.l);
        t.append(", uniqueTournament=");
        t.append(this.m);
        t.append(", incidents=");
        t.append(this.n);
        t.append(", graphData=");
        t.append(this.o);
        t.append(", stableEvent=");
        t.append(this.p);
        t.append(", additionalData=");
        t.append(this.q);
        t.append(")");
        return t.toString();
    }

    public /* synthetic */ otg(int i, String str, String str2, long j, bx7 bx7Var, String str3, iy7 iy7Var, gv9 gv9Var, EventGraphResponse eventGraphResponse, Event event) {
        this(i, str, str2, j, bx7Var, str3, iy7Var, gv9Var, eventGraphResponse, event, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
    }
}
