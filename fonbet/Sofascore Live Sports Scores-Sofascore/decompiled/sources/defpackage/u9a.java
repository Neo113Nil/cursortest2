package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class u9a extends sq3 {
    public int r;
    public final /* synthetic */ kj1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9a(rq3 rq3Var, CoroutineContext coroutineContext, kj1 kj1Var) {
        super(rq3Var, coroutineContext);
        this.s = kj1Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        if (i == 0) {
            this.r = 1;
            y6a.M(obj);
            kj1 kj1Var = this.s;
            i5k.e(1, kj1Var);
            return kj1Var.invoke(this);
        }
        if (i != 1) {
            a70.r("This coroutine had already completed");
            return null;
        }
        this.r = 2;
        y6a.M(obj);
        return obj;
    }
}
