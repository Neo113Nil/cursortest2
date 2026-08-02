package jg;

import ig.C7073b;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class l extends g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final l f70047c = new l();

    public static boolean n(long j11) {
        if ((3 & j11) == 0) {
            return j11 % 100 != 0 || j11 % 400 == 0;
        }
        return false;
    }

    private Object readResolve() {
        return f70047c;
    }

    @Override // jg.g
    public final AbstractC7423b a(mg.e eVar) {
        return ig.f.l1(eVar);
    }

    @Override // jg.g
    public final h f(int i11) {
        if (i11 == 0) {
            return m.BCE;
        }
        if (i11 == 1) {
            return m.f70048CE;
        }
        throw new C7073b(Ej.b.a(i11, "Invalid era: "));
    }

    @Override // jg.g
    public final String h() {
        return "iso8601";
    }

    @Override // jg.g
    public final String i() {
        return "ISO";
    }

    @Override // jg.g
    public final c j(ig.g gVar) {
        return ig.g.k1(gVar);
    }
}
