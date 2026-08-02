package com.vk.reefton.literx.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import xsna.ign;
import xsna.l7i;
import xsna.ml1;
import xsna.q7i;
import xsna.u7i;

/* compiled from: CompletableCreate.kt */
/* loaded from: classes5.dex */
public final class CompletableCreate extends l7i {
    public final ml1 a;

    /* compiled from: CompletableCreate.kt */
    public static final class CreateEmitter extends AtomicBoolean implements q7i, ign {
        private final u7i downstream;

        public CreateEmitter(u7i u7iVar) {
            this.downstream = u7iVar;
        }

        @Override // xsna.ign
        public final void dispose() {
            set(true);
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }

        @Override // xsna.q7i
        public final void onComplete() {
            this.downstream.onComplete();
        }
    }

    public CompletableCreate(ml1 ml1Var) {
        this.a = ml1Var;
    }

    @Override // xsna.l7i
    public final void a(u7i u7iVar) {
        CreateEmitter createEmitter = new CreateEmitter(u7iVar);
        u7iVar.a(createEmitter);
        try {
            this.a.invoke(createEmitter);
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
            u7iVar.onError(th);
        }
    }
}
