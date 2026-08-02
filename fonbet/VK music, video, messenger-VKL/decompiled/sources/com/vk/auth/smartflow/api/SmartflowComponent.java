package com.vk.auth.smartflow.api;

import com.vk.di.component.DiUnscopedComponent;
import xsna.ak20;
import xsna.b6k0;
import xsna.d6k0;
import xsna.dk20;

/* compiled from: SmartflowComponent.kt */
/* loaded from: classes.dex */
public interface SmartflowComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: SmartflowComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final SmartflowComponent getSTUB() {
            return new SmartflowComponent() { // from class: com.vk.auth.smartflow.api.SmartflowComponent$Companion$STUB$1
                public final dk20 a = new dk20();
                public final d6k0 b = new d6k0();

                @Override // com.vk.auth.smartflow.api.SmartflowComponent
                public final b6k0 Vd() {
                    return this.b;
                }

                @Override // com.vk.auth.smartflow.api.SmartflowComponent
                public final ak20 c() {
                    return this.a;
                }
            };
        }
    }

    b6k0 Vd();

    ak20 c();
}
