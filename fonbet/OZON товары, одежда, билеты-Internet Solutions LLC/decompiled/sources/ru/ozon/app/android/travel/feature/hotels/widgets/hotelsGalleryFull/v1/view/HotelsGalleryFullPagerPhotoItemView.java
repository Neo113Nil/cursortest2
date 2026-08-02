package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.travel.utils.extensions.ImageExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPagerPhotoItemView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "pikazonCallback", "ru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPagerPhotoItemView$pikazonCallback$1", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPagerPhotoItemView$pikazonCallback$1;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Photo;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullPagerPhotoItemView extends AppCompatImageView {

    @NotNull
    private final HotelsGalleryFullPagerPhotoItemView$pikazonCallback$1 pikazonCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullPagerPhotoItemView$pikazonCallback$1] */
    public HotelsGalleryFullPagerPhotoItemView(@NotNull final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pikazonCallback = new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullPagerPhotoItemView$pikazonCallback$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                HotelsGalleryFullPagerPhotoItemView.this.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.bgLightKey));
                ImageExtensionsKt.showPlaceholder(HotelsGalleryFullPagerPhotoItemView.this);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                HotelsGalleryFullPagerPhotoItemView.this.clearColorFilter();
                HotelsGalleryFullPagerPhotoItemView.this.setBackground(null);
            }
        };
    }

    public final void bind(@NotNull HotelsGalleryFullVI.Photo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this, item.getImage().getImage(), null, this.pikazonCallback, null, null, false, null, 122, null);
    }
}
