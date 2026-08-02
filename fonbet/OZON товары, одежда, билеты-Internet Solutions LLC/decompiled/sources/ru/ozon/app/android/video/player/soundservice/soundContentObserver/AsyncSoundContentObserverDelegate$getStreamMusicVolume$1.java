package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.video.player.soundservice.soundContentObserver.AsyncSoundContentObserverDelegate", f = "AsyncSoundContentObserverDelegate.kt", l = {71}, m = "getStreamMusicVolume")
/* loaded from: classes2.dex */
final class AsyncSoundContentObserverDelegate$getStreamMusicVolume$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncSoundContentObserverDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncSoundContentObserverDelegate$getStreamMusicVolume$1(AsyncSoundContentObserverDelegate asyncSoundContentObserverDelegate, d<? super AsyncSoundContentObserverDelegate$getStreamMusicVolume$1> dVar) {
        super(dVar);
        this.this$0 = asyncSoundContentObserverDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getStreamMusicVolume(null, this);
    }
}
