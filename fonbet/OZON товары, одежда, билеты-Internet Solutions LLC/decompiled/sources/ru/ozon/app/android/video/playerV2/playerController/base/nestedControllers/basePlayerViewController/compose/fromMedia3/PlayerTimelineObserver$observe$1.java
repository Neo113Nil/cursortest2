package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineObserver", f = "PlayerTimelineObserver.kt", l = {50}, m = "observe")
/* loaded from: classes2.dex */
final class PlayerTimelineObserver$observe$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayerTimelineObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerTimelineObserver$observe$1(PlayerTimelineObserver playerTimelineObserver, d<? super PlayerTimelineObserver$observe$1> dVar) {
        super(dVar);
        this.this$0 = playerTimelineObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.observe(this);
    }
}
