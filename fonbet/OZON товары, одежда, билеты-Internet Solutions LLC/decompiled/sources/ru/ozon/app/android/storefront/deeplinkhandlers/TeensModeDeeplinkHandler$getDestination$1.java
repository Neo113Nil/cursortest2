package ru.ozon.app.android.storefront.deeplinkhandlers;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import pZ.f;
import pZ.h;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.deeplinkhandlers.TeensModeDeeplinkHandler$getDestination$1", f = "TeensModeDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TeensModeDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ GZ.j $route;
    int label;
    final /* synthetic */ TeensModeDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TeensModeDeeplinkHandler$getDestination$1(TeensModeDeeplinkHandler teensModeDeeplinkHandler, GZ.j jVar, d<? super TeensModeDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.this$0 = teensModeDeeplinkHandler;
        this.$route = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new TeensModeDeeplinkHandler$getDestination$1(this.this$0, this.$route, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h teensMode;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        teensMode = this.this$0.setTeensMode(this.$route.b());
        return teensMode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((TeensModeDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
