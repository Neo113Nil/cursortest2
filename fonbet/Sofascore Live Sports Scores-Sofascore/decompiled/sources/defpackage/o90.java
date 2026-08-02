package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o90 implements zff {
    public final /* synthetic */ int a;
    public final Object b;
    public final zff c;
    public final zff d;

    public /* synthetic */ o90(Object obj, zff zffVar, zff zffVar2, int i) {
        this.a = i;
        this.b = obj;
        this.c = zffVar;
        this.d = zffVar2;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        zff zffVar = this.d;
        zff zffVar2 = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                d4a d4aVar = (d4a) ((p90) zffVar2).get();
                hki hkiVar = (hki) ((cc4) zffVar).get();
                r38 r38Var = (r38) ((x6k) obj).b;
                z41 z41Var = new z41(22, false);
                z41Var.b = d4aVar;
                z41Var.c = new AtomicBoolean(r38Var.g());
                ((rv5) hkiVar).a(f9k.a, new vp2(29));
                return z41Var;
            case 1:
                return new li2((eff) ((zff) obj).get(), (Application) zffVar2.get(), (igf) ((dc4) zffVar).get());
            default:
                gsg gsgVar = (gsg) ((zff) obj).get();
                return new qsg(gsgVar, (gsg) zffVar.get());
        }
    }
}
