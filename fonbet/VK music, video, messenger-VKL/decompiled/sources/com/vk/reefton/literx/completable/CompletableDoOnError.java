package com.vk.reefton.literx.completable;

import xsna.izs;
import xsna.jp5;
import xsna.l7i;
import xsna.s3q0;
import xsna.u7i;

/* compiled from: CompletableDoOnError.kt */
/* loaded from: classes5.dex */
public final class CompletableDoOnError extends l7i {
    public final l7i a;
    public final jp5 b;

    /* compiled from: CompletableDoOnError.kt */
    public static final class OnErrorObserver extends BaseCompletableObserver {
        private final izs<Throwable, s3q0> onErrorCallback;

        public OnErrorObserver(u7i u7iVar, jp5 jp5Var) {
            super(u7iVar);
            this.onErrorCallback = jp5Var;
        }

        @Override // xsna.u7i
        public final void onComplete() {
            d().onComplete();
        }

        @Override // com.vk.reefton.literx.completable.BaseCompletableObserver, xsna.u7i
        public final void onError(Throwable th) {
            try {
                this.onErrorCallback.invoke(th);
                d().onError(th);
            } catch (Throwable th2) {
                if (th2 instanceof VirtualMachineError) {
                    throw ((VirtualMachineError) th2);
                }
                if (th2 instanceof ThreadDeath) {
                    throw ((ThreadDeath) th2);
                }
                if (th2 instanceof LinkageError) {
                    throw ((LinkageError) th2);
                }
                dispose();
            }
        }
    }

    public CompletableDoOnError(l7i l7iVar, jp5 jp5Var) {
        this.a = l7iVar;
        this.b = jp5Var;
    }

    @Override // xsna.l7i
    public final void a(u7i u7iVar) {
        OnErrorObserver onErrorObserver = new OnErrorObserver(u7iVar, this.b);
        this.a.a(onErrorObserver);
        u7iVar.a(onErrorObserver);
    }
}
