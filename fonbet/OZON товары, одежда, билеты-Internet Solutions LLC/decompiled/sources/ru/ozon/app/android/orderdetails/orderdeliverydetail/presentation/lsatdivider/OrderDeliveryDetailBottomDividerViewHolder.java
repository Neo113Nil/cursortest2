package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.lsatdivider;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.OrderDeliveryDetailsBottomDividerBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailBottomDividerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailBottomDividerVO;", "Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailsBottomDividerBinding;", "binding", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailsBottomDividerBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailBottomDividerVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailsBottomDividerBinding;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryDetailBottomDividerViewHolder extends k<OrderDeliveryDetailBottomDividerVO> {

    @NotNull
    private final OrderDeliveryDetailsBottomDividerBinding binding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int TOP_MARGIN_WITH_ICON_BUTTON = ResourceExtKt.toPx(8);
    private static final int TOP_MARGIN_WITHOUT_ICON_BUTTON = ResourceExtKt.toPx(16);
    private static final int START_MARGIN_DEFAULT = ResourceExtKt.toPx(50);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailBottomDividerViewHolder$Companion;", "", "<init>", "()V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDeliveryDetailBottomDividerViewHolder(@NotNull OrderDeliveryDetailsBottomDividerBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        View constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDeliveryDetailBottomDividerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View constraintLayout = this.binding.getConstraintLayout();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.binding.getConstraintLayout().getLayoutParams());
        marginLayoutParams.setMarginStart(START_MARGIN_DEFAULT);
        marginLayoutParams.topMargin = item.getHasIconButton() ? TOP_MARGIN_WITH_ICON_BUTTON : TOP_MARGIN_WITHOUT_ICON_BUTTON;
        constraintLayout.setLayoutParams(marginLayoutParams);
    }
}
