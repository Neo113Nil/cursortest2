package com.vk.im.engine.lifecycle.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import xsna.acw;
import xsna.r1w;
import xsna.s3q0;
import xsna.whc;
import xsna.zwi;

/* compiled from: ImEngineLifecycleScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImEngineLifecycleScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImEngineLifecycleScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImEngineLifecycleScopedComponent$Companion$STUB$1 STUB = new ImEngineLifecycleScopedComponent() { // from class: com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent
            public final r1w N() {
                return this.a;
            }

            /* compiled from: ImEngineLifecycleScopedComponent.kt */
            public static final class a implements r1w {
                @Override // xsna.r1w
                public final Future<?> c(boolean z) {
                    return CompletableFuture.completedFuture(s3q0.a);
                }

                @Override // xsna.r1w
                public final void b() {
                }

                @Override // xsna.r1w
                public final void d(whc whcVar) {
                }

                @Override // xsna.r1w
                public final void a(UserCredentials userCredentials, EngineInvalidateSource engineInvalidateSource) {
                }

                @Override // xsna.r1w
                public final void e(zwi zwiVar, EngineInvalidateSource engineInvalidateSource) {
                }
            }
        };
    }

    r1w N();
}
