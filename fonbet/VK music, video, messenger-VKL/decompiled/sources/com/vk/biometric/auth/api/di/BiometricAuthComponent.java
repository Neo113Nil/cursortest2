package com.vk.biometric.auth.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.k47;

/* compiled from: BiometricAuthComponent.kt */
/* loaded from: classes15.dex */
public interface BiometricAuthComponent extends DiUnscopedComponent {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: BiometricAuthComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final BiometricAuthComponent STUB = new BiometricAuthComponent() { // from class: com.vk.biometric.auth.api.di.BiometricAuthComponent$Companion$STUB$1
            public final k47 a = k47.a.a.getSTUB();

            @Override // com.vk.biometric.auth.api.di.BiometricAuthComponent
            public final k47 Y6() {
                return this.a;
            }
        };

        public final BiometricAuthComponent getSTUB() {
            return STUB;
        }
    }

    k47 Y6();
}
