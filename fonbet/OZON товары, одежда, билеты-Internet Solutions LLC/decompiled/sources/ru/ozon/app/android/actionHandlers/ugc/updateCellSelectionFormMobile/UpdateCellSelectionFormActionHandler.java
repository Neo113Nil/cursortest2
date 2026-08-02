package ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile;

import De.s;
import Tc.d;
import Wc.a;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\u00020\n2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010 \u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020$2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010*\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/UpdateCellSelectionFormActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "voId", "", "unSelectOtherToggles", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/Long;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "", "", "buildUpdateCellParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/util/Map;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "handleError", "(Ll10/b;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;La00/f;)V", "commonErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateCellSelectionFormActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public UpdateCellSelectionFormActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "reviewFormCellUpdate";
    }

    private final Map<String, Object> buildUpdateCellParams(AtomAction.ComposerAction action) {
        d builder = new d();
        Map<String, String> params = action.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO commonErrorNotification() {
        return new NotificationDTO(StringProvider.getString(R$string.common_universal_network_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleError(InterfaceC7851b interfaceC7851b, ComposerReferences composerReferences, kotlin.coroutines.d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new UpdateCellSelectionFormActionHandler$handleError$2(composerReferences, interfaceC7851b, this, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification, C4911f container) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, container.e(), null, 8, null).show();
    }

    private final void unSelectOtherToggles(RecyclerView recyclerView, Long voId) {
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder instanceof k) {
                l viewItem = ((k) childViewHolder).getViewItem();
                ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                View childAt2 = viewGroup != null ? viewGroup.getChildAt(0) : null;
                CellView cellView = childAt2 instanceof CellView ? (CellView) childAt2 : null;
                if (cellView != null) {
                    RadioButtonView radioButtonView = cellView.getLeftBlock().getRadioButtonView();
                    if (radioButtonView == null) {
                        radioButtonView = null;
                    }
                    if (radioButtonView != null) {
                        if (!Intrinsics.d(viewItem != null ? Long.valueOf(viewItem.f()) : null, voId)) {
                            radioButtonView.setChecked(false);
                        }
                    }
                }
            }
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        View view;
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            ComposerReferences refs = handlerRefs.getRefs();
            InterfaceC7851b controller = refs.getController();
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            ActionV2Request actionV2Request = new ActionV2Request(buildUpdateCellParams(composerAction), composerAction.getActionName(), false, 4, null);
            ComponentCallbacksC5392m c11 = refs.getContainer().c();
            if (c11 == null || (view = c11.getView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) {
                return;
            }
            unSelectOtherToggles(composerRecyclerViewOrNull, handlerRefs.getVoId());
            C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new UpdateCellSelectionFormActionHandler$processAction$1(controller, this, actionV2Request, refs, handlerRefs, null), 3);
        }
    }
}
