package ru.ozon.app.android.switchUser;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import od0.InterfaceC8695a;
import pZ.f;
import ru.ozon.app.android.navigation.newrouter.destinations.flashbar.FlashbarData;
import ru.ozon.app.android.navigation.newrouter.destinations.flashbar.FlashbarDestination;
import ru.ozon.app.android.switchUser.loader.LoaderEventBus;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor$intercept$1", f = "SwitchUserDestinationInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwitchUserDestinationInterceptor$intercept$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ String $deeplinkWithoutUserId;
    final /* synthetic */ GZ.j $route;
    final /* synthetic */ Long $targetUserId;
    int label;
    final /* synthetic */ SwitchUserDestinationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchUserDestinationInterceptor$intercept$1(SwitchUserDestinationInterceptor switchUserDestinationInterceptor, Long l11, String str, GZ.j jVar, d<? super SwitchUserDestinationInterceptor$intercept$1> dVar) {
        super(1, dVar);
        this.this$0 = switchUserDestinationInterceptor;
        this.$targetUserId = l11;
        this.$deeplinkWithoutUserId = str;
        this.$route = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new SwitchUserDestinationInterceptor$intercept$1(this.this$0, this.$targetUserId, this.$deeplinkWithoutUserId, this.$route, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8695a blockingSwitchUser;
        FlashbarData flashbarData;
        f intercept$handle;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        LoaderEventBus loaderEventBus = LoaderEventBus.INSTANCE;
        loaderEventBus.emit(LoaderEventBus.Event.SHOW_LOADER);
        blockingSwitchUser = this.this$0.blockingSwitchUser(this.$targetUserId.longValue());
        flashbarData = this.this$0.toFlashbarData(blockingSwitchUser);
        loaderEventBus.emit(LoaderEventBus.Event.HIDE_LOADER);
        if (flashbarData != null) {
            return new FlashbarDestination(this.$deeplinkWithoutUserId, flashbarData);
        }
        intercept$handle = SwitchUserDestinationInterceptor.intercept$handle(this.this$0, this.$deeplinkWithoutUserId, this.$route);
        return intercept$handle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((SwitchUserDestinationInterceptor$intercept$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
