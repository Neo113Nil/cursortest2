package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import Vg.d;
import W10.c;
import d20.AbstractC6064a;
import d20.AbstractC6065b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\f\u0010\u000fJW\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00102\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00102\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010¢\u0006\u0004\b\f\u0010\u0018R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(LVg/d;)V", "Ll10/i;", "container", "Ld20/a;", "overlayWidgetViewHolder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "builder", "(Ll10/i;Ld20/a;)Lru/ozon/app/android/action/ActionHandler$Builder;", "Ld20/b;", "(Ll10/i;Ld20/b;)Lru/ozon/app/android/action/ActionHandler$Builder;", "Lkotlin/Function0;", "", "", "nestedPageProvider", "LW10/c;", "trackingDataProvider", "Lru/ozon/composer/ui/widget/l;", "widgetViewItemProvider", "(Ll10/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/action/ActionHandler$Builder;", "LVg/d;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonActionHandlerFactory {

    @NotNull
    private final d customActionHandlersStoreFactory;

    public CartButtonActionHandlerFactory(@NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionHandler.Builder builder$default(CartButtonActionHandlerFactory cartButtonActionHandlerFactory, i iVar, Function0 function0, Function0 function02, Function0 function03, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = CartButtonActionHandlerFactory$builder$6.INSTANCE;
        }
        if ((i11 & 4) != 0) {
            function02 = CartButtonActionHandlerFactory$builder$7.INSTANCE;
        }
        if ((i11 & 8) != 0) {
            function03 = CartButtonActionHandlerFactory$builder$8.INSTANCE;
        }
        return cartButtonActionHandlerFactory.builder(iVar, function0, function02, function03);
    }

    @NotNull
    public final ActionHandler.Builder builder(@NotNull i container, @NotNull AbstractC6064a<?> overlayWidgetViewHolder) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        return new ActionHandler.Builder(container, overlayWidgetViewHolder).customActionHandlers(new CartButtonActionHandlerFactory$builder$1(this));
    }

    @NotNull
    public final ActionHandler.Builder builder(@NotNull i container, @NotNull AbstractC6065b<?> overlayWidgetViewHolder) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        return new ActionHandler.Builder(container, new CartButtonActionHandlerFactory$builder$2(overlayWidgetViewHolder), new CartButtonActionHandlerFactory$builder$3(overlayWidgetViewHolder), new CartButtonActionHandlerFactory$builder$4(overlayWidgetViewHolder)).customActionHandlers(new CartButtonActionHandlerFactory$builder$5(this));
    }

    @NotNull
    public final ActionHandler.Builder builder(@NotNull i container, @NotNull Function0<? extends Map<String, String>> nestedPageProvider, @NotNull Function0<c> trackingDataProvider, @NotNull Function0<l> widgetViewItemProvider) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(nestedPageProvider, "nestedPageProvider");
        Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
        Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
        return new ActionHandler.Builder(container, nestedPageProvider, trackingDataProvider, widgetViewItemProvider).customActionHandlers(new CartButtonActionHandlerFactory$builder$9(this));
    }
}
