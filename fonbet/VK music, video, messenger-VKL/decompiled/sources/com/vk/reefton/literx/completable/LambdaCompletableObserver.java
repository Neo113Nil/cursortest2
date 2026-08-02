package com.vk.reefton.literx.completable;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;
import xsna.gzs;
import xsna.ign;
import xsna.izs;
import xsna.jfv0;
import xsna.ofc0;
import xsna.s3q0;
import xsna.u7i;
import xsna.z1v;

/* compiled from: LambdaCompletableObserver.kt */
/* loaded from: classes5.dex */
public final class LambdaCompletableObserver extends AtomicReference<ign> implements u7i, ign {
    private final gzs<s3q0> onComplete;
    private final izs<Throwable, s3q0> onError = z1v.b;

    public LambdaCompletableObserver(ofc0 ofc0Var) {
        this.onComplete = ofc0Var;
    }

    @Override // xsna.u7i
    public final void a(ign ignVar) {
        set(ignVar);
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
    public final void onComplete() {
        try {
            gzs<s3q0> gzsVar = this.onComplete;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        } catch (Throwable th) {
            if (th instanceof VirtualMachineError) {
                throw ((VirtualMachineError) th);
            }
            if (th instanceof ThreadDeath) {
                throw ((ThreadDeath) th);
            }
            if (th instanceof LinkageError) {
                throw ((LinkageError) th);
            }
            get().dispose();
            onError(th);
        }
    }

    @Override // xsna.u7i
    public final void onError(Throwable th) {
        if (h()) {
            jfv0.b bVar = z1v.a;
            if (bVar != null) {
                bVar.invoke(th);
                return;
            }
            th.printStackTrace();
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, th);
                return;
            }
            return;
        }
        try {
            this.onError.invoke(th);
        } catch (Throwable th2) {
            jfv0.b bVar2 = z1v.a;
            if (bVar2 != null) {
                bVar2.invoke(th2);
                return;
            }
            th2.printStackTrace();
            Thread currentThread2 = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = currentThread2.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(currentThread2, th2);
            }
        }
    }
}
