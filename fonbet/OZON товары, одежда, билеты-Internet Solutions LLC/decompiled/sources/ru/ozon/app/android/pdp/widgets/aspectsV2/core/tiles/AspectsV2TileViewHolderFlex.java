package ru.ozon.app.android.pdp.widgets.aspectsV2.core.tiles;

import Bk0.a;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles.AspectsCompactTilesVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2TilesLayoutBinding;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectV2FlexInnerVH;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\f\u0010\f\u001a\u00020\n*\u00020\u0002H\u0002J\f\u0010\r\u001a\u00020\n*\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/core/tiles/AspectsV2TileViewHolderFlex;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexInnerVH;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/tiles/AspectsCompactTilesVariantV2VO;", "binding", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2TilesLayoutBinding;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2TilesLayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "bind", "", "item", "setPrice", "setImage", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV2TileViewHolderFlex extends AspectV2FlexInnerVH<AspectsCompactTilesVariantV2VO> {

    @NotNull
    private final WidgetAspectsCompactV2TilesLayoutBinding binding;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV2TileViewHolderFlex(@NotNull WidgetAspectsCompactV2TilesLayoutBinding binding, @NotNull ComposerReferences ref) {
        super(binding);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.binding = binding;
        this.ref = ref;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(AspectsCompactTilesVariantV2VO aspectsCompactTilesVariantV2VO, AspectsV2TileViewHolderFlex aspectsV2TileViewHolderFlex, View view) {
        if (aspectsCompactTilesVariantV2VO.getIsSelected()) {
            return;
        }
        InterfaceC7851b.a.a(aspectsV2TileViewHolderFlex.ref.getController(), aspectsCompactTilesVariantV2VO.getRefreshDeeplink(), null, null, null, 14);
        t tokenizedEvent = aspectsCompactTilesVariantV2VO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processNonViewEvents(aspectsV2TileViewHolderFlex.ref.getTokenizedAnalytics(), tokenizedEvent);
        }
    }

    private final void setImage(AspectsCompactTilesVariantV2VO aspectsCompactTilesVariantV2VO) {
        ShapeableImageView shapeableImageView = this.binding.imageIv;
        Intrinsics.f(shapeableImageView);
        ImageViewExtKt.loadImageOrGone(shapeableImageView, aspectsCompactTilesVariantV2VO.getImageUrl());
        shapeableImageView.setAlpha(aspectsCompactTilesVariantV2VO.getIsAvailable() ? 1.0f : 0.5f);
    }

    private final void setPrice(AspectsCompactTilesVariantV2VO aspectsCompactTilesVariantV2VO) {
        WidgetAspectsCompactV2TilesLayoutBinding widgetAspectsCompactV2TilesLayoutBinding = this.binding;
        if (aspectsCompactTilesVariantV2VO.getIsAvailable()) {
            TextView notAvailableTv = widgetAspectsCompactV2TilesLayoutBinding.notAvailableTv;
            Intrinsics.checkNotNullExpressionValue(notAvailableTv, "notAvailableTv");
            ViewExtKt.gone(notAvailableTv);
            PriceAtomView pricePa = widgetAspectsCompactV2TilesLayoutBinding.pricePa;
            Intrinsics.checkNotNullExpressionValue(pricePa, "pricePa");
            PriceAtomHolderKt.bindOrGone$default(pricePa, aspectsCompactTilesVariantV2VO.getPrice(), null, 2, null);
            return;
        }
        PriceAtomView pricePa2 = widgetAspectsCompactV2TilesLayoutBinding.pricePa;
        Intrinsics.checkNotNullExpressionValue(pricePa2, "pricePa");
        ViewExtKt.gone(pricePa2);
        TextView notAvailableTv2 = widgetAspectsCompactV2TilesLayoutBinding.notAvailableTv;
        Intrinsics.checkNotNullExpressionValue(notAvailableTv2, "notAvailableTv");
        ViewExtKt.show(notAvailableTv2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r6 != (r2 != null ? r2.bottomMargin : 0)) goto L39;
     */
    @Override // ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectV2FlexInnerVH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull AspectsCompactTilesVariantV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        VariantConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        setSelected(constraintLayout, item);
        View view = this.itemView;
        VariantConstraintLayout variantConstraintLayout = view instanceof VariantConstraintLayout ? (VariantConstraintLayout) view : null;
        if (variantConstraintLayout != null) {
            variantConstraintLayout.setProbably(item.isEnabled().booleanValue());
        }
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            Dimens dimens = Dimens.INSTANCE;
            marginLayoutParams.bottomMargin = dimens.getDP_8();
            marginLayoutParams.setMarginEnd(dimens.getDP_8());
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = itemView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = itemView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = itemView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            itemView.setLayoutParams(marginLayoutParams);
        }
        setImage(item);
        setPrice(item);
        setParandjaForAspects(this.binding.infoFl, item);
        this.itemView.setOnClickListener(new a(2, item, this));
    }
}
