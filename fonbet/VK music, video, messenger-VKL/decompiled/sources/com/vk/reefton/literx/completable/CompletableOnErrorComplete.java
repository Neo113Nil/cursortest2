package com.vk.reefton.literx.completable;

import xsna.l7i;
import xsna.u7i;

/* compiled from: CompletableOnErrorComplete.kt */
/* loaded from: classes5.dex */
public final class CompletableOnErrorComplete extends l7i {
    public final CompletableDoOnError a;

    /* compiled from: CompletableOnErrorComplete.kt */
    public static final class OnErrorCompleteObserver extends BaseCompletableObserver {
        @Override // xsna.u7i
        public final void onComplete() {
            d().onComplete();
        }

        @Override // com.vk.reefton.literx.completable.BaseCompletableObserver, xsna.u7i
        public final void onError(Throwable th) {
            d().onComplete();
        }
    }

    public CompletableOnErrorComplete(CompletableDoOnError completableDoOnError) {
        this.a = completableDoOnError;
    }

    @Override // xsna.l7i
    public final void a(u7i u7iVar) {
        OnErrorCompleteObserver onErrorCompleteObserver = new OnErrorCompleteObserver(u7iVar);
        CompletableDoOnError completableDoOnError = this.a;
        if (completableDoOnError != null) {
            completableDoOnError.a(onErrorCompleteObserver);
        }
        u7iVar.a(onErrorCompleteObserver);
    }
}
