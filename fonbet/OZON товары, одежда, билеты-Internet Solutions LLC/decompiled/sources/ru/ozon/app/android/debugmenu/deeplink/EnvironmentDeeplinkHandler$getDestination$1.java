package ru.ozon.app.android.debugmenu.deeplink;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import pZ.f;
import ru.ozon.app.android.storage.environment.EnvironmentService;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.deeplink.EnvironmentDeeplinkHandler$getDestination$1", f = "EnvironmentDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class EnvironmentDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ GZ.j $route;
    int label;
    final /* synthetic */ EnvironmentDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnvironmentDeeplinkHandler$getDestination$1(GZ.j jVar, EnvironmentDeeplinkHandler environmentDeeplinkHandler, d<? super EnvironmentDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.$route = jVar;
        this.this$0 = environmentDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new EnvironmentDeeplinkHandler$getDestination$1(this.$route, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        EnvironmentService environmentService;
        EnvironmentService environmentService2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String authority = this.$route.b().getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            if (hashCode != -2085601209) {
                if (hashCode == -1591295178 && authority.equals("env=stg")) {
                    environmentService2 = this.this$0.environmentService;
                    environmentService2.changeEnvironment(false);
                }
            } else if (authority.equals("env=prod")) {
                environmentService = this.this$0.environmentService;
                environmentService.changeEnvironment(true);
            }
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((EnvironmentDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
