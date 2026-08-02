package com.vk.billing;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.d2c0;
import xsna.oge0;
import xsna.pwj0;

/* compiled from: PurchasesManagerComponent.kt */
/* loaded from: classes.dex */
public interface PurchasesManagerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PurchasesManagerComponent.kt */
    /* loaded from: classes15.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PurchasesManagerComponent STUB = new PurchasesManagerComponent() { // from class: com.vk.billing.PurchasesManagerComponent$Companion$STUB$1
            public final bpn0 a = new bpn0(new d2c0(4));

            @Override // com.vk.billing.PurchasesManagerComponent
            public final oge0 J7() {
                return (oge0) this.a.getValue();
            }
        };

        public final PurchasesManagerComponent getSTUB() {
            return STUB;
        }
    }

    oge0 J7();
}
