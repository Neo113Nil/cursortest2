package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: VideoPlaylistReversionComponent.kt */
/* loaded from: classes2.dex */
public interface VideoPlaylistReversionComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoPlaylistReversionComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoPlaylistReversionComponent STUB = new VideoPlaylistReversionComponent() { // from class: com.vk.libvideo.api.di.VideoPlaylistReversionComponent$Companion$STUB$1
            @Override // com.vk.libvideo.api.di.VideoPlaylistReversionComponent
            public final boolean L0(int i, long j) {
                return false;
            }

            @Override // com.vk.libvideo.api.di.VideoPlaylistReversionComponent
            public final void X3(int i, long j) {
            }

            @Override // com.vk.libvideo.api.di.VideoPlaylistReversionComponent
            public final void M2(int i, long j, boolean z) {
            }
        };

        public final VideoPlaylistReversionComponent getSTUB() {
            return STUB;
        }
    }

    boolean L0(int i, long j);

    void M2(int i, long j, boolean z);

    void X3(int i, long j);
}
