package ru.ozon.app.android.pdp.widgets.aspectsV2.core.text;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.WidgetFullAspectsV2TextLayoutBinding;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantFrameLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.text.AspectsTextVariantV2VO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectV2FlexInnerVH;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/core/text/AspectsV2TextViewHolderFlex;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexInnerVH;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/text/AspectsTextVariantV2VO;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetFullAspectsV2TextLayoutBinding;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/pdp/databinding/WidgetFullAspectsV2TextLayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "bind", "", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV2TextViewHolderFlex extends AspectV2FlexInnerVH<AspectsTextVariantV2VO> {

    @NotNull
    private final WidgetFullAspectsV2TextLayoutBinding binding;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV2TextViewHolderFlex(@NotNull WidgetFullAspectsV2TextLayoutBinding binding, @NotNull ComposerReferences ref) {
        super(binding);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.binding = binding;
        this.ref = ref;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (r8 != (r3 != null ? r3.bottomMargin : 0)) goto L35;
     */
    @Override // ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectV2FlexInnerVH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull AspectsTextVariantV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetFullAspectsV2TextLayoutBinding widgetFullAspectsV2TextLayoutBinding = this.binding;
        VariantFrameLayout constraintLayout = widgetFullAspectsV2TextLayoutBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        setSelected(constraintLayout, item);
        widgetFullAspectsV2TextLayoutBinding.getConstraintLayout().setProbably(item.isEnabled().booleanValue());
        TextAtomV2View textAtomV2View = widgetFullAspectsV2TextLayoutBinding.titleTV;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bind$default(textAtomV2View, item.getText(), null, 2, null);
        textAtomV2View.setTextIsSelectable(false);
        if (!item.getIsAvailable()) {
            textAtomV2View.setAlpha(item.isNotAvailableTextAlpha());
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
        setParandjaForAspects(this.itemView, item);
        View itemView2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        ViewExtKt.setOnClickListenerThrottle$default(itemView2, 0L, new AspectsV2TextViewHolderFlex$bind$1$3(item, this), 1, null);
    }
}
