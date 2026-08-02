package com.vk.im.engine.event.publisher.di;

import com.vk.di.component.DiScopedComponent;
import xsna.acw;
import xsna.s3w;
import xsna.u3w;

/* compiled from: ImEventPublisherScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImEventPublisherScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImEventPublisherScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImEventPublisherScopedComponent$Companion$STUB$1 STUB = new ImEventPublisherScopedComponent() { // from class: com.vk.im.engine.event.publisher.di.ImEventPublisherScopedComponent$Companion$STUB$1
            public final u3w a = new u3w();

            @Override // com.vk.im.engine.event.publisher.di.ImEventPublisherScopedComponent
            public final s3w G() {
                return this.a;
            }
        };
    }

    s3w G();
}
