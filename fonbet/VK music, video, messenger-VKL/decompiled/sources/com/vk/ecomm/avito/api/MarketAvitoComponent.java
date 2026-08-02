package com.vk.ecomm.avito.api;

import com.vk.di.component.DiUnscopedComponent;

/* compiled from: MarketAvitoComponent.kt */
/* loaded from: classes18.dex */
public interface MarketAvitoComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MarketAvitoComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MarketAvitoComponent STUB = new MarketAvitoComponent() { // from class: com.vk.ecomm.avito.api.MarketAvitoComponent$Companion$STUB$1
            public final a a = a.Z6.getSTUB();

            @Override // com.vk.ecomm.avito.api.MarketAvitoComponent
            public final a getDelegate() {
                return this.a;
            }
        };

        public final MarketAvitoComponent getSTUB() {
            return STUB;
        }
    }

    a getDelegate();
}
