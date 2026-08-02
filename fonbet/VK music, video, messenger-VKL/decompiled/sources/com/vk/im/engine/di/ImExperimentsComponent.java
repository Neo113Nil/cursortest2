package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.models.c;
import xsna.pwj0;

/* compiled from: ImExperimentsComponent.kt */
/* loaded from: classes.dex */
public interface ImExperimentsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImExperimentsComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImExperimentsComponent$Companion$STUB$1 STUB = new ImExperimentsComponent() { // from class: com.vk.im.engine.di.ImExperimentsComponent$Companion$STUB$1
            public final c.a.C1122a a;

            {
                c.a.getClass();
                this.a = c.a.b;
            }

            @Override // com.vk.im.engine.di.ImExperimentsComponent
            public final c getExperiments() {
                return this.a;
            }
        };
    }

    c getExperiments();
}
