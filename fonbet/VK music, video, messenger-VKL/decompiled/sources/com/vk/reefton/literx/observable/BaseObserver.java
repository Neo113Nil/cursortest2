package com.vk.reefton.literx.observable;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;
import xsna.er70;
import xsna.ign;
import xsna.jfv0;
import xsna.z1v;

/* compiled from: BaseObserver.kt */
/* loaded from: classes5.dex */
public abstract class BaseObserver<T> extends AtomicReference<ign> implements er70<T>, ign {
    private boolean done;
    private final er70<T> downstream;

    public BaseObserver(er70<T> er70Var) {
        this.downstream = er70Var;
    }

    @Override // xsna.er70
    public final void a(ign ignVar) {
        set(ignVar);
    }

    public final er70<T> d() {
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

    @Override // xsna.er70
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // xsna.er70
    public void onError(Throwable th) {
        if (!this.done) {
            this.done = true;
            this.downstream.onError(th);
            return;
        }
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
        }
    }
}
