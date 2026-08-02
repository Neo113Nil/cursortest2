package ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile;

import Vg.d;
import WZ.l;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 =2\u00020\u0001:\u0001=B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u0017*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001a\u0010$\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010<\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/submitSelectionFormMobile/SubmitSelectionFormActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDto", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/composer/ComposerReferences;)V", "getErrorNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lkotlin/Function1;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "", "", "buildSelectionFormParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/util/Map;", "processAction", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LVg/d;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "", "notificationShown", "Z", "", "", "productIds", "Ljava/util/List;", "getProductIds", "()Ljava/util/List;", "setProductIds", "(Ljava/util/List;)V", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "setTokenizedAnalytics", "(LWZ/l;)V", "getManualAnalyticTracking", "()Z", "manualAnalyticTracking", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubmitSelectionFormActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private boolean notificationShown;

    @NotNull
    private List<Long> productIds;
    private l tokenizedAnalytics;

    public SubmitSelectionFormActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.actionV2Repository = actionV2Repository;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionId = "submitSelectionFormMobile";
        this.productIds = K.f71697a;
    }

    private final Map<String, Object> buildSelectionFormParams(AtomAction.ComposerAction action) {
        Tc.d builder = new Tc.d();
        Map<String, String> params = action.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        List<Long> list = this.productIds;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        builder.put("productIds", arrayList);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    private final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerReferences) {
        return new ActionHandler.Builder(handlerReferences.getRefs(), handlerReferences.getNestedPagesProvider(), new SubmitSelectionFormActionHandler$createActionHandler$1(handlerReferences), new SubmitSelectionFormActionHandler$createActionHandler$2(handlerReferences)).onPreProcess(new SubmitSelectionFormActionHandler$createActionHandler$3(handlerReferences)).customActionHandlers(new SubmitSelectionFormActionHandler$createActionHandler$4(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getErrorNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), StringProvider.getString(ru.ozon.app.android.pdp.domain.actionHandlers.R$string.reviews_try_again_later_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences) {
        r a11;
        G supportFragmentManager;
        if ((atomAction instanceof AtomAction.Click) && Intrinsics.d(((AtomAction.Click) atomAction).getId(), "doubleDismissAndRefresh") && (a11 = handlerReferences.getRefs().getContainer().a()) != null && (supportFragmentManager = a11.getSupportFragmentManager()) != null) {
            supportFragmentManager.m1(androidx.core.os.d.a(), "submitSelectionFormMobile");
        }
        createActionHandler(handlerReferences).invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notificationDto, ComposerReferences refs) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        final NotificationBar make$default = NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notificationDto, a11, null, 8, null);
        make$default.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler$showNotification$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
                notificationBar.removeCallback(this);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                SubmitSelectionFormActionHandler.this.notificationShown = true;
            }
        });
        make$default.show();
        G d11 = refs.getContainer().d();
        if (d11 != null) {
            d11.Y0(new G.m() { // from class: ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler$showNotification$2
                @Override // androidx.fragment.app.G.m
                public void onFragmentPaused(G fm, ComponentCallbacksC5392m fragment) {
                    boolean z11;
                    Intrinsics.checkNotNullParameter(fm, "fm");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    z11 = SubmitSelectionFormActionHandler.this.notificationShown;
                    if (z11) {
                        make$default.dismiss();
                        fm.t1(this);
                    }
                }
            }, false);
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public boolean getManualAnalyticTracking() {
        return this.tokenizedAnalytics != null;
    }

    @NotNull
    public final List<Long> getProductIds() {
        return this.productIds;
    }

    public final l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new SubmitSelectionFormActionHandler$processAction$1(handlerRefs.getRefs().getController(), this, new ActionV2Request(buildSelectionFormParams(composerAction), composerAction.getActionName(), false, 4, null), action, handlerRefs, null), 3);
        }
    }

    public final void setProductIds(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.productIds = list;
    }

    public final void setTokenizedAnalytics(l lVar) {
        this.tokenizedAnalytics = lVar;
    }
}
