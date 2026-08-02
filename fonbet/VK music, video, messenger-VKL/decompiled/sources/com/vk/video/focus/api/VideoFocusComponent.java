package com.vk.video.focus.api;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: VideoFocusComponent.kt */
/* loaded from: classes11.dex */
public interface VideoFocusComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoFocusComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoFocusComponent STUB = new VideoFocusComponent() { // from class: com.vk.video.focus.api.VideoFocusComponent$Companion$STUB$1
            public final a a = a.a.getSTUB();

            @Override // com.vk.video.focus.api.VideoFocusComponent
            public final a b() {
                return this.a;
            }
        };

        public final VideoFocusComponent getSTUB() {
            return STUB;
        }
    }

    a b();
}
