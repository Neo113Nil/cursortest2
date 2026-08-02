package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile;

import Tc.d;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/UpdateProductsSelectionFormActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "", "", "buildUpdateProductsParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/util/Map;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "showErrorNotification", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getErrorNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDto", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/composer/ComposerReferences;)V", "processAction", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "", "", "productIds", "Ljava/util/List;", "getProductIds", "()Ljava/util/List;", "setProductIds", "(Ljava/util/List;)V", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateProductsSelectionFormActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private List<Long> productIds;

    public UpdateProductsSelectionFormActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "productsUpdateAction";
        this.productIds = K.f71697a;
    }

    private final Map<String, Object> buildUpdateProductsParams(AtomAction.ComposerAction action) {
        d builder = new d();
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

    private final NotificationDTO getErrorNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), StringProvider.getString(ru.ozon.app.android.pdp.domain.actionHandlers.R$string.reviews_try_again_later_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences) {
        new ActionHandler.Builder(handlerReferences.getRefs(), handlerReferences.getNestedPagesProvider(), new UpdateProductsSelectionFormActionHandler$handleAction$1(handlerReferences), new UpdateProductsSelectionFormActionHandler$handleAction$2(handlerReferences)).buildHandler().invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(ComposerReferences refs) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, getErrorNotificationDTO(), a11, null, 8, null).show();
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
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notificationDto, a11, null, 8, null).show();
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
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new UpdateProductsSelectionFormActionHandler$processAction$1(handlerRefs.getRefs().getController(), this, new ActionV2Request(buildUpdateProductsParams(composerAction), composerAction.getActionName(), false, 4, null), handlerRefs, null), 3);
        }
    }

    public final void setProductIds(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.productIds = list;
    }
}
