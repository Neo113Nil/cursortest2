package com.vk.reefton.literx.completable;

import java.util.concurrent.atomic.AtomicReference;
import xsna.ign;
import xsna.u7i;

/* compiled from: BaseCompletableObserver.kt */
/* loaded from: classes5.dex */
public abstract class BaseCompletableObserver extends AtomicReference<ign> implements u7i, ign {
    private final u7i downstream;

    public BaseCompletableObserver(u7i u7iVar) {
        this.downstream = u7iVar;
    }

    @Override // xsna.u7i
    public final void a(ign ignVar) {
        set(ignVar);
    }

    public final u7i d() {
        return this.downstream;
    }

    @Override // xsna.ign
    public final void dispose() {
        get().dispose();
    }

    @Override // xsna.ign
    public final boolean h() {
        return get().h();
    }

    @Override // xsna.u7i
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }
}
