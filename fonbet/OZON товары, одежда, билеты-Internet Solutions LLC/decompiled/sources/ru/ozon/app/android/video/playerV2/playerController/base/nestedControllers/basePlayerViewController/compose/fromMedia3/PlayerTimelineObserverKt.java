package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import j3.y;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.utils.PlayerStatusSnapshotKt;
import xe.N;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lj3/y;", "player", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "state", "", "observePlayerTimeline", "(Lj3/y;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "shouldScheduleTimelineUpdates", "(Lj3/y;)Z", "", "nextTimelineUpdateDelayMs", "(Lj3/y;)J", "", "TimelineEvents", "[I", "isPositionAdvancing", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayerTimelineObserverKt {

    @NotNull
    private static final int[] TimelineEvents = {7, 5, 4, 11, 0, 13};

    private static final boolean isPositionAdvancing(y yVar) {
        return yVar.isPlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nextTimelineUpdateDelayMs(y yVar) {
        if (!isPositionAdvancing(yVar)) {
            return 1000L;
        }
        long timelineValue = PlayerStatusSnapshotKt.toTimelineValue(yVar.O()) % 200;
        long j11 = 200 - timelineValue;
        return j11 < 8 ? 400 - timelineValue : j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object observePlayerTimeline(@NotNull y yVar, @NotNull PlayerTimelineState playerTimelineState, @NotNull d<?> dVar) {
        PlayerTimelineObserverKt$observePlayerTimeline$1 playerTimelineObserverKt$observePlayerTimeline$1;
        int i11;
        if (dVar instanceof PlayerTimelineObserverKt$observePlayerTimeline$1) {
            playerTimelineObserverKt$observePlayerTimeline$1 = (PlayerTimelineObserverKt$observePlayerTimeline$1) dVar;
            int i12 = playerTimelineObserverKt$observePlayerTimeline$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                playerTimelineObserverKt$observePlayerTimeline$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = playerTimelineObserverKt$observePlayerTimeline$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = playerTimelineObserverKt$observePlayerTimeline$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    PlayerTimelineObserverKt$observePlayerTimeline$2 playerTimelineObserverKt$observePlayerTimeline$2 = new PlayerTimelineObserverKt$observePlayerTimeline$2(yVar, playerTimelineState, null);
                    playerTimelineObserverKt$observePlayerTimeline$1.label = 1;
                    if (N.d(playerTimelineObserverKt$observePlayerTimeline$2, playerTimelineObserverKt$observePlayerTimeline$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                throw new C4005g();
            }
        }
        playerTimelineObserverKt$observePlayerTimeline$1 = new PlayerTimelineObserverKt$observePlayerTimeline$1(dVar);
        Object obj2 = playerTimelineObserverKt$observePlayerTimeline$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = playerTimelineObserverKt$observePlayerTimeline$1.label;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldScheduleTimelineUpdates(y yVar) {
        if (yVar.l(16)) {
            return yVar.P() == 3 || yVar.P() == 2;
        }
        return false;
    }
}
