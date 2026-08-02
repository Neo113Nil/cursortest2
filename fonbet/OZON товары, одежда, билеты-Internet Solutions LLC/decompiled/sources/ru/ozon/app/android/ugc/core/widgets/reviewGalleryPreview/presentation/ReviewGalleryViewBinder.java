package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation;

import Hx.ViewOnClickListenerC3169a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryPreviewShowMoreBinding;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryViewBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewBinder;", "", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "<init>", "(Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;", "previewView", "Landroid/widget/ImageView;", "iconView", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "item", "Lkotlin/Function1;", "", "", "openDeeplink", "bindMediaSource", "(Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;Landroid/widget/ImageView;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Lkotlin/jvm/functions/Function1;)V", "bindImage", "(Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "view", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showMoreButton", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindShowMoreButton", "(Landroid/view/View;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryViewBinder {

    @NotNull
    private final PlayerPreloader playerPreloader;

    public ReviewGalleryViewBinder(@NotNull PlayerPreloader playerPreloader) {
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        this.playerPreloader = playerPreloader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindImage$lambda$2$lambda$1(MediaVO mediaVO, Function1 function1, ReviewGalleryViewBinder reviewGalleryViewBinder, View view) {
        PreloadVideoInfo videoInfo;
        MediaVO.MediaType type = mediaVO.getType();
        if ((type instanceof MediaVO.MediaType.VIDEO) && (videoInfo = ((MediaVO.MediaType.VIDEO) type).getVideoInfo()) != null) {
            PlayerPreloader.DefaultImpls.preCreatePlayer$default(reviewGalleryViewBinder.playerPreloader, videoInfo, null, 2, null);
        }
        function1.invoke(mediaVO.getDeeplink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindShowMoreButton$lambda$5(ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Function1 function1, View view) {
        AtomAction atomAction;
        AtomActionDTO action = largeBorderlessButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, largeBorderlessButton.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bindImage(@NotNull StatusableMediaPreviewView previewView, @NotNull final MediaVO item, @NotNull final Function1<? super String, Unit> openDeeplink) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        previewView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        previewView.setClipToOutline(true);
        StatusableMediaPreviewView.bind$default(previewView, item, null, null, 6, null);
        previewView.setParandjaForDarkTheme();
        previewView.setOnClickListener(new View.OnClickListener() { // from class: ZU.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewGalleryViewBinder.bindImage$lambda$2$lambda$1(MediaVO.this, openDeeplink, this, view);
            }
        });
    }

    public final void bindMediaSource(@NotNull StatusableMediaPreviewView previewView, @NotNull ImageView iconView, MediaVO item, @NotNull Function1<? super String, Unit> openDeeplink) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        if (item == null) {
            ViewExtKt.gone(iconView);
            ViewExtKt.gone(previewView);
            return;
        }
        bindImage(previewView, item, openDeeplink);
        if (item.getType() instanceof MediaVO.MediaType.VIDEO) {
            ViewExtKt.show(iconView);
        } else {
            ViewExtKt.gone(iconView);
        }
    }

    public final void bindShowMoreButton(@NotNull View view, MediaVO item, ButtonV3Atom.LargeBorderlessButton showMoreButton, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (item == null) {
            ViewExtKt.gone(view);
            return;
        }
        ViewGalleryPreviewShowMoreBinding bind = ViewGalleryPreviewShowMoreBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        if ((item.getType() instanceof MediaVO.MediaType.VIDEO) && showMoreButton == null) {
            AppCompatImageView iconIv = bind.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            ViewExtKt.show(iconIv);
        } else {
            AppCompatImageView iconIv2 = bind.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
            ViewExtKt.gone(iconIv2);
        }
        StatusableMediaPreviewView statusableMediaPreviewView = bind.photoPv;
        statusableMediaPreviewView.setClipToOutline(true);
        StatusableMediaPreviewView.bind$default(statusableMediaPreviewView, item, Boolean.TRUE, null, 4, null);
        statusableMediaPreviewView.setBackground(a.getDrawable(statusableMediaPreviewView.getContext(), R$drawable.bg_preview_round_gallery_item));
        Context context = statusableMediaPreviewView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewExtKt.setBackgroundTint(statusableMediaPreviewView, ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja));
        statusableMediaPreviewView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (showMoreButton == null) {
            TextAtomV2View showMoreTav = bind.showMoreTav;
            Intrinsics.checkNotNullExpressionValue(showMoreTav, "showMoreTav");
            ViewExtKt.gone(showMoreTav);
        } else {
            TextAtomV2View showMoreTav2 = bind.showMoreTav;
            Intrinsics.checkNotNullExpressionValue(showMoreTav2, "showMoreTav");
            ViewExtKt.show(showMoreTav2);
            bind.showMoreTav.setText(showMoreButton.getText());
            bind.showMoreTav.setTextIsSelectable(false);
            view.setOnClickListener(new ViewOnClickListenerC3169a(1, showMoreButton, onAction));
        }
    }
}
