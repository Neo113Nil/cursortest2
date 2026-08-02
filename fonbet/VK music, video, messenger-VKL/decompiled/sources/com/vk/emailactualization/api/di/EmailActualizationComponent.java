package com.vk.emailactualization.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.wbp;
import xsna.zbp;

/* compiled from: EmailActualizationComponent.kt */
/* loaded from: classes.dex */
public interface EmailActualizationComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: EmailActualizationComponent.kt */
    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final EmailActualizationComponent getSTUB() {
            return new EmailActualizationComponent() { // from class: com.vk.emailactualization.api.di.EmailActualizationComponent$Companion$STUB$1
                public final zbp a = zbp.a.a.getSTUB();
                public final wbp b = wbp.a.a.getSTUB();

                @Override // com.vk.emailactualization.api.di.EmailActualizationComponent
                public final zbp a() {
                    return this.a;
                }

                @Override // com.vk.emailactualization.api.di.EmailActualizationComponent
                public final wbp getEntryPoint() {
                    return this.b;
                }
            };
        }
    }

    zbp a();

    wbp getEntryPoint();
}
