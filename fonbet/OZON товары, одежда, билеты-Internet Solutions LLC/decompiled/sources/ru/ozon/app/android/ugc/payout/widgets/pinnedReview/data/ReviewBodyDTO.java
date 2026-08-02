package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

import Fj.c;
import Ih.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eBG\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;", "", "content", "", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "mediaPreviews", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO$MediaDTO;", "contextReviews", "Lru/ozon/uni/atoms/data/text/TextDTO;", "badges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getMediaPreviews", "getContextReviews", "getBadges", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MediaDTO", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewBodyDTO {
    private final List<BadgeDTO> badges;
    private final List<IconTitleSubtitleCellDTO> content;
    private final List<TextDTO> contextReviews;
    private final List<MediaDTO> mediaPreviews;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO$MediaDTO;", "", "preview", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "getPreview", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaDTO {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final IconDTO preview;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final PreloadVideoInfo videoInfo;

        public MediaDTO(@NotNull IconDTO preview, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, PreloadVideoInfo preloadVideoInfo) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(action, "action");
            this.preview = preview;
            this.action = action;
            this.trackingInfo = map;
            this.videoInfo = preloadVideoInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaDTO copy$default(MediaDTO mediaDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, PreloadVideoInfo preloadVideoInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = mediaDTO.preview;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = mediaDTO.action;
            }
            if ((i11 & 4) != 0) {
                map = mediaDTO.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                preloadVideoInfo = mediaDTO.videoInfo;
            }
            return mediaDTO.copy(iconDTO, atomActionDTO, map, preloadVideoInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getPreview() {
            return this.preview;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        @NotNull
        public final MediaDTO copy(@NotNull IconDTO preview, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, PreloadVideoInfo videoInfo) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(action, "action");
            return new MediaDTO(preview, action, trackingInfo, videoInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaDTO)) {
                return false;
            }
            MediaDTO mediaDTO = (MediaDTO) other;
            return Intrinsics.d(this.preview, mediaDTO.preview) && Intrinsics.d(this.action, mediaDTO.action) && Intrinsics.d(this.trackingInfo, mediaDTO.trackingInfo) && Intrinsics.d(this.videoInfo, mediaDTO.videoInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final IconDTO getPreview() {
            return this.preview;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.preview.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            PreloadVideoInfo preloadVideoInfo = this.videoInfo;
            return hashCode + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MediaDTO(preview=" + this.preview + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", videoInfo=" + this.videoInfo + ")";
        }
    }

    public ReviewBodyDTO(List<IconTitleSubtitleCellDTO> list, List<MediaDTO> list2, List<TextDTO> list3, List<BadgeDTO> list4) {
        this.content = list;
        this.mediaPreviews = list2;
        this.contextReviews = list3;
        this.badges = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewBodyDTO copy$default(ReviewBodyDTO reviewBodyDTO, List list, List list2, List list3, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewBodyDTO.content;
        }
        if ((i11 & 2) != 0) {
            list2 = reviewBodyDTO.mediaPreviews;
        }
        if ((i11 & 4) != 0) {
            list3 = reviewBodyDTO.contextReviews;
        }
        if ((i11 & 8) != 0) {
            list4 = reviewBodyDTO.badges;
        }
        return reviewBodyDTO.copy(list, list2, list3, list4);
    }

    public final List<IconTitleSubtitleCellDTO> component1() {
        return this.content;
    }

    public final List<MediaDTO> component2() {
        return this.mediaPreviews;
    }

    public final List<TextDTO> component3() {
        return this.contextReviews;
    }

    public final List<BadgeDTO> component4() {
        return this.badges;
    }

    @NotNull
    public final ReviewBodyDTO copy(List<IconTitleSubtitleCellDTO> content, List<MediaDTO> mediaPreviews, List<TextDTO> contextReviews, List<BadgeDTO> badges) {
        return new ReviewBodyDTO(content, mediaPreviews, contextReviews, badges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewBodyDTO)) {
            return false;
        }
        ReviewBodyDTO reviewBodyDTO = (ReviewBodyDTO) other;
        return Intrinsics.d(this.content, reviewBodyDTO.content) && Intrinsics.d(this.mediaPreviews, reviewBodyDTO.mediaPreviews) && Intrinsics.d(this.contextReviews, reviewBodyDTO.contextReviews) && Intrinsics.d(this.badges, reviewBodyDTO.badges);
    }

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final List<IconTitleSubtitleCellDTO> getContent() {
        return this.content;
    }

    public final List<TextDTO> getContextReviews() {
        return this.contextReviews;
    }

    public final List<MediaDTO> getMediaPreviews() {
        return this.mediaPreviews;
    }

    public int hashCode() {
        List<IconTitleSubtitleCellDTO> list = this.content;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MediaDTO> list2 = this.mediaPreviews;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TextDTO> list3 = this.contextReviews;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BadgeDTO> list4 = this.badges;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<IconTitleSubtitleCellDTO> list = this.content;
        List<MediaDTO> list2 = this.mediaPreviews;
        List<TextDTO> list3 = this.contextReviews;
        List<BadgeDTO> list4 = this.badges;
        StringBuilder d11 = c.d("ReviewBodyDTO(content=", list, ", mediaPreviews=", ", contextReviews=", list2);
        d11.append(list3);
        d11.append(", badges=");
        d11.append(list4);
        d11.append(")");
        return d11.toString();
    }
}
