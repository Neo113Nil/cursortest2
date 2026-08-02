package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.utils.ReviewGalleryPreviewLayoutParamsProvider;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/CountPreviewItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "layoutParamsProvider", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/utils/ReviewGalleryPreviewLayoutParamsProvider;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/utils/ReviewGalleryPreviewLayoutParamsProvider;)V", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class CountPreviewItemView extends FrameLayout {
    public static final int $stable = TextAtomV2View.$stable | Image.$stable;

    @NotNull
    private final Image imageView;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountPreviewItemView(@NotNull Context context, @NotNull ReviewGalleryPreviewLayoutParamsProvider layoutParamsProvider) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutParamsProvider, "layoutParamsProvider");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.reviewGalleryPreviewItemImage);
        image.setLayoutParams(layoutParamsProvider.getImageLayoutParams());
        addView(image);
        this.imageView = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.reviewGalleryPreviewItemText);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.textView = textAtomV2View;
        setLayoutParams(layoutParamsProvider.getRootLayoutParams(this));
    }

    public final void bind(@NotNull ReviewGalleryPreviewV2VO.ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
        TextDTO text = item.getText();
        if (text != null) {
            TextHolderKt.bindOrGone$default(this.textView, text, null, 2, null);
        }
    }
}
