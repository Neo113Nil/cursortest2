package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;
import io.agora.mediaplayer.IMediaPlayerCustomDataProvider;

/* loaded from: classes2.dex */
public class MediaPlayerSource {
    Boolean isAgoraSource;
    Boolean isLiveSource;
    long startPos = 0;
    boolean enableCache = false;
    boolean enableMultiAudioTrack = false;
    String url = null;
    String uri = null;
    boolean autoPlay = true;
    IMediaPlayerCustomDataProvider provider = null;

    public void enableAgoraSource(boolean z10) {
        this.isAgoraSource = Boolean.valueOf(z10);
    }

    public void enableLiveSource(boolean z10) {
        this.isLiveSource = Boolean.valueOf(z10);
    }

    @CalledByNative
    public IMediaPlayerCustomDataProvider getProvider() {
        return this.provider;
    }

    @CalledByNative
    public long getStartPos() {
        return this.startPos;
    }

    @CalledByNative
    public String getUri() {
        return this.uri;
    }

    @CalledByNative
    public String getUrl() {
        return this.url;
    }

    @CalledByNative
    public Boolean isAgoraSource() {
        return this.isAgoraSource;
    }

    @CalledByNative
    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    @CalledByNative
    public boolean isEnableCache() {
        return this.enableCache;
    }

    @CalledByNative
    public boolean isEnableMultiAudioTrack() {
        return this.enableMultiAudioTrack;
    }

    @CalledByNative
    public Boolean isLiveSource() {
        return this.isLiveSource;
    }

    public void setAutoPlay(boolean z10) {
        this.autoPlay = z10;
    }

    public void setEnableCache(boolean z10) {
        this.enableCache = z10;
    }

    public void setEnableMultiAudioTrack(boolean z10) {
        this.enableMultiAudioTrack = z10;
    }

    public void setProvider(IMediaPlayerCustomDataProvider iMediaPlayerCustomDataProvider) {
        this.provider = iMediaPlayerCustomDataProvider;
    }

    public void setStartPos(long j10) {
        this.startPos = j10;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MediaPlayerSource{url='");
        sb2.append(this.url);
        sb2.append('\'');
        sb2.append(", uri='");
        sb2.append(this.uri);
        sb2.append('\'');
        sb2.append(", startPos=");
        sb2.append(this.startPos);
        sb2.append(", enableCache=");
        sb2.append(this.enableCache);
        sb2.append(", autoPlay=");
        sb2.append(this.autoPlay);
        sb2.append(", enableMultiAudioTrack=");
        sb2.append(this.enableMultiAudioTrack);
        sb2.append(", isLiveSource=");
        Boolean bool = this.isLiveSource;
        Boolean bool2 = null;
        if (bool != null) {
            bool.booleanValue();
        } else {
            bool = null;
        }
        sb2.append(bool);
        sb2.append(", isAgoraSource=");
        Boolean bool3 = this.isAgoraSource;
        if (bool3 != null) {
            bool3.booleanValue();
            bool2 = bool3;
        }
        sb2.append(bool2);
        sb2.append(", provider=");
        sb2.append(this.provider);
        sb2.append('}');
        return sb2.toString();
    }
}
