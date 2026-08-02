package com.vk.reefton.literx.single;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ign;
import xsna.izs;
import xsna.jfv0;
import xsna.s3q0;
import xsna.xuj0;
import xsna.z1v;
import xsna.znf0;

/* compiled from: LambdaSingleObserver.kt */
/* loaded from: classes5.dex */
public final class LambdaSingleObserver<T> extends AtomicReference<ign> implements xuj0<T>, ign {
    private final izs<Throwable, s3q0> onError;
    private final izs<T, s3q0> onSuccess;

    public LambdaSingleObserver(znf0 znf0Var, izs izsVar) {
        this.onSuccess = znf0Var;
        this.onError = izsVar;
    }

    @Override // xsna.xuj0
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

    @Override // xsna.xuj0
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

    @Override // xsna.xuj0
    public final void onSuccess(T t) {
        try {
            izs<T, s3q0> izsVar = this.onSuccess;
            if (izsVar != null) {
                izsVar.invoke(t);
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
}
