package ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll;

import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2", f = "PostRefreshWithScrollActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2 extends j implements Function2<M, d<? super Boolean>, Object> {
    final /* synthetic */ String $body;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PostRefreshWithScrollActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2(PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler, String str, d<? super PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2> dVar) {
        super(2, dVar);
        this.this$0 = postRefreshWithScrollActionHandler;
        this.$body = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2 postRefreshWithScrollActionHandler$isAsyncCartEnabled$2 = new PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2(this.this$0, this.$body, dVar);
        postRefreshWithScrollActionHandler$isAsyncCartEnabled$2.L$0 = obj;
        return postRefreshWithScrollActionHandler$isAsyncCartEnabled$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        JsonParser jsonParser;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler = this.this$0;
        String str = this.$body;
        try {
            r.Companion companion = r.INSTANCE;
            jsonParser = postRefreshWithScrollActionHandler.jsonDeserializer;
            a11 = Boolean.valueOf(Intrinsics.d(((Map) jsonParser.fromJson(str, Map.class)).get(AppMeasurementSdk.ConditionalUserProperty.NAME), "modifyItems"));
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        a.b bVar = Lm0.a.f17149a;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            bVar.e(b11);
        }
        return a11 instanceof r.b ? Boolean.FALSE : a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
