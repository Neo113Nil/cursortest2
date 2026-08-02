package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrah;", "Lbuc;", "Lfy1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class rah extends buc {
    public final float a;
    public final uah b;
    public final boolean c;
    public final long d;
    public final long e;

    public rah(float f, uah uahVar, boolean z, long j, long j2) {
        this.a = f;
        this.b = uahVar;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new fy1(new xjd(this, 7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rah)) {
            return false;
        }
        rah rahVar = (rah) obj;
        if (!p75.b(this.a, rahVar.a) || !Intrinsics.c(this.b, rahVar.b) || this.c != rahVar.c) {
            return false;
        }
        long j = rahVar.d;
        int i = r13.j;
        return e8k.a(this.d, j) && e8k.a(this.e, rahVar.e);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        wdd wddVar;
        fy1 fy1Var = (fy1) wtcVar;
        xjd xjdVar = new xjd(this, 7);
        fy1Var.o = xjdVar;
        if (fy1Var.a.n && (wddVar = c6o.a0(fy1Var, 2).p) != null) {
            wddVar.D1(xjdVar, true);
        }
    }

    public final int hashCode() {
        int e = dmi.e((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.e) + ljg.c(e, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) p75.c(this.a));
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        vxd.q(this.d, ", spotColor=", sb);
        sb.append((Object) r13.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
