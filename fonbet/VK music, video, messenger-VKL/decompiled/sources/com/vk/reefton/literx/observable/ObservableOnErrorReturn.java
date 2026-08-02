package com.vk.reefton.literx.observable;

import java.lang.Thread;
import xsna.er70;
import xsna.iq70;
import xsna.izs;
import xsna.j6e0;
import xsna.jfv0;
import xsna.z1v;

/* compiled from: ObservableOnErrorReturn.kt */
/* loaded from: classes5.dex */
public final class ObservableOnErrorReturn<T> extends iq70<T> {
    public final ObservableMap b;
    public final j6e0 c;

    /* compiled from: ObservableOnErrorReturn.kt */
    public static final class OnErrorReturnObserver<T> extends BaseObserver<T> {
        private final izs<Throwable, T> fn;

        public OnErrorReturnObserver(er70 er70Var, j6e0 j6e0Var) {
            super(er70Var);
            this.fn = j6e0Var;
        }

        @Override // com.vk.reefton.literx.observable.BaseObserver, xsna.er70
        public final void onError(Throwable th) {
            try {
                d().onNext(this.fn.invoke(th));
            } catch (Throwable th2) {
                jfv0.b bVar = z1v.a;
                if (bVar != null) {
                    bVar.invoke(th2);
                    return;
                }
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(currentThread, th2);
                }
            }
        }

        @Override // xsna.er70
        public final void onNext(T t) {
            d().onNext(t);
        }
    }

    public ObservableOnErrorReturn(ObservableMap observableMap, j6e0 j6e0Var) {
        this.b = observableMap;
        this.c = j6e0Var;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        OnErrorReturnObserver onErrorReturnObserver = new OnErrorReturnObserver(er70Var, this.c);
        this.b.d(onErrorReturnObserver);
        er70Var.a(onErrorReturnObserver);
    }
}
