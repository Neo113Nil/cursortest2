package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.models.c;
import xsna.acw;

/* compiled from: ImExperimentsScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImExperimentsScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImExperimentsScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImExperimentsScopedComponent$Companion$STUB$1 STUB = new ImExperimentsScopedComponent() { // from class: com.vk.im.engine.di.ImExperimentsScopedComponent$Companion$STUB$1
            public final c.a.C1122a a;

            {
                c.a.getClass();
                this.a = c.a.b;
            }

            @Override // com.vk.im.engine.di.ImExperimentsScopedComponent
            public final c getExperiments() {
                return this.a;
            }
        };
    }

    c getExperiments();
}
