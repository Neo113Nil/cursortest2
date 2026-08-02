package androidx.media3.exoplayer.ima;

import android.content.Context;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;

/* loaded from: classes5.dex */
public class ImaServerSideAdInsertionMediaSource {

    public static class AdsLoader {
        public void release() {
        }

        public void setPlayer(Player player) {
        }

        public static class Builder {
            public Builder setAdErrorListener(Object obj) {
                return this;
            }

            public Builder setAdEventListener(Object obj) {
                return this;
            }

            public Builder(Context context, View view) {
            }

            public AdsLoader build() {
                return new AdsLoader();
            }
        }
    }

    public static class Factory implements MediaSource.Factory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            return null;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        public Factory(AdsLoader adsLoader, MediaSource.Factory factory) {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[0];
        }
    }
}
