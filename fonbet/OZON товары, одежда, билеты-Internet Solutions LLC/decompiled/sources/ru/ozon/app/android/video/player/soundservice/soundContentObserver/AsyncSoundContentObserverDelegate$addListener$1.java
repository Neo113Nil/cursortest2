package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.maplibre.android.log.Logger;
import ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.player.soundservice.soundContentObserver.AsyncSoundContentObserverDelegate$addListener$1", f = "AsyncSoundContentObserverDelegate.kt", l = {Logger.NONE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AsyncSoundContentObserverDelegate$addListener$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ SoundContentObserver.Listener $listener;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AsyncSoundContentObserverDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncSoundContentObserverDelegate$addListener$1(AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate, SoundContentObserver.Listener listener, d<? super AsyncSoundContentObserverDelegate$addListener$1> dVar) {
        super(2, dVar);
        this.this$0 = asyncSoundContentObserverDelegate;
        this.$listener = listener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AsyncSoundContentObserverDelegate$addListener$1(this.this$0, this.$listener, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate;
        InterfaceC3394a interfaceC3394a;
        SoundContentObserver.Listener listener;
        List list;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC3394a interfaceC3394a2 = this.this$0.mutex;
            asyncSoundContentObserverDelegate = this.this$0;
            SoundContentObserver.Listener listener2 = this.$listener;
            this.L$0 = interfaceC3394a2;
            this.L$1 = asyncSoundContentObserverDelegate;
            this.L$2 = listener2;
            this.label = 1;
            if (interfaceC3394a2.a(this) == aVar) {
                return aVar;
            }
            interfaceC3394a = interfaceC3394a2;
            listener = listener2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listener = (SoundContentObserver.Listener) this.L$2;
            asyncSoundContentObserverDelegate = (AsyncSoundContentObserverDelegate) this.L$1;
            interfaceC3394a = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            list = asyncSoundContentObserverDelegate.listeners;
            list.add(listener);
            Unit unit = Unit.f71690a;
            interfaceC3394a.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            interfaceC3394a.c(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AsyncSoundContentObserverDelegate$addListener$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
