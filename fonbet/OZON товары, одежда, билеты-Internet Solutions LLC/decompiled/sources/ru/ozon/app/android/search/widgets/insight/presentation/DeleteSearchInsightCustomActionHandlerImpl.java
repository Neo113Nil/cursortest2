package ru.ozon.app.android.search.widgets.insight.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.common.cellList.v2.presentation.CellV2ViewHolder;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.search.widgets.insight.di.InsightWidgetComponent;
import ru.ozon.app.android.storefront.actionHandlers.DeleteSearchInsightCustomActionHandler;
import ru.ozon.app.android.storefront.domain.events.DisableActionUpdate;
import ru.ozon.app.android.storefront.domain.events.UpdateCellRightIcon;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightCustomActionHandlerImpl;", "Lru/ozon/app/android/storefront/actionHandlers/DeleteSearchInsightCustomActionHandler;", "<init>", "()V", "Lxe/M;", "", "", "params", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;", "viewModel", "", "deleteSearchInsightAction", "(Lxe/M;Ljava/util/Map;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;)V", "dismissDelayed", "(Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;Lru/ozon/app/android/composer/ComposerNavigator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Ll10/b;", "controller", "updateCell", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Ll10/b;Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "createRightBlock", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeleteSearchInsightCustomActionHandlerImpl extends DeleteSearchInsightCustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId = "deleteSearchInsight";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightCustomActionHandlerImpl$Companion;", "", "<init>", "()V", "ICON_CHECK_FILLED", "", "DELAY", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final CellDTO.RightBlock createRightBlock() {
        return new CellDTO.RightBlock(null, null, null, null, null, null, null, new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO("ic_m_check_filled", UniColors.GRAPHIC_ACTION_PRIMARY.getToken()), null, null, null, null, null, null, null, null, null, null, null, 65514, null), null, null, null, null, 3967, null);
    }

    private final void deleteSearchInsightAction(M m11, Map<String, String> map, ActionV2Repository actionV2Repository, ComposerNavigator composerNavigator, DeleteSearchInsightViewModel deleteSearchInsightViewModel) {
        C10727i.c(m11, null, null, new DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1(actionV2Repository, new ActionV2Request(map, getActionId(), false, 4, null), this, deleteSearchInsightViewModel, composerNavigator, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissDelayed(DeleteSearchInsightViewModel deleteSearchInsightViewModel, ComposerNavigator composerNavigator, d<? super Unit> dVar) {
        DeleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1 deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1;
        int i11;
        if (dVar instanceof DeleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1) {
            deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1 = (DeleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1) dVar;
            int i12 = deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.L$0 = deleteSearchInsightViewModel;
                    deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.L$1 = composerNavigator;
                    deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.label = 1;
                    if (Y.b(150L, deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    composerNavigator = (ComposerNavigator) deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.L$1;
                    deleteSearchInsightViewModel = (DeleteSearchInsightViewModel) deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.L$0;
                    s.b(obj);
                }
                deleteSearchInsightViewModel.setCellSelected(false);
                composerNavigator.popBackStack();
                return Unit.f71690a;
            }
        }
        deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1 = new DeleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1(this, dVar);
        Object obj2 = deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = deleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1.label;
        if (i11 != 0) {
        }
        deleteSearchInsightViewModel.setCellSelected(false);
        composerNavigator.popBackStack();
        return Unit.f71690a;
    }

    private final void updateCell(CustomActionHandler.HandlerReferences handlerRefs, InterfaceC7851b controller, DeleteSearchInsightViewModel viewModel) {
        RecyclerView recyclerView;
        l viewItem;
        c d11;
        View view;
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
        if (b11 == null || (view = b11.getView()) == null || (recyclerView = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) {
            r a11 = handlerRefs.getRefs().getContainer().a();
            recyclerView = a11 != null ? (RecyclerView) a11.findViewById(R.id.listRv) : null;
            if (recyclerView == null) {
                return;
            }
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            SingleAtom singleAtom = childAt instanceof SingleAtom ? (SingleAtom) childAt : null;
            if (singleAtom != null) {
                RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(singleAtom);
                CellV2ViewHolder cellV2ViewHolder = childViewHolder instanceof CellV2ViewHolder ? (CellV2ViewHolder) childViewHolder : null;
                if (cellV2ViewHolder != null && (viewItem = cellV2ViewHolder.getViewItem()) != null && (d11 = viewItem.d()) != null) {
                    long id2 = d11.getId();
                    Long voId = handlerRefs.getVoId();
                    if (voId != null && id2 == voId.longValue()) {
                        controller.update(new UpdateCellRightIcon(d11.getId(), createRightBlock(), true));
                        viewModel.setCellSelected(true);
                    } else {
                        controller.update(new DisableActionUpdate(d11.getId()));
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
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.Click) && (params = ((AtomAction.Click) action).getParams()) != null) {
            ActionComponentApi actionComponentApi = (ActionComponentApi) handlerRefs.getRefs().getComponent(ActionComponentApi.class);
            RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) handlerRefs.getRefs().getComponent(RetainComposerComponentApi.class);
            final InsightWidgetComponent insightWidgetComponent = (InsightWidgetComponent) handlerRefs.getRefs().getWidgetComponent(InsightWidgetComponent.class);
            DeleteSearchInsightViewModelImpl deleteSearchInsightViewModelImpl = (DeleteSearchInsightViewModelImpl) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightCustomActionHandlerImpl$processAction$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    DeleteSearchInsightViewModelImpl viewModel = InsightWidgetComponent.this.getViewModel();
                    Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return viewModel;
                }
            }).a(DeleteSearchInsightViewModelImpl.class);
            if (deleteSearchInsightViewModelImpl.getIsCellSelected()) {
                return;
            }
            updateCell(handlerRefs, retainComposerComponentApi.getComposerController(), deleteSearchInsightViewModelImpl);
            deleteSearchInsightAction(K.a(handlerRefs.getRefs().getContainer().g()), params, actionComponentApi.getActionRepository(), retainComposerComponentApi.getComposerNavigator(), deleteSearchInsightViewModelImpl);
        }
    }
}
