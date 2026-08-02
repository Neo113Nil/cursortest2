package ru.ozon.app.android.travel.molecules.view.travelBadge.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v2.TravelBadgeV2DTO;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewTravelBadgeV2Binding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import y7.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelBadge/v2/TravelBadgeV2View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewTravelBadgeV2Binding;", "iconSize", "iconEndMargin", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v2/TravelBadgeV2DTO;", "newRoundedImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "endMargin", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelBadgeV2View extends LinearLayout {

    @NotNull
    private final ViewTravelBadgeV2Binding binding;
    private final int iconEndMargin;
    private final int iconSize;

    public /* synthetic */ TravelBadgeV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final ShapeableImageView newRoundedImageView(int endMargin) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
        int i11 = this.iconSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginEnd(endMargin);
        shapeableImageView.setLayoutParams(layoutParams);
        shapeableImageView.setShapeAppearanceModel(new k().o(this.iconSize / 2.0f));
        return shapeableImageView;
    }

    public final void bind(@NotNull TravelBadgeV2DTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FrameLayout frameLayout = this.binding.travelBadgeViewImagesContainer;
        frameLayout.removeAllViews();
        ListIterator<TravelBadgeV2DTO.BadgeIcon> listIterator = item.getImageLinks().listIterator(item.getImageLinks().size());
        int i11 = 0;
        while (listIterator.hasPrevious()) {
            TravelBadgeV2DTO.BadgeIcon previous = listIterator.previous();
            String image = previous.getIcon().getImage();
            String tintColor = previous.getIcon().getTintColor();
            ShapeableImageView newRoundedImageView = newRoundedImageView(i11);
            ImageViewExtKt.load$default(newRoundedImageView, image, null, null, null, null, false, null, 126, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = newRoundedImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, tintColor);
            if (parseColor != null) {
                ThemeExtKt.tint(newRoundedImageView, Integer.valueOf(parseColor.intValue()));
            }
            Context context2 = newRoundedImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, previous.getBgColor());
            if (parseColor2 != null) {
                newRoundedImageView.setBackgroundColor(parseColor2.intValue());
            }
            frameLayout.addView(newRoundedImageView);
            i11 += this.iconEndMargin;
        }
        TextAtomView travelBadgeViewTitleTextView = this.binding.travelBadgeViewTitleTextView;
        Intrinsics.checkNotNullExpressionValue(travelBadgeViewTitleTextView, "travelBadgeViewTitleTextView");
        TextAtomHolderKt.bindOrGone$default(travelBadgeViewTitleTextView, item.getText(), null, 2, null);
        this.binding.travelBadgeViewTitleTextView.setAllCaps(false);
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor3 = styleParser2.parseColor(context3, item.getBgColor());
        if (parseColor3 != null) {
            ViewExtKt.setBackgroundTint(this, parseColor3.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelBadgeV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewTravelBadgeV2Binding inflate = ViewTravelBadgeV2Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.iconSize = ResourceExtKt.toPx(24, context);
        this.iconEndMargin = ResourceExtKt.toPx(14, context);
    }
}
