package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import IU.a;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.C5429p;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.C7092a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CartSplitV2ViewModelV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartCountPickerView;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.feature.R$drawable;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u000206\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001:B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J1\u0010\u001a\u001a\u00020\u000e*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u000e*\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0010J\u001d\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder;", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartCountPickerView;", "countPickerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartCountPickerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerListener;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "", "configureCartCountPicker", "()V", "configureDsCountPicker", "initQuantityInput", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "", "styleRes", "Lkotlin/Function0;", "onClick", "bindQuantityButton", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ILkotlin/jvm/functions/Function0;)V", "", "enabled", "setButtonEnabled", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Z)V", "hideKeyboard", "Landroidx/lifecycle/J;", "lifecycle", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CartSplitV2ViewModelV2;", "viewModel", "onAttachViewModel", "(Landroidx/lifecycle/J;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CartSplitV2ViewModelV2;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "item", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartCountPickerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerListener;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder$hideKeyboardScrollListener$1", "hideKeyboardScrollListener", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder$hideKeyboardScrollListener$1;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "quantityTextWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder$roundedOutlineProvider$1", "roundedOutlineProvider", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder$roundedOutlineProvider$1;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CountPickerBinder {

    @NotNull
    private final AppType appType;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final CartCountPickerView countPickerView;

    @NotNull
    private final CountPickerBinder$hideKeyboardScrollListener$1 hideKeyboardScrollListener;
    private ControlsVO.QuantityControl item;

    @NotNull
    private final CountPickerListener listener;

    @NotNull
    private final SimpleTextWatcher quantityTextWatcher;

    @NotNull
    private final CountPickerBinder$roundedOutlineProvider$1 roundedOutlineProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_2 = ResourceExtKt.toPx(2);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_12 = ResourceExtKt.toPx(12);
    private static final int DP_32 = ResourceExtKt.toPx(32);
    private static final int DP_42 = ResourceExtKt.toPx(42);
    private static final float RADIUS_8 = ResourceExtKt.toPxF(8);
    private static final float RADIUS_16 = ResourceExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder$Companion;", "", "<init>", "()V", "", "RADIUS_8", "F", "getRADIUS_8", "()F", "RADIUS_16", "getRADIUS_16", "", "NO_BREAK_SPACE", "Ljava/lang/String;", "NARROW_NO_BREAK_SPACE", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getRADIUS_16() {
            return CountPickerBinder.RADIUS_16;
        }

        public final float getRADIUS_8() {
            return CountPickerBinder.RADIUS_8;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder$hideKeyboardScrollListener$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder$roundedOutlineProvider$1] */
    public CountPickerBinder(@NotNull CartCountPickerView countPickerView, @NotNull ComposerReferences composerReferences, @NotNull AppType appType, @NotNull CountPickerListener listener, @NotNull AsyncCartViewModel asyncCartViewModel) {
        Intrinsics.checkNotNullParameter(countPickerView, "countPickerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        this.countPickerView = countPickerView;
        this.composerReferences = composerReferences;
        this.appType = appType;
        this.listener = listener;
        this.asyncCartViewModel = asyncCartViewModel;
        this.hideKeyboardScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder$hideKeyboardScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                CountPickerListener countPickerListener;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dx == 0 && dy == 0) {
                    return;
                }
                CountPickerBinder.this.hideKeyboard();
                countPickerListener = CountPickerBinder.this.listener;
                countPickerListener.onKeyboardHided();
            }
        };
        this.quantityTextWatcher = new SimpleTextWatcher(new CountPickerBinder$quantityTextWatcher$1(this));
        this.roundedOutlineProvider = new ViewOutlineProvider() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder$roundedOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                AppType appType2;
                CountPickerBinder.Companion companion;
                float radius_8;
                CountPickerBinder.Companion companion2;
                Intrinsics.checkNotNullParameter(view, "view");
                appType2 = CountPickerBinder.this.appType;
                if (appType2 == AppType.SELECT) {
                    companion2 = CountPickerBinder.Companion;
                    radius_8 = companion2.getRADIUS_16();
                } else {
                    companion = CountPickerBinder.Companion;
                    radius_8 = companion.getRADIUS_8();
                }
                float f7 = radius_8;
                if (outline != null) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), f7);
                }
            }
        };
        initQuantityInput();
    }

    private final void bindQuantityButton(IconButtonV3View iconButtonV3View, IconButtonV3DTO iconButtonV3DTO, int i11, Function0<Unit> function0) {
        IconButtonV3DTO.Sizes size = iconButtonV3DTO.getSize();
        if (size == null) {
            size = IconButtonV3DTO.Sizes.SIZE_500;
        }
        iconButtonV3View.setSize(size);
        IconButtonV3DTO.IconButtonShape buttonShape = iconButtonV3DTO.getButtonShape();
        if (buttonShape == null) {
            buttonShape = IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE;
        }
        iconButtonV3View.setShape(buttonShape);
        iconButtonV3View.setIconDrawable(DrawableResource.INSTANCE.fromToken(iconButtonV3DTO.getIcon()));
        iconButtonV3View.applyStyle(i11);
        iconButtonV3View.setOnClickListener(new a(function0, 1));
    }

    private final void configureCartCountPicker() {
        CartCountPickerView cartCountPickerView = this.countPickerView;
        QuantityInput inputEt = cartCountPickerView.getInputEt();
        inputEt.setDsStyle(false);
        ViewGroup.LayoutParams layoutParams = inputEt.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = DP_8;
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.setMarginEnd(i11);
        inputEt.setLayoutParams(marginLayoutParams);
        inputEt.setMinWidth(DP_42);
        int i12 = DP_12;
        inputEt.setPadding(i12, 0, i12, 0);
        inputEt.setBackgroundResource(R$drawable.bg_quantity_input_selector);
        inputEt.setTextAppearance(R$style.TextStyle_Body_M_Bold);
        cartCountPickerView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        cartCountPickerView.setClipToOutline(false);
    }

    private final void configureDsCountPicker() {
        CartCountPickerView cartCountPickerView = this.countPickerView;
        Drawable background = cartCountPickerView.getIncreaseBtn().getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(0.0f);
        }
        Drawable background2 = cartCountPickerView.getDecreaseBtn().getBackground();
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadius(0.0f);
        }
        QuantityInput inputEt = cartCountPickerView.getInputEt();
        inputEt.setDsStyle(true);
        ViewGroup.LayoutParams layoutParams = inputEt.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        inputEt.setLayoutParams(marginLayoutParams);
        inputEt.setMinWidth(DP_32);
        int i11 = DP_2;
        inputEt.setPadding(i11, 0, i11, 0);
        Context context = inputEt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        inputEt.setBackgroundColor(ResourceExtKt.color(context, R$color.bg_secondary));
        inputEt.setTextAppearance(ru.ozon.uni.core.R$style.OzonTextAppearance_BodyNumeric_400small);
        cartCountPickerView.setOutlineProvider(this.roundedOutlineProvider);
        cartCountPickerView.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideKeyboard() {
        this.countPickerView.getInputEt().clearFocus();
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 != null) {
            KeyboardUtilsKt.hideKeyboard(c11);
        }
    }

    private final void initQuantityInput() {
        QuantityInput inputEt = this.countPickerView.getInputEt();
        inputEt.addTextChangedListener(this.quantityTextWatcher);
        inputEt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: mn.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CountPickerBinder.initQuantityInput$lambda$9$lambda$7(CountPickerBinder.this, view, z11);
            }
        });
        inputEt.setOnEditorActionListener(new C7092a(inputEt, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initQuantityInput$lambda$9$lambda$7(CountPickerBinder countPickerBinder, View view, boolean z11) {
        View view2;
        ComponentCallbacksC5392m c11 = countPickerBinder.composerReferences.getContainer().c();
        RecyclerView composerRecyclerView = (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2);
        if (z11) {
            if (composerRecyclerView != null) {
                composerRecyclerView.addOnScrollListener(countPickerBinder.hideKeyboardScrollListener);
            }
        } else {
            if (composerRecyclerView != null) {
                composerRecyclerView.removeOnScrollListener(countPickerBinder.hideKeyboardScrollListener);
            }
            countPickerBinder.listener.onKeyboardHided();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initQuantityInput$lambda$9$lambda$8(QuantityInput quantityInput, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        quantityInput.clearFocus();
        KeyboardUtilsKt.hideKeyboard(quantityInput);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonEnabled(IconButtonV3View iconButtonV3View, boolean z11) {
        ControlsVO.QuantityControl quantityControl;
        ControlsVO.QuantityControl.QuantityStyle style;
        iconButtonV3View.setDisabled(!z11);
        iconButtonV3View.setClickable(z11);
        if (iconButtonV3View.getDisabled() || (quantityControl = this.item) == null || (style = quantityControl.getStyle()) == null) {
            return;
        }
        iconButtonV3View.applyStyle(style.getStyleRes());
    }

    public final void bind(ControlsVO.QuantityControl item) {
        this.item = item;
        if (item == null) {
            ViewExtKt.gone(this.countPickerView);
            return;
        }
        ViewExtKt.show(this.countPickerView);
        bindQuantityButton(this.countPickerView.getDecreaseBtn(), item.getStyle().getDecreaseBtn(), item.getStyle().getStyleRes(), new CountPickerBinder$bind$1(this));
        bindQuantityButton(this.countPickerView.getIncreaseBtn(), item.getStyle().getIncreaseBtn(), item.getStyle().getStyleRes(), new CountPickerBinder$bind$2(this));
        if (item.getStyle() == ControlsVO.QuantityControl.QuantityStyle.CUSTOM_DS_COUNT_PICKER) {
            configureDsCountPicker();
        } else {
            configureCartCountPicker();
        }
    }

    public final void onAttachViewModel(@NotNull J lifecycle, @NotNull CartSplitV2ViewModelV2 viewModel) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C2399j.C(new C2408n0(new C2417s0(C5429p.a(viewModel.getDecreaseEnabled()), this.asyncCartViewModel.isProcessing(), new CountPickerBinder$onAttachViewModel$1$1(this, null)), new CountPickerBinder$onAttachViewModel$1$2(this, null)), K.a(lifecycle));
        viewModel.getIncreaseEnabled().observe(lifecycle, new CountPickerBinder$sam$androidx_lifecycle_Observer$0(new CountPickerBinder$onAttachViewModel$1$3(this)));
        viewModel.getQuantityInputEnabled().observe(lifecycle, new CountPickerBinder$sam$androidx_lifecycle_Observer$0(new CountPickerBinder$onAttachViewModel$1$4(this)));
        viewModel.getCurrentQuantity().observe(lifecycle, new CountPickerBinder$sam$androidx_lifecycle_Observer$0(new CountPickerBinder$onAttachViewModel$1$5(this)));
    }
}
