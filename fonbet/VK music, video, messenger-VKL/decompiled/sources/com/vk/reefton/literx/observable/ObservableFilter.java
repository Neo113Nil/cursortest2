package com.vk.reefton.literx.observable;

import xsna.er70;
import xsna.iq70;
import xsna.izs;

/* compiled from: ObservableFilter.kt */
/* loaded from: classes5.dex */
public final class ObservableFilter<T> extends iq70<T> {
    public final iq70<T> b;
    public final izs<T, Boolean> c;

    /* compiled from: ObservableFilter.kt */
    public static final class FilterObserver<T> extends BaseObserver<T> {
        private final izs<T, Boolean> predicate;

        /* JADX WARN: Multi-variable type inference failed */
        public FilterObserver(er70<T> er70Var, izs<? super T, Boolean> izsVar) {
            super(er70Var);
            this.predicate = izsVar;
        }

        @Override // xsna.er70
        public final void onNext(T t) {
            try {
                if (this.predicate.invoke(t).booleanValue()) {
                    d().onNext(t);
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
                dispose();
                onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableFilter(iq70<T> iq70Var, izs<? super T, Boolean> izsVar) {
        this.b = iq70Var;
        this.c = izsVar;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        FilterObserver filterObserver = new FilterObserver(er70Var, this.c);
        this.b.d(filterObserver);
        er70Var.a(filterObserver);
    }
}
