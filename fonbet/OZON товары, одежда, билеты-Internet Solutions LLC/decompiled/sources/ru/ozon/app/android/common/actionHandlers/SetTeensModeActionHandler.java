package ru.ozon.app.android.common.actionHandlers;

import Tg.b;
import Vg.f;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.K;
import i10.h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeInfo;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u001a\u0010'\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/SetTeensModeActionHandler;", "LVg/f;", "Lru/ozon/app/android/push/OzonPushManager;", "ozonPushManager", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/push/OzonPushManager;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Landroidx/fragment/app/m;", "currentFragment", "", "findNonModalFragmentsCurrentUrl", "(Landroidx/fragment/app/m;)Ljava/lang/String;", "redirectLink", "", "actionParams", "Lk20/g;", "componentStorage", "", "setTeensModeCookie", "(Ljava/lang/String;Ljava/util/Map;Lk20/g;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showErrorNotification", "(La00/f;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(La00/f;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/push/OzonPushManager;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetTeensModeActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final OzonPushManager ozonPushManager;

    public SetTeensModeActionHandler(@NotNull OzonPushManager ozonPushManager, @NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(ozonPushManager, "ozonPushManager");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.ozonPushManager = ozonPushManager;
        this.actionV2Repository = actionV2Repository;
        this.actionId = "setTeensMode";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    private final String findNonModalFragmentsCurrentUrl(ComponentCallbacksC5392m currentFragment) {
        ComposerScreenConfig config;
        G parentFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        ComponentCallbacksC5392m componentCallbacksC5392m;
        if ((currentFragment != null ? currentFragment.getParentFragment() : null) instanceof BottomSheetComposerFragment) {
            ComponentCallbacksC5392m parentFragment = currentFragment.getParentFragment();
            if (parentFragment == null || (parentFragmentManager = parentFragment.getParentFragmentManager()) == null || (r02 = parentFragmentManager.r0()) == null) {
                currentFragment = null;
            } else {
                Iterator it = r02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        componentCallbacksC5392m = 0;
                        break;
                    }
                    componentCallbacksC5392m = it.next();
                    if (((ComponentCallbacksC5392m) componentCallbacksC5392m).isVisible()) {
                        break;
                    }
                }
                currentFragment = componentCallbacksC5392m;
            }
        }
        ComposerFragment composerFragment = currentFragment instanceof ComposerFragment ? (ComposerFragment) currentFragment : null;
        h.c pageRef = (composerFragment == null || (config = composerFragment.getConfig()) == null) ? null : config.getPageRef();
        h.c.a aVar = pageRef instanceof h.c.a ? (h.c.a) pageRef : null;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTeensModeCookie(String redirectLink, Map<String, String> actionParams, C7475g componentStorage) {
        String str = actionParams.get("teensMode");
        if (str == null) {
            return;
        }
        boolean equals = str.equals("on");
        if (redirectLink == null) {
            redirectLink = "ozon://home";
        }
        ((StorefrontCommonComponentApi) componentStorage.getComponent(StorefrontCommonComponentApi.class)).getTeensModeService().setTeensModeCookieChanged(new TeensModeInfo(equals, redirectLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(C4911f container) {
        showNotification(container, new NotificationDTO(StringProvider.getString(R$string.common_something_went_wrong_android), StringProvider.getString(R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 508, null));
    }

    private final void showNotification(C4911f container, NotificationDTO notification) {
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = c11.getView()) == null) {
            rootView = ContextExtKt.getRootView(container.a());
        }
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, container.i(), null, 8, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.Click) {
            String findNonModalFragmentsCurrentUrl = findNonModalFragmentsCurrentUrl(widgetInfo.a().c());
            String removeSchema = findNonModalFragmentsCurrentUrl != null ? UriExtKt.removeSchema(findNonModalFragmentsCurrentUrl) : null;
            String actionId = getActionId();
            Map<String, String> params = ((AtomAction.Click) action).getParams();
            C10727i.c(K.a(widgetInfo.a().g()), null, null, new SetTeensModeActionHandler$processWidgetAction$1(this, new ActionV2Request(params != null ? U.n(params, new Pair("currentPage", removeSchema)) : null, actionId, false, 4, null), widgetInfo, action, widgetComponentStorage, null), 3);
        }
    }
}
