package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical;

import S0.InterfaceC3978p0;
import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PlayerShowcaseVerticalComposableKt$PlayerCell$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ xe.M $coroutineScope;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ InterfaceC3978p0<PoolPlayerController> $playerController$delegate;
    final /* synthetic */ Function1<PoolPlayerController, PoolPlayerController> $startPlaying;
    final /* synthetic */ Function0<Unit> $stopPlaying;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseVerticalComposableKt$PlayerCell$1$1(xe.M m11, PlayerShowcaseComponent playerShowcaseComponent, boolean z11, Function1<? super PoolPlayerController, ? extends PoolPlayerController> function1, InterfaceC3978p0<PoolPlayerController> interfaceC3978p0, Function0<Unit> function0) {
        super(1);
        this.$coroutineScope = m11;
        this.$component = playerShowcaseComponent;
        this.$isVisible = z11;
        this.$startPlaying = function1;
        this.$playerController$delegate = interfaceC3978p0;
        this.$stopPlaying = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final B0 c11 = C10727i.c(this.$coroutineScope, null, null, new PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1(this.$component, this.$isVisible, this.$startPlaying, this.$playerController$delegate, null), 3);
        final Function0<Unit> function0 = this.$stopPlaying;
        return new M() { // from class: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical.PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                B0.this.j(null);
                function0.invoke();
            }
        };
    }
}
