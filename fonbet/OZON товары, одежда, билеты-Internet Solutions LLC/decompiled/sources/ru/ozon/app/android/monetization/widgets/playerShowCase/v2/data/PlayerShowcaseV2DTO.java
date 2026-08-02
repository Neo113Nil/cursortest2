package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;", "", "videoUrl", "", "videoFormat", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO$VideoFormat;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO$VideoFormat;)V", "getVideoUrl", "()Ljava/lang/String;", "getVideoFormat", "()Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO$VideoFormat;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "VideoFormat", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PlayerShowcaseV2DTO {
    public static final int $stable = 0;

    @NotNull
    private final VideoFormat videoFormat;

    @NotNull
    private final String videoUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO$VideoFormat;", "", "<init>", "(Ljava/lang/String;I)V", "MP4", "HLS", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VideoFormat {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VideoFormat[] $VALUES;
        public static final VideoFormat MP4 = new VideoFormat("MP4", 0);
        public static final VideoFormat HLS = new VideoFormat("HLS", 1);

        private static final /* synthetic */ VideoFormat[] $values() {
            return new VideoFormat[]{MP4, HLS};
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

    public PlayerShowcaseV2DTO(@NotNull String videoUrl, @NotNull VideoFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.videoUrl = videoUrl;
        this.videoFormat = videoFormat;
    }

    public static /* synthetic */ PlayerShowcaseV2DTO copy$default(PlayerShowcaseV2DTO playerShowcaseV2DTO, String str, VideoFormat videoFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = playerShowcaseV2DTO.videoUrl;
        }
        if ((i11 & 2) != 0) {
            videoFormat = playerShowcaseV2DTO.videoFormat;
        }
        return playerShowcaseV2DTO.copy(str, videoFormat);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final VideoFormat getVideoFormat() {
        return this.videoFormat;
    }

    @NotNull
    public final PlayerShowcaseV2DTO copy(@NotNull String videoUrl, @NotNull VideoFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        return new PlayerShowcaseV2DTO(videoUrl, videoFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerShowcaseV2DTO)) {
            return false;
        }
        PlayerShowcaseV2DTO playerShowcaseV2DTO = (PlayerShowcaseV2DTO) other;
        return Intrinsics.d(this.videoUrl, playerShowcaseV2DTO.videoUrl) && this.videoFormat == playerShowcaseV2DTO.videoFormat;
    }

    @NotNull
    public final VideoFormat getVideoFormat() {
        return this.videoFormat;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        return this.videoFormat.hashCode() + (this.videoUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PlayerShowcaseV2DTO(videoUrl=" + this.videoUrl + ", videoFormat=" + this.videoFormat + ")";
    }
}
