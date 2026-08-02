package com.vk.stories.viewer.reactions.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.fbm0;

/* compiled from: StoryReactionsComponent.kt */
/* loaded from: classes6.dex */
public interface StoryReactionsComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: StoryReactionsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StoryReactionsComponent STUB = new StoryReactionsComponent() { // from class: com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent$Companion$STUB$1
            @Override // com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent
            public final fbm0 b() {
                return fbm0.a.a.getSTUB();
            }
        };

        public final StoryReactionsComponent getSTUB() {
            return STUB;
        }
    }

    fbm0 b();
}
