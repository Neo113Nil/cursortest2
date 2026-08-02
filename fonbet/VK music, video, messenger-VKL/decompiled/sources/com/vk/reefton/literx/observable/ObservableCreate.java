package com.vk.reefton.literx.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.er70;
import xsna.gzs;
import xsna.ign;
import xsna.iq70;
import xsna.j4;
import xsna.s3q0;
import xsna.vnf0;

/* compiled from: ObservableCreate.kt */
/* loaded from: classes5.dex */
public final class ObservableCreate<T> extends iq70<T> {
    public final vnf0 b;

    /* compiled from: ObservableCreate.kt */
    public static final class CreateEmitter<T> extends AtomicBoolean implements ign {
        private final er70<T> downstream;
        private AtomicReference<gzs<s3q0>> onDisposed = new AtomicReference<>();

        public CreateEmitter(er70<T> er70Var) {
            this.downstream = er70Var;
        }

        public final void a(Throwable th) {
            if (get()) {
                return;
            }
            this.downstream.onError(th);
        }

        public final void b(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        public final void c(j4 j4Var) {
            this.onDisposed.set(j4Var);
        }

        @Override // xsna.ign
        public final void dispose() {
            if (get()) {
                return;
            }
            set(true);
            gzs<s3q0> gzsVar = this.onDisposed.get();
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }
    }

    public ObservableCreate(vnf0 vnf0Var) {
        this.b = vnf0Var;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        CreateEmitter createEmitter = new CreateEmitter(er70Var);
        er70Var.a(createEmitter);
        try {
            this.b.a(createEmitter);
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
            er70Var.onError(th);
        }
    }
}
