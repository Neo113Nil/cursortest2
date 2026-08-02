package gf;

import bf.AbstractC5657a;
import gf.f;
import java.io.IOException;
import java.util.List;

/* loaded from: classes10.dex */
public final class h extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n f64389e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f.d f64390f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ List f64391g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, n nVar, f.d dVar, List list) {
        super(str, true);
        this.f64389e = nVar;
        this.f64390f = dVar;
        this.f64391g = list;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        p002if.j jVar;
        n nVar = this.f64389e;
        f.d dVar = this.f64390f;
        try {
            dVar.f64370b.W().c(nVar);
            return -1L;
        } catch (IOException e11) {
            p002if.j.f66400c.getClass();
            jVar = p002if.j.f66398a;
            String str = "Http2Connection.Listener failure for " + dVar.f64370b.Q();
            jVar.getClass();
            p002if.j.j(4, str, e11);
            try {
                nVar.d(EnumC6726b.PROTOCOL_ERROR, e11);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
