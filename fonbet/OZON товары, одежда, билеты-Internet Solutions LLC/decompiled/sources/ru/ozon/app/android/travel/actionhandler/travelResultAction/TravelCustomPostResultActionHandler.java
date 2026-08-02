package ru.ozon.app.android.travel.actionhandler.travelResultAction;

import Vg.c;
import Vg.d;
import android.net.Uri;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.actionhandler.SupportedResultActionHandlers;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.actionhandler.popAndRefresh.PopAndRefreshActionHandler;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionWithErrorResponse;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelCustomPostResultActionHandler;", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelResultActionHandler;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "api", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;", "supportedResultActionHandlers", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;LVg/d;Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;)V", "", "action", "buildUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lio/reactivex/y;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;", "getRequestSource", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Lio/reactivex/y;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "getCustomActionHandlers", "()LVg/c;", "Companion", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelCustomPostResultActionHandler extends TravelResultActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelCustomPostResultActionHandler$Companion;", "", "<init>", "()V", "COMPOSER_ACTION_API", "", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCustomPostResultActionHandler(@NotNull TravelCommonActionResultApi api, @NotNull d customActionHandlersStoreFactory, @NotNull SupportedResultActionHandlers supportedResultActionHandlers) {
        super(api, customActionHandlersStoreFactory, supportedResultActionHandlers);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(supportedResultActionHandlers, "supportedResultActionHandlers");
    }

    private final String buildUrl(String action) {
        String uri = Uri.parse("composer-api.bx/_action/").buildUpon().appendEncodedPath(action).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @Override // ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionHandler
    @NotNull
    protected c getCustomActionHandlers() {
        return getCustomActionHandlersStoreFactory().create(TravelForceRedirectActionHandler.class, PopAndRefreshActionHandler.class, TravelCustomPostResultActionHandler.class);
    }

    @Override // ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionHandler
    @NotNull
    protected y<TravelCommonActionWithErrorResponse> getRequestSource(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String buildUrl = buildUrl(action.getActionName());
        TravelCommonActionResultApi api = getApi();
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        return api.performCustomPostRequest(buildUrl, params);
    }
}
