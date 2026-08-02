package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import Sc.s;
import Wc.a;
import android.media.AudioManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)I"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.player.soundservice.soundContentObserver.AsyncSoundContentObserverDelegate$getStreamMusicVolume$2", f = "AsyncSoundContentObserverDelegate.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AsyncSoundContentObserverDelegate$getStreamMusicVolume$2 extends j implements Function2<M, d<? super Integer>, Object> {
    final /* synthetic */ AudioManager $this_getStreamMusicVolume;
    int label;
    final /* synthetic */ AsyncSoundContentObserverDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncSoundContentObserverDelegate$getStreamMusicVolume$2(AudioManager audioManager, AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate, d<? super AsyncSoundContentObserverDelegate$getStreamMusicVolume$2> dVar) {
        super(2, dVar);
        this.$this_getStreamMusicVolume = audioManager;
        this.this$0 = asyncSoundContentObserverDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AsyncSoundContentObserverDelegate$getStreamMusicVolume$2(this.$this_getStreamMusicVolume, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AudioManager audioManager = this.$this_getStreamMusicVolume;
            if (audioManager == null) {
                return null;
            }
            AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate = this.this$0;
            this.label = 1;
            obj = asyncSoundContentObserverDelegate.getStreamVolumeSafety(audioManager, 3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return (Integer) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Integer> dVar) {
        return ((AsyncSoundContentObserverDelegate$getStreamMusicVolume$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
