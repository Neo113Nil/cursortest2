package ru.ozon.app.android.debugmenu.deeplink;

import Sc.s;
import Wc.a;
import android.util.Base64;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.h;
import pZ.f;
import ru.ozon.app.android.storage.debug.DebugToolsService;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.deeplink.ResolveOverrideDeeplinkHandler$getDestination$1", f = "ResolveOverrideDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ResolveOverrideDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ GZ.j $route;
    int label;
    final /* synthetic */ ResolveOverrideDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResolveOverrideDeeplinkHandler$getDestination$1(GZ.j jVar, ResolveOverrideDeeplinkHandler resolveOverrideDeeplinkHandler, d<? super ResolveOverrideDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.$route = jVar;
        this.this$0 = resolveOverrideDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new ResolveOverrideDeeplinkHandler$getDestination$1(this.$route, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DebugToolsService debugToolsService;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String queryParameter = this.$route.b().getQueryParameter("cityIP");
        if (queryParameter != null) {
            if (h.K(queryParameter)) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                byte[] bytes = V.e.b(new Object[]{queryParameter}, 1, "{\"request.header.x_real_ip\": {\"kind\": \"VALUE_KIND_STRING\", \"stringValue\": \"%s\"}}", "format(...)").getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                String encodeToString = Base64.encodeToString(bytes, 2);
                debugToolsService = this.this$0.debugToolsService;
                debugToolsService.setResolveOverride(encodeToString);
                return new pZ.h("Геолокация обновлена через диплинк");
            }
        }
        return new pZ.h("Некорректный параметр cityIP");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((ResolveOverrideDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
