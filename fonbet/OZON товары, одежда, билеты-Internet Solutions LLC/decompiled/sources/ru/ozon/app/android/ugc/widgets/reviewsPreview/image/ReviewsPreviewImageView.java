package ru.ozon.app.android.ugc.widgets.reviewsPreview.image;

import Kk.C3531a;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewTileBinder;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "image", "Lru/ozon/uni/android/atom/image/Image;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "cornerImage", "tileBinder", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileBinder;", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "bind", "item", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;", "updateCornerRadius", "radius", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewImageView extends ConstraintLayout {

    @NotNull
    private final Image cornerImage;

    @NotNull
    private final IconView icon;

    @NotNull
    private final Image image;

    @NotNull
    private final ReviewsPreviewTileBinder tileBinder;
    public static final int $stable = 8;

    @NotNull
    private static final ImageAspectRatio ratio = ImageAspectRatio.RATIO_2_3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsPreviewImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.reviewsPreviewImage);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        image.setLayoutParams(bVar);
        addView(image);
        this.image = image;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.reviewsPreviewPlayIcon, -2, -2);
        a11.f41658v = 0;
        a11.f41636i = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) a11).topMargin = dimens.getDP_8();
        a11.setMarginEnd(dimens.getDP_8());
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.icon = iconView;
        Image image2 = new Image(context, null, 0, 6, null);
        image2.setId(R$id.reviewsPreviewCornerImage);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(dimens.getDP_48(), dimens.getDP_48());
        bVar2.f41658v = 0;
        bVar2.f41636i = 0;
        image2.setLayoutParams(bVar2);
        addView(image2);
        this.cornerImage = image2;
        this.tileBinder = new ReviewsPreviewTileBinder(this);
    }

    private final void updateCornerRadius(final int radius) {
        ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: ru.ozon.app.android.ugc.widgets.reviewsPreview.image.ReviewsPreviewImageView$updateCornerRadius$outlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (outline != null) {
                    outline.setRoundRect(0, 0, ReviewsPreviewImageView.this.getWidth(), ReviewsPreviewImageView.this.getHeight(), ResourceExtKt.toPxF(radius));
                }
            }
        };
        if (Intrinsics.d(this.image.getOutlineProvider(), viewOutlineProvider)) {
            return;
        }
        this.image.setOutlineProvider(viewOutlineProvider);
        this.image.invalidateOutline();
    }

    public final void bind(@NotNull ReviewsPreviewVO.ReviewsPreviewImageVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageHolderKt.bind$default(this.image, item.getImage(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.icon, item.getPlayIcon(), null, 2, null);
        ImageHolderKt.bindOrGone$default(this.cornerImage, item.getCornerImage(), null, 2, null);
        this.tileBinder.bindTile(item);
        CornerRadius cornerRadius = item.getCornerRadius();
        if (cornerRadius != null) {
            updateCornerRadius(cornerRadius.getPx());
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getWidgetBackgroundColor());
        if (parseColor != null) {
            setBackgroundColor(parseColor.intValue());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        ImageAspectRatio imageAspectRatio = ratio;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((imageAspectRatio.getHeightRatio() * size) / imageAspectRatio.getWidthRatio(), 1073741824));
    }
}
