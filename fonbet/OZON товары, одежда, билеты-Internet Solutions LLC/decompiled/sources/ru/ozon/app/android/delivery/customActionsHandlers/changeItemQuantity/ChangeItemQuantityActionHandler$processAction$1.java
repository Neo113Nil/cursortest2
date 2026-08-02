package ru.ozon.app.android.delivery.customActionsHandlers.changeItemQuantity;

import Sc.r;
import Sc.s;
import Wc.a;
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
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.changeItemQuantity.ChangeItemQuantityActionHandler$processAction$1", f = "ChangeItemQuantityActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ChangeItemQuantityActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ String $link;
    final /* synthetic */ String $postData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChangeItemQuantityActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeItemQuantityActionHandler$processAction$1(ChangeItemQuantityActionHandler changeItemQuantityActionHandler, String str, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, String str2, d<? super ChangeItemQuantityActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = changeItemQuantityActionHandler;
        this.$postData = str;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
        this.$link = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChangeItemQuantityActionHandler$processAction$1 changeItemQuantityActionHandler$processAction$1 = new ChangeItemQuantityActionHandler$processAction$1(this.this$0, this.$postData, this.$action, this.$handlerRefs, this.$link, dVar);
        changeItemQuantityActionHandler$processAction$1.L$0 = obj;
        return changeItemQuantityActionHandler$processAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        String str;
        Map map;
        JsonParser jsonParser;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ChangeItemQuantityActionHandler changeItemQuantityActionHandler = this.this$0;
        String str2 = this.$postData;
        try {
            r.Companion companion = r.INSTANCE;
            jsonParser = changeItemQuantityActionHandler.jsonDeserializer;
            a11 = (Map) jsonParser.fromJson(str2, Map.class);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        AtomAction atomAction = this.$action;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        String str3 = this.$link;
        if (!(a11 instanceof r.b)) {
            Map map2 = (Map) a11;
            Map<String, String> params = ((AtomAction.Click) atomAction).getParams();
            if (params != null && (str = params.get("quantity")) != null && (map = (Map) map2.get("changeItemQuantity")) != null) {
                map.put("quantity", new Integer(Integer.parseInt(str)));
            }
            InterfaceC7851b.a.e(handlerReferences.getRefs().getController(), str3, map2, null, 4);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ChangeItemQuantityActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
