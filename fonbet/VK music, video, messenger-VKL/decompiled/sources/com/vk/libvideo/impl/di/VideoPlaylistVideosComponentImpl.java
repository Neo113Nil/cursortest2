package com.vk.libvideo.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.di.VideoPlaylistVideosComponent;
import xsna.b7m;
import xsna.bpn0;
import xsna.e7m;
import xsna.m5t0;
import xsna.vqe0;

/* compiled from: VideoPlaylistVideosComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoPlaylistVideosComponentImpl implements VideoPlaylistVideosComponent {
    public final bpn0 a = new bpn0(new vqe0(11));

    /* compiled from: VideoPlaylistVideosComponentImpl.kt */
    public static final class a implements b7m<VideoPlaylistVideosComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoPlaylistVideosComponentImpl();
        }
    }

    @Override // com.vk.libvideo.api.di.VideoPlaylistVideosComponent
    public final m5t0 U7() {
        return (m5t0) this.a.getValue();
    }
}
