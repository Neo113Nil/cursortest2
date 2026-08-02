package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyqd;", "Lbuc;", "Lzqd;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class yqd extends buc {
    public final long a;
    public final float b;
    public final wla c;
    public final Function1 d;

    public yqd(long j, float f, wla wlaVar, Function1 function1) {
        this.a = j;
        this.b = f;
        this.c = wlaVar;
        this.d = function1;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new zqd(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yqd.class == obj.getClass()) {
            yqd yqdVar = (yqd) obj;
            return this.a == yqdVar.a && this.b == yqdVar.b && Intrinsics.c(this.c, yqdVar.c) && this.d == yqdVar.d;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        zqd zqdVar = (zqd) wtcVar;
        zqdVar.o = this.a;
        zqdVar.p = this.b;
        zqdVar.q = this.d;
        zqdVar.r = this.c;
        zqdVar.n1();
        nwf nwfVar = zqdVar.w;
        if (nwfVar != null) {
            zqdVar.k1(zqdVar.p, nwfVar, zqdVar.x);
        }
    }

    public final int hashCode() {
        int a = fc6.a(this.b, Long.hashCode(this.a) * 31, 31);
        wla wlaVar = this.c;
        return this.d.hashCode() + ((a + (wlaVar != null ? wlaVar.hashCode() : 0)) * 31);
    }
}
