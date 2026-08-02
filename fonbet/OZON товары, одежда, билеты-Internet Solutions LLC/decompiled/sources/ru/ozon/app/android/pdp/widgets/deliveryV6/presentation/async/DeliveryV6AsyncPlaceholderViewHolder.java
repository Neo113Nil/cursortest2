package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Placeholder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderView;", "view", "<init>", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Placeholder;Ll20/d;)V", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderView;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6AsyncPlaceholderViewHolder extends k<DeliveryV6VO.Placeholder> {

    @NotNull
    private final DeliveryV6AsyncPlaceholderView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6AsyncPlaceholderViewHolder(@NotNull DeliveryV6AsyncPlaceholderView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryV6VO.Placeholder item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        DeliveryV6AsyncPlaceholderView deliveryV6AsyncPlaceholderView = this.view;
        boolean d11 = Intrinsics.d(item.getViewDTO(), Boolean.TRUE);
        ViewGroup.LayoutParams layoutParams = deliveryV6AsyncPlaceholderView.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = d11 ? -2 : 0;
        layoutParams.height = i12;
        if (i11 != i12) {
            deliveryV6AsyncPlaceholderView.setLayoutParams(layoutParams);
        }
        ViewExtKt.showOrGone(deliveryV6AsyncPlaceholderView, Boolean.valueOf(d11));
    }
}
