package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.singleVideo;

import Kk.d;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.models.MediaImageStickerVO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "media", "Landroid/graphics/Rect;", "paddings", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/models/MediaImageStickerVO;", "mediaImageSticker", "<init>", "(JLru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Landroid/graphics/Rect;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/models/MediaImageStickerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "getMedia", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "Landroid/graphics/Rect;", "getPaddings", "()Landroid/graphics/Rect;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMediaPreviewCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/models/MediaImageStickerVO;", "getMediaImageSticker", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/models/MediaImageStickerVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewSingleVideoVO implements c {
    private final long id;

    @NotNull
    private final MediaVO media;
    private final MediaImageStickerVO mediaImageSticker;
    private final CornerRadius mediaPreviewCornerRadius;

    @NotNull
    private final Rect paddings;

    public SingleReviewSingleVideoVO(long j11, @NotNull MediaVO media, @NotNull Rect paddings, CornerRadius cornerRadius, MediaImageStickerVO mediaImageStickerVO) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.media = media;
        this.paddings = paddings;
        this.mediaPreviewCornerRadius = cornerRadius;
        this.mediaImageSticker = mediaImageStickerVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewSingleVideoVO)) {
            return false;
        }
        SingleReviewSingleVideoVO singleReviewSingleVideoVO = (SingleReviewSingleVideoVO) other;
        return this.id == singleReviewSingleVideoVO.id && Intrinsics.d(this.media, singleReviewSingleVideoVO.media) && Intrinsics.d(this.paddings, singleReviewSingleVideoVO.paddings) && this.mediaPreviewCornerRadius == singleReviewSingleVideoVO.mediaPreviewCornerRadius && Intrinsics.d(this.mediaImageSticker, singleReviewSingleVideoVO.mediaImageSticker);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final MediaVO getMedia() {
        return this.media;
    }

    public final MediaImageStickerVO getMediaImageSticker() {
        return this.mediaImageSticker;
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
        int a11 = d.a(this.paddings, (this.media.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        int hashCode = (a11 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        MediaImageStickerVO mediaImageStickerVO = this.mediaImageSticker;
        return hashCode + (mediaImageStickerVO != null ? mediaImageStickerVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SingleReviewSingleVideoVO(id=" + this.id + ", media=" + this.media + ", paddings=" + this.paddings + ", mediaPreviewCornerRadius=" + this.mediaPreviewCornerRadius + ", mediaImageSticker=" + this.mediaImageSticker + ")";
    }
}
