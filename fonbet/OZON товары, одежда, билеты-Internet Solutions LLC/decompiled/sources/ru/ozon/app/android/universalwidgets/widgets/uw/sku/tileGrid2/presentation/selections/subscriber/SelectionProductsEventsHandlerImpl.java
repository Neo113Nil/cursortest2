package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber;

import Ae.C2399j;
import Ae.C2408n0;
import De.s;
import Sc.o;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent$Result$ActionResult;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.SelectionProductsOverlayVisibilityAware;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001/BO\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandlerImpl;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "selectionProductsEventManager", "Ljava/util/HashMap;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "Lkotlin/collections/HashMap;", "selectionProductsEventsMap", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "tileOverlayBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "roundMode", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/SelectionProductsOverlayVisibilityAware;", "selectionProductsOverlayVisibilityAware", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;Ljava/util/HashMap;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/SelectionProductsOverlayVisibilityAware;)V", "event", "", "onEvent", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;)V", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "showOverlay", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;)V", "hideOverlay", "()V", "", "tileId", "updateSelectionProductsData", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;)V", "key", "", "isRemovedFromSelectionProducts", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;)Z", "subscribeToSelectionProductsEvents", "reset", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "Ljava/util/HashMap;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/SelectionProductsOverlayVisibilityAware;", "Ljava/lang/String;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "Lxe/M;", "scope", "Lxe/M;", "Creator", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionProductsEventsHandlerImpl implements SelectionProductsEventsHandler {
    private TileGrid2DTO.OverlayItem overlayItem;

    @NotNull
    private final RoundMode roundMode;

    @NotNull
    private final M scope;

    @NotNull
    private final SelectionProductsEventManager selectionProductsEventManager;

    @NotNull
    private final HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap;
    private final SelectionProductsOverlayVisibilityAware selectionProductsOverlayVisibilityAware;
    private String tileId;

    @NotNull
    private final TileOverlayBinder tileOverlayBinder;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandlerImpl$Creator;", "", "selectionProductsEventManager", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "selectionProductsEventsMap", "Ljava/util/HashMap;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "Lkotlin/collections/HashMap;", "overlayBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;Ljava/util/HashMap;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;)V", "createForButtons", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "createForRoot", "viewBinding", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Creator {

        @NotNull
        private final TileOverlayBinder overlayBinder;

        @NotNull
        private final SelectionProductsEventManager selectionProductsEventManager;

        @NotNull
        private final HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap;

        public Creator(@NotNull SelectionProductsEventManager selectionProductsEventManager, @NotNull HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap, @NotNull TileOverlayBinder overlayBinder) {
            Intrinsics.checkNotNullParameter(selectionProductsEventManager, "selectionProductsEventManager");
            Intrinsics.checkNotNullParameter(selectionProductsEventsMap, "selectionProductsEventsMap");
            Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
            this.selectionProductsEventManager = selectionProductsEventManager;
            this.selectionProductsEventsMap = selectionProductsEventsMap;
            this.overlayBinder = overlayBinder;
        }

        @NotNull
        public final SelectionProductsEventsHandler createForButtons() {
            return new SelectionProductsEventsHandlerImpl(this.selectionProductsEventManager, this.selectionProductsEventsMap, this.overlayBinder, RoundMode.BOTTOM, null, null);
        }

        public final SelectionProductsEventsHandler createForRoot(@NotNull TileGrid2BaseViewBinding viewBinding) {
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            if (!(viewBinding instanceof TileGrid2BaseViewBinding.TileGrid2DefaultViewBinding)) {
                return null;
            }
            return new SelectionProductsEventsHandlerImpl(this.selectionProductsEventManager, this.selectionProductsEventsMap, this.overlayBinder, RoundMode.TOP, ((TileGrid2BaseViewBinding.TileGrid2DefaultViewBinding) viewBinding).getTopRightButtonsDelegate(), null);
        }
    }

    public /* synthetic */ SelectionProductsEventsHandlerImpl(SelectionProductsEventManager selectionProductsEventManager, HashMap hashMap, TileOverlayBinder tileOverlayBinder, RoundMode roundMode, SelectionProductsOverlayVisibilityAware selectionProductsOverlayVisibilityAware, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectionProductsEventManager, hashMap, tileOverlayBinder, roundMode, selectionProductsOverlayVisibilityAware);
    }

    private final void hideOverlay() {
        TileOverlayBinder.bind$default(this.tileOverlayBinder, false, null, this.roundMode, null, null, 24, null);
        SelectionProductsOverlayVisibilityAware selectionProductsOverlayVisibilityAware = this.selectionProductsOverlayVisibilityAware;
        if (selectionProductsOverlayVisibilityAware != null) {
            selectionProductsOverlayVisibilityAware.onSelectionProductsOverlayVisibilityChanged(false);
        }
    }

    private final void onEvent(SelectionProductEvent event) {
        String valueOf = String.valueOf(event.getSku());
        this.selectionProductsEventsMap.put(new SelectionProductsTileKey(valueOf, event.getSelectionUuid()), event);
        if (Intrinsics.d(this.tileId, valueOf)) {
            if (event instanceof SelectionProductEvent.ProductRemovalStarted) {
                showOverlay(this.overlayItem);
            } else {
                if (!(event instanceof SelectionProductEvent.ProductRemoved)) {
                    throw new o();
                }
                if (((SelectionProductEvent.ProductRemoved) event).getResult() == SelectionProductEvent$Result$ActionResult.SUCCEED) {
                    showOverlay(this.overlayItem);
                } else {
                    hideOverlay();
                }
            }
        }
    }

    private final void showOverlay(TileGrid2DTO.OverlayItem overlayItem) {
        TileOverlayBinder.bind$default(this.tileOverlayBinder, true, overlayItem, this.roundMode, null, null, 24, null);
        SelectionProductsOverlayVisibilityAware selectionProductsOverlayVisibilityAware = this.selectionProductsOverlayVisibilityAware;
        if (selectionProductsOverlayVisibilityAware != null) {
            selectionProductsOverlayVisibilityAware.onSelectionProductsOverlayVisibilityChanged(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeToSelectionProductsEvents$onEvent(SelectionProductsEventsHandlerImpl selectionProductsEventsHandlerImpl, SelectionProductEvent selectionProductEvent, d dVar) {
        selectionProductsEventsHandlerImpl.onEvent(selectionProductEvent);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler
    public boolean isRemovedFromSelectionProducts(@NotNull SelectionProductsTileKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SelectionProductEvent selectionProductEvent = this.selectionProductsEventsMap.get(key);
        if (selectionProductEvent instanceof SelectionProductEvent.ProductRemovalStarted) {
            return true;
        }
        return (selectionProductEvent instanceof SelectionProductEvent.ProductRemoved) && ((SelectionProductEvent.ProductRemoved) selectionProductEvent).getResult() == SelectionProductEvent$Result$ActionResult.SUCCEED;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler
    public void reset() {
        E0.d(this.scope.getCoroutineContext());
        this.tileId = null;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler
    public void subscribeToSelectionProductsEvents() {
        C2399j.C(new C2408n0(this.selectionProductsEventManager.getSelectionProductEvents(), new SelectionProductsEventsHandlerImpl$subscribeToSelectionProductsEvents$1(this)), this.scope);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler
    public void updateSelectionProductsData(@NotNull String tileId, TileGrid2DTO.OverlayItem overlayItem) {
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        this.tileId = tileId;
        this.overlayItem = overlayItem;
    }

    private SelectionProductsEventsHandlerImpl(SelectionProductsEventManager selectionProductsEventManager, HashMap<SelectionProductsTileKey, SelectionProductEvent> hashMap, TileOverlayBinder tileOverlayBinder, RoundMode roundMode, SelectionProductsOverlayVisibilityAware selectionProductsOverlayVisibilityAware) {
        this.selectionProductsEventManager = selectionProductsEventManager;
        this.selectionProductsEventsMap = hashMap;
        this.tileOverlayBinder = tileOverlayBinder;
        this.roundMode = roundMode;
        this.selectionProductsOverlayVisibilityAware = selectionProductsOverlayVisibilityAware;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11).plus(new SelectionProductsEventsHandlerImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }
}
