package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons;

import W10.c;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepository;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/FetchCancelReasonsActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepository;", "cancelReasonsRepository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "<init>", "(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "link", "", "body", "LW10/c;", "trackingData", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "fetchCancelReasons", "(Ljava/lang/String;Ljava/util/Map;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/composer/ComposerNavigator;", "cancelReasons", "", "openCancelReasons", "(Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;LW10/c;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FetchCancelReasonsActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final CancelReasonsRepository cancelReasonsRepository;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    public FetchCancelReasonsActionHandler(@NotNull CancelReasonsRepository cancelReasonsRepository, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(cancelReasonsRepository, "cancelReasonsRepository");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        this.cancelReasonsRepository = cancelReasonsRepository;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.actionId = "fetchCancelReasons";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchCancelReasons(String str, Map<String, String> map, c cVar, d<? super CancelReasonsWithPayloads> dVar) {
        return C10727i.f(this.coroutineDispatcherProvider.getIO(), new FetchCancelReasonsActionHandler$fetchCancelReasons$2(this, str, map, cVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCancelReasons(ComposerNavigator composerNavigator, CancelReasonsWithPayloads cancelReasonsWithPayloads, c cVar) {
        String uri = LinkGenerator.INSTANCE.cancelReasons().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        composerNavigator.openDeeplink(uri, U.j(new Pair("cancelReasons", cancelReasonsWithPayloads), new Pair("trackingData", cVar)));
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new FetchCancelReasonsActionHandler$processAction$1(handlerRefs, this, action, null), 3);
        }
    }
}
