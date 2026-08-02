package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineObserverKt", f = "PlayerTimelineObserver.kt", l = {32}, m = "observePlayerTimeline")
/* loaded from: classes2.dex */
final class PlayerTimelineObserverKt$observePlayerTimeline$1 extends c {
    int label;
    /* synthetic */ Object result;

    PlayerTimelineObserverKt$observePlayerTimeline$1(d<? super PlayerTimelineObserverKt$observePlayerTimeline$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return PlayerTimelineObserverKt.observePlayerTimeline(null, null, this);
    }
}
