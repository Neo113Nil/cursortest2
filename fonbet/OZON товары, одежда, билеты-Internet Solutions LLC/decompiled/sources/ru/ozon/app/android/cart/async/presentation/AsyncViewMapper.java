package ru.ozon.app.android.cart.async.presentation;

import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.async.data.AsyncDTO;
import ru.ozon.app.android.cart.async.di.AsyncWidgetComponent;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/async/presentation/AsyncViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/cart/async/di/AsyncWidgetComponent;", "Lru/ozon/app/android/cart/async/data/AsyncDTO;", "Lru/ozon/app/android/cart/async/presentation/AsyncVI;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/cart/async/data/AsyncDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AsyncViewMapper extends OverlayWidgetScreenViewItemMapper2<AsyncWidgetComponent, AsyncDTO, AsyncVI> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AsyncVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new AsyncViewHolder(component().getAsyncCartViewModelProvider().get(container.a0(), component().get$storage()));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AsyncWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AsyncWidgetComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AsyncVI> map(@NotNull AsyncDTO state, @NotNull d info) {
        b bVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        Boolean enabled = state.getEnabled();
        boolean booleanValue = enabled != null ? enabled.booleanValue() : false;
        Integer operationsDebounceDelay = state.getOperationsDebounceDelay();
        if (operationsDebounceDelay != null) {
            b.Companion companion = b.INSTANCE;
            bVar = b.e(c.g(operationsDebounceDelay.intValue(), EnumC10311b.MILLISECONDS));
        } else {
            bVar = null;
        }
        return C7714v.a0(new AsyncVI(hashCode, booleanValue, bVar, null));
    }
}
