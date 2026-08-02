package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.presentation.HotelsGalleryFeedVO;
import ru.ozon.app.android.travel.utils.extensions.ImageExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/view/HotelsGalleryFeedItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "adaptiveCallback", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "Landroid/graphics/drawable/Drawable;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/presentation/HotelsGalleryFeedVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedItemView extends FrameLayout {

    @NotNull
    private final PikazonLoaderCallback<Drawable> adaptiveCallback;

    @NotNull
    private final IconView icon;

    @NotNull
    private final Image imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFeedItemView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        Image image = (Image) qVar.i(N.b(Image.class), context);
        if (image == null) {
            context2 = context;
            image = new Image(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        image.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(image);
        this.imageView = image;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context2);
        iconView = iconView == null ? new IconView(context2, null, 0, 6, null) : iconView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        iconView.setLayoutParams(layoutParams);
        addView(iconView);
        this.icon = iconView;
        this.adaptiveCallback = ImageExtensionsKt.createAdaptiveImageCallback(image);
    }

    public final void bind(@NotNull HotelsGalleryFeedVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageExtensionsKt.bindWithCallback(this.imageView, item.getImage(), this.adaptiveCallback);
        IconHolderKt.bindOrGone$default(this.icon, item.getVideoControlIcon(), null, 2, null);
    }
}
