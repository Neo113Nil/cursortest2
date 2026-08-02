package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartCountPickerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "decreaseBtn", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getDecreaseBtn", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "inputEt", "Lru/ozon/app/android/cart/ui/quantityInput/QuantityInput;", "getInputEt", "()Lru/ozon/app/android/cart/ui/quantityInput/QuantityInput;", "increaseBtn", "getIncreaseBtn", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartCountPickerView extends LinearLayout {

    @NotNull
    private final IconButtonV3View decreaseBtn;

    @NotNull
    private final IconButtonV3View increaseBtn;

    @NotNull
    private final QuantityInput inputEt;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_32 = ResourceExtKt.toPx(32);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartCountPickerView$Companion;", "", "<init>", "()V", "", "INPUT_MAX_LENGTH", "I", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartCountPickerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final IconButtonV3View getDecreaseBtn() {
        return this.decreaseBtn;
    }

    @NotNull
    public final IconButtonV3View getIncreaseBtn() {
        return this.increaseBtn;
    }

    @NotNull
    public final QuantityInput getInputEt() {
        return this.inputEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartCountPickerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, attributeSet2, i12, 0, 14, defaultConstructorMarker);
        iconButtonV3View.setId(R$id.decreaseQuantityBtn);
        int i13 = DP_32;
        iconButtonV3View.setLayoutParams(new LinearLayout.LayoutParams(i13, i13));
        addView(iconButtonV3View);
        this.decreaseBtn = iconButtonV3View;
        QuantityInput quantityInput = new QuantityInput(context, null, 0, 6, null);
        quantityInput.setId(R$id.quantityEt);
        quantityInput.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, i13));
        quantityInput.setGravity(17);
        quantityInput.setImeOptions(6);
        quantityInput.setInputType(2);
        quantityInput.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        quantityInput.setSelectAllOnFocus(true);
        addView(quantityInput);
        this.inputEt = quantityInput;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, attributeSet2, i12, 0, 14, defaultConstructorMarker);
        iconButtonV3View2.setId(R$id.increaseQuantityBtn);
        iconButtonV3View2.setLayoutParams(new LinearLayout.LayoutParams(i13, i13));
        addView(iconButtonV3View2);
        this.increaseBtn = iconButtonV3View2;
        setOrientation(0);
    }
}
