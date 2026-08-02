package ru.ozon.app.android.fresh.cart.domain.actionHandlers;

import Lm0.a;
import Sc.r;
import Sc.s;
import Tg.b;
import Vg.f;
import a00.C4911f;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import i10.l;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshRemoveCartItemsOnModalActionHandler;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.H0;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 62\u00020\u0001:\u00016B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0018\u001a\u00020\u00132\n\u0010\"\u001a\u00060 j\u0002`!H\u0002¢\u0006\u0004\b\u0018\u0010#J\u000f\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00130)2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020,2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010.R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u001a\u00102\u001a\u0002018\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/cart/domain/actionHandlers/FreshRemoveCartItemsOnModalActionHandler;", "LVg/f;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "buildHandlerRefs", "(LVg/f$a;Lk20/g;)Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "handlerRefs", "", "callActionAndHandleResult", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "error", "showError", "(Ljava/lang/Throwable;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/atoms/af/AtomAction;", "dataAction", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/af/AtomAction;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "(La00/f;)V", "commonNetworkErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "isNetworkRelatedError", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "LTg/b;", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshRemoveCartItemsOnModalActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public FreshRemoveCartItemsOnModalActionHandler(@NotNull JsonParser jsonDeserializer, @NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.jsonDeserializer = jsonDeserializer;
        this.actionV2Repository = actionV2Repository;
        this.actionId = "freshRemoveCartItemsOnModal";
    }

    private final CustomActionHandler.HandlerReferences buildHandlerRefs(f.a widgetInfo, C7475g widgetComponentStorage) {
        return new CustomActionHandler.HandlerReferences(((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(new C4911f(widgetInfo.a().e()), widgetInfo.b()), new FreshRemoveCartItemsOnModalActionHandler$buildHandlerRefs$1(widgetInfo), widgetInfo.c(), widgetInfo.c().n());
    }

    private final void callActionAndHandleResult(AtomAction.Click action, CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params;
        String str;
        Object a11;
        String id2 = action.getId();
        if (id2 == null || (params = action.getParams()) == null || (str = params.get("postBody")) == null) {
            return;
        }
        Map c11 = U.c();
        try {
            r.Companion companion = r.INSTANCE;
            a11 = (Map) this.jsonDeserializer.fromJson(str, Map.class);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (!(a11 instanceof r.b)) {
            c11 = (Map) a11;
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            showError(b11, handlerRefs);
            return;
        }
        ActionV2Request actionV2Request = new ActionV2Request(c11, id2, false, 4, null);
        InterfaceC7851b controller = handlerRefs.getRefs().getController();
        controller.e(new l.a.C1079a(0L, null, 3));
        ((H0) C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$4(this, actionV2Request, handlerRefs, null), 3)).y(new FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$5(controller));
    }

    private final NotificationDTO commonNetworkErrorNotification() {
        return new NotificationDTO(StringProvider.getString(R$string.common_universal_network_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerRefs) {
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new FreshRemoveCartItemsOnModalActionHandler$createActionHandler$1(handlerRefs), new FreshRemoveCartItemsOnModalActionHandler$createActionHandler$2(handlerRefs)).buildHandler();
    }

    private final boolean isNetworkRelatedError(Throwable th2) {
        return (th2 instanceof UnknownHostException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SocketException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processWidgetAction$lambda$1$lambda$0(FreshRemoveCartItemsOnModalActionHandler freshRemoveCartItemsOnModalActionHandler, b bVar, CustomActionHandler.HandlerReferences handlerReferences, DialogInterface dialogInterface, int i11) {
        freshRemoveCartItemsOnModalActionHandler.callActionAndHandleResult((AtomAction.Click) bVar, handlerReferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(Throwable error, CustomActionHandler.HandlerReferences handlerRefs) {
        if (isNetworkRelatedError(error)) {
            showNotification$default(this, commonNetworkErrorNotification(), handlerRefs, null, 4, null);
        } else {
            showError(handlerRefs.getRefs().getContainer());
        }
        a.f17149a.e(error);
    }

    private final void showNotification(NotificationDTO notification, CustomActionHandler.HandlerReferences handlerRefs, AtomAction dataAction) {
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        C4911f container = handlerRefs.getRefs().getContainer();
        if ((dataAction instanceof AtomAction.DismissAndScroll) || (dataAction instanceof AtomAction.DismissRedirect) || (dataAction instanceof AtomAction.DismissRefresh) || (dataAction instanceof AtomAction.Dismiss)) {
            rootView = ContextExtKt.getRootView(container.a());
        } else {
            ComponentCallbacksC5392m c11 = container.c();
            rootView = c11 != null ? c11.getView() : null;
        }
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, container.i(), createActionHandler(handlerRefs)).show();
    }

    static /* synthetic */ void showNotification$default(FreshRemoveCartItemsOnModalActionHandler freshRemoveCartItemsOnModalActionHandler, NotificationDTO notificationDTO, CustomActionHandler.HandlerReferences handlerReferences, AtomAction atomAction, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            atomAction = null;
        }
        freshRemoveCartItemsOnModalActionHandler.showNotification(notificationDTO, handlerReferences, atomAction);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.Click) {
            final CustomActionHandler.HandlerReferences buildHandlerRefs = buildHandlerRefs(widgetInfo, widgetComponentStorage);
            androidx.fragment.app.r a11 = widgetInfo.a().a();
            if (a11 != null) {
                AtomAction.Click click = (AtomAction.Click) action;
                Map<String, String> params = click.getParams();
                if (params == null || (string = params.get("warningMessage")) == null) {
                    string = StringProvider.getString(ru.ozon.app.android.fresh.cart.R$string.delete_product_confirmation);
                }
                Map<String, String> params2 = click.getParams();
                if (params2 == null || (string2 = params2.get("actionTitle")) == null) {
                    string2 = StringProvider.getString(ru.ozon.app.android.fresh.cart.R$string.delete);
                }
                String string3 = StringProvider.getString(ru.ozon.app.android.fresh.cart.R$string.cancel);
                f.a aVar = new f.a(a11);
                aVar.f(string);
                final AtomAction.Click click2 = (AtomAction.Click) action;
                aVar.m(string2, new DialogInterface.OnClickListener() { // from class: Ct.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        FreshRemoveCartItemsOnModalActionHandler.processWidgetAction$lambda$1$lambda$0(FreshRemoveCartItemsOnModalActionHandler.this, click2, buildHandlerRefs, dialogInterface, i11);
                    }
                });
                aVar.h(string3, null);
                aVar.q();
            }
        }
    }

    private final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }
}
