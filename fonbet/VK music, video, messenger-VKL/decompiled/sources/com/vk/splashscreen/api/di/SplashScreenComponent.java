package com.vk.splashscreen.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.wkk0;
import xsna.xkk0;

/* compiled from: SplashScreenComponent.kt */
/* loaded from: classes5.dex */
public interface SplashScreenComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: SplashScreenComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final SplashScreenComponent STUB = new SplashScreenComponent() { // from class: com.vk.splashscreen.api.di.SplashScreenComponent$Companion$STUB$1
            public final xkk0 a = xkk0.a.getSTUB();
            public final wkk0 b = new wkk0(0);

            @Override // com.vk.splashscreen.api.di.SplashScreenComponent
            public final wkk0 de() {
                return this.b;
            }

            @Override // com.vk.splashscreen.api.di.SplashScreenComponent
            public final xkk0 getStateManager() {
                return this.a;
            }
        };

        public final SplashScreenComponent getSTUB() {
            return STUB;
        }
    }

    /* compiled from: SplashScreenComponent.kt */
    public static final class a implements b7m<SplashScreenComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return SplashScreenComponent.Companion.getSTUB();
        }
    }

    wkk0 de();

    xkk0 getStateManager();
}
