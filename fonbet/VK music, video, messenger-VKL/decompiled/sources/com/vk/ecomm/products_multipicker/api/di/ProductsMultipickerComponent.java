package com.vk.ecomm.products_multipicker.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.atd0;
import xsna.pwj0;

/* compiled from: ProductsMultipickerComponent.kt */
/* loaded from: classes18.dex */
public interface ProductsMultipickerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ProductsMultipickerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ProductsMultipickerComponent STUB = new ProductsMultipickerComponent() { // from class: com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent$Companion$STUB$1
            public final atd0 a = atd0.a.a.getSTUB();

            @Override // com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent
            public final atd0 a() {
                return this.a;
            }
        };

        public final ProductsMultipickerComponent getSTUB() {
            return STUB;
        }
    }

    atd0 a();
}
