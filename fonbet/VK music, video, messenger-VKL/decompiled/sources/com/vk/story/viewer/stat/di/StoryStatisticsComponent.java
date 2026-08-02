package com.vk.story.viewer.stat.di;

import com.vk.di.component.DiScopedComponent;
import xsna.jfm0;
import xsna.pwj0;

/* compiled from: StoryStatisticsComponent.kt */
/* loaded from: classes11.dex */
public interface StoryStatisticsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: StoryStatisticsComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StoryStatisticsComponent STUB = new StoryStatisticsComponent() { // from class: com.vk.story.viewer.stat.di.StoryStatisticsComponent$Companion$STUB$1
            public final jfm0 a = jfm0.a.getSTUB();

            @Override // com.vk.story.viewer.stat.di.StoryStatisticsComponent
            public final jfm0 h7() {
                return this.a;
            }
        };

        public final StoryStatisticsComponent getSTUB() {
            return STUB;
        }
    }

    jfm0 h7();
}
