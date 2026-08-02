package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoTimerComponent$Companion$STUB$1;
import xsna.gkt0;
import xsna.pwj0;

/* compiled from: VideoTimerComponent.kt */
/* loaded from: classes.dex */
public interface VideoTimerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoTimerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoTimerComponent STUB = new VideoTimerComponent() { // from class: com.vk.libvideo.api.di.VideoTimerComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: VideoTimerComponent.kt */
            public static final class a implements gkt0 {
            }

            @Override // com.vk.libvideo.api.di.VideoTimerComponent
            public final a R0() {
                return this.a;
            }
        };

        public final VideoTimerComponent getSTUB() {
            return STUB;
        }
    }

    VideoTimerComponent$Companion$STUB$1.a R0();
}
