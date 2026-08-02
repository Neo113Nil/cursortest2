package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import xsna.acw;
import xsna.ezv;
import xsna.hzv;

/* compiled from: ImCmdCoroutinesExecutorScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImCmdCoroutinesExecutorScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImCmdCoroutinesExecutorScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImCmdCoroutinesExecutorScopedComponent$Companion$STUB$1 STUB = new ImCmdCoroutinesExecutorScopedComponent() { // from class: com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent$Companion$STUB$1
            public final hzv a = new hzv();

            @Override // com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent
            public final ezv g() {
                return this.a;
            }
        };
    }

    ezv g();
}
