package com.vk.ecomm.market.api.filters.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.market.api.filters.di.a;
import xsna.eb10;
import xsna.fb10;
import xsna.kr80;

/* compiled from: MarketProductFilterComponent.kt */
/* loaded from: classes18.dex */
public interface MarketProductFilterComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MarketProductFilterComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MarketProductFilterComponent$Companion$STUB$1 STUB = new MarketProductFilterComponent() { // from class: com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent$Companion$STUB$1
            public final eb10<?> a = eb10.a.a.getSTUB();
            public final a b = new a();
            public final com.vk.ecomm.market.api.filters.di.a c = a.C0942a.a.getSTUB();

            @Override // com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent
            public final eb10<?> T2() {
                return this.a;
            }

            @Override // com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent
            public final fb10 a() {
                return this.b;
            }

            @Override // com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent
            public final com.vk.ecomm.market.api.filters.di.a b4() {
                return this.c;
            }

            /* compiled from: MarketProductFilterComponent.kt */
            public static final class a implements fb10 {
                @Override // xsna.fb10
                public final void a(kr80 kr80Var) {
                }
            }
        };
    }

    eb10<?> T2();

    fb10 a();

    a b4();
}
