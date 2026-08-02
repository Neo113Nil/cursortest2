package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoClipsInteractionComponent$Companion$STUB$1;
import xsna.kbs0;
import xsna.pwj0;

/* compiled from: VideoClipsInteractionComponent.kt */
/* loaded from: classes2.dex */
public interface VideoClipsInteractionComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoClipsInteractionComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoClipsInteractionComponent STUB = new VideoClipsInteractionComponent() { // from class: com.vk.libvideo.api.di.VideoClipsInteractionComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: VideoClipsInteractionComponent.kt */
            public static final class a implements kbs0 {
            }

            @Override // com.vk.libvideo.api.di.VideoClipsInteractionComponent
            public final a V8() {
                return this.a;
            }
        };

        public final VideoClipsInteractionComponent getSTUB() {
            return STUB;
        }
    }

    VideoClipsInteractionComponent$Companion$STUB$1.a V8();
}
