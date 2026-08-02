package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dek implements yff {
    public final yff a;
    public final yff b;
    public final yff c;
    public final tsg d;
    public final yff e;
    public final yff f;
    public final yff g;

    public dek(yff yffVar, yff yffVar2, yff yffVar3, tsg tsgVar, yff yffVar4, yff yffVar5, yff yffVar6) {
        this.a = yffVar;
        this.b = yffVar2;
        this.c = yffVar3;
        this.d = tsgVar;
        this.e = yffVar4;
        this.f = yffVar5;
        this.g = yffVar6;
    }

    @Override // defpackage.yff
    public final Object get() {
        Context context = (Context) this.a.get();
        sic sicVar = (sic) this.b.get();
        mlg mlgVar = (mlg) this.c.get();
        sx2 sx2Var = (sx2) this.d.get();
        Executor executor = (Executor) this.e.get();
        mlg mlgVar2 = (mlg) this.f.get();
        kif kifVar = new kif(5);
        n2f n2fVar = new n2f(5);
        mlg mlgVar3 = (mlg) this.g.get();
        ji3 ji3Var = new ji3();
        ji3Var.a = context;
        ji3Var.b = sicVar;
        ji3Var.d = mlgVar;
        ji3Var.e = sx2Var;
        ji3Var.c = executor;
        ji3Var.f = mlgVar2;
        ji3Var.g = kifVar;
        ji3Var.h = n2fVar;
        ji3Var.i = mlgVar3;
        return ji3Var;
    }
}
