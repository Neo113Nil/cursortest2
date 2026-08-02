package ru.ozon.app.android.fresh.cart.domain.actionHandlers;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.m;
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
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$4", f = "FreshRemoveCartItemsOnModalActionHandler.kt", l = {m.e.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$4 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    int label;
    final /* synthetic */ FreshRemoveCartItemsOnModalActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$4(FreshRemoveCartItemsOnModalActionHandler freshRemoveCartItemsOnModalActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, d<? super FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$4> dVar) {
        super(2, dVar);
        this.this$0 = freshRemoveCartItemsOnModalActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$4(this.this$0, this.$request, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        Function1 createActionHandler;
        AtomActionDTO action;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        AtomAction atomAction = null;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, trackingData, ComposerActionWithActionDTO.class, this);
            if (mo480requestActionResultWithTrackingBWLJW6A == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
        }
        FreshRemoveCartItemsOnModalActionHandler freshRemoveCartItemsOnModalActionHandler = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
            ComposerActionWithActionDTO composerActionWithActionDTO = (ComposerActionWithActionDTO) ((ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A).getData();
            if (composerActionWithActionDTO != null && (action = composerActionWithActionDTO.getAction()) != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, null);
            }
            if (atomAction != null) {
                createActionHandler = freshRemoveCartItemsOnModalActionHandler.createActionHandler(handlerReferences);
                createActionHandler.invoke(atomAction);
            }
        }
        FreshRemoveCartItemsOnModalActionHandler freshRemoveCartItemsOnModalActionHandler2 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            freshRemoveCartItemsOnModalActionHandler2.showError(b11, handlerReferences2);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$4) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
