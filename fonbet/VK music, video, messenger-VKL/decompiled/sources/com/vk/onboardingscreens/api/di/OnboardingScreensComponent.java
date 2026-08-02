package com.vk.onboardingscreens.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.ant;
import xsna.dzq0;
import xsna.xyq0;

/* compiled from: OnboardingScreensComponent.kt */
/* loaded from: classes4.dex */
public interface OnboardingScreensComponent extends DiUnscopedComponent {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: OnboardingScreensComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final OnboardingScreensComponent STUB = new OnboardingScreensComponent() { // from class: com.vk.onboardingscreens.api.di.OnboardingScreensComponent$Companion$STUB$1
            public final xyq0 a = xyq0.a.a.getSTUB();
            public final dzq0 b = dzq0.a.a.getSTUB();
            public final ant c = ant.a.a.getSTUB();

            @Override // com.vk.onboardingscreens.api.di.OnboardingScreensComponent
            public final ant J5() {
                return this.c;
            }

            @Override // com.vk.onboardingscreens.api.di.OnboardingScreensComponent
            public final xyq0 Ye() {
                return this.a;
            }

            @Override // com.vk.onboardingscreens.api.di.OnboardingScreensComponent
            public final dzq0 a2() {
                return this.b;
            }
        };

        public final OnboardingScreensComponent getSTUB() {
            return STUB;
        }
    }

    ant J5();

    xyq0 Ye();

    dzq0 a2();
}
