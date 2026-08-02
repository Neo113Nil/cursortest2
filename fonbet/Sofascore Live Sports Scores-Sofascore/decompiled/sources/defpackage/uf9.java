package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luf9;", "Lbuc;", "Lyf9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class uf9 extends buc {
    public final wzc a;

    public uf9(wzc wzcVar) {
        this.a = wzcVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        yf9 yf9Var = new yf9();
        yf9Var.o = this.a;
        return yf9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf9) && Intrinsics.c(((uf9) obj).a, this.a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        yf9 yf9Var = (yf9) wtcVar;
        wzc wzcVar = yf9Var.o;
        wzc wzcVar2 = this.a;
        if (Intrinsics.c(wzcVar, wzcVar2)) {
            return;
        }
        yf9Var.m1();
        yf9Var.o = wzcVar2;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
