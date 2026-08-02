package com.vk.im.sync.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.jxv;
import xsna.lxv;
import xsna.pwj0;
import xsna.w0i0;
import xsna.z0i0;

/* compiled from: ImSynchronizationComponent.kt */
/* loaded from: classes.dex */
public interface ImSynchronizationComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImSynchronizationComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImSynchronizationComponent$Companion$STUB$1 STUB = new ImSynchronizationComponent() { // from class: com.vk.im.sync.api.di.ImSynchronizationComponent$Companion$STUB$1
            public final lxv a = new lxv();
            public final z0i0 b = new z0i0();

            @Override // com.vk.im.sync.api.di.ImSynchronizationComponent
            public final jxv Ea() {
                return this.a;
            }

            @Override // com.vk.im.sync.api.di.ImSynchronizationComponent
            public final w0i0 V4() {
                return this.b;
            }
        };
    }

    jxv Ea();

    w0i0 V4();
}
