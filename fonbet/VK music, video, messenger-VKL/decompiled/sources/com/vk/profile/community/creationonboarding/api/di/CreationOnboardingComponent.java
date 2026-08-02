package com.vk.profile.community.creationonboarding.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.h0h;
import xsna.vbk;
import xsna.xbk;

/* compiled from: CreationOnboardingComponent.kt */
/* loaded from: classes5.dex */
public interface CreationOnboardingComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: CreationOnboardingComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CreationOnboardingComponent STUB = new CreationOnboardingComponent() { // from class: com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent$Companion$STUB$1
            public final xbk a = xbk.a.a.getSTUB();
            public final vbk b = vbk.a.a.getSTUB();
            public final h0h c = h0h.a.a.getSTUB();

            @Override // com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent
            public final h0h Zd() {
                return this.c;
            }

            @Override // com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent
            public final xbk a() {
                return this.a;
            }

            @Override // com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent
            public final vbk d() {
                return this.b;
            }
        };

        public final CreationOnboardingComponent getSTUB() {
            return STUB;
        }
    }

    h0h Zd();

    xbk a();

    vbk d();
}
