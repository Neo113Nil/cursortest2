package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import xsna.acw;
import xsna.lzv;
import xsna.nzv;

/* compiled from: ImCmdRxExecutorScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImCmdRxExecutorScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImCmdRxExecutorScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImCmdRxExecutorScopedComponent$Companion$STUB$1 STUB = new ImCmdRxExecutorScopedComponent() { // from class: com.vk.im.engine.di.ImCmdRxExecutorScopedComponent$Companion$STUB$1
            public final nzv a = new nzv();

            @Override // com.vk.im.engine.di.ImCmdRxExecutorScopedComponent
            public final lzv g() {
                return this.a;
            }
        };
    }

    lzv g();
}
