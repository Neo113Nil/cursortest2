package ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler$processAction$1", f = "PostRefreshWithScrollActionHandler.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PostRefreshWithScrollActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ AsyncCartViewModel $asyncCartViewModel;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ PostRefreshWithScrollActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRefreshWithScrollActionHandler$processAction$1(PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler, AsyncCartViewModel asyncCartViewModel, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, d<? super PostRefreshWithScrollActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = postRefreshWithScrollActionHandler;
        this.$asyncCartViewModel = asyncCartViewModel;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PostRefreshWithScrollActionHandler$processAction$1(this.this$0, this.$asyncCartViewModel, this.$action, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler = this.this$0;
            AsyncCartViewModel asyncCartViewModel = this.$asyncCartViewModel;
            AtomAction.Click click = (AtomAction.Click) this.$action;
            this.label = 1;
            obj = postRefreshWithScrollActionHandler.doAsyncRefreshIfNeed(asyncCartViewModel, click, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.doRefresh(this.$handlerRefs, (AtomAction.Click) this.$action);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PostRefreshWithScrollActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
