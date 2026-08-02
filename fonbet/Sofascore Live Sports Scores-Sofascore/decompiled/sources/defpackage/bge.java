package defpackage;

import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bge implements efb {
    public sk3 a = sk3.a(rk3.d);
    public ege b;
    public final /* synthetic */ fge c;

    public bge(fge fgeVar) {
        this.c = fgeVar;
    }

    @Override // defpackage.efb
    public final void a(sk3 sk3Var) {
        fge.p.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{sk3Var, this.b.a});
        this.a = sk3Var;
        fge fgeVar = this.c;
        if (fgeVar.i.c() && ((ege) fgeVar.h.get(fgeVar.i.a())).c == this) {
            fgeVar.D(this.b);
        }
    }
}
