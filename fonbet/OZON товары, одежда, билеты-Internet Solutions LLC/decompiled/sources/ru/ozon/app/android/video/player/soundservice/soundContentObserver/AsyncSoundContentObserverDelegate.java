package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import He.b;
import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.media.AudioManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;
import ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;
import xe.f1;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\t*\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/soundContentObserver/AsyncSoundContentObserverDelegate;", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserverDelegate;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/media/AudioManager;", "audioManager", "()Landroid/media/AudioManager;", "", "getStreamMusicVolume", "(Landroid/media/AudioManager;Lkotlin/coroutines/d;)Ljava/lang/Object;", "streamType", "getStreamVolumeSafety", "(Landroid/media/AudioManager;ILkotlin/coroutines/d;)Ljava/lang/Object;", "Lxe/M;", "getOrCreateScope", "()Lxe/M;", "coroutineScope", "", "handleOnVolumeChange", "()V", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;)V", "Landroid/content/Context;", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "scope", "Lxe/M;", "LJe/a;", "mutex", "LJe/a;", "", "listeners", "Ljava/util/List;", "prevVolume", "Ljava/lang/Integer;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsyncSoundContentObserverDelegate implements SoundContentObserverDelegate {

    @NotNull
    private final Context context;

    @NotNull
    private final J coroutineExceptionHandler;

    @NotNull
    private final List<SoundContentObserver.Listener> listeners;

    @NotNull
    private final InterfaceC3394a mutex;
    private Integer prevVolume;

    @NotNull
    private M scope;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.video.player.soundservice.soundContentObserver.AsyncSoundContentObserverDelegate$1", f = "AsyncSoundContentObserverDelegate.kt", l = {Logger.NONE, 38}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.video.player.soundservice.soundContentObserver.AsyncSoundContentObserverDelegate$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AsyncSoundContentObserverDelegate.this.new AnonymousClass1(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
        
            if (r6.a(r5) == r0) goto L21;
         */
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
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    interfaceC3394a = AsyncSoundContentObserverDelegate.this.mutex;
                    asyncSoundContentObserverDelegate = AsyncSoundContentObserverDelegate.this;
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
                            asyncSoundContentObserverDelegate2.prevVolume = (Integer) obj;
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
                if (asyncSoundContentObserverDelegate.prevVolume != null) {
                    interfaceC3394a2 = interfaceC3394a;
                    Unit unit2 = Unit.f71690a;
                    interfaceC3394a2.c(null);
                    return Unit.f71690a;
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
                    asyncSoundContentObserverDelegate2.prevVolume = (Integer) obj;
                    Unit unit22 = Unit.f71690a;
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/soundContentObserver/AsyncSoundContentObserverDelegate$Companion;", "", "<init>", "()V", "GET_STREAM_MUSIC_VOLUME_TIMEOUT", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AsyncSoundContentObserverDelegate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.coroutineExceptionHandler = new AsyncSoundContentObserverDelegate$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.scope = coroutineScope();
        this.mutex = Je.e.a();
        this.listeners = new ArrayList();
        C10727i.c(getOrCreateScope(), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioManager audioManager() {
        Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final M coroutineScope() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return N.a(De.s.f6650a.plus(X0.b()).plus(this.coroutineExceptionHandler));
    }

    private final M getOrCreateScope() {
        if (!N.f(this.scope)) {
            this.scope = coroutineScope();
        }
        return this.scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getStreamMusicVolume(AudioManager audioManager, d<? super Integer> dVar) {
        AsyncSoundContentObserverDelegate$getStreamMusicVolume$1 asyncSoundContentObserverDelegate$getStreamMusicVolume$1;
        int i11;
        if (dVar instanceof AsyncSoundContentObserverDelegate$getStreamMusicVolume$1) {
            asyncSoundContentObserverDelegate$getStreamMusicVolume$1 = (AsyncSoundContentObserverDelegate$getStreamMusicVolume$1) dVar;
            int i12 = asyncSoundContentObserverDelegate$getStreamMusicVolume$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                asyncSoundContentObserverDelegate$getStreamMusicVolume$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = asyncSoundContentObserverDelegate$getStreamMusicVolume$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = asyncSoundContentObserverDelegate$getStreamMusicVolume$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    AsyncSoundContentObserverDelegate$getStreamMusicVolume$2 asyncSoundContentObserverDelegate$getStreamMusicVolume$2 = new AsyncSoundContentObserverDelegate$getStreamMusicVolume$2(audioManager, this, null);
                    asyncSoundContentObserverDelegate$getStreamMusicVolume$1.label = 1;
                    obj = f1.c(1000L, asyncSoundContentObserverDelegate$getStreamMusicVolume$2, asyncSoundContentObserverDelegate$getStreamMusicVolume$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Integer num = (Integer) obj;
                return new Integer(num == null ? num.intValue() : 0);
            }
        }
        asyncSoundContentObserverDelegate$getStreamMusicVolume$1 = new AsyncSoundContentObserverDelegate$getStreamMusicVolume$1(this, dVar);
        Object obj2 = asyncSoundContentObserverDelegate$getStreamMusicVolume$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = asyncSoundContentObserverDelegate$getStreamMusicVolume$1.label;
        if (i11 != 0) {
        }
        Integer num2 = (Integer) obj2;
        return new Integer(num2 == null ? num2.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getStreamVolumeSafety(AudioManager audioManager, int i11, d<? super Integer> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new AsyncSoundContentObserverDelegate$getStreamVolumeSafety$2(audioManager, i11, null), dVar);
    }

    @Override // ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserverDelegate
    public void addListener(@NotNull SoundContentObserver.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C10727i.c(getOrCreateScope(), null, null, new AsyncSoundContentObserverDelegate$addListener$1(this, listener, null), 3);
    }

    @Override // ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserverDelegate
    public void handleOnVolumeChange() {
        C10727i.c(getOrCreateScope(), null, null, new AsyncSoundContentObserverDelegate$handleOnVolumeChange$1(this, null), 3);
    }
}
