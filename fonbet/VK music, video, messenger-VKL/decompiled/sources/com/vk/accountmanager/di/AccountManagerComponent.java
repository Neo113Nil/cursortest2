package com.vk.accountmanager.di;

import com.vk.di.component.DiScopedComponent;
import xsna.kp;
import xsna.mp;
import xsna.pwj0;
import xsna.xcu0;

/* compiled from: AccountManagerComponent.kt */
/* loaded from: classes.dex */
public interface AccountManagerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AccountManagerComponent.kt */
    /* loaded from: classes14.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AccountManagerComponent$Companion$STUB$1 STUB = new AccountManagerComponent() { // from class: com.vk.accountmanager.di.AccountManagerComponent$Companion$STUB$1
            public final mp a = mp.a.a.getSTUB();
            public final xcu0 b = xcu0.b.a.getSTUB();
            public final kp c = kp.a.a.getSTUB();

            @Override // com.vk.accountmanager.di.AccountManagerComponent
            public final xcu0 Kd() {
                return this.b;
            }

            @Override // com.vk.accountmanager.di.AccountManagerComponent
            public final kp b() {
                return this.c;
            }

            @Override // com.vk.accountmanager.di.AccountManagerComponent
            public final mp c() {
                return this.a;
            }
        };
    }

    xcu0 Kd();

    kp b();

    mp c();
}
