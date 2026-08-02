package com.vk.ecomm.products_selection.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ntd0;
import xsna.pwj0;

/* compiled from: ProductsSelectionComponent.kt */
/* loaded from: classes18.dex */
public interface ProductsSelectionComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ProductsSelectionComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ProductsSelectionComponent STUB = new ProductsSelectionComponent() { // from class: com.vk.ecomm.products_selection.api.di.ProductsSelectionComponent$Companion$STUB$1
            public final ntd0 a = ntd0.a.a.getSTUB();

            @Override // com.vk.ecomm.products_selection.api.di.ProductsSelectionComponent
            public final ntd0 a() {
                return this.a;
            }
        };

        public final ProductsSelectionComponent getSTUB() {
            return STUB;
        }
    }

    ntd0 a();
}
