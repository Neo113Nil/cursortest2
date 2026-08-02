package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/models/MediaImageStickerVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MediaImageStickerVO {
    public static final int $stable = AtomAction.$stable;
    private final AtomAction clickAction;

    @NotNull
    private final ImageDTO image;

    public MediaImageStickerVO(@NotNull ImageDTO image, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.clickAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaImageStickerVO)) {
            return false;
        }
        MediaImageStickerVO mediaImageStickerVO = (MediaImageStickerVO) other;
        return Intrinsics.d(this.image, mediaImageStickerVO.image) && Intrinsics.d(this.clickAction, mediaImageStickerVO.clickAction);
    }

    public final AtomAction getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        AtomAction atomAction = this.clickAction;
        return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
    }

    @NotNull
    public String toString() {
        return "MediaImageStickerVO(image=" + this.image + ", clickAction=" + this.clickAction + ")";
    }
}
