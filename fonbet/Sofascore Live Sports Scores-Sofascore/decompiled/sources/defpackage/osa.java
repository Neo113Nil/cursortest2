package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class osa {
    public final z88 a;
    public final CoroutineContext b;
    public final lk0 c;
    public final e1d d;
    public final e1d e;

    public osa(z88 z88Var) {
        this.a = z88Var;
        CoroutineContext coroutineContext = c9k.a;
        this.b = coroutineContext;
        lk0 lk0Var = new lk0(this, coroutineContext, z88Var instanceof xdh ? (f6e) CollectionsKt.firstOrNull(((xdh) z88Var).a()) : null);
        this.c = lk0Var;
        this.d = e.f(lk0Var.d());
        p33 p33Var = (p33) lk0Var.k.a.getValue();
        if (p33Var == null) {
            rfb rfbVar = rsa.a;
            p33Var = new p33(rfbVar.a, rfbVar.b, rfbVar.c, rfbVar, null);
        }
        this.e = e.f(p33Var);
    }

    public final Object a(hoi hoiVar) {
        Object collect = this.c.k.a.collect(new vj0(new f10(this, 11), 18), hoiVar);
        lu3 lu3Var = lu3.a;
        if (collect != lu3Var) {
            collect = Unit.a;
        }
        return collect == lu3Var ? collect : Unit.a;
    }

    public final Object b(int i) {
        this.c.a(i);
        return ((xba) ((eoh) this.d).getValue()).get(i);
    }

    public final int c() {
        return ((xba) ((eoh) this.d).getValue()).size();
    }

    public final p33 d() {
        return (p33) ((eoh) this.e).getValue();
    }

    public final Object e(int i) {
        return ((xba) ((eoh) this.d).getValue()).get(i);
    }
}
