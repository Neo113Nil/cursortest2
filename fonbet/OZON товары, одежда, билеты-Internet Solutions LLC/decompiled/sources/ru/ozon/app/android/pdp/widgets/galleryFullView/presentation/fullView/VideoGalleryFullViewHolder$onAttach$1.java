package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.FullScreenModel;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class VideoGalleryFullViewHolder$onAttach$1 extends AbstractC7737t implements Function1<FullScreenModel, Unit> {
    final /* synthetic */ VideoGalleryFullViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoGalleryFullViewHolder$onAttach$1(VideoGalleryFullViewHolder videoGalleryFullViewHolder) {
        super(1);
        this.this$0 = videoGalleryFullViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FullScreenModel fullScreenModel) {
        invoke2(fullScreenModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FullScreenModel it) {
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding2;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding3;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding4;
        GallerySyncViewModelImpl gallerySyncViewModelImpl;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding5;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding6;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding7;
        Drawable drawable;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding8;
        GallerySyncViewModelImpl gallerySyncViewModelImpl2;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding9;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding10;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding11;
        GalleryFullViewVideoScreenBinding galleryFullViewVideoScreenBinding12;
        GallerySyncViewModelImpl gallerySyncViewModelImpl3;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getIsFullScreen() && it.getScreenOrientation() == 0) {
            galleryFullViewVideoScreenBinding9 = this.this$0.binding;
            galleryFullViewVideoScreenBinding9.getRoot().getLayoutParams().height = -1;
            galleryFullViewVideoScreenBinding10 = this.this$0.binding;
            galleryFullViewVideoScreenBinding10.getRoot().requestLayout();
            galleryFullViewVideoScreenBinding11 = this.this$0.binding;
            galleryFullViewVideoScreenBinding11.getRoot().setBackground(null);
            galleryFullViewVideoScreenBinding12 = this.this$0.binding;
            ViewExtKt.gone(galleryFullViewVideoScreenBinding12.getOzonVideoVolumeIv());
            gallerySyncViewModelImpl3 = this.this$0.widgetViewModel;
            gallerySyncViewModelImpl3.onOrientationChanged(it);
            return;
        }
        if (!it.getIsFullScreen() && it.getScreenOrientation() == 1) {
            galleryFullViewVideoScreenBinding5 = this.this$0.binding;
            galleryFullViewVideoScreenBinding5.getRoot().getLayoutParams().height = -1;
            galleryFullViewVideoScreenBinding6 = this.this$0.binding;
            galleryFullViewVideoScreenBinding6.getRoot().requestLayout();
            galleryFullViewVideoScreenBinding7 = this.this$0.binding;
            View root = galleryFullViewVideoScreenBinding7.getRoot();
            drawable = this.this$0.portraitBackground;
            root.setBackground(drawable);
            galleryFullViewVideoScreenBinding8 = this.this$0.binding;
            ViewExtKt.show(galleryFullViewVideoScreenBinding8.getOzonVideoVolumeIv());
            gallerySyncViewModelImpl2 = this.this$0.widgetViewModel;
            gallerySyncViewModelImpl2.onOrientationChanged(it);
            return;
        }
        if (it.getIsFullScreen() && it.getScreenOrientation() == 1) {
            galleryFullViewVideoScreenBinding = this.this$0.binding;
            galleryFullViewVideoScreenBinding.getRoot().getLayoutParams().height = -1;
            galleryFullViewVideoScreenBinding2 = this.this$0.binding;
            galleryFullViewVideoScreenBinding2.getRoot().requestLayout();
            galleryFullViewVideoScreenBinding3 = this.this$0.binding;
            galleryFullViewVideoScreenBinding3.getRoot().setBackground(null);
            galleryFullViewVideoScreenBinding4 = this.this$0.binding;
            ViewExtKt.gone(galleryFullViewVideoScreenBinding4.getOzonVideoVolumeIv());
            gallerySyncViewModelImpl = this.this$0.widgetViewModel;
            gallerySyncViewModelImpl.onOrientationChanged(it);
        }
    }
}
