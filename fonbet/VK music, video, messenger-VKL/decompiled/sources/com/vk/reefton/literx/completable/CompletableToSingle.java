package com.vk.reefton.literx.completable;

import com.vk.reefton.literx.observable.ObservableFlatMapCompletable;
import java.util.concurrent.atomic.AtomicReference;
import xsna.dtj0;
import xsna.gzs;
import xsna.ign;
import xsna.u7i;
import xsna.xuj0;
import xsna.z260;

/* compiled from: CompletableToSingle.kt */
/* loaded from: classes5.dex */
public final class CompletableToSingle<T> extends dtj0<T> {
    public final ObservableFlatMapCompletable a;
    public final z260 b;

    /* compiled from: CompletableToSingle.kt */
    public static final class ToSingleObserver<T> extends AtomicReference<ign> implements u7i, ign {
        private final xuj0<T> downstream;
        private final gzs<T> valueProvider;

        public ToSingleObserver(xuj0 xuj0Var, z260 z260Var) {
            this.downstream = xuj0Var;
            this.valueProvider = z260Var;
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
                this.downstream.onSuccess(this.valueProvider.invoke());
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
                dispose();
                onError(th);
            }
        }

        @Override // xsna.u7i
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }

    public CompletableToSingle(ObservableFlatMapCompletable observableFlatMapCompletable, z260 z260Var) {
        this.a = observableFlatMapCompletable;
        this.b = z260Var;
    }

    @Override // xsna.dtj0
    public final void a(xuj0<T> xuj0Var) {
        ToSingleObserver toSingleObserver = new ToSingleObserver(xuj0Var, this.b);
        ObservableFlatMapCompletable observableFlatMapCompletable = this.a;
        if (observableFlatMapCompletable != null) {
            observableFlatMapCompletable.a(toSingleObserver);
        }
        xuj0Var.a(toSingleObserver);
    }
}
