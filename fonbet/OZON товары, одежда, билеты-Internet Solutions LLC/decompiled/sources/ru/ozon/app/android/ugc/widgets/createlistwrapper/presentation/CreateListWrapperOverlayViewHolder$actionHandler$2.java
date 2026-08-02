package ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation;

import Vg.c;
import Vg.f;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.UpdateProductsSelectionFormActionHandler;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CreateListWrapperOverlayViewHolder$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ CreateListWrapperOverlayViewHolder this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$actionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
        final /* synthetic */ CreateListWrapperOverlayViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CreateListWrapperOverlayViewHolder createListWrapperOverlayViewHolder) {
            super(1);
            this.this$0 = createListWrapperOverlayViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction action) {
            c customActionHandlersStore;
            SelectedProductsManager selectedProductsManager;
            c customActionHandlersStore2;
            SelectedProductsManager selectedProductsManager2;
            l lVar;
            Intrinsics.checkNotNullParameter(action, "action");
            String id2 = action.getId();
            if (Intrinsics.d(id2, "submitSelectionFormMobile")) {
                customActionHandlersStore2 = this.this$0.getCustomActionHandlersStore();
                f handler = customActionHandlersStore2.getHandler("submitSelectionFormMobile");
                SubmitSelectionFormActionHandler submitSelectionFormActionHandler = handler instanceof SubmitSelectionFormActionHandler ? (SubmitSelectionFormActionHandler) handler : null;
                if (submitSelectionFormActionHandler != null) {
                    CreateListWrapperOverlayViewHolder createListWrapperOverlayViewHolder = this.this$0;
                    selectedProductsManager2 = createListWrapperOverlayViewHolder.selectedProductsManager;
                    submitSelectionFormActionHandler.setProductIds(selectedProductsManager2.getSelectedIds());
                    lVar = createListWrapperOverlayViewHolder.tokenizedAnalytics;
                    submitSelectionFormActionHandler.setTokenizedAnalytics(lVar);
                }
            } else if (Intrinsics.d(id2, "productsUpdateAction")) {
                customActionHandlersStore = this.this$0.getCustomActionHandlersStore();
                f handler2 = customActionHandlersStore.getHandler("productsUpdateAction");
                UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler = handler2 instanceof UpdateProductsSelectionFormActionHandler ? (UpdateProductsSelectionFormActionHandler) handler2 : null;
                if (updateProductsSelectionFormActionHandler != null) {
                    selectedProductsManager = this.this$0.selectedProductsManager;
                    updateProductsSelectionFormActionHandler.setProductIds(selectedProductsManager.getSelectedIds());
                }
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateListWrapperOverlayViewHolder$actionHandler$2(CreateListWrapperOverlayViewHolder createListWrapperOverlayViewHolder) {
        super(0);
        this.this$0 = createListWrapperOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        i iVar;
        iVar = this.this$0.container;
        return new ActionHandler.Builder(iVar, this.this$0).onPreProcess(new AnonymousClass1(this.this$0)).customActionHandlers(new C(this.this$0) { // from class: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$actionHandler$2.2
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                c customActionHandlersStore;
                customActionHandlersStore = ((CreateListWrapperOverlayViewHolder) this.receiver).getCustomActionHandlersStore();
                return customActionHandlersStore;
            }
        }).buildHandler();
    }
}
