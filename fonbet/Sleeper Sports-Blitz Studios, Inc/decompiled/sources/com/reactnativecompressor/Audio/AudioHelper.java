package com.reactnativecompressor.Audio;

import android.media.MediaExtractor;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.reactnativecompressor.Utils.Utils;
import io.radar.sdk.RadarTrackingOptions;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioHelper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/reactnativecompressor/Audio/AudioHelper;", "", "<init>", "()V", "quality", "", "getQuality", "()Ljava/lang/String;", "setQuality", "(Ljava/lang/String;)V", "bitrate", "", "getBitrate", "()I", "setBitrate", "(I)V", "samplerate", "getSamplerate", "setSamplerate", "channels", "getChannels", "setChannels", "progressDivider", "getProgressDivider", "()Ljava/lang/Integer;", "setProgressDivider", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AudioHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String quality = "medium";
    private int bitrate = -1;
    private int samplerate = -1;
    private int channels = -1;
    private Integer progressDivider = 0;

    public final String getQuality() {
        return this.quality;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final void setBitrate(int i) {
        this.bitrate = i;
    }

    public final int getSamplerate() {
        return this.samplerate;
    }

    public final void setSamplerate(int i) {
        this.samplerate = i;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final void setChannels(int i) {
        this.channels = i;
    }

    public final Integer getProgressDivider() {
        return this.progressDivider;
    }

    public final void setProgressDivider(Integer num) {
        this.progressDivider = num;
    }

    /* compiled from: AudioHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/reactnativecompressor/Audio/AudioHelper$Companion;", "", "<init>", "()V", "fromMap", "Lcom/reactnativecompressor/Audio/AudioHelper;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "getAudioBitrate", "", "path", "", "getDestinationBitrateByQuality", "quality", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AudioHelper fromMap(ReadableMap map) {
            Intrinsics.checkNotNullParameter(map, "map");
            AudioHelper audioHelper = new AudioHelper();
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (nextKey.hashCode()) {
                    case -102270099:
                        if (!nextKey.equals("bitrate")) {
                            break;
                        } else {
                            int i = map.getInt(nextKey);
                            if (i > 320000 || i < 64000) {
                                i = 64000;
                            }
                            audioHelper.setBitrate(i);
                            break;
                        }
                    case 144039306:
                        if (!nextKey.equals("samplerate")) {
                            break;
                        } else {
                            audioHelper.setSamplerate(map.getInt(nextKey));
                            break;
                        }
                    case 651215103:
                        if (!nextKey.equals("quality")) {
                            break;
                        } else {
                            audioHelper.setQuality(map.getString(nextKey));
                            break;
                        }
                    case 1432626128:
                        if (!nextKey.equals("channels")) {
                            break;
                        } else {
                            audioHelper.setChannels(map.getInt(nextKey));
                            break;
                        }
                }
            }
            return audioHelper;
        }

        public final int getAudioBitrate(String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            long length = new File(path).length() * 8;
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Intrinsics.checkNotNullExpressionValue(mediaExtractor.getTrackFormat(0), "getTrackFormat(...)");
            return ((int) (length / (r7.getLong("durationUs") / 1000000.0d))) / 1000;
        }

        public final int getDestinationBitrateByQuality(String path, String quality) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(quality, "quality");
            int audioBitrate = getAudioBitrate(path);
            Utils.INSTANCE.addLog("source bitrate: " + audioBitrate);
            String lowerCase = quality.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1078030475) {
                if (hashCode != 107348) {
                    if (hashCode == 3202466 && lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
                        return Math.min(320, (int) (audioBitrate * 0.7d));
                    }
                } else if (lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR)) {
                    return Math.max(64, (int) (audioBitrate * 0.3d));
                }
            } else if (lowerCase.equals("medium")) {
                return (int) (audioBitrate * 0.5d);
            }
            Utils.INSTANCE.addLog("Invalid quality level. Please enter 'low', 'medium', or 'high'.");
            return audioBitrate;
        }
    }
}
