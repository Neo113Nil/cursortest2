package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import xsna.izv;
import xsna.kzv;
import xsna.pwj0;

/* compiled from: ImCmdDirectExecutorComponent.kt */
/* loaded from: classes.dex */
public interface ImCmdDirectExecutorComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImCmdDirectExecutorComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImCmdDirectExecutorComponent$Companion$STUB$1 STUB = new ImCmdDirectExecutorComponent() { // from class: com.vk.im.engine.di.ImCmdDirectExecutorComponent$Companion$STUB$1
            public final kzv a = new kzv();

            @Override // com.vk.im.engine.di.ImCmdDirectExecutorComponent
            public final izv g() {
                return this.a;
            }
        };
    }

    izv g();
}
