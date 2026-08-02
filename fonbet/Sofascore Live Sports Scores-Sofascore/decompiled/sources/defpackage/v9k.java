package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v9k extends au3 {
    public static final v9k c = new v9k();

    @Override // defpackage.au3
    public final au3 f0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        qnl qnlVar = (qnl) coroutineContext.get(qnl.c);
        if (qnlVar != null) {
            qnlVar.b = true;
        } else {
            a70.m("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.au3
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
