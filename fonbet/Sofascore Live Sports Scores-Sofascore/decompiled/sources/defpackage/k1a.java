package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk1a;", "Lbuc;", "Lm1a;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class k1a extends buc {
    public final wzc a;
    public final n9j b;
    public final uah c;

    public k1a(wzc wzcVar, n9j n9jVar, uah uahVar) {
        this.a = wzcVar;
        this.b = n9jVar;
        this.c = uahVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new m1a(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1a)) {
            return false;
        }
        k1a k1aVar = (k1a) obj;
        return Intrinsics.c(this.a, k1aVar.a) && this.b.equals(k1aVar.b) && Intrinsics.c(this.c, k1aVar.c) && p75.b(2.0f, 2.0f) && p75.b(1.0f, 1.0f);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        boolean z;
        m1a m1aVar = (m1a) wtcVar;
        boolean z2 = true;
        if (!m1aVar.q) {
            m1aVar.q = true;
            z = true;
        } else {
            z = false;
        }
        wzc wzcVar = m1aVar.r;
        wzc wzcVar2 = this.a;
        if (wzcVar != wzcVar2) {
            m1aVar.r = wzcVar2;
            g9i g9iVar = m1aVar.v;
            rq3 rq3Var = null;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            m1aVar.v = xw3.L(m1aVar.Y0(), null, null, new l1a(m1aVar, rq3Var, 3), 3);
        }
        n9j n9jVar = m1aVar.w;
        n9j n9jVar2 = this.b;
        if (!Intrinsics.c(n9jVar, n9jVar2)) {
            m1aVar.w = n9jVar2;
            z = true;
        }
        uah uahVar = m1aVar.y;
        uah uahVar2 = this.c;
        if (!Intrinsics.c(uahVar, uahVar2)) {
            if (!Intrinsics.c(m1aVar.y, uahVar2)) {
                m1aVar.y = uahVar2;
                m1aVar.A.k1();
            }
            z = true;
        }
        if (!p75.b(m1aVar.s, 2.0f)) {
            m1aVar.s = 2.0f;
            z = true;
        }
        if (p75.b(m1aVar.t, 1.0f)) {
            z2 = z;
        } else {
            m1aVar.t = 1.0f;
        }
        if (z2) {
            m1aVar.n1();
        }
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + dmi.e(Boolean.hashCode(true) * 31, 31, false)) * 31)) * 31;
        uah uahVar = this.c;
        return Float.hashCode(1.0f) + fc6.a(2.0f, (hashCode + (uahVar != null ? uahVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=true, isError=false, interactionSource=" + this.a + ", colors=" + this.b + ", textFieldShape=" + this.c + ", focusedIndicatorLineThickness=" + ((Object) p75.c(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) p75.c(1.0f)) + ')';
    }
}
