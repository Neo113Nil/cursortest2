package ru.ozon.app.android.app.launch.handlers.listeners;

import L00.c;
import L00.g;
import Sc.s;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.network.homeprefetch.PrefetchHomePageFacade;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener$prefetchHome$1", f = "AppLaunchListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AppLaunchListener$prefetchHome$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ g $request;
    int label;
    final /* synthetic */ AppLaunchListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppLaunchListener$prefetchHome$1(AppLaunchListener appLaunchListener, g gVar, d<? super AppLaunchListener$prefetchHome$1> dVar) {
        super(2, dVar);
        this.this$0 = appLaunchListener;
        this.$request = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppLaunchListener$prefetchHome$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PrefetchHomePageFacade prefetchHomePageFacade;
        PrefetchHomePageFacade prefetchHomePageFacade2;
        L00.d dVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        c cVar = null;
        try {
            try {
                prefetchHomePageFacade2 = this.this$0.prefetchHomePageFacade;
                prefetchHomePageFacade2.setStarting();
                dVar = this.this$0.callFactory;
                cVar = dVar.a(this.$request);
                cVar.b();
            } catch (CancellationException e11) {
                if (cVar != null) {
                    cVar.a();
                }
                throw e11;
            } catch (Exception unused) {
            }
            return Unit.f71690a;
        } finally {
            prefetchHomePageFacade = this.this$0.prefetchHomePageFacade;
            prefetchHomePageFacade.setCompleted();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AppLaunchListener$prefetchHome$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
