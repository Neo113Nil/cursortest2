package ru.ozon.app.android.travel.actionhandler.travelResultAction;

import Bc.i;
import Bc.k;
import Bc.r;
import Fy.C3065c;
import Mc.a;
import Vg.c;
import Vg.d;
import a00.C4908c;
import a00.C4911f;
import android.view.ViewGroup;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.travel.actionhandler.SupportedResultActionHandlers;
import ru.ozon.app.android.travel.actionhandler.utils.LifecycleDisposable;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionWithErrorResponse;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0014\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00060!j\u0002`\"H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelResultActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "api", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;", "supportedResultActionHandlers", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;LVg/d;Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "", "message", "", "showError", "(La00/f;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lio/reactivex/y;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;", "getRequestSource", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Lio/reactivex/y;", "atomAction", "handleAtomAction", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/af/AtomAction;)V", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "getCustomActionHandlers", "()LVg/c;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "getApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/travel/actionhandler/SupportedResultActionHandlers;", "Lnc/b;", "disposable", "Lnc/b;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class TravelResultActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final TravelCommonActionResultApi api;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final SupportedResultActionHandlers supportedResultActionHandlers;

    public TravelResultActionHandler(@NotNull TravelCommonActionResultApi api, @NotNull d customActionHandlersStoreFactory, @NotNull SupportedResultActionHandlers supportedResultActionHandlers) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(supportedResultActionHandlers, "supportedResultActionHandlers");
        this.api = api;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.supportedResultActionHandlers = supportedResultActionHandlers;
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
        this.actionId = "travelResultAction";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TravelResultActionResponseVO processAction$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (TravelResultActionResponseVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(C4911f container, String message) {
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, message, null, null, null, container.g(), 58, null).show();
        }
    }

    static /* synthetic */ void showError$default(TravelResultActionHandler travelResultActionHandler, C4911f c4911f, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        travelResultActionHandler.showError(c4911f, str);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @NotNull
    protected final TravelCommonActionResultApi getApi() {
        return this.api;
    }

    @NotNull
    protected c getCustomActionHandlers() {
        return this.customActionHandlersStoreFactory.create(this.supportedResultActionHandlers.getHandlers());
    }

    @NotNull
    protected final d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersStoreFactory;
    }

    @NotNull
    protected y<TravelCommonActionWithErrorResponse> getRequestSource(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        TravelCommonActionResultApi travelCommonActionResultApi = this.api;
        String actionName = action.getActionName();
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        return travelCommonActionResultApi.performActionWithError(actionName, params);
    }

    protected void handleAtomAction(@NotNull CustomActionHandler.HandlerReferences handlerRefs, @NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), TravelResultActionHandler$handleAtomAction$1$1.INSTANCE, new TravelResultActionHandler$handleAtomAction$1$2(handlerRefs)).customActionHandlers(new TravelResultActionHandler$handleAtomAction$1$3(this)).buildHandler().invoke(atomAction);
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            this.disposable.dispose();
            C4911f container = handlerRefs.getRefs().getContainer();
            C4908c g10 = container.g();
            final InterfaceC7851b controller = handlerRefs.getRefs().getController();
            LifecycleDisposable lifecycleDisposable = new LifecycleDisposable(g10, new k(new i(new r(getRequestSource((AtomAction.ComposerAction) action).j(a.b()), new GH.a(TravelResultActionHandler$processAction$1.INSTANCE, 8)).g(C8125a.a()), new DM.i(new TravelResultActionHandler$processAction$2(controller), 10)), new InterfaceC9019a() { // from class: dM.a
                @Override // qc.InterfaceC9019a
                public final void run() {
                    InterfaceC7851b.this.hideLoader();
                }
            }).h(new C3065c(new TravelResultActionHandler$processAction$4(this, container, handlerRefs), 9), new Gy.a(new TravelResultActionHandler$processAction$5(this, container), 5)));
            g10.getLifecycle().a(lifecycleDisposable);
            this.disposable = lifecycleDisposable;
        }
    }
}
