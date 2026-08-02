package com.vk.im.engine.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.mjg;

/* compiled from: ImCommonCommandsFactoryComponent.kt */
/* loaded from: classes2.dex */
public interface ImCommonCommandsFactoryComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImCommonCommandsFactoryComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImCommonCommandsFactoryComponent STUB = new ImCommonCommandsFactoryComponent() { // from class: com.vk.im.engine.di.ImCommonCommandsFactoryComponent$Companion$STUB$1
            public final mjg a = mjg.a.a.getSTUB();

            @Override // com.vk.im.engine.di.ImCommonCommandsFactoryComponent
            public final mjg w7() {
                return this.a;
            }
        };

        public final ImCommonCommandsFactoryComponent getSTUB() {
            return STUB;
        }
    }

    mjg w7();
}
