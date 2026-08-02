package ru.ozon.app.android.account.orders.changeDeliveryTimeButton.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/orders/changeDeliveryTimeButton/presentation/ChangeDeliveryTimeButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "changeDeliveryTimeBtn", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getChangeDeliveryTimeBtn", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeDeliveryTimeButtonView extends FrameLayout {
    public static final int $stable = LargeButtonView.$stable;

    @NotNull
    private final LargeButtonView changeDeliveryTimeBtn;

    public /* synthetic */ ChangeDeliveryTimeButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final LargeButtonView getChangeDeliveryTimeBtn() {
        return this.changeDeliveryTimeBtn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeDeliveryTimeButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        largeButtonView.setId(R$id.changeDeliveryTimeBtn);
        int px = ResourceExtKt.toPx(16, context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(px, px, px, px);
        largeButtonView.setLayoutParams(marginLayoutParams);
        this.changeDeliveryTimeBtn = largeButtonView;
        setId(View.generateViewId());
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(a.getColor(context, UniColors.LAYER_FLOOR_2.getResId()));
        addView(largeButtonView);
    }
}
