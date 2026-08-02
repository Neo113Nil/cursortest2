package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.item;

import Gw.ViewOnClickListenerC3131a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.d;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.databinding.ReturnItemViewBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckboxBindingDelegate;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001526\u0010\u001b\u001a2\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u00190\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J+\u0010%\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0019H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u009b\u0001\u0010.\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u001926\u0010\u001b\u001a2\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u00190\u00172\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120+2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00192\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/item/ProductsInBotV2ItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "payload", "", "setupCheckedAnalytics", "(LWZ/l;LWZ/t;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "item", "Lkotlin/Function3;", "", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "quantityActionHandler", "setupQuantity", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;Lfd/n;)V", "quantity", "maxQuantity", "updateQuantity", "(II)V", "setupConstraints", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;)V", "actionHandler", "bindProductImage", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;Lkotlin/jvm/functions/Function1;)V", "", "disabled", "setDisabled", "(Z)V", "Lkotlin/Function2;", "setProduct", "removeProduct", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/ReturnItemViewBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/ReturnItemViewBinding;", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckboxBindingDelegate;", "checkboxDelegate$delegate", "LSc/j;", "getCheckboxDelegate", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckboxBindingDelegate;", "checkboxDelegate", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2ItemView extends ConstraintLayout {

    @NotNull
    private final ReturnItemViewBinding binding;

    /* renamed from: checkboxDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j checkboxDelegate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int topPriceMargin = UiExtKt.toPx(10);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/item/ProductsInBotV2ItemView$Companion;", "", "<init>", "()V", "", "MINIMAL_QUANTITY", "I", "", "CHECK_PAYLOAD", "Ljava/lang/String;", "UNCHECK_PAYLOAD", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProductsInBotV2ItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindProductImage(ProductsInBotV2VO.ItemVO item, Function1<? super AtomAction, Unit> actionHandler) {
        ReturnItemViewBinding returnItemViewBinding = this.binding;
        IconView productIconView = returnItemViewBinding.productIconView;
        Intrinsics.checkNotNullExpressionValue(productIconView, "productIconView");
        IconHolderKt.bindOrGone(productIconView, item.getImage(), actionHandler);
        IconDTO privateIcon = item.getPrivateIcon();
        if (privateIcon == null) {
            IconView blurIconView = returnItemViewBinding.blurIconView;
            Intrinsics.checkNotNullExpressionValue(blurIconView, "blurIconView");
            ViewExtKt.gone(blurIconView);
            IconView privateIconView = returnItemViewBinding.privateIconView;
            Intrinsics.checkNotNullExpressionValue(privateIconView, "privateIconView");
            ViewExtKt.gone(privateIconView);
            return;
        }
        IconView blurIconView2 = returnItemViewBinding.blurIconView;
        Intrinsics.checkNotNullExpressionValue(blurIconView2, "blurIconView");
        ImageViewExtKt.load$default(blurIconView2, item.getImage().getBackgroundImage(), C7714v.b0(new ImageTransformation.Blur(0, 0, 3, null), ImageTransformation.CenterCrop.INSTANCE), null, null, null, false, null, 124, null);
        IconDTO.IconSize size = item.getImage().getSize();
        if (size != null) {
            returnItemViewBinding.blurIconView.setSize(size);
        }
        IconView blurIconView3 = returnItemViewBinding.blurIconView;
        Intrinsics.checkNotNullExpressionValue(blurIconView3, "blurIconView");
        ViewExtKt.show(blurIconView3);
        IconView privateIconView2 = returnItemViewBinding.privateIconView;
        Intrinsics.checkNotNullExpressionValue(privateIconView2, "privateIconView");
        IconHolderKt.bind(privateIconView2, privateIcon, actionHandler);
    }

    private final RmsCheckboxBindingDelegate getCheckboxDelegate() {
        return (RmsCheckboxBindingDelegate) this.checkboxDelegate.getValue();
    }

    private final void setDisabled(boolean disabled) {
        float f7;
        ReturnItemViewBinding returnItemViewBinding = this.binding;
        if (disabled) {
            f7 = 0.45f;
        } else {
            returnItemViewBinding.checkBoxClickArea.setOnClickListener(new ViewOnClickListenerC3131a(returnItemViewBinding, 1));
            f7 = 1.0f;
        }
        returnItemViewBinding.productIconView.setAlpha(f7);
        returnItemViewBinding.blurIconView.setAlpha(f7);
        returnItemViewBinding.privateIconView.setAlpha(f7);
        returnItemViewBinding.priceView.setAlpha(f7);
        returnItemViewBinding.nameTv.setAlpha(f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDisabled$lambda$8$lambda$7(ReturnItemViewBinding returnItemViewBinding, View view) {
        returnItemViewBinding.checkbox.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCheckedAnalytics(l tokenizedAnalytics, t tokenizedEvent, String payload) {
        tokenizedAnalytics.f(tokenizedEvent, new d(new ProductsInBotV2ItemView$setupCheckedAnalytics$1(payload)), null);
    }

    private final void setupConstraints(ProductsInBotV2VO.ItemVO item) {
        if (item.getBadge() == null && item.getQuantitySelector() == null) {
            PriceAtomView priceView = this.binding.priceView;
            Intrinsics.checkNotNullExpressionValue(priceView, "priceView");
            ViewGroup.LayoutParams layoutParams = priceView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = topPriceMargin;
            priceView.setLayoutParams(marginLayoutParams);
            ConstraintLayoutExtKt.updateConstraints(this, new ProductsInBotV2ItemView$setupConstraints$2(this));
        }
    }

    private final void setupQuantity(ProductsInBotV2VO.ItemVO item, InterfaceC6511n<? super Long, ? super Integer, ? super Function1<? super Integer, Unit>, ? extends Function1<? super AtomAction, Unit>> quantityActionHandler) {
        Function1<? super AtomAction, Unit> invoke = quantityActionHandler.invoke(Long.valueOf(item.getSkuId()), Integer.valueOf(item.getCurrentQuantity()), new ProductsInBotV2ItemView$setupQuantity$1$updatedQuantityActionHandler$1(item, this));
        IconButtonV3View quantityDecrease = this.binding.quantityDecrease;
        Intrinsics.checkNotNullExpressionValue(quantityDecrease, "quantityDecrease");
        RmsQuantitySelector quantitySelector = item.getQuantitySelector();
        IconButtonV3HolderKt.bindOrGone(quantityDecrease, quantitySelector != null ? quantitySelector.getDecrease() : null, invoke);
        IconButtonV3View quantityIncrease = this.binding.quantityIncrease;
        Intrinsics.checkNotNullExpressionValue(quantityIncrease, "quantityIncrease");
        RmsQuantitySelector quantitySelector2 = item.getQuantitySelector();
        IconButtonV3HolderKt.bindOrGone(quantityIncrease, quantitySelector2 != null ? quantitySelector2.getIncrease() : null, invoke);
        TextAtomV2View quantityText = this.binding.quantityText;
        Intrinsics.checkNotNullExpressionValue(quantityText, "quantityText");
        RmsQuantitySelector quantitySelector3 = item.getQuantitySelector();
        TextHolderKt.bindOrGone$default(quantityText, quantitySelector3 != null ? quantitySelector3.getQuantity() : null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateQuantity(int quantity, int maxQuantity) {
        ReturnItemViewBinding returnItemViewBinding = this.binding;
        returnItemViewBinding.quantityText.setText(String.valueOf(quantity));
        returnItemViewBinding.quantityIncrease.setDisabled(quantity == maxQuantity);
        returnItemViewBinding.quantityDecrease.setDisabled(quantity == 1);
    }

    public final void bind(@NotNull ProductsInBotV2VO.ItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6511n<? super Long, ? super Integer, ? super Function1<? super Integer, Unit>, ? extends Function1<? super AtomAction, Unit>> quantityActionHandler, @NotNull Function2<? super Long, ? super Integer, Unit> setProduct, @NotNull Function1<? super Long, Unit> removeProduct, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(quantityActionHandler, "quantityActionHandler");
        Intrinsics.checkNotNullParameter(setProduct, "setProduct");
        Intrinsics.checkNotNullParameter(removeProduct, "removeProduct");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ReturnItemViewBinding returnItemViewBinding = this.binding;
        RmsCheckboxBindingDelegate checkboxDelegate = getCheckboxDelegate();
        CheckBoxView checkbox = returnItemViewBinding.checkbox;
        Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
        checkboxDelegate.bind(checkbox, item.getCheckbox());
        returnItemViewBinding.checkbox.setOnStateChangeListener(new ProductsInBotV2ItemView$bind$1$1(removeProduct, item, setProduct, this, tokenizedAnalytics));
        bindProductImage(item, actionHandler);
        IconView privateIconView = returnItemViewBinding.privateIconView;
        Intrinsics.checkNotNullExpressionValue(privateIconView, "privateIconView");
        IconHolderKt.bindOrGone(privateIconView, item.getPrivateIcon(), actionHandler);
        PriceAtomView priceView = returnItemViewBinding.priceView;
        Intrinsics.checkNotNullExpressionValue(priceView, "priceView");
        PriceAtomHolderKt.bind(priceView, item.getPrice(), actionHandler);
        TextAtomV2View nameTv = returnItemViewBinding.nameTv;
        Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
        TextHolderKt.bind(nameTv, item.getName(), actionHandler);
        returnItemViewBinding.nameTv.setTextIsSelectable(false);
        BadgeView badgeBv = returnItemViewBinding.badgeBv;
        Intrinsics.checkNotNullExpressionValue(badgeBv, "badgeBv");
        BadgeHolderKt.bindOrGone(badgeBv, item.getBadge(), actionHandler);
        setupQuantity(item, quantityActionHandler);
        setDisabled(item.getIsDisabled());
        setupConstraints(item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInBotV2ItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.checkboxDelegate = k.b(ProductsInBotV2ItemView$checkboxDelegate$2.INSTANCE);
        this.binding = ReturnItemViewBinding.bind(View.inflate(context, R$layout.return_item_view, this));
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }
}
