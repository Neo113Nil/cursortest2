package com.vk.ecomm.storefrontservices.api;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.storefrontservices.api.a;
import xsna.pwj0;

/* compiled from: StorefrontServicesComponent.kt */
/* loaded from: classes18.dex */
public interface StorefrontServicesComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: StorefrontServicesComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StorefrontServicesComponent STUB = new StorefrontServicesComponent() { // from class: com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent$Companion$STUB$1
            public final a a = a.C1021a.a.getSTUB();

            @Override // com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent
            public final a a() {
                return this.a;
            }
        };

        public final StorefrontServicesComponent getSTUB() {
            return STUB;
        }
    }

    a a();
}
