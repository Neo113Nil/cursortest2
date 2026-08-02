package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import A00.a;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonPreCreateVHState;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonPreCreateVHStateHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductCountUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.loader.CartButtonQuantLoaderFactory;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonErrorUpdateKey;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00020\"j\b\u0012\u0004\u0012\u00020\u0002`#2\n\u0010!\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b$\u0010%R(\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0&0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/di/CartButtonQuantWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/loader/CartButtonQuantLoaderFactory;", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonPreCreateVHStateHolder;", "doubleCartPreCreateVHStateHolder", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonPreCreateVHStateHolder;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoubleCartQuantViewMapper extends OverlayWidgetScreenViewItemMapper2<CartButtonQuantWidgetComponent, CartButtonQuantDto, DoubleCartQuantVO> implements CartButtonQuantLoaderFactory {

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ProductCountUpdateKey.class, AsyncCartButtonDeliveryUpdateKey.class, AsyncCartButtonErrorUpdateKey.class, ProductUpdateKey.class);

    private final CartButtonPreCreateVHStateHolder doubleCartPreCreateVHStateHolder() {
        return component().getDoubleCartPreCreateVHStateHolder();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        CartButtonQuantDto cartButtonQuantDto = state instanceof CartButtonQuantDto ? (CartButtonQuantDto) state : null;
        return (cartButtonQuantDto != null ? cartButtonQuantDto.getConfiguration() : null) instanceof CartButtonQuantDto.Configuration.DoubleCartData;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<DoubleCartQuantVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        CartButtonPreCreateVHState cachedState = doubleCartPreCreateVHStateHolder().getCachedState();
        Intrinsics.g(cachedState, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantPreCreateViewHolderState");
        DoubleCartQuantPreCreateViewHolderState doubleCartQuantPreCreateViewHolderState = (DoubleCartQuantPreCreateViewHolderState) cachedState;
        return new DoubleCartQuantViewHolder(container, component().getDoubleCartQuantViewBinder(), component().getFeatureChecker(), doubleCartQuantPreCreateViewHolderState.getMode(), doubleCartQuantPreCreateViewHolderState.getHasShadow());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartButtonQuantWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartButtonQuantWidgetComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public DoubleCartQuantVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DoubleCartQuantVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return DoubleCartQuantUpdateConsumer.INSTANCE.handleUpdate(update, oldItem);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<DoubleCartQuantVO> map(@NotNull CartButtonQuantDto state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        List<DoubleCartQuantVO> invoke = component().getDoubleCartMapper().invoke(state, info);
        DoubleCartQuantVO doubleCartQuantVO = (DoubleCartQuantVO) C7714v.M(invoke);
        if (doubleCartQuantVO != null) {
            doubleCartPreCreateVHStateHolder().cache(new DoubleCartQuantPreCreateViewHolderState(doubleCartQuantVO.getHasShadow(), doubleCartQuantVO.getMode()));
        }
        return invoke;
    }
}
