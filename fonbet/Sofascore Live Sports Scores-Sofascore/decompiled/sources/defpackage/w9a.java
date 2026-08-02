package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w9a extends sq3 {
    public int r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ rq3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9a(rq3 rq3Var, CoroutineContext coroutineContext, Function2 function2, rq3 rq3Var2) {
        super(rq3Var, coroutineContext);
        this.s = function2;
        this.t = rq3Var2;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        if (i != 0) {
            if (i != 1) {
                a70.r("This coroutine had already completed");
                return null;
            }
            this.r = 2;
            y6a.M(obj);
            return obj;
        }
        this.r = 1;
        y6a.M(obj);
        Function2 function2 = this.s;
        function2.getClass();
        i5k.e(2, function2);
        return function2.invoke(this.t, this);
    }
}
