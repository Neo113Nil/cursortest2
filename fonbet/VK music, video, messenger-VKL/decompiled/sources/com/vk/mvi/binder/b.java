package com.vk.mvi.binder;

import com.vk.mvi.binder.BinderLifecycleMode;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: BinderLifecycleMode.kt */
/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.v37] */
    public static final void a(BinderLifecycleMode binderLifecycleMode, final gzs<s3q0> gzsVar) {
        binderLifecycleMode.b(new BinderLifecycleMode.a() { // from class: xsna.v37
            @Override // com.vk.mvi.binder.BinderLifecycleMode.a
            public final void a(BinderLifecycleMode.BindState bindState) {
                if (bindState == BinderLifecycleMode.BindState.DESTROYED) {
                    gzs.this.invoke();
                }
            }
        });
    }
}
