package com.vk.media.playback.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import xsna.b7m;
import xsna.cv10;
import xsna.e7m;
import xsna.ev10;
import xsna.fpf0;

/* compiled from: MediaPlaybackComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MediaPlaybackComponentImpl implements MediaPlaybackComponent {
    public final MediaPipelineComponent a;

    /* compiled from: MediaPlaybackComponentImpl.kt */
    public static final class a implements b7m<MediaPlaybackComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MediaPlaybackComponentImpl((MediaPipelineComponent) e7mVar.a(fpf0.a(MediaPipelineComponent.class)));
        }
    }

    public MediaPlaybackComponentImpl(MediaPipelineComponent mediaPipelineComponent) {
        this.a = mediaPipelineComponent;
    }

    @Override // com.vk.media.playback.di.MediaPlaybackComponent
    public final cv10 Yb(Context context, String str) {
        return new ev10(context, str, this.a);
    }
}
