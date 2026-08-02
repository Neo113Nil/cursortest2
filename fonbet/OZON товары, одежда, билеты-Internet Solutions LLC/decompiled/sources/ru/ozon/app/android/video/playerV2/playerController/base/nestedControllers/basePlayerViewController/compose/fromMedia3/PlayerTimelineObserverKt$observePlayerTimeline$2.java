package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import Sc.C4005g;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import j3.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineObserverKt$observePlayerTimeline$2", f = "PlayerTimelineObserver.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlayerTimelineObserverKt$observePlayerTimeline$2 extends j implements Function2<M, d<?>, Object> {
    final /* synthetic */ y $player;
    final /* synthetic */ PlayerTimelineState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerTimelineObserverKt$observePlayerTimeline$2(y yVar, PlayerTimelineState playerTimelineState, d<? super PlayerTimelineObserverKt$observePlayerTimeline$2> dVar) {
        super(2, dVar);
        this.$player = yVar;
        this.$state = playerTimelineState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PlayerTimelineObserverKt$observePlayerTimeline$2 playerTimelineObserverKt$observePlayerTimeline$2 = new PlayerTimelineObserverKt$observePlayerTimeline$2(this.$player, this.$state, dVar);
        playerTimelineObserverKt$observePlayerTimeline$2.L$0 = obj;
        return playerTimelineObserverKt$observePlayerTimeline$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            PlayerTimelineObserver playerTimelineObserver = new PlayerTimelineObserver(this.$player, this.$state, (M) this.L$0);
            this.label = 1;
            if (playerTimelineObserver.observe(this) == aVar) {
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
    public final Object invoke(M m11, d<?> dVar) {
        return ((PlayerTimelineObserverKt$observePlayerTimeline$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
