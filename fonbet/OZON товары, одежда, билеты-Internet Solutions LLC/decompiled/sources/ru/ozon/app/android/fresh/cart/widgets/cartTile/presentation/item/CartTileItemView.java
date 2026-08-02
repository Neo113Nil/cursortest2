package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import B90.C2618u;
import Bi.b;
import D40.d;
import De.C2860c;
import Lt.ViewOnClickListenerC3597a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 `2\u00020\u0001:\u0001`B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJe\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u00162\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0019j\u0002`\u001a\u0012\u0004\u0012\u00020\f0\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J[\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010'\u001a\u0012\u0012\b\u0012\u00060\u0019j\u0002`\u001a\u0012\u0004\u0012\u00020\f0\u00162\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010^¨\u0006a"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isNeeded", "", "bindParanja", "(Z)V", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "item", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "controller", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "cartPickerUpdateCallback", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "processClickEvent", "bindController", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "radius", "", "colorToken", "bindBackground", "(ILjava/lang/String;)V", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;", "spacers", "bindSpacers", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;)V", "onClickEvent", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "tileBackgroundColor", "I", "getTileBackgroundColor", "()I", "setTileBackgroundColor", "(I)V", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "weightTextView", "descriptionView", "Landroidx/constraintlayout/helper/widget/Flow;", "contentFlow", "Landroidx/constraintlayout/helper/widget/Flow;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "cartPickerView", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "binButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Landroidx/constraintlayout/widget/Barrier;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "getBarrier$annotations", "()V", "Landroid/view/View;", "clickView", "Landroid/view/View;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileCheckBoxCutOutView;", "checkboxCutOutView", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileCheckBoxCutOutView;", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkboxView", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable$delegate", "LSc/j;", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder;", "cartPickerBinder$delegate", "getCartPickerBinder", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder;", "cartPickerBinder", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileItemView extends ConstraintLayout {

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final IconButtonV3View binButtonView;

    @NotNull
    private final ButtonV3View buttonView;

    /* renamed from: cartPickerBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartPickerBinder;

    @NotNull
    private final CartPickerView cartPickerView;

    @NotNull
    private final CartTileCheckBoxCutOutView checkboxCutOutView;

    @NotNull
    private final CheckBoxView checkboxView;

    @NotNull
    private final View clickView;

    @NotNull
    private final Flow contentFlow;

    @NotNull
    private final TextAtomV2View descriptionView;

    @NotNull
    private final Image imageView;

    @NotNull
    private final PriceAtomView priceView;
    private int tileBackgroundColor;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private final TextAtomV2View weightTextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final CornerRadius imageCornerRadius = CornerRadius.RADIUS_400;

    @NotNull
    private static final UniColors defaultImageBackgroundColor = UniColors.BG_LIGHT_KEY;
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
    private static final int imageSize = UiExtKt.toPx(68);
    private static final int checkboxCutOutSize = UiExtKt.toPx(32);
    private static final int buttonsMargin = UiExtKt.toPx(8);
    private static final int betweenMargin = UiExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemView$Companion;", "", "<init>", "()V", "", "CART_PICKER_WIDTH", "I", "", "LEFT_BIAS", "F", "PARANJA_ALPHA", "EMPTY_MARGIN", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartTileItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$38$lambda$37(CartTileVO.TileItem tileItem, Function1 function1, Function2 function2, CartTileVO.TileItem tileItem2, View view) {
        t tokenizedEvent = tileItem.getTokenizedEvent();
        if (tokenizedEvent != null) {
            function1.invoke(tokenizedEvent);
        }
        function2.invoke(tileItem.getAction(), tileItem2);
    }

    private final void bindBackground(int radius, String colorToken) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.tileBackgroundColor = styleParser.parseColor(context, colorToken, defaultImageBackgroundColor.getResId());
        getBackgroundDrawable().setCornerRadius(UiExtKt.toPxF(radius));
        GradientDrawable backgroundDrawable = getBackgroundDrawable();
        int i11 = this.tileBackgroundColor;
        backgroundDrawable.setColors(new int[]{i11, i11});
        setBackground(getBackgroundDrawable());
    }

    private final void bindController(CartTileVO.TileItem item, CartTileVO.TileItem.TileControl controller, Function2<? super AtomAction, ? super CartTileVO.TileItem, Unit> actionHandler, Function1<? super CartPickerVO, Unit> cartPickerUpdateCallback, Function1<? super t, Unit> processClickEvent) {
        if (controller instanceof CartTileVO.TileItem.TileControl.AvailableControl) {
            this.buttonView.setVisibility(8);
            this.binButtonView.setVisibility(8);
            CartPickerBinder.bind$default(getCartPickerBinder(), this.cartPickerView, ((CartTileVO.TileItem.TileControl.AvailableControl) controller).getCartPicker(), cartPickerUpdateCallback, new CartTileItemView$bindController$1(item, processClickEvent, actionHandler), false, 16, null);
        } else {
            if (!(controller instanceof CartTileVO.TileItem.TileControl.UnavailableControl)) {
                throw new o();
            }
            this.cartPickerView.setVisibility(8);
            CartTileVO.TileItem.TileControl.UnavailableControl unavailableControl = (CartTileVO.TileItem.TileControl.UnavailableControl) controller;
            ButtonV3HolderKt.bindOrGone(this.buttonView, unavailableControl.getButton(), new CartTileItemView$bindController$2(actionHandler, item));
            IconButtonV3HolderKt.bindOrGone(this.binButtonView, unavailableControl.getBinButton(), new CartTileItemView$bindController$3(actionHandler, item));
        }
    }

    private final void bindParanja(boolean isNeeded) {
        ViewExtKt.alpha(this.imageView, 0.5f, isNeeded);
        ViewExtKt.alpha(this.priceView, 0.5f, isNeeded);
        ViewExtKt.alpha(this.titleView, 0.5f, isNeeded);
    }

    private final void bindSpacers(CartTileVO.TileItem.Spacers spacers) {
        setPadding(UiExtKt.toPx(spacers.getHorizontal()), UiExtKt.toPx(spacers.getVertical()), UiExtKt.toPx(spacers.getHorizontal()), UiExtKt.toPx(spacers.getVertical()));
        Flow flow = this.contentFlow;
        ViewGroup.LayoutParams layoutParams = flow.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = UiExtKt.toPx(spacers.getBetween());
        flow.setLayoutParams(marginLayoutParams);
        ButtonV3View buttonV3View = this.buttonView;
        ViewGroup.LayoutParams layoutParams2 = buttonV3View.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.rightMargin = this.binButtonView.getVisibility() == 8 ? 0 : buttonsMargin;
        buttonV3View.setLayoutParams(marginLayoutParams2);
    }

    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.backgroundDrawable.getValue();
    }

    private final CartPickerBinder getCartPickerBinder() {
        return (CartPickerBinder) this.cartPickerBinder.getValue();
    }

    public final void bind(@NotNull CartTileVO.TileItem item, @NotNull Function1<? super t, Unit> onClickEvent, @NotNull Function2<? super AtomAction, ? super CartTileVO.TileItem, Unit> actionHandler, @NotNull Function1<? super CartPickerVO, Unit> cartPickerUpdateCallback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(cartPickerUpdateCallback, "cartPickerUpdateCallback");
        ImageHolderKt.bindOrGone$default(this.imageView, new ImageDTO(item.getImage(), defaultImageBackgroundColor.getToken(), null, false, null, null, null, null, imageCornerRadius, null, null, null, null, null, ImageDTO.FitType.FIT_CENTER, null, 48892, null), null, 2, null);
        PriceAtomHolderKt.bindOrGone$default(this.priceView, item.getPrice(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.weightTextView, item.getWeightText(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.descriptionView, item.getDescription(), null, 2, null);
        CheckBoxView checkBoxView = this.checkboxView;
        CartTileVO.TileItem.CheckboxWrapper checkboxWrapper = item.getCheckboxWrapper();
        CheckBoxHolderKt.bindOrGone$default(checkBoxView, checkboxWrapper != null ? checkboxWrapper.getCheckbox() : null, null, 2, null);
        this.checkboxView.setOnStateChangeListener(new CartTileItemView$bind$1$1(item, onClickEvent, actionHandler, item));
        this.checkboxCutOutView.setVisibility(item.getCheckboxWrapper() != null ? 0 : 8);
        bindController(item, item.getTileControl(), actionHandler, cartPickerUpdateCallback, onClickEvent);
        bindParanja(item.getHasParanja());
        bindBackground(item.getRadius(), item.getBackgroundColor());
        bindSpacers(item.getSpacers());
        this.clickView.setOnClickListener(new ViewOnClickListenerC3597a(item, onClickEvent, actionHandler, item));
        requestLayout();
        invalidate();
    }

    public final int getTileBackgroundColor() {
        return this.tileBackgroundColor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartTileItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = defaultBackgroundColor;
        this.tileBackgroundColor = a.getColor(context, i12);
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.ctImage);
        int i13 = imageSize;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i13, i13);
        bVar.f41636i = 0;
        bVar.f41628e = 0;
        image.setLayoutParams(bVar);
        addView(image);
        this.imageView = image;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.ctPrice, 0, -2);
        b11.f41598E = 0.0f;
        int i14 = buttonsMargin;
        ((ViewGroup.MarginLayoutParams) b11).rightMargin = i14;
        priceAtomView.setLayoutParams(b11);
        addView(priceAtomView);
        this.priceView = priceAtomView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.ctTitle, 0, -2);
        d11.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) d11).rightMargin = i14;
        textAtomV2View.setLayoutParams(d11);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.ctWeight, 0, -2);
        d12.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) d12).rightMargin = i14;
        textAtomV2View2.setLayoutParams(d12);
        TextViewExtKt.setTextCopyable(textAtomV2View2, false);
        addView(textAtomV2View2);
        this.weightTextView = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d13 = b.d(textAtomV2View3, R$id.ctDescription, 0, -2);
        d13.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) d13).rightMargin = i14;
        textAtomV2View3.setLayoutParams(d13);
        TextViewExtKt.setTextCopyable(textAtomV2View3, false);
        addView(textAtomV2View3);
        this.descriptionView = textAtomV2View3;
        Flow flow = new Flow(context);
        flow.setId(R$id.ctContentFlow);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, 0);
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        bVar2.f41630f = image.getId();
        bVar2.f41632g = R$id.ctBarrier;
        ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = i14;
        flow.setLayoutParams(bVar2);
        flow.setReferencedIds(new int[]{priceAtomView.getId(), textAtomV2View.getId(), textAtomV2View2.getId(), textAtomV2View3.getId()});
        flow.setOrientation(1);
        flow.setVerticalStyle(2);
        flow.setVerticalGap(betweenMargin);
        flow.setWrapMode(0);
        addView(flow);
        this.contentFlow = flow;
        AttributeSet attributeSet2 = null;
        int i15 = 0;
        CartPickerView cartPickerView = new CartPickerView(context, attributeSet2, i15, 6, null);
        cartPickerView.setId(R$id.ctCartPicker);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(UiExtKt.toPx(96), -2);
        bVar3.f41636i = 0;
        bVar3.f41634h = 0;
        bVar3.f41642l = 0;
        cartPickerView.setLayoutParams(bVar3);
        addView(cartPickerView);
        this.cartPickerView = cartPickerView;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.ctBinButton, -2, -2);
        c11.f41636i = 0;
        c11.f41634h = 0;
        c11.f41642l = 0;
        iconButtonV3View.setLayoutParams(c11);
        addView(iconButtonV3View);
        this.binButtonView = iconButtonV3View;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, i15, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.ctButton, -2, -2);
        e11.f41636i = image.getId();
        e11.f41642l = 0;
        e11.f41632g = iconButtonV3View.getId();
        ((ViewGroup.MarginLayoutParams) e11).rightMargin = i14;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.ctBarrier);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -1));
        barrier.setReferencedIds(new int[]{buttonV3View.getId(), iconButtonV3View.getId(), cartPickerView.getId()});
        barrier.f(0);
        addView(barrier);
        this.barrier = barrier;
        View view = new View(context);
        view.setId(R$id.ctClickView);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, 0);
        int i16 = R$id.ctImage;
        bVar4.f41628e = i16;
        bVar4.f41636i = i16;
        int i17 = R$id.ctContentFlow;
        bVar4.f41634h = i17;
        bVar4.f41642l = i17;
        view.setLayoutParams(bVar4);
        addView(view);
        this.clickView = view;
        CartTileCheckBoxCutOutView cartTileCheckBoxCutOutView = new CartTileCheckBoxCutOutView(context, null, 0, 6, null);
        cartTileCheckBoxCutOutView.setId(R$id.ctCheckboxCutOut);
        int i18 = checkboxCutOutSize;
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(i18, i18);
        bVar5.f41636i = image.getId();
        bVar5.f41628e = image.getId();
        cartTileCheckBoxCutOutView.setLayoutParams(bVar5);
        cartTileCheckBoxCutOutView.setForeground(new ColorDrawable(a.getColor(context, i12)));
        cartTileCheckBoxCutOutView.setVisibility(8);
        addView(cartTileCheckBoxCutOutView);
        this.checkboxCutOutView = cartTileCheckBoxCutOutView;
        CheckBoxView checkBoxView = new CheckBoxView(context, null, 0, 6, null);
        checkBoxView.setId(R$id.ctCheckbox);
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(-2, -2);
        bVar6.f41636i = image.getId();
        bVar6.f41628e = image.getId();
        checkBoxView.setLayoutParams(bVar6);
        checkBoxView.setClipToOutline(true);
        addView(checkBoxView);
        this.checkboxView = checkBoxView;
        this.backgroundDrawable = k.b(new CartTileItemView$backgroundDrawable$2(this));
        this.cartPickerBinder = k.b(CartTileItemView$cartPickerBinder$2.INSTANCE);
    }
}
