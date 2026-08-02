package ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.items;

import FG.a;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoVO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderProductViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lkotlin/Function1;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;", "", "onItemClick", "<init>", "(Lru/ozon/uni/android/atom/image/Image;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;)V", "Lru/ozon/uni/android/atom/image/Image;", "Lkotlin/jvm/functions/Function1;", "orderProduct", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderProductViewHolder extends j {

    @NotNull
    private final Image imageView;

    @NotNull
    private final Function1<OrderInfoVO.OrderProduct, Unit> onItemClick;
    private OrderInfoVO.OrderProduct orderProduct;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrderProductViewHolder(@NotNull Image imageView, @NotNull Function1<? super OrderInfoVO.OrderProduct, Unit> onItemClick) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.imageView = imageView;
        this.onItemClick = onItemClick;
        imageView.setOnClickListener(new a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(OrderProductViewHolder orderProductViewHolder, View view) {
        OrderInfoVO.OrderProduct orderProduct = orderProductViewHolder.orderProduct;
        if (orderProduct != null) {
            orderProductViewHolder.onItemClick.invoke(orderProduct);
        }
    }

    public final void bind(@NotNull OrderInfoVO.OrderProduct item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.orderProduct = item;
        ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
    }
}
