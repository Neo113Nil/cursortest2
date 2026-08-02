package com.fyber.inneractive.sdk.util;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements Runnable {
    public final /* synthetic */ Object[] a;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e b;

    public c(com.fyber.inneractive.sdk.web.e eVar) {
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getClass();
        com.fyber.inneractive.sdk.web.e eVar = this.b;
        boolean z = eVar.f;
        if (z) {
            return;
        }
        d dVar = new d(eVar);
        eVar.d = dVar;
        if (z) {
            return;
        }
        try {
            eVar.a.execute(dVar);
        } catch (NullPointerException e) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e.getMessage());
        } catch (RejectedExecutionException e2) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e2.getMessage());
        }
    }
}
