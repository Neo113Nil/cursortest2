package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation;

import Sc.o;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewAdapter;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewBinder;", "reviewGalleryViewBinder", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewBinder;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;", "item", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "getType", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "mapItem", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;", "previewView", "Landroid/widget/ImageView;", "iconView", "Lkotlin/Function1;", "", "", "openDeeplink", "bindMediaSource", "(Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;Landroid/widget/ImageView;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "view", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showMoreButton", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindShowMoreButton", "(Landroid/view/View;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lkotlin/jvm/functions/Function1;)V", "imageView", "bindImage", "(Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewBinder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryViewAdapter {

    @NotNull
    private final ReviewGalleryViewBinder reviewGalleryViewBinder;

    public ReviewGalleryViewAdapter(@NotNull ReviewGalleryViewBinder reviewGalleryViewBinder) {
        Intrinsics.checkNotNullParameter(reviewGalleryViewBinder, "reviewGalleryViewBinder");
        this.reviewGalleryViewBinder = reviewGalleryViewBinder;
    }

    private final MediaVO.MediaType getType(ReviewGalleryPreviewVO.MediaContentVO item) {
        if (item instanceof ReviewGalleryPreviewVO.MediaContentVO.VideoVO) {
            return new MediaVO.MediaType.VIDEO(((ReviewGalleryPreviewVO.MediaContentVO.VideoVO) item).getVideoInfo());
        }
        if (item instanceof ReviewGalleryPreviewVO.MediaContentVO.ImageVO) {
            return MediaVO.MediaType.PHOTO.INSTANCE;
        }
        throw new o();
    }

    private final MediaVO mapItem(ReviewGalleryPreviewVO.MediaContentVO item) {
        String str;
        MediaVO.State.Ready ready = new MediaVO.State.Ready(item.getUrl());
        MediaVO.MediaType type = getType(item);
        AtomActionDTO action = item.getAction();
        if (action == null || (str = action.getLink()) == null) {
            str = "";
        }
        return new MediaVO(ready, str, type, null, null, 16, null);
    }

    public final void bindImage(@NotNull StatusableMediaPreviewView imageView, @NotNull ReviewGalleryPreviewVO.MediaContentVO item, @NotNull Function1<? super String, Unit> openDeeplink) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        this.reviewGalleryViewBinder.bindImage(imageView, mapItem(item), openDeeplink);
    }

    public final void bindMediaSource(@NotNull StatusableMediaPreviewView previewView, @NotNull ImageView iconView, @NotNull ReviewGalleryPreviewVO.MediaContentVO item, @NotNull Function1<? super String, Unit> openDeeplink) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        this.reviewGalleryViewBinder.bindMediaSource(previewView, iconView, mapItem(item), openDeeplink);
    }

    public final void bindShowMoreButton(@NotNull View view, @NotNull ReviewGalleryPreviewVO.MediaContentVO item, ButtonV3Atom.LargeBorderlessButton showMoreButton, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.reviewGalleryViewBinder.bindShowMoreButton(view, mapItem(item), showMoreButton, onAction);
    }
}
