package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import xsna.pwj0;

/* compiled from: VideoApiHelperComponent.kt */
/* loaded from: classes.dex */
public interface VideoApiHelperComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoApiHelperComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoApiHelperComponent STUB = new VideoApiHelperComponent() { // from class: com.vk.libvideo.api.di.VideoApiHelperComponent$Companion$STUB$1
            public final VideoApiHelperRepository a = VideoApiHelperRepository.a.a.getSTUB();

            @Override // com.vk.libvideo.api.di.VideoApiHelperComponent
            public final VideoApiHelperRepository N4() {
                return this.a;
            }
        };

        public final VideoApiHelperComponent getSTUB() {
            return STUB;
        }
    }

    VideoApiHelperRepository N4();
}
