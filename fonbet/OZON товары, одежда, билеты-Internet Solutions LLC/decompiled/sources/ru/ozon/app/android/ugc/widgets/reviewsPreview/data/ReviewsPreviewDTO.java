package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J_\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO;", "", "items", "", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewItemDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "horizontalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "itemSpacing", "playbackType", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "backgroundColor", "<init>", "(Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getItemSpacing", "getPlaybackType", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "PlaybackType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsPreviewDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final Paddings horizontalPadding;
    private final Paddings itemSpacing;

    @NotNull
    private final List<ReviewsPreviewItemDTO> items;

    @NotNull
    private final PlaybackType playbackType;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYBACK_TYPE_SIMULTANEOUS", "PLAYBACK_TYPE_SEQUENTIAL", "PLAYBACK_TYPE_RANDOM", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PlaybackType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PlaybackType[] $VALUES;
        public static final PlaybackType PLAYBACK_TYPE_SIMULTANEOUS = new PlaybackType("PLAYBACK_TYPE_SIMULTANEOUS", 0);
        public static final PlaybackType PLAYBACK_TYPE_SEQUENTIAL = new PlaybackType("PLAYBACK_TYPE_SEQUENTIAL", 1);
        public static final PlaybackType PLAYBACK_TYPE_RANDOM = new PlaybackType("PLAYBACK_TYPE_RANDOM", 2);

        private static final /* synthetic */ PlaybackType[] $values() {
            return new PlaybackType[]{PLAYBACK_TYPE_SIMULTANEOUS, PLAYBACK_TYPE_SEQUENTIAL, PLAYBACK_TYPE_RANDOM};
        }

        static {
            PlaybackType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PlaybackType(String str, int i11) {
        }

        public static PlaybackType valueOf(String str) {
            return (PlaybackType) Enum.valueOf(PlaybackType.class, str);
        }

        public static PlaybackType[] values() {
            return (PlaybackType[]) $VALUES.clone();
        }
    }

    public ReviewsPreviewDTO(@NotNull List<ReviewsPreviewItemDTO> items, Map<String, TokenizedTrackingInfo> map, Paddings paddings, Paddings paddings2, @NotNull PlaybackType playbackType, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(playbackType, "playbackType");
        this.items = items;
        this.trackingInfo = map;
        this.horizontalPadding = paddings;
        this.itemSpacing = paddings2;
        this.playbackType = playbackType;
        this.backgroundColor = str;
    }

    public static /* synthetic */ ReviewsPreviewDTO copy$default(ReviewsPreviewDTO reviewsPreviewDTO, List list, Map map, Paddings paddings, Paddings paddings2, PlaybackType playbackType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewsPreviewDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = reviewsPreviewDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            paddings = reviewsPreviewDTO.horizontalPadding;
        }
        if ((i11 & 8) != 0) {
            paddings2 = reviewsPreviewDTO.itemSpacing;
        }
        if ((i11 & 16) != 0) {
            playbackType = reviewsPreviewDTO.playbackType;
        }
        if ((i11 & 32) != 0) {
            str = reviewsPreviewDTO.backgroundColor;
        }
        PlaybackType playbackType2 = playbackType;
        String str2 = str;
        return reviewsPreviewDTO.copy(list, map, paddings, paddings2, playbackType2, str2);
    }

    @NotNull
    public final List<ReviewsPreviewItemDTO> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getItemSpacing() {
        return this.itemSpacing;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PlaybackType getPlaybackType() {
        return this.playbackType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ReviewsPreviewDTO copy(@NotNull List<ReviewsPreviewItemDTO> items, Map<String, TokenizedTrackingInfo> trackingInfo, Paddings horizontalPadding, Paddings itemSpacing, @NotNull PlaybackType playbackType, String backgroundColor) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(playbackType, "playbackType");
        return new ReviewsPreviewDTO(items, trackingInfo, horizontalPadding, itemSpacing, playbackType, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsPreviewDTO)) {
            return false;
        }
        ReviewsPreviewDTO reviewsPreviewDTO = (ReviewsPreviewDTO) other;
        return Intrinsics.d(this.items, reviewsPreviewDTO.items) && Intrinsics.d(this.trackingInfo, reviewsPreviewDTO.trackingInfo) && this.horizontalPadding == reviewsPreviewDTO.horizontalPadding && this.itemSpacing == reviewsPreviewDTO.itemSpacing && this.playbackType == reviewsPreviewDTO.playbackType && Intrinsics.d(this.backgroundColor, reviewsPreviewDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final Paddings getItemSpacing() {
        return this.itemSpacing;
    }

    @NotNull
    public final List<ReviewsPreviewItemDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final PlaybackType getPlaybackType() {
        return this.playbackType;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Paddings paddings = this.horizontalPadding;
        int hashCode3 = (hashCode2 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.itemSpacing;
        int hashCode4 = (this.playbackType.hashCode() + ((hashCode3 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ReviewsPreviewItemDTO> list = this.items;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Paddings paddings = this.horizontalPadding;
        Paddings paddings2 = this.itemSpacing;
        PlaybackType playbackType = this.playbackType;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("ReviewsPreviewDTO(items=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", horizontalPadding=");
        Lh.a.e(sb2, paddings, ", itemSpacing=", paddings2, ", playbackType=");
        sb2.append(playbackType);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }
}
