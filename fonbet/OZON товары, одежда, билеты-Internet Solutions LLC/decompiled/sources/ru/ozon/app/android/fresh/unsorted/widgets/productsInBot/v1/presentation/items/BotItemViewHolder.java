package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items;

import AW.a;
import Hx.ViewOnClickListenerC3169a;
import Hx.b;
import Sc.InterfaceC4008j;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.fresh.unsorted.databinding.LayoutProductInBotItemBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.ProductsInBotQuantityUpdate;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api.SelectedProductsBody;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010%J\u0013\u0010(\u001a\u00020\u000e*\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u000e*\u00020'H\u0002¢\u0006\u0004\b*\u0010)J#\u0010.\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010-\u001a\u00060+j\u0002`,H\u0014¢\u0006\u0004\b.\u0010/J+\u0010.\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010-\u001a\u00060+j\u0002`,2\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b.\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u001b\u00109\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010<\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001b\u0010?\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;)V", "", "image", "", "setProductImage", "(Ljava/lang/String;)V", "item", "setCheckbox", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "aspects", "setAspects", "setItemQuantity", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsBody$Product;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "addProductToList", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsBody$Product;)V", "removeProductFromList", "", "skuId", "", "qty", "increaseQuantity", "(JI)V", "decreaseQuantity", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "disableButton", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;)V", "enableButton", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;", "cornerRadius$delegate", "LSc/j;", "getCornerRadius", "()I", "cornerRadius", "disabledColor$delegate", "getDisabledColor", "disabledColor", "enabledColor$delegate", "getEnabledColor", "enabledColor", "Lru/ozon/app/android/fresh/unsorted/databinding/LayoutProductInBotItemBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/LayoutProductInBotItemBinding;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BotItemViewHolder extends k<BotItemVO> {

    @NotNull
    private final LayoutProductInBotItemBinding binding;

    /* renamed from: cornerRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cornerRadius;

    /* renamed from: disabledColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledColor;

    /* renamed from: enabledColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j enabledColor;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ProductsInBotViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotItemViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull ProductsInBotViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.viewModel = viewModel;
        this.cornerRadius = Sc.k.b(BotItemViewHolder$cornerRadius$2.INSTANCE);
        this.disabledColor = Sc.k.b(new BotItemViewHolder$disabledColor$2(this));
        this.enabledColor = Sc.k.b(new BotItemViewHolder$enabledColor$2(this));
        LayoutProductInBotItemBinding bind = LayoutProductInBotItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void addProductToList(SelectedProductsBody.Product product) {
        this.refs.getController().update(new ProductsInBotQuantityUpdate(product.getSku(), product.getQty(), this.binding.checkboxIv.isSelected()));
    }

    private final void decreaseQuantity(long skuId, int qty) {
        this.refs.getController().update(new ProductsInBotQuantityUpdate(skuId, qty, this.binding.checkboxIv.isSelected()));
    }

    private final void disableButton(SmallIconButtonView smallIconButtonView) {
        ViewExtKt.disable(smallIconButtonView);
        smallIconButtonView.setTint(getDisabledColor());
    }

    private final void enableButton(SmallIconButtonView smallIconButtonView) {
        ViewExtKt.enable(smallIconButtonView);
        smallIconButtonView.setTint(getEnabledColor());
    }

    private final int getCornerRadius() {
        return ((Number) this.cornerRadius.getValue()).intValue();
    }

    private final int getDisabledColor() {
        return ((Number) this.disabledColor.getValue()).intValue();
    }

    private final int getEnabledColor() {
        return ((Number) this.enabledColor.getValue()).intValue();
    }

    private final void increaseQuantity(long skuId, int qty) {
        this.refs.getController().update(new ProductsInBotQuantityUpdate(skuId, qty, this.binding.checkboxIv.isSelected()));
    }

    private final void removeProductFromList(SelectedProductsBody.Product product) {
        this.refs.getController().update(new ProductsInBotQuantityUpdate(product.getSku(), product.getQty(), this.binding.checkboxIv.isSelected()));
    }

    private final void setAspects(TextAtom aspects) {
        TextAtomView aspectsTa = this.binding.aspectsTa;
        Intrinsics.checkNotNullExpressionValue(aspectsTa, "aspectsTa");
        TextAtomHolderKt.bindOrGone$default(aspectsTa, aspects, null, 2, null);
    }

    private final void setCheckbox(BotItemVO item) {
        PriceView priceV = this.binding.priceV;
        Intrinsics.checkNotNullExpressionValue(priceV, "priceV");
        PriceHolderKt.bind$default(priceV, item.getPrice(), null, 2, null);
        this.binding.checkboxIv.setSelected(item.getIsSelected());
        this.binding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC3169a(0, this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCheckbox$lambda$0(BotItemViewHolder botItemViewHolder, BotItemVO botItemVO, View view) {
        boolean isSelected = botItemViewHolder.binding.checkboxIv.isSelected();
        botItemViewHolder.binding.checkboxIv.setSelected(!isSelected);
        if (isSelected) {
            botItemViewHolder.removeProductFromList(botItemVO.toProductBody(botItemVO.getCurrentQuantity()));
        } else {
            botItemViewHolder.addProductToList(botItemVO.toProductBody(botItemVO.getCurrentQuantity()));
        }
    }

    private final void setItemQuantity(BotItemVO item) {
        if (item.getMaxQuantity() <= 1) {
            Group counterGroup = this.binding.counterGroup;
            Intrinsics.checkNotNullExpressionValue(counterGroup, "counterGroup");
            ViewExtKt.gone(counterGroup);
            return;
        }
        Group counterGroup2 = this.binding.counterGroup;
        Intrinsics.checkNotNullExpressionValue(counterGroup2, "counterGroup");
        ViewExtKt.show(counterGroup2);
        this.binding.itemCountTv.setText(String.valueOf(item.getCurrentQuantity()));
        SmallIconButtonView minusBv = this.binding.minusBv;
        Intrinsics.checkNotNullExpressionValue(minusBv, "minusBv");
        WrappedIconButtonHolderKt.bindOrGone$default(minusBv, item.getMinusButton(), null, 2, null);
        SmallIconButtonView plusBv = this.binding.plusBv;
        Intrinsics.checkNotNullExpressionValue(plusBv, "plusBv");
        WrappedIconButtonHolderKt.bindOrGone$default(plusBv, item.getPlusButton(), null, 2, null);
        int currentQuantity = item.getCurrentQuantity();
        if (2 <= currentQuantity && currentQuantity < item.getMaxQuantity()) {
            SmallIconButtonView plusBv2 = this.binding.plusBv;
            Intrinsics.checkNotNullExpressionValue(plusBv2, "plusBv");
            enableButton(plusBv2);
            SmallIconButtonView minusBv2 = this.binding.minusBv;
            Intrinsics.checkNotNullExpressionValue(minusBv2, "minusBv");
            enableButton(minusBv2);
        } else if (currentQuantity == 1) {
            SmallIconButtonView minusBv3 = this.binding.minusBv;
            Intrinsics.checkNotNullExpressionValue(minusBv3, "minusBv");
            disableButton(minusBv3);
            SmallIconButtonView plusBv3 = this.binding.plusBv;
            Intrinsics.checkNotNullExpressionValue(plusBv3, "plusBv");
            enableButton(plusBv3);
        } else if (currentQuantity == item.getMaxQuantity()) {
            SmallIconButtonView minusBv4 = this.binding.minusBv;
            Intrinsics.checkNotNullExpressionValue(minusBv4, "minusBv");
            enableButton(minusBv4);
            SmallIconButtonView plusBv4 = this.binding.plusBv;
            Intrinsics.checkNotNullExpressionValue(plusBv4, "plusBv");
            disableButton(plusBv4);
        }
        this.binding.minusBv.setOnClickListener(new b(0, item, this));
        this.binding.plusBv.setOnClickListener(new a(2, item, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setItemQuantity$lambda$2(BotItemVO botItemVO, BotItemViewHolder botItemViewHolder, View view) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        ButtonV3Atom.SmallIconButton minusButton = botItemVO.getMinusButton();
        if (minusButton != null && (trackingInfo = minusButton.getTrackingInfo()) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(botItemViewHolder.refs.getTokenizedAnalytics(), TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(botItemVO.getId()), null, 2, null), null, 2, null);
        }
        botItemViewHolder.decreaseQuantity(botItemVO.getSkuId(), botItemVO.getCurrentQuantity() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setItemQuantity$lambda$4(BotItemVO botItemVO, BotItemViewHolder botItemViewHolder, View view) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        ButtonV3Atom.SmallIconButton plusButton = botItemVO.getPlusButton();
        if (plusButton != null && (trackingInfo = plusButton.getTrackingInfo()) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(botItemViewHolder.refs.getTokenizedAnalytics(), TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(botItemVO.getId()), null, 2, null), null, 2, null);
        }
        botItemViewHolder.increaseQuantity(botItemVO.getSkuId(), botItemVO.getCurrentQuantity() + 1);
    }

    private final void setProductImage(String image) {
        ImageView productIv = this.binding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageViewExtKt.load$default(productIv, image, C7714v.t(new ImageTransformation.RoundedCorners(getCornerRadius(), null, 2, null)), null, null, null, false, null, 124, null);
    }

    private final void setTitle(TextAtom title) {
        TextAtomView titleTa = this.binding.titleTa;
        Intrinsics.checkNotNullExpressionValue(titleTa, "titleTa");
        TextAtomHolderKt.bind$default(titleTa, title, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BotItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BotItemVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            setProductImage(item.getImage());
            setTitle(item.getTitle());
            setAspects(item.getAspects());
        }
        setItemQuantity(item);
        setCheckbox(item);
        if (item.getIsSelected()) {
            this.viewModel.setProduct(item.getSkuId(), item.getCurrentQuantity());
        } else {
            this.viewModel.deleteProduct(item.getSkuId());
        }
    }
}
