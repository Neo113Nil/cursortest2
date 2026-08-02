package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.v3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.R$drawable;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewLuggageTabV3Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.molecules.view.textCenteredImageView.TextCenteredImageView;
import ru.ozon.app.android.uikit.view.skeleton.SkeletonPlaceholderView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/view/v3/LuggageTabV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewLuggageTabV3Binding;", "dp8", "luggageTextColor", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/LuggageTabVO;", "resolveVisibility", "canBeShown", "", "isShowingProgress", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LuggageTabV3View extends ConstraintLayout {

    @NotNull
    private final ViewLuggageTabV3Binding binding;
    private final int dp8;
    private final int luggageTextColor;

    public /* synthetic */ LuggageTabV3View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final int resolveVisibility(boolean canBeShown, boolean isShowingProgress) {
        if (canBeShown) {
            return isShowingProgress ? 4 : 0;
        }
        return 8;
    }

    public final void bind(@NotNull AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean isShowingProgress = item.getIsShowingProgress();
        TextCenteredImageView textCenteredImageView = this.binding.handCarryIconIv;
        Intrinsics.f(textCenteredImageView);
        boolean z11 = false;
        textCenteredImageView.setVisibility(isShowingProgress ? 4 : 0);
        ImageViewExtKt.load$default(textCenteredImageView, item.getHandCarryIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.tint(textCenteredImageView, item.getHandCarryIconTintColor());
        textCenteredImageView.setText(item.getHandCarryWeight());
        TextCenteredImageView textCenteredImageView2 = this.binding.luggageIconIv;
        Intrinsics.f(textCenteredImageView2);
        textCenteredImageView2.setVisibility(isShowingProgress ? 4 : 0);
        ImageViewExtKt.load$default(textCenteredImageView2, item.getLuggageIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.tint(textCenteredImageView2, item.getLuggageIconTintColor());
        textCenteredImageView2.setText(item.getLuggageWeight());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, (!item.getIsSelected() || isShowingProgress) ? R$attr.textSecondary : R$attr.textPrimary);
        AppCompatTextView appCompatTextView = this.binding.handCarryCountTav;
        appCompatTextView.setVisibility(resolveVisibility(item.getHasHandCarryCount(), isShowingProgress));
        appCompatTextView.setText(item.getHandCarryCount());
        appCompatTextView.setTextColor(themeColor);
        AppCompatTextView appCompatTextView2 = this.binding.luggageCountTav;
        appCompatTextView2.setVisibility(resolveVisibility(item.getHasLuggageCount(), isShowingProgress));
        appCompatTextView2.setText(item.getLuggageCount());
        appCompatTextView2.setTextColor(themeColor);
        TextAtomView textAtomView = this.binding.luggageTabPriceTav;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, item.getPrice(), null, 2, null);
        textAtomView.setVisibility(isShowingProgress ? 4 : 0);
        ViewLuggageTabV3Binding viewLuggageTabV3Binding = this.binding;
        SkeletonPlaceholderView luggageTabPriceSkeletonSpv = viewLuggageTabV3Binding.luggageTabPriceSkeletonSpv;
        Intrinsics.checkNotNullExpressionValue(luggageTabPriceSkeletonSpv, "luggageTabPriceSkeletonSpv");
        luggageTabPriceSkeletonSpv.setVisibility(isShowingProgress ? 0 : 8);
        SkeletonPlaceholderView handCarrySkeleton = viewLuggageTabV3Binding.handCarrySkeleton;
        Intrinsics.checkNotNullExpressionValue(handCarrySkeleton, "handCarrySkeleton");
        handCarrySkeleton.setVisibility(isShowingProgress ? 0 : 8);
        SkeletonPlaceholderView luggageSkeleton = viewLuggageTabV3Binding.luggageSkeleton;
        Intrinsics.checkNotNullExpressionValue(luggageSkeleton, "luggageSkeleton");
        luggageSkeleton.setVisibility(isShowingProgress ? 0 : 8);
        if (!isShowingProgress && item.getIsSelected()) {
            z11 = true;
        }
        setSelected(z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuggageTabV3View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewLuggageTabV3Binding inflate = ViewLuggageTabV3Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.luggageTextColor = themeColor;
        setBackground(a.getDrawable(context, R$drawable.bg_travel_luggage_tab_v3));
        setPadding(px, 0, px, 0);
        inflate.handCarryIconIv.setTextColor(themeColor);
        inflate.luggageIconIv.setTextColor(themeColor);
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.layerSurface);
        inflate.luggageTabPriceSkeletonSpv.setBackgroundColor(themeColor2);
        inflate.luggageSkeleton.setBackgroundColor(themeColor2);
        inflate.handCarrySkeleton.setBackgroundColor(themeColor2);
    }
}
