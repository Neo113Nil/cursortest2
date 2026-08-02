package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data;

import B90.C2618u;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "", "isVertical", "", "videoFormat", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "videoUrls", "", "", "<init>", "(ZLru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;Ljava/util/List;)V", "()Z", "getVideoFormat", "()Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "getVideoUrls", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "VideoFormat", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PlayerShowcaseDTO {
    public static final int $stable = 8;
    private final boolean isVertical;

    @NotNull
    private final VideoFormat videoFormat;

    @NotNull
    private final List<String> videoUrls;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "", "<init>", "(Ljava/lang/String;I)V", "MP4", "HLS", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public PlayerShowcaseDTO(boolean z11, @NotNull VideoFormat videoFormat, @NotNull List<String> videoUrls) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        Intrinsics.checkNotNullParameter(videoUrls, "videoUrls");
        this.isVertical = z11;
        this.videoFormat = videoFormat;
        this.videoUrls = videoUrls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayerShowcaseDTO copy$default(PlayerShowcaseDTO playerShowcaseDTO, boolean z11, VideoFormat videoFormat, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = playerShowcaseDTO.isVertical;
        }
        if ((i11 & 2) != 0) {
            videoFormat = playerShowcaseDTO.videoFormat;
        }
        if ((i11 & 4) != 0) {
            list = playerShowcaseDTO.videoUrls;
        }
        return playerShowcaseDTO.copy(z11, videoFormat, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final VideoFormat getVideoFormat() {
        return this.videoFormat;
    }

    @NotNull
    public final List<String> component3() {
        return this.videoUrls;
    }

    @NotNull
    public final PlayerShowcaseDTO copy(boolean isVertical, @NotNull VideoFormat videoFormat, @NotNull List<String> videoUrls) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        Intrinsics.checkNotNullParameter(videoUrls, "videoUrls");
        return new PlayerShowcaseDTO(isVertical, videoFormat, videoUrls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerShowcaseDTO)) {
            return false;
        }
        PlayerShowcaseDTO playerShowcaseDTO = (PlayerShowcaseDTO) other;
        return this.isVertical == playerShowcaseDTO.isVertical && this.videoFormat == playerShowcaseDTO.videoFormat && Intrinsics.d(this.videoUrls, playerShowcaseDTO.videoUrls);
    }

    @NotNull
    public final VideoFormat getVideoFormat() {
        return this.videoFormat;
    }

    @NotNull
    public final List<String> getVideoUrls() {
        return this.videoUrls;
    }

    public int hashCode() {
        return this.videoUrls.hashCode() + ((this.videoFormat.hashCode() + (Boolean.hashCode(this.isVertical) * 31)) * 31);
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isVertical;
        VideoFormat videoFormat = this.videoFormat;
        List<String> list = this.videoUrls;
        StringBuilder sb2 = new StringBuilder("PlayerShowcaseDTO(isVertical=");
        sb2.append(z11);
        sb2.append(", videoFormat=");
        sb2.append(videoFormat);
        sb2.append(", videoUrls=");
        return C2618u.h(sb2, list, ")");
    }

    public /* synthetic */ PlayerShowcaseDTO(boolean z11, VideoFormat videoFormat, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, videoFormat, list);
    }
}
