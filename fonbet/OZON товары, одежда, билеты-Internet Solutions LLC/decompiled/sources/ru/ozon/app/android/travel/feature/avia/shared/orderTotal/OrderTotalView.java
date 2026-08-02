package ru.ozon.app.android.travel.feature.avia.shared.orderTotal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewOrderTotalBinding;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewOrderTotalBinding;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OrderTotalView extends ConstraintLayout {

    @NotNull
    private final ViewOrderTotalBinding binding;

    public /* synthetic */ OrderTotalView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    public final void bind(@NotNull OrderTotalVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewOrderTotalBinding viewOrderTotalBinding = this.binding;
        TextAtomView orderTotalCaptionTextView = viewOrderTotalBinding.orderTotalCaptionTextView;
        Intrinsics.checkNotNullExpressionValue(orderTotalCaptionTextView, "orderTotalCaptionTextView");
        TextAtomHolderKt.bind$default(orderTotalCaptionTextView, item.getCaption(), null, 2, null);
        SmallIconButtonView orderTotalInfoButton = viewOrderTotalBinding.orderTotalInfoButton;
        Intrinsics.checkNotNullExpressionValue(orderTotalInfoButton, "orderTotalInfoButton");
        WrappedIconButtonHolderKt.bindOrGone(orderTotalInfoButton, item.getInfoButton(), onAction);
        LargeButtonView orderTotalSubmitButton = viewOrderTotalBinding.orderTotalSubmitButton;
        Intrinsics.checkNotNullExpressionValue(orderTotalSubmitButton, "orderTotalSubmitButton");
        LargeButtonHolderKt.bind(orderTotalSubmitButton, item.getSubmitButton(), onAction);
        TextAtomView orderTotalPriceTextView = viewOrderTotalBinding.orderTotalPriceTextView;
        Intrinsics.checkNotNullExpressionValue(orderTotalPriceTextView, "orderTotalPriceTextView");
        TextAtomHolderKt.bind$default(orderTotalPriceTextView, item.getPrice(), null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTotalView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewOrderTotalBinding inflate = ViewOrderTotalBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.orderTotalInfoButton.setScaleType(ImageView.ScaleType.CENTER);
    }
}
