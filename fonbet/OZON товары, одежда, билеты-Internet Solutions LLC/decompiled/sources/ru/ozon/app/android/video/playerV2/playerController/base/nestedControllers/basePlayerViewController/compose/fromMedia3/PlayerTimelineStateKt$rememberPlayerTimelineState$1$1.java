package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineStateKt$rememberPlayerTimelineState$1$1", f = "PlayerTimelineState.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlayerTimelineStateKt$rememberPlayerTimelineState$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ExoPlayer $player;
    final /* synthetic */ PlayerTimelineState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerTimelineStateKt$rememberPlayerTimelineState$1$1(ExoPlayer exoPlayer, PlayerTimelineState playerTimelineState, d<? super PlayerTimelineStateKt$rememberPlayerTimelineState$1$1> dVar) {
        super(2, dVar);
        this.$player = exoPlayer;
        this.$state = playerTimelineState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PlayerTimelineStateKt$rememberPlayerTimelineState$1$1(this.$player, this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ExoPlayer exoPlayer = this.$player;
            PlayerTimelineState playerTimelineState = this.$state;
            this.label = 1;
            if (PlayerTimelineObserverKt.observePlayerTimeline(exoPlayer, playerTimelineState, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PlayerTimelineStateKt$rememberPlayerTimelineState$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
