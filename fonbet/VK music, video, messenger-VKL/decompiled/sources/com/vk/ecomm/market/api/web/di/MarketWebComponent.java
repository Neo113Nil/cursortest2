package com.vk.ecomm.market.api.web.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.ff10;
import xsna.m8q0;

/* compiled from: MarketWebComponent.kt */
/* loaded from: classes18.dex */
public interface MarketWebComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MarketWebComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MarketWebComponent STUB = new MarketWebComponent() { // from class: com.vk.ecomm.market.api.web.di.MarketWebComponent$Companion$STUB$1
            public final ff10 a = new ff10();

            @Override // com.vk.ecomm.market.api.web.di.MarketWebComponent
            public final m8q0 gc() {
                return this.a;
            }
        };

        public final MarketWebComponent getSTUB() {
            return STUB;
        }
    }

    m8q0 gc();
}
