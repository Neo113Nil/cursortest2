package ru.ozon.app.android.fresh.main.ui.atoms.cartPrice;

import AI.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.app.android.fresh.main.R$drawable;
import ru.ozon.app.android.fresh.main.R$string;
import ru.ozon.app.android.fresh.main.databinding.CartPriceExpressAtomBinding;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\rJ\u0019\u0010\u001b\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\rJ\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\rR$\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u0010,\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\"\u0010/\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R*\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R*\u0010<\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u00106\"\u0004\b>\u00108R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\u0014\u0010I\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00104R\u0017\u0010K\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceFreshView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initClickListeners", "()V", "", "price", "priceColor", "originalPrice", "originalPriceColor", "priceWithUnit", "bindPrices", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceStyleType;", "theme", "bindToCartBtnTheme", "(Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceStyleType;)V", "onBindComplete", "getDefaultPriceColor", "(Ljava/lang/String;)I", "Landroid/view/ViewGroup$LayoutParams;", "hideButtonsShowToCart", "()Landroid/view/ViewGroup$LayoutParams;", "showButtonsHideToCart", "disablePlusButton", "enablePlusButton", "roundedBgColor", "Ljava/lang/String;", "getRoundedBgColor", "()Ljava/lang/String;", "setRoundedBgColor", "(Ljava/lang/String;)V", "enabledPlusColor", "getEnabledPlusColor", "setEnabledPlusColor", "disabledPlusColor", "getDisabledPlusColor", "setDisabledPlusColor", "unitOfMeasure", "getUnitOfMeasure", "setUnitOfMeasure", AppMeasurementSdk.ConditionalUserProperty.VALUE, "availableCount", "I", "getAvailableCount", "()I", "setAvailableCount", "(I)V", "minCount", "getMinCount", "setMinCount", "count", "getCount", "setCount", "Lkotlin/Function1;", "onPlusClick", "Lkotlin/jvm/functions/Function1;", "getOnPlusClick", "()Lkotlin/jvm/functions/Function1;", "setOnPlusClick", "(Lkotlin/jvm/functions/Function1;)V", "onMinusClick", "getOnMinusClick", "setOnMinusClick", "sidePadding", "Lru/ozon/app/android/fresh/main/databinding/CartPriceExpressAtomBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/CartPriceExpressAtomBinding;", "getBinding", "()Lru/ozon/app/android/fresh/main/databinding/CartPriceExpressAtomBinding;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPriceFreshView extends ConstraintLayout implements AtomView {

    @NotNull
    private static final ViewGroup.LayoutParams defaultLp = new ViewGroup.LayoutParams(-1, -2);
    private int availableCount;

    @NotNull
    private final CartPriceExpressAtomBinding binding;
    private int count;
    private String disabledPlusColor;
    private String enabledPlusColor;
    private int minCount;
    private Function1<? super CartPriceFreshView, Unit> onMinusClick;
    private Function1<? super CartPriceFreshView, Unit> onPlusClick;
    private String roundedBgColor;
    private final int sidePadding;

    @NotNull
    private String unitOfMeasure;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartPriceFreshAtom.CartPriceStyleType.values().length];
            try {
                iArr[CartPriceFreshAtom.CartPriceStyleType.STYLE_TYPE_PRIMARY_EXPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CartPriceFreshView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void disablePlusButton() {
        ImageView plusButtonIv = this.binding.plusButtonIv;
        Intrinsics.checkNotNullExpressionValue(plusButtonIv, "plusButtonIv");
        ViewExtKt.disable(plusButtonIv);
        Unit unit = Unit.f71690a;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, this.disabledPlusColor);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            ImageView plusButtonIv2 = this.binding.plusButtonIv;
            Intrinsics.checkNotNullExpressionValue(plusButtonIv2, "plusButtonIv");
            ThemeExtKt.tint(plusButtonIv2, Integer.valueOf(intValue));
        }
    }

    private final void enablePlusButton() {
        ImageView plusButtonIv = this.binding.plusButtonIv;
        Intrinsics.checkNotNullExpressionValue(plusButtonIv, "plusButtonIv");
        ViewExtKt.enable(plusButtonIv);
        Unit unit = Unit.f71690a;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, this.enabledPlusColor);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            ImageView plusButtonIv2 = this.binding.plusButtonIv;
            Intrinsics.checkNotNullExpressionValue(plusButtonIv2, "plusButtonIv");
            ThemeExtKt.tint(plusButtonIv2, Integer.valueOf(intValue));
        }
    }

    private final int getDefaultPriceColor(String originalPrice) {
        if (originalPrice != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return ThemeExtKt.themeColorRes(context, R$attr.oz_semantic_text_fresh);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return ThemeExtKt.themeColorRes(context2, R$attr.oz_semantic_text_primary);
    }

    private final ViewGroup.LayoutParams hideButtonsShowToCart() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = defaultLp;
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        int i11 = this.sidePadding;
        ViewExtKt.updatePadding$default(this, i11, 0, i11, 0, 10, null);
        Group counterPriceGroup = this.binding.counterPriceGroup;
        Intrinsics.checkNotNullExpressionValue(counterPriceGroup, "counterPriceGroup");
        ViewExtKt.gone(counterPriceGroup);
        Group toCartBtnAndPriceGroup = this.binding.toCartBtnAndPriceGroup;
        Intrinsics.checkNotNullExpressionValue(toCartBtnAndPriceGroup, "toCartBtnAndPriceGroup");
        ViewExtKt.show(toCartBtnAndPriceGroup);
        setBackground(null);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$0(CartPriceFreshView cartPriceFreshView, View view) {
        cartPriceFreshView.setCount(cartPriceFreshView.count + cartPriceFreshView.minCount);
        Function1<? super CartPriceFreshView, Unit> function1 = cartPriceFreshView.onPlusClick;
        if (function1 != null) {
            function1.invoke(cartPriceFreshView);
        }
    }

    private final ViewGroup.LayoutParams showButtonsHideToCart() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = defaultLp;
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        ViewExtKt.updatePadding$default(this, 0, 0, 0, 0, 10, null);
        Group counterPriceGroup = this.binding.counterPriceGroup;
        Intrinsics.checkNotNullExpressionValue(counterPriceGroup, "counterPriceGroup");
        ViewExtKt.show(counterPriceGroup);
        Group toCartBtnAndPriceGroup = this.binding.toCartBtnAndPriceGroup;
        Intrinsics.checkNotNullExpressionValue(toCartBtnAndPriceGroup, "toCartBtnAndPriceGroup");
        ViewExtKt.gone(toCartBtnAndPriceGroup);
        setBackgroundResource(R$drawable.bg_cart_price_express_view);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, this.roundedBgColor);
        if (parseColor != null) {
            ViewExtKt.setBackgroundTint(this, parseColor.intValue());
        }
        return layoutParams;
    }

    public final void bindPrices(@NotNull String price, @NotNull String priceColor, String originalPrice, String originalPriceColor, @NotNull String priceWithUnit) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceColor, "priceColor");
        Intrinsics.checkNotNullParameter(priceWithUnit, "priceWithUnit");
        int defaultPriceColor = getDefaultPriceColor(priceColor);
        this.binding.pricesFlexbox.setPrice(price, priceColor, defaultPriceColor);
        PriceFlexboxView priceFlexboxView = this.binding.pricesFlexbox;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        priceFlexboxView.setOriginPrice(originalPrice, originalPriceColor, ThemeExtKt.themeColorRes(context, R$attr.oz_semantic_text_primary));
        this.binding.pricesFlexbox.setOriginPriceLineColor(priceColor, defaultPriceColor);
        this.binding.pricePerUnitTv.setText(priceWithUnit);
    }

    public final void bindToCartBtnTheme(@NotNull CartPriceFreshAtom.CartPriceStyleType theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (WhenMappings.$EnumSwitchMapping$0[theme.ordinal()] == 1) {
            this.binding.toCartBtnView.setBackgroundResource(R$drawable.bg_cart_primary_fresh_ripple_rounded);
        } else {
            this.binding.toCartBtnView.setBackgroundResource(R$drawable.bg_cart_primary_ripple_rounded);
        }
    }

    @NotNull
    public final CartPriceExpressAtomBinding getBinding() {
        return this.binding;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final Function1<CartPriceFreshView, Unit> getOnMinusClick() {
        return this.onMinusClick;
    }

    public final Function1<CartPriceFreshView, Unit> getOnPlusClick() {
        return this.onPlusClick;
    }

    public final void initClickListeners() {
        this.binding.toCartBtnView.setOnClickListener(new b(this, 7));
        ImageView plusButtonIv = this.binding.plusButtonIv;
        Intrinsics.checkNotNullExpressionValue(plusButtonIv, "plusButtonIv");
        ViewExtKt.setOnClickListenerThrottle$default(plusButtonIv, 0L, new CartPriceFreshView$initClickListeners$2(this), 1, null);
        ImageView minusButtonIv = this.binding.minusButtonIv;
        Intrinsics.checkNotNullExpressionValue(minusButtonIv, "minusButtonIv");
        ViewExtKt.setOnClickListenerThrottle$default(minusButtonIv, 0L, new CartPriceFreshView$initClickListeners$3(this), 1, null);
    }

    public final void onBindComplete() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.fresh.main.ui.atoms.cartPrice.CartPriceFreshView$onBindComplete$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0) {
                    return;
                }
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((CartPriceFreshView) this).requestLayout();
            }
        });
    }

    public final void setAvailableCount(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.availableCount = i11;
    }

    public final void setCount(int i11) {
        if (i11 <= 0 || i11 < this.minCount) {
            hideButtonsShowToCart();
            enablePlusButton();
            i11 = 0;
        } else if (i11 >= this.availableCount) {
            disablePlusButton();
            showButtonsHideToCart();
            i11 = this.availableCount;
        } else {
            enablePlusButton();
            showButtonsHideToCart();
        }
        this.count = i11;
        this.binding.countLabelTv.setText(StringProvider.getString(R$string.cart_price_with_unit, Integer.valueOf(i11), this.unitOfMeasure));
    }

    public final void setDisabledPlusColor(String str) {
        this.disabledPlusColor = str;
    }

    public final void setEnabledPlusColor(String str) {
        this.enabledPlusColor = str;
    }

    public final void setMinCount(int i11) {
        this.minCount = i11;
    }

    public final void setOnMinusClick(Function1<? super CartPriceFreshView, Unit> function1) {
        this.onMinusClick = function1;
    }

    public final void setOnPlusClick(Function1<? super CartPriceFreshView, Unit> function1) {
        this.onPlusClick = function1;
    }

    public final void setRoundedBgColor(String str) {
        this.roundedBgColor = str;
    }

    public final void setUnitOfMeasure(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unitOfMeasure = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartPriceFreshView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.unitOfMeasure = "";
        this.sidePadding = ResourceExtKt.toPx(4);
        this.binding = CartPriceExpressAtomBinding.inflate(LayoutInflater.from(context), this);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(false);
    }
}
