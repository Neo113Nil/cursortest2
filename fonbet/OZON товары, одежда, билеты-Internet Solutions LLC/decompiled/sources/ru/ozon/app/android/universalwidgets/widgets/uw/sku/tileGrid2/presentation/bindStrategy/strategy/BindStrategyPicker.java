package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.BindStrategy;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\bR\u0012\u0010\u0006\u001a\u00028\u0000X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/BindStrategyPicker;", "T", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/BindStrategy;", "", "<init>", "()V", "bindStrategy", "getBindStrategy", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/BindStrategy;", "activeStrategy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/BindStrategy;", "getActiveStrategy", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BindStrategyPicker<T extends BindStrategy> {
    private T activeStrategy;

    @NotNull
    public final T getActiveStrategy() {
        if (this.activeStrategy == null) {
            this.activeStrategy = getBindStrategy();
        }
        T t2 = this.activeStrategy;
        if (t2 != null) {
            return t2;
        }
        Intrinsics.n("activeStrategy");
        throw null;
    }

    @NotNull
    protected abstract T getBindStrategy();
}
