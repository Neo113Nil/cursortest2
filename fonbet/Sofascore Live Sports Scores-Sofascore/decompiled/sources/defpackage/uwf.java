package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uwf implements ku3, swf {
    public static final tj2 e = new tj2();
    public final CoroutineContext a;
    public final CoroutineContext b;
    public final uwf c = this;
    public volatile CoroutineContext d;

    public uwf(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.a = coroutineContext;
        this.b = coroutineContext2;
    }

    @Override // defpackage.swf
    public final void b() {
        c();
    }

    public final void c() {
        synchronized (this.c) {
            try {
                CoroutineContext coroutineContext = this.d;
                if (coroutineContext == null) {
                    this.d = e;
                } else {
                    bea.p(coroutineContext, new km8(0));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.swf
    public final void d() {
        c();
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2 = this.d;
        if (coroutineContext2 == null || coroutineContext2 == e) {
            qg3 qg3Var = (qg3) this.a.get(qg3.b);
            CoroutineContext twfVar = qg3Var != null ? new twf(qg3Var, this) : g.a;
            synchronized (this.c) {
                try {
                    CoroutineContext coroutineContext3 = this.d;
                    if (coroutineContext3 == null) {
                        CoroutineContext coroutineContext4 = this.a;
                        coroutineContext = coroutineContext4.plus(new aea((yda) coroutineContext4.get(uic.g))).plus(this.b).plus(twfVar);
                    } else if (coroutineContext3 == e) {
                        CoroutineContext coroutineContext5 = this.a;
                        aea aeaVar = new aea((yda) coroutineContext5.get(uic.g));
                        aeaVar.x(new km8(0));
                        coroutineContext = coroutineContext5.plus(aeaVar).plus(this.b).plus(twfVar);
                    } else {
                        coroutineContext = coroutineContext3;
                    }
                    this.d = coroutineContext;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext2 = coroutineContext;
        }
        coroutineContext2.getClass();
        return coroutineContext2;
    }

    @Override // defpackage.swf
    public final void a() {
    }
}
