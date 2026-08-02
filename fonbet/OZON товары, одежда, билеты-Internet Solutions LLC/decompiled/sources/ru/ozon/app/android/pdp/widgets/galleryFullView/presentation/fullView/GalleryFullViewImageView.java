package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryFullViewImageView extends FrameLayout {

    @NotNull
    private final ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryFullViewImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        imageView.setBackground(ContextExtKt.createRoundRectShape$default(context, Dimens.INSTANCE.getDPF_24(), CornersConfig.ALL, R$color.bg_light_key, 0, null, 24, null));
        imageView.setClipToOutline(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.imageView = imageView;
        addView(imageView);
    }

    @NotNull
    public final ImageView getImageView() {
        return this.imageView;
    }
}
