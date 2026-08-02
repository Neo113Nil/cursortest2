package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import Fj.c;
import Ve.C4598rp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001dBG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;", "", "", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "content", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;", "mediaPreviews", "Lru/ozon/uni/atoms/data/text/TextDTO;", "contextReviews", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "getMediaPreviews", "getContextReviews", "getBadges", "MediaVO", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewBodyVO {
    private final List<BadgeDTO> badges;
    private final List<IconTitleSubtitleCellDTO> content;
    private final List<TextDTO> contextReviews;
    private final List<MediaVO> mediaPreviews;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "preview", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "videoInfo", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPreview", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaVO {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final IconDTO preview;
        private final PreloadVideoInfo videoInfo;

        public MediaVO(@NotNull IconDTO preview, @NotNull AtomAction action, PreloadVideoInfo preloadVideoInfo) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(action, "action");
            this.preview = preview;
            this.action = action;
            this.videoInfo = preloadVideoInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaVO)) {
                return false;
            }
            MediaVO mediaVO = (MediaVO) other;
            return Intrinsics.d(this.preview, mediaVO.preview) && Intrinsics.d(this.action, mediaVO.action) && Intrinsics.d(this.videoInfo, mediaVO.videoInfo);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final IconDTO getPreview() {
            return this.preview;
        }

        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, this.preview.hashCode() * 31, 31);
            PreloadVideoInfo preloadVideoInfo = this.videoInfo;
            return a11 + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode());
        }

        @NotNull
        public String toString() {
            return "MediaVO(preview=" + this.preview + ", action=" + this.action + ", videoInfo=" + this.videoInfo + ")";
        }
    }

    public ReviewBodyVO(List<IconTitleSubtitleCellDTO> list, List<MediaVO> list2, List<TextDTO> list3, List<BadgeDTO> list4) {
        this.content = list;
        this.mediaPreviews = list2;
        this.contextReviews = list3;
        this.badges = list4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewBodyVO)) {
            return false;
        }
        ReviewBodyVO reviewBodyVO = (ReviewBodyVO) other;
        return Intrinsics.d(this.content, reviewBodyVO.content) && Intrinsics.d(this.mediaPreviews, reviewBodyVO.mediaPreviews) && Intrinsics.d(this.contextReviews, reviewBodyVO.contextReviews) && Intrinsics.d(this.badges, reviewBodyVO.badges);
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

    public final List<MediaVO> getMediaPreviews() {
        return this.mediaPreviews;
    }

    public int hashCode() {
        List<IconTitleSubtitleCellDTO> list = this.content;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MediaVO> list2 = this.mediaPreviews;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TextDTO> list3 = this.contextReviews;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BadgeDTO> list4 = this.badges;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<IconTitleSubtitleCellDTO> list = this.content;
        List<MediaVO> list2 = this.mediaPreviews;
        List<TextDTO> list3 = this.contextReviews;
        List<BadgeDTO> list4 = this.badges;
        StringBuilder d11 = c.d("ReviewBodyVO(content=", list, ", mediaPreviews=", ", contextReviews=", list2);
        d11.append(list3);
        d11.append(", badges=");
        d11.append(list4);
        d11.append(")");
        return d11.toString();
    }
}
