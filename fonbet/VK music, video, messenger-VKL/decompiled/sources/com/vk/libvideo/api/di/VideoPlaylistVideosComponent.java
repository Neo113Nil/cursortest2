package com.vk.libvideo.api.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.video.VideoListWithTotalCount;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.a0;
import xsna.bpn0;
import xsna.jzm0;
import xsna.m5t0;

/* compiled from: VideoPlaylistVideosComponent.kt */
/* loaded from: classes2.dex */
public interface VideoPlaylistVideosComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoPlaylistVideosComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoPlaylistVideosComponent STUB = new VideoPlaylistVideosComponent() { // from class: com.vk.libvideo.api.di.VideoPlaylistVideosComponent$Companion$STUB$1
            public final bpn0 a = new bpn0(new jzm0(6));

            /* compiled from: VideoPlaylistVideosComponent.kt */
            public static final class a implements m5t0 {
                @Override // xsna.m5t0
                public final x<VideoListWithTotalCount> a(m5t0.a aVar) {
                    return a0.b;
                }
            }

            @Override // com.vk.libvideo.api.di.VideoPlaylistVideosComponent
            public final m5t0 U7() {
                return (m5t0) this.a.getValue();
            }
        };

        public final VideoPlaylistVideosComponent getSTUB() {
            return STUB;
        }
    }

    m5t0 U7();
}
