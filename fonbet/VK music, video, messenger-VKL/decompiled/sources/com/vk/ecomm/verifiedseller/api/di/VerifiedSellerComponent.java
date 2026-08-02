package com.vk.ecomm.verifiedseller.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.unr0;
import xsna.wnr0;

/* compiled from: VerifiedSellerComponent.kt */
/* loaded from: classes.dex */
public interface VerifiedSellerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VerifiedSellerComponent.kt */
    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VerifiedSellerComponent STUB = new VerifiedSellerComponent() { // from class: com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent$Companion$STUB$1
            public final wnr0 a = wnr0.a.getSTUB();
            public final unr0 b = unr0.a.a.getSTUB();

            @Override // com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent
            public final wnr0 a() {
                return this.a;
            }

            @Override // com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent
            public final unr0 d() {
                return this.b;
            }
        };

        public final VerifiedSellerComponent getSTUB() {
            return STUB;
        }
    }

    wnr0 a();

    unr0 d();
}
