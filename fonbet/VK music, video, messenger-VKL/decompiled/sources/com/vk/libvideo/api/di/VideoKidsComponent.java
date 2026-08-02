package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: VideoKidsComponent.kt */
/* loaded from: classes2.dex */
public interface VideoKidsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoKidsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoKidsComponent STUB = new VideoKidsComponent() { // from class: com.vk.libvideo.api.di.VideoKidsComponent$Companion$STUB$1
            @Override // com.vk.libvideo.api.di.VideoKidsComponent
            public final b I4() {
                return new b();
            }
        };

        public final VideoKidsComponent getSTUB() {
            return STUB;
        }
    }

    b I4();
}
