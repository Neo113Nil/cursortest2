package com.vk.onboardingpromo.api;

import com.vk.di.component.DiScopedComponent;
import com.vk.onboardingpromo.api.a;
import com.vk.onboardingpromo.api.b;
import xsna.pwj0;

/* compiled from: OnboardingPromoComponent.kt */
/* loaded from: classes4.dex */
public interface OnboardingPromoComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: OnboardingPromoComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final OnboardingPromoComponent STUB = new OnboardingPromoComponent() { // from class: com.vk.onboardingpromo.api.OnboardingPromoComponent$Companion$STUB$1
            public final a a;

            {
                b.a.a.getSTUB();
                this.a = a.C1445a.a.getSTUB();
            }

            @Override // com.vk.onboardingpromo.api.OnboardingPromoComponent
            public final a b() {
                return this.a;
            }
        };

        public final OnboardingPromoComponent getSTUB() {
            return STUB;
        }
    }

    a b();
}
