package ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll;

import A00.a;
import Sc.s;
import i10.h;
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
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler$doRefresh$1", f = "PostRefreshWithScrollActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PostRefreshWithScrollActionHandler$doRefresh$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ a.C $scroll;
    int label;
    final /* synthetic */ PostRefreshWithScrollActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRefreshWithScrollActionHandler$doRefresh$1(AtomAction.Click click, CustomActionHandler.HandlerReferences handlerReferences, a.C c11, PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler, d<? super PostRefreshWithScrollActionHandler$doRefresh$1> dVar) {
        super(2, dVar);
        this.$action = click;
        this.$handlerRefs = handlerReferences;
        this.$scroll = c11;
        this.this$0 = postRefreshWithScrollActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PostRefreshWithScrollActionHandler$doRefresh$1(this.$action, this.$handlerRefs, this.$scroll, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        String str;
        JsonParser jsonParser;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Map<String, String> params = this.$action.getParams();
        if (params == null || (str = params.get("body")) == null) {
            map = null;
        } else {
            jsonParser = this.this$0.jsonDeserializer;
            map = (Map) jsonParser.fromJson(str, Map.class);
        }
        InterfaceC7851b.a.a(this.$handlerRefs.getRefs().getController(), this.$action.getLink(), map, null, new h.b(this.$scroll, null, 2), 4);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PostRefreshWithScrollActionHandler$doRefresh$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
