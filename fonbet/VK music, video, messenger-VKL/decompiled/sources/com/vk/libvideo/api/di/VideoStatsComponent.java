package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: VideoStatsComponent.kt */
/* loaded from: classes2.dex */
public interface VideoStatsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoStatsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoStatsComponent STUB = new VideoStatsComponent() { // from class: com.vk.libvideo.api.di.VideoStatsComponent$Companion$STUB$1
            @Override // com.vk.libvideo.api.di.VideoStatsComponent
            public final d M6() {
                return new d();
            }
        };

        public final VideoStatsComponent getSTUB() {
            return STUB;
        }
    }

    d M6();
}
