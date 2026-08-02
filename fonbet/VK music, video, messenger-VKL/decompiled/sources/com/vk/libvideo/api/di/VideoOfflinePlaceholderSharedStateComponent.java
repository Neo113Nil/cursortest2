package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.h0t0;
import xsna.pwj0;

/* compiled from: VideoOfflinePlaceholderSharedStateComponent.kt */
/* loaded from: classes2.dex */
public interface VideoOfflinePlaceholderSharedStateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoOfflinePlaceholderSharedStateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoOfflinePlaceholderSharedStateComponent STUB = new VideoOfflinePlaceholderSharedStateComponent() { // from class: com.vk.libvideo.api.di.VideoOfflinePlaceholderSharedStateComponent$Companion$STUB$1
            public final h0t0 a = h0t0.a.a.getSTUB();

            @Override // com.vk.libvideo.api.di.VideoOfflinePlaceholderSharedStateComponent
            public final h0t0 B() {
                return this.a;
            }
        };

        public final VideoOfflinePlaceholderSharedStateComponent getSTUB() {
            return STUB;
        }
    }

    h0t0 B();
}
