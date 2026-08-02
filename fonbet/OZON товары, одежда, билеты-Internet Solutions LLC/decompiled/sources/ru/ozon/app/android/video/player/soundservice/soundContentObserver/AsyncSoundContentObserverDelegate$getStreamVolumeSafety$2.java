package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import Ej.b;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)I"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.player.soundservice.soundContentObserver.AsyncSoundContentObserverDelegate$getStreamVolumeSafety$2", f = "AsyncSoundContentObserverDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AsyncSoundContentObserverDelegate$getStreamVolumeSafety$2 extends j implements Function2<M, d<? super Integer>, Object> {
    final /* synthetic */ int $streamType;
    final /* synthetic */ AudioManager $this_getStreamVolumeSafety;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncSoundContentObserverDelegate$getStreamVolumeSafety$2(AudioManager audioManager, int i11, d<? super AsyncSoundContentObserverDelegate$getStreamVolumeSafety$2> dVar) {
        super(2, dVar);
        this.$this_getStreamVolumeSafety = audioManager;
        this.$streamType = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AsyncSoundContentObserverDelegate$getStreamVolumeSafety$2(this.$this_getStreamVolumeSafety, this.$streamType, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int streamMaxVolume;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        try {
            streamMaxVolume = this.$this_getStreamVolumeSafety.getStreamVolume(this.$streamType);
        } catch (RuntimeException e11) {
            Lm0.a.f17149a.e(b.a(this.$streamType, "Could not retrieve stream volume for stream type "), e11);
            streamMaxVolume = this.$this_getStreamVolumeSafety.getStreamMaxVolume(this.$streamType);
        }
        return new Integer(streamMaxVolume);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Integer> dVar) {
        return ((AsyncSoundContentObserverDelegate$getStreamVolumeSafety$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
