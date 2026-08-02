package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class czf implements p6b {
    public final /* synthetic */ d6b a;
    public final /* synthetic */ fsf b;
    public final /* synthetic */ ku3 c;
    public final /* synthetic */ d6b d;
    public final /* synthetic */ lj2 e;
    public final /* synthetic */ j2d f;
    public final /* synthetic */ Function2 g;

    public czf(d6b d6bVar, fsf fsfVar, ku3 ku3Var, d6b d6bVar2, lj2 lj2Var, j2d j2dVar, Function2 function2) {
        this.a = d6bVar;
        this.b = fsfVar;
        this.c = ku3Var;
        this.d = d6bVar2;
        this.e = lj2Var;
        this.f = j2dVar;
        this.g = function2;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        d6b d6bVar2 = this.a;
        fsf fsfVar = this.b;
        rq3 rq3Var = null;
        if (d6bVar == d6bVar2) {
            fsfVar.a = xw3.L(this.c, null, null, new cce(this.f, this.g, rq3Var, 8), 3);
            return;
        }
        if (d6bVar == this.d) {
            yda ydaVar = (yda) fsfVar.a;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            fsfVar.a = null;
        }
        if (d6bVar == d6b.ON_DESTROY) {
            p2g p2gVar = w2g.b;
            this.e.resumeWith(Unit.a);
        }
    }
}
