package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.FetchCancelReasonsActionHandler$processAction$1", f = "FetchCancelReasonsActionHandler.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FetchCancelReasonsActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FetchCancelReasonsActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchCancelReasonsActionHandler$processAction$1(CustomActionHandler.HandlerReferences handlerReferences, FetchCancelReasonsActionHandler fetchCancelReasonsActionHandler, AtomAction atomAction, d<? super FetchCancelReasonsActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.this$0 = fetchCancelReasonsActionHandler;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FetchCancelReasonsActionHandler$processAction$1 fetchCancelReasonsActionHandler$processAction$1 = new FetchCancelReasonsActionHandler$processAction$1(this.$handlerRefs, this.this$0, this.$action, dVar);
        fetchCancelReasonsActionHandler$processAction$1.L$0 = obj;
        return fetchCancelReasonsActionHandler$processAction$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [W10.c] */
    /* JADX WARN: Type inference failed for: r1v4, types: [W10.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [W10.c] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ?? r12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                this.$handlerRefs.getRefs().getController().e(new l.a.C1079a(0L, null, 3));
                c trackingData = this.$handlerRefs.getTrackingData();
                if (trackingData == null) {
                    trackingData = new c(null, null, null);
                }
                ?? r13 = trackingData;
                FetchCancelReasonsActionHandler fetchCancelReasonsActionHandler = this.this$0;
                AtomAction atomAction = this.$action;
                r.Companion companion = r.INSTANCE;
                String actionName = ((AtomAction.ComposerAction) atomAction).getActionName();
                Map<String, String> params = ((AtomAction.ComposerAction) atomAction).getParams();
                this.L$0 = r13;
                this.label = 1;
                obj = fetchCancelReasonsActionHandler.fetchCancelReasons(actionName, params, r13, this);
                i11 = r13;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r14 = (c) this.L$0;
                s.b(obj);
                i11 = r14;
            }
            a11 = (CancelReasonsWithPayloads) obj;
            r.Companion companion2 = r.INSTANCE;
            r12 = i11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
            r12 = i11;
        }
        this.$handlerRefs.getRefs().getController().hideLoader();
        FetchCancelReasonsActionHandler fetchCancelReasonsActionHandler2 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        if (!(a11 instanceof r.b)) {
            fetchCancelReasonsActionHandler2.openCancelReasons(handlerReferences.getRefs().getNavigator(), (CancelReasonsWithPayloads) a11, r12);
        }
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        if (r.b(a11) != null) {
            RestrictionsUtilsKt.showRestriction$default(handlerReferences2.getRefs(), StringProvider.getString(R$string.error_common_error_technical_error_title), new Integer(R$drawable.ic_warning), null, 4, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FetchCancelReasonsActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
