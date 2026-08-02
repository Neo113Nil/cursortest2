package com.vk.reefton.literx.observable;

import com.vk.reefton.literx.SimpleDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.er70;
import xsna.ign;
import xsna.iq70;

/* compiled from: ObservableFromIterable.kt */
/* loaded from: classes5.dex */
public final class ObservableFromIterable<T> extends iq70<T> {
    public final ArrayList b;

    /* compiled from: ObservableFromIterable.kt */
    public static final class FromIterableDisposable<T> extends AtomicBoolean implements ign {
        private final er70<T> downstream;
        private final Iterator<T> iterator;

        /* JADX WARN: Multi-variable type inference failed */
        public FromIterableDisposable(Iterator<? extends T> it, er70<T> er70Var) {
            this.iterator = it;
            this.downstream = er70Var;
        }

        public final void d() {
            while (!get()) {
                try {
                    T next = this.iterator.next();
                    if (next == null) {
                        this.downstream.onComplete();
                        return;
                    }
                    this.downstream.onNext(next);
                    if (get()) {
                        return;
                    }
                    if (!this.iterator.hasNext()) {
                        if (get()) {
                            return;
                        }
                        this.downstream.onComplete();
                        return;
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
                    set(true);
                    this.downstream.onError(th);
                    return;
                }
            }
        }

        @Override // xsna.ign
        public final void dispose() {
            set(true);
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }
    }

    public ObservableFromIterable(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        try {
            Iterator it = this.b.iterator();
            try {
                if (!it.hasNext()) {
                    er70Var.a(new SimpleDisposable());
                    er70Var.onComplete();
                } else {
                    FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(it, er70Var);
                    er70Var.a(fromIterableDisposable);
                    fromIterableDisposable.d();
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
                er70Var.a(new SimpleDisposable());
                er70Var.onError(th);
            }
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
            er70Var.a(new SimpleDisposable());
            er70Var.onError(th2);
        }
    }
}
