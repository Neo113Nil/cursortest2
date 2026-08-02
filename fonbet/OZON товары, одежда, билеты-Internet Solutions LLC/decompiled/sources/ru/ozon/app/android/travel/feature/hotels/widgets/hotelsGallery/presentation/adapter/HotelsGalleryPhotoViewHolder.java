package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter;

import Lo.a;
import WZ.l;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryPhotoViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemViewHolder;", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;", "", "onPhotoItemClicked", "<init>", "(Landroidx/appcompat/widget/AppCompatImageView;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryPhotoViewHolder extends HotelsGalleryItemViewHolder {

    @NotNull
    private final AppCompatImageView imageView;
    private HotelsGalleryVO.Photo item;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryPhotoViewHolder(@NotNull AppCompatImageView imageView, @NotNull l tokenizedAnalytics, @NotNull Function1<? super HotelsGalleryVO.Photo, Unit> onPhotoItemClicked) {
        super(imageView, null);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onPhotoItemClicked, "onPhotoItemClicked");
        this.imageView = imageView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        imageView.setOnClickListener(new a(1, this, onPhotoItemClicked));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HotelsGalleryPhotoViewHolder hotelsGalleryPhotoViewHolder, Function1 function1, View view) {
        HotelsGalleryVO.Photo photo = hotelsGalleryPhotoViewHolder.item;
        if (photo != null) {
            function1.invoke(photo);
        }
    }

    public final void bind(@NotNull HotelsGalleryVO.Photo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ImageViewExtKt.load$default(this.imageView, item.getUrl(), null, null, null, null, false, null, 126, null);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        l lVar = this.tokenizedAnalytics;
        HotelsGalleryVO.Photo photo = this.item;
        TokenizedAnalyticsExtKt.processViewEvents(lVar, photo != null ? photo.getTrackingInfo() : null);
    }
}
