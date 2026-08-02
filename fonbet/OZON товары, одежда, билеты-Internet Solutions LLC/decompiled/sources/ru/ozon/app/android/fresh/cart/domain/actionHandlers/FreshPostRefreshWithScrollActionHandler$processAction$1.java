package ru.ozon.app.android.fresh.cart.domain.actionHandlers;

import A00.a;
import Sc.s;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshPostRefreshWithScrollActionHandler$processAction$1", f = "FreshPostRefreshWithScrollActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshPostRefreshWithScrollActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ a.C $scroll;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshPostRefreshWithScrollActionHandler$processAction$1(AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, a.C c11, JsonParser jsonParser, d<? super FreshPostRefreshWithScrollActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
        this.$scroll = c11;
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshPostRefreshWithScrollActionHandler$processAction$1(this.$action, this.$handlerRefs, this.$scroll, this.$jsonDeserializer, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Map<String, String> params = ((AtomAction.Click) this.$action).getParams();
        InterfaceC7851b.a.a(this.$handlerRefs.getRefs().getController(), ((AtomAction.Click) this.$action).getLink(), (params == null || (str = params.get("body")) == null) ? null : (Map) this.$jsonDeserializer.fromJson(str, Map.class), null, new h.b(this.$scroll, new l.a.b(0L, new Integer(0))), 4);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshPostRefreshWithScrollActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
