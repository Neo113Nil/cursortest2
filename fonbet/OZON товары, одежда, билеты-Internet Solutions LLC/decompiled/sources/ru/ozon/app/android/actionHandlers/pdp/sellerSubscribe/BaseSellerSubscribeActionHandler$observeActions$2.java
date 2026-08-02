package ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler$observeActions$2", f = "BaseSellerSubscribeActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseSellerSubscribeActionHandler$observeActions$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ BaseSellerSubscribeActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSellerSubscribeActionHandler$observeActions$2(BaseSellerSubscribeActionHandler baseSellerSubscribeActionHandler, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, d<? super BaseSellerSubscribeActionHandler$observeActions$2> dVar) {
        super(2, dVar);
        this.this$0 = baseSellerSubscribeActionHandler;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseSellerSubscribeActionHandler$observeActions$2(this.this$0, this.$action, this.$handlerRefs, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, d<? super Unit> dVar) {
        return ((BaseSellerSubscribeActionHandler$observeActions$2) create(bool, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.processAction(this.$action, this.$handlerRefs);
        this.this$0.releaseStateListenerJob();
        return Unit.f71690a;
    }
}
