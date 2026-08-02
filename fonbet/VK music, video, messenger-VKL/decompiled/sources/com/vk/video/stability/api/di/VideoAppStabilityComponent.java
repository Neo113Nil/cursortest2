package com.vk.video.stability.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.y1s0;

/* compiled from: VideoAppStabilityComponent.kt */
/* loaded from: classes6.dex */
public interface VideoAppStabilityComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoAppStabilityComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoAppStabilityComponent STUB = new VideoAppStabilityComponent() { // from class: com.vk.video.stability.api.di.VideoAppStabilityComponent$Companion$STUB$1
            @Override // com.vk.video.stability.api.di.VideoAppStabilityComponent
            public final y1s0 G7() {
                return y1s0.a.getSTUB();
            }
        };

        public final VideoAppStabilityComponent getSTUB() {
            return STUB;
        }
    }

    y1s0 G7();
}
