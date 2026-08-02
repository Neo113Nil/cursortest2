package com.vk.libvideo.api.seek.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import xsna.yet0;
import xsna.zet0;

/* compiled from: VideoSeekComponent.kt */
/* loaded from: classes2.dex */
public interface VideoSeekComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoSeekComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoSeekComponent STUB = new VideoSeekComponent() { // from class: com.vk.libvideo.api.seek.di.VideoSeekComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.libvideo.api.seek.di.VideoSeekComponent
            public final zet0 E1() {
                return this.a;
            }

            /* compiled from: VideoSeekComponent.kt */
            public static final class a implements zet0 {
                @Override // xsna.zet0
                public final void a(yet0 yet0Var, VideoSeekEventSource videoSeekEventSource, VideoSeekEventScreenMode videoSeekEventScreenMode, long j) {
                }
            }
        };

        public final VideoSeekComponent getSTUB() {
            return STUB;
        }
    }

    zet0 E1();
}
