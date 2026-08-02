package ru.ozon.app.android.travel.feature.general.common.actions;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.travel.actionhandler.SupportedResultActionHandlers;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.PushRouteAndRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.actionhandler.forceRefresh.TravelForceRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.modalParentRefresh.ModalParentRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.popAndRefresh.PopAndRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelDownloadFile.TravelDownloadFileActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionHandler;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/actions/SupportedResultActionHandlersImpl;", "Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;", "<init>", "()V", "handlers", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "getHandlers", "()Ljava/util/Set;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SupportedResultActionHandlersImpl implements SupportedResultActionHandlers {
    @Override // ru.ozon.app.android.travel.actionhandler.SupportedResultActionHandlers
    @NotNull
    public Set<Class<? extends CustomActionHandler>> getHandlers() {
        Class[] elements = {TravelForceRefreshActionHandler.class, TravelForceRedirectActionHandler.class, PopAndRefreshActionHandler.class, TravelResultActionHandler.class, ModalParentRefreshActionHandler.class, ShareLinkActionHandler.class, PushRouteAndRefreshActionHandler.class, TravelDownloadFileActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
