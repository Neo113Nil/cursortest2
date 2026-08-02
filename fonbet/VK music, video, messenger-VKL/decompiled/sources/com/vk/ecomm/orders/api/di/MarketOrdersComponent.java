package com.vk.ecomm.orders.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.hy80;
import xsna.jy80;
import xsna.pwj0;

/* compiled from: MarketOrdersComponent.kt */
/* loaded from: classes.dex */
public interface MarketOrdersComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MarketOrdersComponent.kt */
    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MarketOrdersComponent STUB = new MarketOrdersComponent() { // from class: com.vk.ecomm.orders.api.di.MarketOrdersComponent$Companion$STUB$1
            public final jy80 a = new jy80();

            @Override // com.vk.ecomm.orders.api.di.MarketOrdersComponent
            public final hy80 S4() {
                return this.a;
            }
        };

        public final MarketOrdersComponent getSTUB() {
            return STUB;
        }
    }

    hy80 S4();
}
