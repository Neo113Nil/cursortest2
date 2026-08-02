package ru.ozon.app.android.video.preload.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "", "videoUrl", "", "format", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo$VideoFormat;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo$VideoFormat;)V", "getVideoUrl", "()Ljava/lang/String;", "getFormat", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo$VideoFormat;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "VideoFormat", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PreloadVideoInfo {
    public static final int $stable = 0;
    private final VideoFormat format;

    @NotNull
    private final String videoUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/video/preload/data/PreloadVideoInfo$VideoFormat;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "MP4", "HLS", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VideoFormat {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VideoFormat[] $VALUES;

        @i(name = "INVALID")
        public static final VideoFormat INVALID = new VideoFormat("INVALID", 0);

        @i(name = "MP4")
        public static final VideoFormat MP4 = new VideoFormat("MP4", 1);

        @i(name = "HLS")
        public static final VideoFormat HLS = new VideoFormat("HLS", 2);

        private static final /* synthetic */ VideoFormat[] $values() {
            return new VideoFormat[]{INVALID, MP4, HLS};
        }

        static {
            VideoFormat[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private VideoFormat(String str, int i11) {
        }

        public static VideoFormat valueOf(String str) {
            return (VideoFormat) Enum.valueOf(VideoFormat.class, str);
        }

        public static VideoFormat[] values() {
            return (VideoFormat[]) $VALUES.clone();
        }
    }

    public PreloadVideoInfo(@NotNull String videoUrl, VideoFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.videoUrl = videoUrl;
        this.format = videoFormat;
    }

    public static /* synthetic */ PreloadVideoInfo copy$default(PreloadVideoInfo preloadVideoInfo, String str, VideoFormat videoFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = preloadVideoInfo.videoUrl;
        }
        if ((i11 & 2) != 0) {
            videoFormat = preloadVideoInfo.format;
        }
        return preloadVideoInfo.copy(str, videoFormat);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoFormat getFormat() {
        return this.format;
    }

    @NotNull
    public final PreloadVideoInfo copy(@NotNull String videoUrl, VideoFormat format) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        return new PreloadVideoInfo(videoUrl, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreloadVideoInfo)) {
            return false;
        }
        PreloadVideoInfo preloadVideoInfo = (PreloadVideoInfo) other;
        return Intrinsics.d(this.videoUrl, preloadVideoInfo.videoUrl) && this.format == preloadVideoInfo.format;
    }

    public final VideoFormat getFormat() {
        return this.format;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int hashCode = this.videoUrl.hashCode() * 31;
        VideoFormat videoFormat = this.format;
        return hashCode + (videoFormat == null ? 0 : videoFormat.hashCode());
    }

    @NotNull
    public String toString() {
        return "PreloadVideoInfo(videoUrl=" + this.videoUrl + ", format=" + this.format + ")";
    }
}
