package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.ImageGalleryFullViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/ImageGalleryFullViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/BaseGalleryFullViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewImageView;", "previewIv", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "widgetViewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "maxHeight", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewImageView;Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;I)V", "", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Image;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Image;)V", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewImageView;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "LWZ/l;", "I", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Image;", "currentPosition", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageGalleryFullViewHolder extends BaseGalleryFullViewHolder {
    private int currentPosition;
    private GalleryFullViewVO.GalleryItemVO.Image item;

    @NotNull
    private final G lifecycleObserver;
    private final int maxHeight;

    @NotNull
    private final GalleryFullViewImageView previewIv;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final GallerySyncViewModelImpl widgetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGalleryFullViewHolder(@NotNull GalleryFullViewImageView previewIv, @NotNull GallerySyncViewModelImpl widgetViewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, int i11) {
        super(previewIv);
        Intrinsics.checkNotNullParameter(previewIv, "previewIv");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.previewIv = previewIv;
        this.widgetViewModel = widgetViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.maxHeight = i11;
        this.lifecycleObserver = new G() { // from class: KD.h
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                ImageGalleryFullViewHolder.lifecycleObserver$lambda$1(ImageGalleryFullViewHolder.this, j11, aVar);
            }
        };
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            ComponentCallbacksC5392m c12 = refs.getContainer().c();
            previewIv.setOnTouchListener(new GalleryFullViewPinchToZoomTouchListener(viewGroup, c12 != null ? c12.getParentFragment() : null, new ImageGalleryFullViewHolder$1$1(refs)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$1(ImageGalleryFullViewHolder imageGalleryFullViewHolder, J j11, AbstractC5434v.a event) {
        GalleryFullViewVO.GalleryItemVO.Image image;
        String galleryId;
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC5434v.a.ON_DESTROY || (image = imageGalleryFullViewHolder.item) == null || (galleryId = image.getGalleryId()) == null) {
            return;
        }
        imageGalleryFullViewHolder.widgetViewModel.updateCurrentSyncItem(galleryId, new GallerySyncModel(imageGalleryFullViewHolder.currentPosition, null));
    }

    public final void bind(@NotNull GalleryFullViewVO.GalleryItemVO.Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.currentPosition = getAdapterPosition();
        ImageView imageView = this.previewIv.getImageView();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        if (this.maxHeight < item.getHeight()) {
            int i13 = this.maxHeight;
            layoutParams.height = i13;
            layoutParams.width = C6915b.b(item.getContainerRatio().doubleValue() * i13);
        } else {
            layoutParams.height = item.getHeight();
            layoutParams.width = -1;
        }
        if (i11 != layoutParams.height || i12 != layoutParams.width) {
            imageView.setLayoutParams(layoutParams);
        }
        ImageViewExtKt.load$default(this.previewIv.getImageView(), item.getUrl(), null, null, null, null, false, null, 126, null);
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(this.lifecycleObserver);
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        getLifecycle().e(this.lifecycleObserver);
    }
}
