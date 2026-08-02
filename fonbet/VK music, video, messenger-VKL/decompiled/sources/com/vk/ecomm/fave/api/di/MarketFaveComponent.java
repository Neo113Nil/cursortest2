package com.vk.ecomm.fave.api.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.fave.api.di.a;

/* compiled from: MarketFaveComponent.kt */
/* loaded from: classes18.dex */
public interface MarketFaveComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MarketFaveComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MarketFaveComponent STUB = new MarketFaveComponent() { // from class: com.vk.ecomm.fave.api.di.MarketFaveComponent$Companion$STUB$1
            public final a a = a.C0939a.a.getSTUB();

            @Override // com.vk.ecomm.fave.api.di.MarketFaveComponent
            public final a u1() {
                return this.a;
            }
        };

        public final MarketFaveComponent getSTUB() {
            return STUB;
        }
    }

    a u1();
}
