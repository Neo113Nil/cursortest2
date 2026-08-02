package ru.ozon.app.android.search.aiMessenger.actionHandlers;

import Sc.s;
import Wc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.common.actionHandlers.R$string;
import ru.ozon.app.android.common.cellList.v2.presentation.CellV2ViewHolder;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.actionHandlers.DeleteAiConversationActionHandler;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\f*\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/actionHandlers/DeleteAiConversationActionHandlerImpl;", "Lru/ozon/app/android/storefront/actionHandlers/DeleteAiConversationActionHandler;", "<init>", "()V", "Lxe/M;", "", "", "params", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "deleteAiConversation", "(Lxe/M;Ljava/util/Map;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "deleteAllCells", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Landroidx/recyclerview/widget/RecyclerView;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteCell", "dismissDelayed", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lkotlin/coroutines/d;)Ljava/lang/Object;", "showErrorNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "getRecyclerView", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeleteAiConversationActionHandlerImpl extends DeleteAiConversationActionHandler {

    @NotNull
    private final String actionId = "deleteAiConversation";

    private final void deleteAiConversation(M m11, Map<String, String> map, ActionV2Repository actionV2Repository, CustomActionHandler.HandlerReferences handlerReferences) {
        C10727i.c(m11, null, null, new DeleteAiConversationActionHandlerImpl$deleteAiConversation$1(actionV2Repository, new ActionV2Request(map, getActionId(), false, 4, null), this, handlerReferences, map, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteAllCells(CustomActionHandler.HandlerReferences handlerReferences, RecyclerView recyclerView, d<? super Unit> dVar) {
        l viewItem;
        l20.d c11;
        String d11;
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView.C findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(i11);
            CellV2ViewHolder cellV2ViewHolder = findViewHolderForLayoutPosition instanceof CellV2ViewHolder ? (CellV2ViewHolder) findViewHolderForLayoutPosition : null;
            if (cellV2ViewHolder != null && (viewItem = cellV2ViewHolder.getViewItem()) != null && (c11 = viewItem.c()) != null && (d11 = c11.d()) != null) {
                handlerReferences.getRefs().getController().p(d11);
                Object dismissDelayed = dismissDelayed(handlerReferences, dVar);
                return dismissDelayed == a.COROUTINE_SUSPENDED ? dismissDelayed : Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteCell(CustomActionHandler.HandlerReferences handlerReferences, RecyclerView recyclerView, d<? super Unit> dVar) {
        Object dismissDelayed;
        Long voId = handlerReferences.getVoId();
        if (voId == null) {
            return Unit.f71690a;
        }
        long longValue = voId.longValue();
        Iterator<View> it = C5316f0.b(recyclerView).iterator();
        int i11 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                handlerReferences.getRefs().getController().m(longValue);
                return (i11 == 1 && (dismissDelayed = dismissDelayed(handlerReferences, dVar)) == a.COROUTINE_SUSPENDED) ? dismissDelayed : Unit.f71690a;
            }
            if ((recyclerView.getChildViewHolder((View) c5314e0.next()) instanceof CellV2ViewHolder) && (i11 = i11 + 1) < 0) {
                C7714v.N0();
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissDelayed(CustomActionHandler.HandlerReferences handlerReferences, d<? super Unit> dVar) {
        DeleteAiConversationActionHandlerImpl$dismissDelayed$1 deleteAiConversationActionHandlerImpl$dismissDelayed$1;
        int i11;
        ComposerNavigator composerNavigator;
        if (dVar instanceof DeleteAiConversationActionHandlerImpl$dismissDelayed$1) {
            deleteAiConversationActionHandlerImpl$dismissDelayed$1 = (DeleteAiConversationActionHandlerImpl$dismissDelayed$1) dVar;
            int i12 = deleteAiConversationActionHandlerImpl$dismissDelayed$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                deleteAiConversationActionHandlerImpl$dismissDelayed$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = deleteAiConversationActionHandlerImpl$dismissDelayed$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = deleteAiConversationActionHandlerImpl$dismissDelayed$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    composerNavigator = ((RetainComposerComponentApi) handlerReferences.getRefs().getComponent(RetainComposerComponentApi.class)).getComposerNavigator();
                    deleteAiConversationActionHandlerImpl$dismissDelayed$1.L$0 = composerNavigator;
                    deleteAiConversationActionHandlerImpl$dismissDelayed$1.label = 1;
                    if (Y.b(300L, deleteAiConversationActionHandlerImpl$dismissDelayed$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    composerNavigator = (ComposerNavigator) deleteAiConversationActionHandlerImpl$dismissDelayed$1.L$0;
                    s.b(obj);
                }
                composerNavigator.popBackStack();
                return Unit.f71690a;
            }
        }
        deleteAiConversationActionHandlerImpl$dismissDelayed$1 = new DeleteAiConversationActionHandlerImpl$dismissDelayed$1(this, dVar);
        Object obj2 = deleteAiConversationActionHandlerImpl$dismissDelayed$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = deleteAiConversationActionHandlerImpl$dismissDelayed$1.label;
        if (i11 != 0) {
        }
        composerNavigator.popBackStack();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView(CustomActionHandler.HandlerReferences handlerRefs) {
        View view;
        RecyclerView composerRecyclerViewOrNull;
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
        if (b11 != null && (view = b11.getView()) != null && (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) != null) {
            return composerRecyclerViewOrNull;
        }
        r a11 = handlerRefs.getRefs().getContainer().a();
        if (a11 != null) {
            return (RecyclerView) a11.findViewById(R.id.listRv);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(CustomActionHandler.HandlerReferences handlerRefs) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        NotificationDTO notificationDTO = new NotificationDTO(StringProvider.getString(R$string.collapse_widget_notification_warning_title_android), StringProvider.getString(R$string.collapse_widget_notification_warning_subtitle_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 508, null);
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notificationDTO, handlerRefs.getRefs().getContainer().e(), null, 8, null).show();
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
        if (action instanceof AtomAction.Click) {
            Map<String, String> params = ((AtomAction.Click) action).getParams();
            if (params == null) {
                params = U.c();
            }
            deleteAiConversation(K.a(handlerRefs.getRefs().getContainer().g()), params, ((ActionComponentApi) handlerRefs.getRefs().getComponent(ActionComponentApi.class)).getActionRepository(), handlerRefs);
        }
    }
}
