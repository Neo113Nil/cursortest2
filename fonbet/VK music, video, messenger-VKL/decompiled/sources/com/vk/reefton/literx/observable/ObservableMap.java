package com.vk.reefton.literx.observable;

import java.util.concurrent.atomic.AtomicReference;
import xsna.er70;
import xsna.ign;
import xsna.iq70;
import xsna.izs;

/* compiled from: ObservableMap.kt */
/* loaded from: classes5.dex */
public final class ObservableMap<T, R> extends iq70<R> {
    public final iq70<T> b;
    public final izs<T, R> c;

    /* compiled from: ObservableMap.kt */
    public static final class MapObserver<T, R> extends AtomicReference<ign> implements er70<T>, ign {
        private final er70<R> downstream;
        private final izs<T, R> fn;

        /* JADX WARN: Multi-variable type inference failed */
        public MapObserver(er70<R> er70Var, izs<? super T, ? extends R> izsVar) {
            this.downstream = er70Var;
            this.fn = izsVar;
        }

        @Override // xsna.er70
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

        @Override // xsna.er70
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // xsna.er70
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // xsna.er70
        public final void onNext(T t) {
            try {
                this.downstream.onNext(this.fn.invoke(t));
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableMap(iq70<T> iq70Var, izs<? super T, ? extends R> izsVar) {
        this.b = iq70Var;
        this.c = izsVar;
    }

    @Override // xsna.iq70
    public final void d(er70<R> er70Var) {
        MapObserver mapObserver = new MapObserver(er70Var, this.c);
        this.b.d(mapObserver);
        er70Var.a(mapObserver);
    }
}
