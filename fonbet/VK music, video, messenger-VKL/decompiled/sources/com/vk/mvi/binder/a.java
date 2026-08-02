package com.vk.mvi.binder;

import androidx.lifecycle.Lifecycle;
import com.vk.mvi.binder.BinderLifecycleMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import xsna.f5z;
import xsna.gzs;
import xsna.nhl;
import xsna.s3q0;
import xsna.v37;

/* compiled from: AndroidBinderLifecycleMode.kt */
/* loaded from: classes3.dex */
public final class a implements BinderLifecycleMode {
    public final Lifecycle a;
    public final Lifecycle.State b;
    public final ArrayList c = new ArrayList();
    public final AtomicReference<BinderLifecycleMode.BindState> d;
    public final AtomicReference<gzs<s3q0>> e;

    /* compiled from: AndroidBinderLifecycleMode.kt */
    /* renamed from: com.vk.mvi.binder.a$a, reason: collision with other inner class name */
    public static final class C1360a implements nhl {
        public C1360a() {
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
            a.c(a.this);
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
            a aVar = a.this;
            aVar.a.removeObserver(this);
            a.c(aVar);
            aVar.c.clear();
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
            a.c(a.this);
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
            a.c(a.this);
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
            a.c(a.this);
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
            a.c(a.this);
        }
    }

    public a(Lifecycle lifecycle, Lifecycle.State state) {
        this.a = lifecycle;
        this.b = state;
        Lifecycle.State currentState = lifecycle.getCurrentState();
        this.d = new AtomicReference<>(currentState == Lifecycle.State.DESTROYED ? BinderLifecycleMode.BindState.DESTROYED : currentState.compareTo(state) >= 0 ? BinderLifecycleMode.BindState.ACTIVE : BinderLifecycleMode.BindState.STOPPED);
        this.e = new AtomicReference<>(null);
        lifecycle.addObserver(new C1360a());
    }

    public static final void c(a aVar) {
        AtomicReference<gzs<s3q0>> atomicReference = aVar.e;
        Lifecycle.State currentState = aVar.a.getCurrentState();
        BinderLifecycleMode.BindState bindState = currentState == Lifecycle.State.DESTROYED ? BinderLifecycleMode.BindState.DESTROYED : currentState.compareTo(aVar.b) >= 0 ? BinderLifecycleMode.BindState.ACTIVE : BinderLifecycleMode.BindState.STOPPED;
        AtomicReference<BinderLifecycleMode.BindState> atomicReference2 = aVar.d;
        if (bindState != atomicReference2.get()) {
            atomicReference2.set(bindState);
            if (bindState == BinderLifecycleMode.BindState.ACTIVE) {
                gzs<s3q0> gzsVar = atomicReference.get();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                atomicReference.set(null);
            }
            Iterator it = aVar.c.iterator();
            while (it.hasNext()) {
                ((BinderLifecycleMode.a) it.next()).a(bindState);
            }
        }
    }

    @Override // com.vk.mvi.binder.BinderLifecycleMode
    public final void a(gzs<s3q0> gzsVar) {
        if (this.d.get() == BinderLifecycleMode.BindState.ACTIVE) {
            gzsVar.invoke();
        } else {
            this.e.set(gzsVar);
        }
    }

    @Override // com.vk.mvi.binder.BinderLifecycleMode
    public final void b(v37 v37Var) {
        if (this.d.get() == BinderLifecycleMode.BindState.DESTROYED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.c.add(v37Var);
    }
}
