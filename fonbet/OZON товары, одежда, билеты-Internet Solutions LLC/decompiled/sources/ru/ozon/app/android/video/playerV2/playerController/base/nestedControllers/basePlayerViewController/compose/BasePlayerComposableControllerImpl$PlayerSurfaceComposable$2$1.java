package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose;

import Cg0.c;
import Sc.InterfaceC4008j;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableControllerImpl$PlayerSurfaceComposable$2$1", f = "BasePlayerComposableController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasePlayerComposableControllerImpl$PlayerSurfaceComposable$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ c $placeholderTracking;
    int label;
    final /* synthetic */ BasePlayerComposableControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePlayerComposableControllerImpl$PlayerSurfaceComposable$2$1(BasePlayerComposableControllerImpl basePlayerComposableControllerImpl, c cVar, d<? super BasePlayerComposableControllerImpl$PlayerSurfaceComposable$2$1> dVar) {
        super(2, dVar);
        this.this$0 = basePlayerComposableControllerImpl;
        this.$placeholderTracking = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BasePlayerComposableControllerImpl$PlayerSurfaceComposable$2$1(this.this$0, this.$placeholderTracking, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        interfaceC4008j = this.this$0.playbackAnalyticsListenerDelegate;
        ((PlaybackAnalyticsListener) interfaceC4008j.getValue()).updateWidgetName(this.$placeholderTracking.a());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BasePlayerComposableControllerImpl$PlayerSurfaceComposable$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
