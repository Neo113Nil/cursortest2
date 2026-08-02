package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow;

import G.g;
import Kk.d;
import android.graphics.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Landroid/graphics/Rect;", "paddings", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem;", "listOfMedia", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "<init>", "(JLandroid/graphics/Rect;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Landroid/graphics/Rect;", "getPaddings", "()Landroid/graphics/Rect;", "Ljava/util/List;", "getListOfMedia", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMediaPreviewCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "MediaItem", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewGalleryRowVO implements c {
    private final long id;

    @NotNull
    private final List<MediaItem> listOfMedia;
    private final CornerRadius mediaPreviewCornerRadius;

    @NotNull
    private final Rect paddings;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem;", "", "media", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "getMedia", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "Media", "MoreButton", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem$Media;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem$MoreButton;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MediaItem {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem$Media;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "media", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "getMedia", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Media implements MediaItem {
            public static final int $stable = MediaVO.$stable;

            @NotNull
            private final MediaVO media;

            public Media(@NotNull MediaVO media) {
                Intrinsics.checkNotNullParameter(media, "media");
                this.media = media;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Media) && Intrinsics.d(this.media, ((Media) other).media);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow.SingleReviewGalleryRowVO.MediaItem
            @NotNull
            public MediaVO getMedia() {
                return this.media;
            }

            public int hashCode() {
                return this.media.hashCode();
            }

            @NotNull
            public String toString() {
                return "Media(media=" + this.media + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem$MoreButton;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "media", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showMoreButton", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "getMedia", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MoreButton implements MediaItem {
            public static final int $stable = ButtonV3Atom.LargeBorderlessButton.$stable | MediaVO.$stable;

            @NotNull
            private final MediaVO media;

            @NotNull
            private final ButtonV3Atom.LargeBorderlessButton showMoreButton;

            public MoreButton(@NotNull MediaVO media, @NotNull ButtonV3Atom.LargeBorderlessButton showMoreButton) {
                Intrinsics.checkNotNullParameter(media, "media");
                Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
                this.media = media;
                this.showMoreButton = showMoreButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MoreButton)) {
                    return false;
                }
                MoreButton moreButton = (MoreButton) other;
                return Intrinsics.d(this.media, moreButton.media) && Intrinsics.d(this.showMoreButton, moreButton.showMoreButton);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow.SingleReviewGalleryRowVO.MediaItem
            @NotNull
            public MediaVO getMedia() {
                return this.media;
            }

            @NotNull
            public final ButtonV3Atom.LargeBorderlessButton getShowMoreButton() {
                return this.showMoreButton;
            }

            public int hashCode() {
                return this.showMoreButton.hashCode() + (this.media.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "MoreButton(media=" + this.media + ", showMoreButton=" + this.showMoreButton + ")";
            }
        }

        @NotNull
        MediaVO getMedia();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleReviewGalleryRowVO(long j11, @NotNull Rect paddings, @NotNull List<? extends MediaItem> listOfMedia, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(listOfMedia, "listOfMedia");
        this.id = j11;
        this.paddings = paddings;
        this.listOfMedia = listOfMedia;
        this.mediaPreviewCornerRadius = cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewGalleryRowVO)) {
            return false;
        }
        SingleReviewGalleryRowVO singleReviewGalleryRowVO = (SingleReviewGalleryRowVO) other;
        return this.id == singleReviewGalleryRowVO.id && Intrinsics.d(this.paddings, singleReviewGalleryRowVO.paddings) && Intrinsics.d(this.listOfMedia, singleReviewGalleryRowVO.listOfMedia) && this.mediaPreviewCornerRadius == singleReviewGalleryRowVO.mediaPreviewCornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<MediaItem> getListOfMedia() {
        return this.listOfMedia;
    }

    public final CornerRadius getMediaPreviewCornerRadius() {
        return this.mediaPreviewCornerRadius;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(d.a(this.paddings, Long.hashCode(this.id) * 31, 31), 31, this.listOfMedia);
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        return b11 + (cornerRadius == null ? 0 : cornerRadius.hashCode());
    }

    @NotNull
    public String toString() {
        return "SingleReviewGalleryRowVO(id=" + this.id + ", paddings=" + this.paddings + ", listOfMedia=" + this.listOfMedia + ", mediaPreviewCornerRadius=" + this.mediaPreviewCornerRadius + ")";
    }
}
