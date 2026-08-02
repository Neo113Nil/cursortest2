package com.vk.passkey.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.zl90;

/* compiled from: PasskeyComponent.kt */
/* loaded from: classes.dex */
public interface PasskeyComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PasskeyComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final PasskeyComponent getSTUB() {
            return new PasskeyComponent() { // from class: com.vk.passkey.api.di.PasskeyComponent$Companion$STUB$1
                @Override // com.vk.passkey.api.di.PasskeyComponent
                public final zl90 i9() {
                    return zl90.a.a.getSTUB();
                }
            };
        }
    }

    zl90 i9();
}
