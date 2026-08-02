package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.mvvm.model.Event;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m6j extends w31 implements v31, a1i {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final bx7 l;
    public final n6j m;
    public final Event n;
    public final x43 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6j(int i, String str, String str2, long j, String str3, bx7 bx7Var, n6j n6jVar, Event event, x43 x43Var) {
        super(str, str2, str3, bx7Var, true, x43Var);
        bx7Var.getClass();
        event.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = bx7Var;
        this.m = n6jVar;
        this.n = event;
        this.o = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        bx7 bx7Var = this.l;
        bx7Var.getClass();
        Event event = this.n;
        event.getClass();
        return new m6j(this.g, this.h, this.i, this.j, this.k, bx7Var, this.m, event, x43Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6j)) {
            return false;
        }
        m6j m6jVar = (m6j) obj;
        return this.g == m6jVar.g && Intrinsics.c(this.h, m6jVar.h) && Intrinsics.c(this.i, m6jVar.i) && this.j == m6jVar.j && this.k.equals(m6jVar.k) && Intrinsics.c(this.l, m6jVar.l) && this.m.equals(m6jVar.m) && Intrinsics.c(this.n, m6jVar.n) && this.o.equals(m6jVar.o);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.o;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
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
        return this.o.hashCode() + ((this.n.hashCode() + ljg.d(fn0.d(this.l, dmi.c(ljg.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31), 31, this.m.a)) * 31);
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
        StringBuilder t = dmi.t(this.g, "TennisPowerFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        t.append(", sport=");
        t.append(this.k);
        t.append(", event=");
        t.append(this.l);
        t.append(", powerGraphData=");
        t.append(this.m);
        t.append(", stableEvent=");
        t.append(this.n);
        t.append(", additionalData=");
        t.append(this.o);
        t.append(")");
        return t.toString();
    }
}
