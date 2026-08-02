package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2HeaderDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper.CartSplitV2MappersKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.views.CartSplitHeaderView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR6\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R<\u0010'\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040%j\b\u0012\u0004\u0012\u00020\u0004`&0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#¨\u0006)"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderWidgetComponent;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2HeaderDTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderVO;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2HeaderDTOV2;J)Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2HeaderViewMapper extends WidgetViewMapper2<CartSplitV2HeaderWidgetComponent, CartSplitV2HeaderDTOV2, CartSplitV2HeaderVO> {

    @NotNull
    private final Function2<CartSplitV2HeaderDTOV2, d, List<CartSplitV2HeaderVO>> mapper = new CartSplitV2HeaderViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, k<CartSplitV2HeaderVO>> holderProducer = new CartSplitV2HeaderViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final CartSplitV2HeaderVO toVO(CartSplitV2HeaderDTOV2 cartSplitV2HeaderDTOV2, long j11) {
        return new CartSplitV2HeaderVO(j11, CartSplitV2MappersKt.toVOV2(cartSplitV2HeaderDTOV2.getHeader(), j11));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CartSplitV2HeaderDTOV2;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new CartSplitHeaderView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CartSplitV2HeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CartSplitV2HeaderDTOV2, d, List<CartSplitV2HeaderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartSplitV2HeaderWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartSplitV2HeaderWidgetComponent.INSTANCE.create(storage);
    }
}
