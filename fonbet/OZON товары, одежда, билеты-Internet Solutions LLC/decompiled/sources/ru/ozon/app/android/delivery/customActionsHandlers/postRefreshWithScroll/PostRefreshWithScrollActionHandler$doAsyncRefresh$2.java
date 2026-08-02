package ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll;

import Lm0.a;
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
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler$doAsyncRefresh$2", f = "PostRefreshWithScrollActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PostRefreshWithScrollActionHandler$doAsyncRefresh$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    final /* synthetic */ AsyncCartViewModel $this_doAsyncRefresh;
    int label;
    final /* synthetic */ PostRefreshWithScrollActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRefreshWithScrollActionHandler$doAsyncRefresh$2(AtomAction.Click click, AsyncCartViewModel asyncCartViewModel, PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler, d<? super PostRefreshWithScrollActionHandler$doAsyncRefresh$2> dVar) {
        super(2, dVar);
        this.$action = click;
        this.$this_doAsyncRefresh = asyncCartViewModel;
        this.this$0 = postRefreshWithScrollActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PostRefreshWithScrollActionHandler$doAsyncRefresh$2(this.$action, this.$this_doAsyncRefresh, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a11;
        String removeSchema;
        JsonParser jsonParser;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Map<String, String> params = this.$action.getParams();
        if (params != null && (str = params.get("body")) != null) {
            PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler = this.this$0;
            try {
                r.Companion companion = r.INSTANCE;
                jsonParser = postRefreshWithScrollActionHandler.jsonDeserializer;
                a11 = (Map) jsonParser.fromJson(str, Map.class);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            a.b bVar = Lm0.a.f17149a;
            Throwable b11 = r.b(a11);
            if (b11 != null) {
                bVar.e(b11);
            }
            if (a11 instanceof r.b) {
                a11 = null;
            }
            Map<String, ? extends Object> map = (Map) a11;
            if (map != null) {
                AsyncCartViewModel asyncCartViewModel = this.$this_doAsyncRefresh;
                String link = this.$action.getLink();
                if (link == null || (removeSchema = UriExtKt.removeSchema(link)) == null) {
                    return Unit.f71690a;
                }
                asyncCartViewModel.post(removeSchema, map);
                return Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PostRefreshWithScrollActionHandler$doAsyncRefresh$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
