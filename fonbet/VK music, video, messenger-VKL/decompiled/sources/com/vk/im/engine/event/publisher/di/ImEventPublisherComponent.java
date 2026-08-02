package com.vk.im.engine.event.publisher.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.s3w;
import xsna.u3w;

/* compiled from: ImEventPublisherComponent.kt */
/* loaded from: classes2.dex */
public interface ImEventPublisherComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImEventPublisherComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImEventPublisherComponent$Companion$STUB$1 STUB = new ImEventPublisherComponent() { // from class: com.vk.im.engine.event.publisher.di.ImEventPublisherComponent$Companion$STUB$1
            public final u3w a = new u3w();

            @Override // com.vk.im.engine.event.publisher.di.ImEventPublisherComponent
            public final s3w G() {
                return this.a;
            }
        };
    }

    s3w G();
}
