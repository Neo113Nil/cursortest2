package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fb8 {
    public final void a(g1c g1cVar, g1c g1cVar2, boolean z, long j) {
        long s = bea.s(j, z ? lna.a : lna.b);
        if (g1cVar != null) {
            int g = an3.g(s);
            int B = z ? g1cVar.B(g) : g1cVar.s(g);
            new k6a(k6a.a(B, z ? g1cVar.s(B) : g1cVar.B(B)));
        }
        if (g1cVar2 != null) {
            int g2 = an3.g(s);
            int B2 = z ? g1cVar2.B(g2) : g1cVar2.s(g2);
            new k6a(k6a.a(B2, z ? g1cVar2.s(B2) : g1cVar2.B(B2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb8)) {
            return false;
        }
        db8 db8Var = db8.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + wv8.a(0, db8.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + db8.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
