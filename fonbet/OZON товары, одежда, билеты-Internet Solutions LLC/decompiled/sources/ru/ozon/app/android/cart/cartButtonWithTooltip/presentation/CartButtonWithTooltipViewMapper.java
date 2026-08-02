package ru.ozon.app.android.cart.cartButtonWithTooltip.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartButtonWithTooltip.data.CartButtonWithTooltipDTO;
import ru.ozon.app.android.cart.cartButtonWithTooltip.di.CartButtonWithTooltipWidgetComponent;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R<\u0010\u001c\u001a$\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001aj\b\u0012\u0004\u0012\u00020\u0004`\u001b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/cartButtonWithTooltip/di/CartButtonWithTooltipWidgetComponent;", "Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO;", "Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;)Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/HideCartTooltip;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipMapper;", "getMapper", "()Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipMapper;", "mapper", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartButtonWithTooltipViewMapper extends WidgetViewMapper2<CartButtonWithTooltipWidgetComponent, CartButtonWithTooltipDTO, CartButtonWithTooltipVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<CartButtonWithTooltipVO>> holderProducer = new CartButtonWithTooltipViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<HideCartTooltip>> supportedUpdates = C7714v.a0(HideCartTooltip.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CartButtonWithTooltipVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HideCartTooltip>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartButtonWithTooltipWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartButtonWithTooltipWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TextAtomV2View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        textAtomV2View.setGravity(17);
        textAtomV2View.setClickable(true);
        textAtomV2View.setFocusable(true);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setLayoutParams(layoutParams);
        return textAtomV2View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CartButtonWithTooltipMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CartButtonWithTooltipVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CartButtonWithTooltipVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof HideCartTooltip)) {
            return (CartButtonWithTooltipVO) super.handleUpdate(update, (a.J.InterfaceC0007a) oldItem);
        }
        CartTooltipVO tooltip = oldItem.getTooltip();
        if (tooltip != null) {
            tooltip.setNeedShow(false);
            Unit unit = Unit.f71690a;
        } else {
            tooltip = null;
        }
        return CartButtonWithTooltipVO.copy$default(oldItem, 0L, null, tooltip, 3, null);
    }
}
