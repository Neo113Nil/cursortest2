package ru.ozon.app.android.travel.molecules.view.travelBadge.v1;

import Tl.a;
import android.content.Context;
import android.graphics.RectF;
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
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v1.TravelBadgeDTO;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewTravelBadgeBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import y7.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelBadge/v1/TravelBadgeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewTravelBadgeBinding;", "iconSize", "iconEndMargin", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;", "newRoundedImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "endMargin", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelBadgeView extends LinearLayout {

    @NotNull
    private final ViewTravelBadgeBinding binding;
    private final int iconEndMargin;
    private final int iconSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TravelBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ShapeableImageView newRoundedImageView(int endMargin) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
        int i11 = this.iconSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginEnd(endMargin);
        shapeableImageView.setLayoutParams(layoutParams);
        k kVar = new k();
        a aVar = new a();
        k.a aVar2 = new k.a(kVar);
        aVar2.d(aVar);
        shapeableImageView.setShapeAppearanceModel(aVar2.a());
        return shapeableImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float newRoundedImageView$lambda$4$lambda$3(RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        float f7 = 2;
        return Math.min(bounds.width() / f7, bounds.height() / f7);
    }

    public final void bind(@NotNull TravelBadgeDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FrameLayout frameLayout = this.binding.travelBadgeViewImagesContainer;
        frameLayout.removeAllViews();
        ListIterator<String> listIterator = item.getImageLinks().listIterator(item.getImageLinks().size());
        int i11 = 0;
        while (listIterator.hasPrevious()) {
            String previous = listIterator.previous();
            ShapeableImageView newRoundedImageView = newRoundedImageView(i11);
            ImageViewExtKt.load$default(newRoundedImageView, previous, null, null, null, null, false, null, 126, null);
            frameLayout.addView(newRoundedImageView);
            i11 += this.iconEndMargin;
        }
        this.binding.travelBadgeViewTitleTextView.setText(item.getText());
    }

    public /* synthetic */ TravelBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewTravelBadgeBinding inflate = ViewTravelBadgeBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.iconSize = ResourceExtKt.toPx(24, context);
        this.iconEndMargin = ResourceExtKt.toPx(14, context);
    }
}
