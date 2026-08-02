package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler;

import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler.RemoveSelectionItemProductActionHandler;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent$Result$ActionResult;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler.RemoveSelectionItemProductActionHandler$processAction$1", f = "RemoveSelectionItemProductActionHandler.kt", l = {66, 72, 91}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class RemoveSelectionItemProductActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ String $selectionUuid;
    final /* synthetic */ long $sku;
    Object L$0;
    int label;
    final /* synthetic */ RemoveSelectionItemProductActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveSelectionItemProductActionHandler$processAction$1(RemoveSelectionItemProductActionHandler removeSelectionItemProductActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, long j11, String str, d<? super RemoveSelectionItemProductActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = removeSelectionItemProductActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
        this.$sku = j11;
        this.$selectionUuid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RemoveSelectionItemProductActionHandler$processAction$1(this.this$0, this.$request, this.$handlerRefs, this.$sku, this.$selectionUuid, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler.RemoveSelectionItemProductActionHandler.showNotification$default(r8, r9, null, r11, 2, null) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r15 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        if (r15 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        ActionV2Response actionV2Response;
        NotificationDTO notification;
        Object showNotification;
        String error;
        RemoveSelectionItemProductActionHandler$processAction$1 removeSelectionItemProductActionHandler$processAction$1;
        SelectionProductsEventManager selectionProductsEventManager;
        SelectionProductsEventManager selectionProductsEventManager2;
        Function1 createActionHandler;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            this.label = 1;
            obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, RemoveSelectionItemProductActionHandler.SelectionProductRemoveResponse.class, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    removeSelectionItemProductActionHandler$processAction$1 = this;
                    createActionHandler = removeSelectionItemProductActionHandler$processAction$1.this$0.createActionHandler(removeSelectionItemProductActionHandler$processAction$1.$handlerRefs);
                    createActionHandler.invoke(new AtomAction.Dismiss(null, null, null, null, 13, null));
                    return Unit.f71690a;
                }
                actionV2Response = (ActionV2Response) this.L$0;
                s.b(obj);
                error = actionV2Response.getError();
                if (error != null || error.length() == 0) {
                    removeSelectionItemProductActionHandler$processAction$1 = this;
                    selectionProductsEventManager = removeSelectionItemProductActionHandler$processAction$1.this$0.selectionProductsEventManager;
                    selectionProductsEventManager.onSelectionProductsChanged(new SelectionProductEvent.ProductRemoved(removeSelectionItemProductActionHandler$processAction$1.$sku, removeSelectionItemProductActionHandler$processAction$1.$selectionUuid, SelectionProductEvent$Result$ActionResult.SUCCEED));
                } else {
                    selectionProductsEventManager2 = this.this$0.selectionProductsEventManager;
                    selectionProductsEventManager2.onSelectionProductsChanged(new SelectionProductEvent.ProductRemoved(this.$sku, this.$selectionUuid, SelectionProductEvent$Result$ActionResult.FAILED));
                    RemoveSelectionItemProductActionHandler removeSelectionItemProductActionHandler = this.this$0;
                    CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                    this.L$0 = null;
                    this.label = 3;
                    removeSelectionItemProductActionHandler$processAction$1 = this;
                }
                createActionHandler = removeSelectionItemProductActionHandler$processAction$1.this$0.createActionHandler(removeSelectionItemProductActionHandler$processAction$1.$handlerRefs);
                createActionHandler.invoke(new AtomAction.Dismiss(null, null, null, null, 13, null));
                return Unit.f71690a;
            }
            s.b(obj);
        }
        actionV2Response = (ActionV2Response) obj;
        RemoveSelectionItemProductActionHandler.SelectionProductRemoveResponse selectionProductRemoveResponse = (RemoveSelectionItemProductActionHandler.SelectionProductRemoveResponse) actionV2Response.getData();
        if (selectionProductRemoveResponse != null && (notification = selectionProductRemoveResponse.getNotification()) != null) {
            RemoveSelectionItemProductActionHandler removeSelectionItemProductActionHandler2 = this.this$0;
            CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
            this.L$0 = actionV2Response;
            this.label = 2;
            showNotification = removeSelectionItemProductActionHandler2.showNotification(handlerReferences2, notification, this);
        }
        error = actionV2Response.getError();
        if (error != null) {
        }
        removeSelectionItemProductActionHandler$processAction$1 = this;
        selectionProductsEventManager = removeSelectionItemProductActionHandler$processAction$1.this$0.selectionProductsEventManager;
        selectionProductsEventManager.onSelectionProductsChanged(new SelectionProductEvent.ProductRemoved(removeSelectionItemProductActionHandler$processAction$1.$sku, removeSelectionItemProductActionHandler$processAction$1.$selectionUuid, SelectionProductEvent$Result$ActionResult.SUCCEED));
        createActionHandler = removeSelectionItemProductActionHandler$processAction$1.this$0.createActionHandler(removeSelectionItemProductActionHandler$processAction$1.$handlerRefs);
        createActionHandler.invoke(new AtomAction.Dismiss(null, null, null, null, 13, null));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RemoveSelectionItemProductActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
