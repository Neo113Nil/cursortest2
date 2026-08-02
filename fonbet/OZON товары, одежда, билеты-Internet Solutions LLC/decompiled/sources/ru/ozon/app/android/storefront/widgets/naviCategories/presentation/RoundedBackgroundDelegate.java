package ru.ozon.app.android.storefront.widgets.naviCategories.presentation;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedBackgroundDelegate;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedCornerVO;", "", "cornerRadii", "", "cornerRadius", "applyTo", "(Ljava/util/List;[FF)[F", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "paddingsVO", "", "bindOuterBackground", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;)V", "Landroid/view/View;", "backgroundCornerRadius", "F", "cornersCoordinates", "[F", "Landroid/graphics/drawable/GradientDrawable;", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedBackgroundDelegate {
    private final float backgroundCornerRadius;

    @NotNull
    private final View containerView;

    @NotNull
    private final float[] cornersCoordinates;

    @NotNull
    private GradientDrawable topBackgroundLayer;

    public RoundedBackgroundDelegate(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.backgroundCornerRadius = ResourceExtKt.toPxF(24);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = 0.0f;
        }
        this.cornersCoordinates = fArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.topBackgroundLayer = gradientDrawable;
        View view = this.containerView;
        view.setClipToOutline(true);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ThemeExtKt.themeColor(context2, R$attr.layerFloor0)), this.topBackgroundLayer}));
    }

    private final float[] applyTo(List<? extends RoundedCornerVO> list, float[] fArr, float f7) {
        int length = fArr.length;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, 0, length, 0.0f);
        for (RoundedCornerVO roundedCornerVO : list) {
            if (roundedCornerVO != RoundedCornerVO.NONE) {
                fArr[roundedCornerVO.getRoundedCornerX()] = f7;
                fArr[roundedCornerVO.getRoundedCornerY()] = f7;
            }
        }
        return fArr;
    }

    public void bindOuterBackground(@NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull PaddingsVO paddingsVO) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(paddingsVO, "paddingsVO");
        this.topBackgroundLayer.setCornerRadii(applyTo(roundedCorners, this.cornersCoordinates, this.backgroundCornerRadius));
        this.containerView.setPadding(paddingsVO.getLeft(), paddingsVO.getTop(), paddingsVO.getRight(), paddingsVO.getBottom());
    }
}
