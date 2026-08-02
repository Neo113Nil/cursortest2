package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class twf extends a implements cu3 {
    public final /* synthetic */ qg3 b;
    public final /* synthetic */ uwf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twf(qg3 qg3Var, uwf uwfVar) {
        super(bu3.a);
        this.b = qg3Var;
        this.c = uwfVar;
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        qg3 qg3Var = this.b;
        uwf uwfVar = this.c;
        u6h.W(th, new ix1(25, qg3Var, uwfVar));
        CoroutineContext coroutineContext2 = uwfVar.b;
        bu3 bu3Var = bu3.a;
        cu3 cu3Var = (cu3) coroutineContext2.get(bu3Var);
        if (cu3Var != null) {
            cu3Var.handleException(coroutineContext, th);
            return;
        }
        cu3 cu3Var2 = (cu3) uwfVar.a.get(bu3Var);
        if (cu3Var2 == null) {
            throw th;
        }
        cu3Var2.handleException(coroutineContext, th);
    }
}
