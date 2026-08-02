package ru.ozon.app.android.ugc.widgets.productVariant.presentation;

import GW.a;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.ugc.databinding.WidgetProductVariantBinding;
import ru.ozon.app.android.ugc.widgets.productVariant.presentation.ProductVariantVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO;", "Lru/ozon/app/android/ugc/databinding/WidgetProductVariantBinding;", "binding", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetProductVariantBinding;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "getChangeVariantAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/databinding/WidgetProductVariantBinding;", "LWZ/l;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductVariantWidgetVH extends k<ProductVariantVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetProductVariantBinding binding;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProductVariantWidgetVH(@NotNull WidgetProductVariantBinding binding, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        binding.productNameTAV.setTextIsSelectable(false);
        binding.productDescriptionTAV.setTextIsSelectable(false);
        binding.changeVariantTAV.setTextIsSelectable(false);
        binding.changeVariantTAV.setOnClickListener(new a(this, 3));
        binding.productVariantWidget.setOnClickListener(new Il.a(this, 8));
    }

    private final AtomAction getChangeVariantAction() {
        ProductVariantVO.ChangeVariantButton changeVariantButton;
        ProductVariantVO boundData = getBoundData();
        if (boundData == null || (changeVariantButton = boundData.getChangeVariantButton()) == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(changeVariantButton.getAction(), changeVariantButton.getTrackingInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$0(ProductVariantWidgetVH productVariantWidgetVH, View view) {
        AtomAction changeVariantAction = productVariantWidgetVH.getChangeVariantAction();
        if (changeVariantAction != null) {
            productVariantWidgetVH.actionHandler.invoke(changeVariantAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(ProductVariantWidgetVH productVariantWidgetVH, View view) {
        AtomAction changeVariantAction = productVariantWidgetVH.getChangeVariantAction();
        if (changeVariantAction != null) {
            productVariantWidgetVH.actionHandler.invoke(changeVariantAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductVariantVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetProductVariantBinding widgetProductVariantBinding = this.binding;
        widgetProductVariantBinding.productVariantWidget.getBackground().setColorFilter(new PorterDuffColorFilter(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()), PorterDuff.Mode.SRC_ATOP));
        ShapeableImageView productIv = widgetProductVariantBinding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageViewExtKt.load$default(productIv, item.getProductImage(), C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners(Dimens.INSTANCE.getDP_6(), null, 2, null)), null, null, null, false, null, 124, null);
        TextAtomV2View productNameTAV = widgetProductVariantBinding.productNameTAV;
        Intrinsics.checkNotNullExpressionValue(productNameTAV, "productNameTAV");
        TextHolderKt.bind$default(productNameTAV, item.getProductName(), null, 2, null);
        TextAtomV2View productDescriptionTAV = widgetProductVariantBinding.productDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(productDescriptionTAV, "productDescriptionTAV");
        TextHolderKt.bind$default(productDescriptionTAV, item.getProductDescription(), null, 2, null);
        TextAtomV2View changeVariantTAV = widgetProductVariantBinding.changeVariantTAV;
        Intrinsics.checkNotNullExpressionValue(changeVariantTAV, "changeVariantTAV");
        ProductVariantVO.ChangeVariantButton changeVariantButton = item.getChangeVariantButton();
        TextHolderKt.bindOrGone$default(changeVariantTAV, changeVariantButton != null ? changeVariantButton.getChangeVariantText() : null, null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProductVariantVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ProductVariantWidgetVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
