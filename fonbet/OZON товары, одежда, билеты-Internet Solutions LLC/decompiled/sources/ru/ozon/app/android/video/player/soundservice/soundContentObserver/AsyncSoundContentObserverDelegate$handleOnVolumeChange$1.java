package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import android.media.AudioManager;
import java.util.Iterator;
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
@e(c = "ru.ozon.app.android.video.player.soundservice.soundContentObserver.AsyncSoundContentObserverDelegate$handleOnVolumeChange$1", f = "AsyncSoundContentObserverDelegate.kt", l = {Logger.NONE, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AsyncSoundContentObserverDelegate$handleOnVolumeChange$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AsyncSoundContentObserverDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncSoundContentObserverDelegate$handleOnVolumeChange$1(AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate, d<? super AsyncSoundContentObserverDelegate$handleOnVolumeChange$1> dVar) {
        super(2, dVar);
        this.this$0 = asyncSoundContentObserverDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AsyncSoundContentObserverDelegate$handleOnVolumeChange$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r6 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0046, code lost:
    
        if (r6.a(r5) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0015, B:8:0x005d, B:12:0x0074, B:13:0x007e, B:15:0x0084, B:17:0x00aa, B:18:0x00b2, B:24:0x0090, B:25:0x009a, B:27:0x00a0, B:29:0x006a), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0015, B:8:0x005d, B:12:0x0074, B:13:0x007e, B:15:0x0084, B:17:0x00aa, B:18:0x00b2, B:24:0x0090, B:25:0x009a, B:27:0x00a0, B:29:0x006a), top: B:6:0x0015 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate;
        InterfaceC3394a interfaceC3394a2;
        Throwable th2;
        AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate2;
        int intValue;
        Integer num;
        List list;
        List list2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                interfaceC3394a = this.this$0.mutex;
                asyncSoundContentObserverDelegate = this.this$0;
                this.L$0 = interfaceC3394a;
                this.L$1 = asyncSoundContentObserverDelegate;
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncSoundContentObserverDelegate2 = (AsyncSoundContentObserverDelegate) this.L$1;
                    interfaceC3394a2 = (InterfaceC3394a) this.L$0;
                    try {
                        s.b(obj);
                        intValue = ((Number) obj).intValue();
                        num = asyncSoundContentObserverDelegate2.prevVolume;
                        if (num != null) {
                            if (num.intValue() == intValue) {
                            }
                        }
                        if (intValue <= 0) {
                            list2 = asyncSoundContentObserverDelegate2.listeners;
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((SoundContentObserver.Listener) it.next()).onUnmute();
                            }
                        } else if (intValue == 0) {
                            list = asyncSoundContentObserverDelegate2.listeners;
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((SoundContentObserver.Listener) it2.next()).onMute();
                            }
                        }
                        asyncSoundContentObserverDelegate2.prevVolume = new Integer(intValue);
                        Unit unit = Unit.f71690a;
                        interfaceC3394a2.c(null);
                        return Unit.f71690a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC3394a2.c(null);
                        throw th2;
                    }
                }
                asyncSoundContentObserverDelegate = (AsyncSoundContentObserverDelegate) this.L$1;
                InterfaceC3394a interfaceC3394a3 = (InterfaceC3394a) this.L$0;
                s.b(obj);
                interfaceC3394a = interfaceC3394a3;
            }
            AudioManager audioManager = asyncSoundContentObserverDelegate.audioManager();
            this.L$0 = interfaceC3394a;
            this.L$1 = asyncSoundContentObserverDelegate;
            this.label = 2;
            Object streamMusicVolume = asyncSoundContentObserverDelegate.getStreamMusicVolume(audioManager, this);
            if (streamMusicVolume != aVar) {
                asyncSoundContentObserverDelegate2 = asyncSoundContentObserverDelegate;
                interfaceC3394a2 = interfaceC3394a;
                obj = streamMusicVolume;
                intValue = ((Number) obj).intValue();
                num = asyncSoundContentObserverDelegate2.prevVolume;
                if (num != null) {
                }
                if (intValue <= 0) {
                }
                asyncSoundContentObserverDelegate2.prevVolume = new Integer(intValue);
                Unit unit2 = Unit.f71690a;
                interfaceC3394a2.c(null);
                return Unit.f71690a;
            }
            return aVar;
        } catch (Throwable th4) {
            interfaceC3394a2 = interfaceC3394a;
            th2 = th4;
            interfaceC3394a2.c(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AsyncSoundContentObserverDelegate$handleOnVolumeChange$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
