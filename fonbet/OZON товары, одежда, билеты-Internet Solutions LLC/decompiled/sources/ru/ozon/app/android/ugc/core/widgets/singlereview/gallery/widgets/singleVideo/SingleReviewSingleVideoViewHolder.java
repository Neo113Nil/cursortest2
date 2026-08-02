package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.singleVideo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views.SingleReviewGalleryItemView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.SingleReviewGalleryViewHolder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryViewUtilsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryItemView;", "view", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryItemView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryItemView;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewSingleVideoViewHolder extends SingleReviewGalleryViewHolder<SingleReviewSingleVideoVO> {

    @NotNull
    private final SingleReviewGalleryItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewSingleVideoViewHolder(@NotNull ComposerReferences refs, @NotNull SingleReviewGalleryItemView view) {
        super(view, refs);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleReviewSingleVideoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bindMedia(item.getMedia(), item.getMediaPreviewCornerRadius(), new SingleReviewSingleVideoViewHolder$bind$1(this));
        this.view.bindSticker(item.getMediaImageSticker(), getActionHandler());
        SingleReviewGalleryViewUtilsKt.updatePaddings(this.view, item.getPaddings());
    }
}
