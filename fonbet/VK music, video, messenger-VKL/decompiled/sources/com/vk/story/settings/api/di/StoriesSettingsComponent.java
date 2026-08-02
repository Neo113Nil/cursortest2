package com.vk.story.settings.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.evl0;
import xsna.pwj0;

/* compiled from: StoriesSettingsComponent.kt */
/* loaded from: classes11.dex */
public interface StoriesSettingsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: StoriesSettingsComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StoriesSettingsComponent STUB = new StoriesSettingsComponent() { // from class: com.vk.story.settings.api.di.StoriesSettingsComponent$Companion$STUB$1
            @Override // com.vk.story.settings.api.di.StoriesSettingsComponent
            public final evl0 B7() {
                return evl0.a.getSTUB();
            }
        };

        public final StoriesSettingsComponent getSTUB() {
            return STUB;
        }
    }

    evl0 B7();
}
