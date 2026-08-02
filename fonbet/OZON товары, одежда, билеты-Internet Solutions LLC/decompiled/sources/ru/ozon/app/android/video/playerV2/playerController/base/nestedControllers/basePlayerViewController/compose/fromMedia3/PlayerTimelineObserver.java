package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import j3.C7248D;
import j3.y;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineObserver;", "", "Lj3/y;", "player", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "state", "Lxe/M;", "scope", "<init>", "(Lj3/y;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;Lxe/M;)V", "", "restartUpdates", "()V", "", "observe", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lj3/y;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "Lxe/M;", "Lxe/B0;", "updateJob", "Lxe/B0;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayerTimelineObserver {

    @NotNull
    private final y player;

    @NotNull
    private final M scope;

    @NotNull
    private final PlayerTimelineState state;
    private B0 updateJob;

    public PlayerTimelineObserver(@NotNull y player, @NotNull PlayerTimelineState state, @NotNull M scope) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.player = player;
        this.state = state;
        this.scope = scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartUpdates() {
        boolean shouldScheduleTimelineUpdates;
        this.state.update$video_prodGoogleAllVendorsRelease();
        B0 b02 = this.updateJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.updateJob = null;
        shouldScheduleTimelineUpdates = PlayerTimelineObserverKt.shouldScheduleTimelineUpdates(this.player);
        if (shouldScheduleTimelineUpdates) {
            this.updateJob = C10727i.c(this.scope, null, null, new PlayerTimelineObserver$restartUpdates$1(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object observe(@NotNull d<?> dVar) {
        PlayerTimelineObserver$observe$1 playerTimelineObserver$observe$1;
        int i11;
        PlayerTimelineObserver playerTimelineObserver;
        B0 b02;
        if (dVar instanceof PlayerTimelineObserver$observe$1) {
            playerTimelineObserver$observe$1 = (PlayerTimelineObserver$observe$1) dVar;
            int i12 = playerTimelineObserver$observe$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                playerTimelineObserver$observe$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = playerTimelineObserver$observe$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = playerTimelineObserver$observe$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        restartUpdates();
                        y yVar = this.player;
                        PlayerTimelineObserver$observe$2 playerTimelineObserver$observe$2 = new PlayerTimelineObserver$observe$2(this);
                        playerTimelineObserver$observe$1.L$0 = this;
                        playerTimelineObserver$observe$1.label = 1;
                        if (C7248D.b(yVar, playerTimelineObserver$observe$2, playerTimelineObserver$observe$1) == aVar) {
                            return aVar;
                        }
                        playerTimelineObserver = this;
                    } catch (Throwable th2) {
                        th = th2;
                        playerTimelineObserver = this;
                        b02 = playerTimelineObserver.updateJob;
                        if (b02 != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    playerTimelineObserver = (PlayerTimelineObserver) playerTimelineObserver$observe$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        b02 = playerTimelineObserver.updateJob;
                        if (b02 != null) {
                            b02.j(null);
                        }
                        throw th;
                    }
                }
                throw new C4005g();
            }
        }
        playerTimelineObserver$observe$1 = new PlayerTimelineObserver$observe$1(this, dVar);
        Object obj2 = playerTimelineObserver$observe$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = playerTimelineObserver$observe$1.label;
        if (i11 != 0) {
        }
        throw new C4005g();
    }
}
