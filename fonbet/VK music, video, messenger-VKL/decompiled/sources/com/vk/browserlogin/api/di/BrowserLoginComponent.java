package com.vk.browserlogin.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.lk8;
import xsna.pwj0;

/* compiled from: BrowserLoginComponent.kt */
/* loaded from: classes15.dex */
public interface BrowserLoginComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: BrowserLoginComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final BrowserLoginComponent STUB = new BrowserLoginComponent() { // from class: com.vk.browserlogin.api.di.BrowserLoginComponent$Companion$STUB$1
            public final lk8 a = lk8.a.a.getSTUB();

            @Override // com.vk.browserlogin.api.di.BrowserLoginComponent
            public final lk8 of() {
                return this.a;
            }
        };

        public final BrowserLoginComponent getSTUB() {
            return STUB;
        }
    }

    lk8 of();
}
