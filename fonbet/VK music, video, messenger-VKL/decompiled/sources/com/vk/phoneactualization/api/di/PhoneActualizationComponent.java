package com.vk.phoneactualization.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.i2a0;
import xsna.l2a0;
import xsna.pwj0;

/* compiled from: PhoneActualizationComponent.kt */
/* loaded from: classes4.dex */
public interface PhoneActualizationComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PhoneActualizationComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final PhoneActualizationComponent getSTUB() {
            return new PhoneActualizationComponent() { // from class: com.vk.phoneactualization.api.di.PhoneActualizationComponent$Companion$STUB$1
                public final l2a0 a = l2a0.a.a.getSTUB();
                public final i2a0 b = i2a0.a.a.getSTUB();

                @Override // com.vk.phoneactualization.api.di.PhoneActualizationComponent
                public final l2a0 a() {
                    return this.a;
                }

                @Override // com.vk.phoneactualization.api.di.PhoneActualizationComponent
                public final i2a0 getEntryPoint() {
                    return this.b;
                }
            };
        }
    }

    l2a0 a();

    i2a0 getEntryPoint();
}
