package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import xsna.acw;
import xsna.izv;
import xsna.kzv;

/* compiled from: ImCmdDirectExecutorScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImCmdDirectExecutorScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImCmdDirectExecutorScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImCmdDirectExecutorScopedComponent$Companion$STUB$1 STUB = new ImCmdDirectExecutorScopedComponent() { // from class: com.vk.im.engine.di.ImCmdDirectExecutorScopedComponent$Companion$STUB$1
            public final kzv a = new kzv();

            @Override // com.vk.im.engine.di.ImCmdDirectExecutorScopedComponent
            public final izv g() {
                return this.a;
            }
        };
    }

    izv g();
}
