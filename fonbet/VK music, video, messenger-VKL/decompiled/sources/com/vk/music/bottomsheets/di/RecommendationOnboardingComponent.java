package com.vk.music.bottomsheets.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.td80;
import xsna.zaf0;

/* compiled from: RecommendationOnboardingComponent.kt */
/* loaded from: classes3.dex */
public interface RecommendationOnboardingComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: RecommendationOnboardingComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final RecommendationOnboardingComponent STUB = new RecommendationOnboardingComponent() { // from class: com.vk.music.bottomsheets.di.RecommendationOnboardingComponent$Companion$STUB$1
            public final td80 a = td80.a.a.getSTUB();
            public final zaf0 b = zaf0.a.a.getSTUB();

            @Override // com.vk.music.bottomsheets.di.RecommendationOnboardingComponent
            public final zaf0 R8() {
                return this.b;
            }

            @Override // com.vk.music.bottomsheets.di.RecommendationOnboardingComponent
            public final td80 W7() {
                return this.a;
            }
        };

        public final RecommendationOnboardingComponent getSTUB() {
            return STUB;
        }
    }

    zaf0 R8();

    td80 W7();
}
