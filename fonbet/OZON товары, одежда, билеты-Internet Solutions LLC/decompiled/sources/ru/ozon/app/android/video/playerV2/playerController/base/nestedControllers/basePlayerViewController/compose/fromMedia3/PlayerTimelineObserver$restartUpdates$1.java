package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import Sc.s;
import Wc.a;
import j3.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineObserver$restartUpdates$1", f = "PlayerTimelineObserver.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlayerTimelineObserver$restartUpdates$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlayerTimelineObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerTimelineObserver$restartUpdates$1(PlayerTimelineObserver playerTimelineObserver, d<? super PlayerTimelineObserver$restartUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = playerTimelineObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PlayerTimelineObserver$restartUpdates$1 playerTimelineObserver$restartUpdates$1 = new PlayerTimelineObserver$restartUpdates$1(this.this$0, dVar);
        playerTimelineObserver$restartUpdates$1.L$0 = obj;
        return playerTimelineObserver$restartUpdates$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0039 -> B:5:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        y yVar;
        long nextTimelineUpdateDelayMs;
        PlayerTimelineState playerTimelineState;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            if (N.f(m11)) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
            playerTimelineState = this.this$0.state;
            playerTimelineState.update$video_prodGoogleAllVendorsRelease();
            if (N.f(m11)) {
                yVar = this.this$0.player;
                nextTimelineUpdateDelayMs = PlayerTimelineObserverKt.nextTimelineUpdateDelayMs(yVar);
                this.L$0 = m11;
                this.label = 1;
                if (Y.b(nextTimelineUpdateDelayMs, this) == aVar) {
                    return aVar;
                }
                playerTimelineState = this.this$0.state;
                playerTimelineState.update$video_prodGoogleAllVendorsRelease();
                if (N.f(m11)) {
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PlayerTimelineObserver$restartUpdates$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
