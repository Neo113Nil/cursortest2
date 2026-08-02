package com.vk.biometrics.lock.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.b87;
import xsna.p97;
import xsna.pwj0;
import xsna.v57;

/* compiled from: BiometricsLockComponent.kt */
/* loaded from: classes.dex */
public interface BiometricsLockComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: BiometricsLockComponent.kt */
    /* loaded from: classes15.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final BiometricsLockComponent STUB = new BiometricsLockComponent() { // from class: com.vk.biometrics.lock.api.di.BiometricsLockComponent$Companion$STUB$1
            public final b87 a = b87.a.a.getSTUB();
            public final p97 b = p97.a.a.getSTUB();
            public final v57 c = v57.a.getSTUB();

            @Override // com.vk.biometrics.lock.api.di.BiometricsLockComponent
            public final p97 H() {
                return this.b;
            }

            @Override // com.vk.biometrics.lock.api.di.BiometricsLockComponent
            public final b87 a() {
                return this.a;
            }

            @Override // com.vk.biometrics.lock.api.di.BiometricsLockComponent
            public final v57 b() {
                return this.c;
            }
        };

        public final BiometricsLockComponent getSTUB() {
            return STUB;
        }
    }

    p97 H();

    b87 a();

    v57 b();
}
