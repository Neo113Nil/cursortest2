package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical;

import Ae.C2399j;
import Ae.C2408n0;
import S0.InterfaceC3978p0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical.PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1", f = "PlayerShowcaseVerticalComposable.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ InterfaceC3978p0<PoolPlayerController> $playerController$delegate;
    final /* synthetic */ Function1<PoolPlayerController, PoolPlayerController> $startPlaying;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "remainCapacity", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical.PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1$1", f = "PlayerShowcaseVerticalComposable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical.PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Integer, d<? super Unit>, Object> {
        final /* synthetic */ PlayerShowcaseComponent $component;
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ InterfaceC3978p0<PoolPlayerController> $playerController$delegate;
        final /* synthetic */ Function1<PoolPlayerController, PoolPlayerController> $startPlaying;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z11, PlayerShowcaseComponent playerShowcaseComponent, Function1<? super PoolPlayerController, ? extends PoolPlayerController> function1, InterfaceC3978p0<PoolPlayerController> interfaceC3978p0, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$isVisible = z11;
            this.$component = playerShowcaseComponent;
            this.$startPlaying = function1;
            this.$playerController$delegate = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isVisible, this.$component, this.$startPlaying, this.$playerController$delegate, dVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PoolPlayerController PlayerCell$lambda$6;
            PoolPlayerController poolPlayerController;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (this.I$0 == 0) {
                return Unit.f71690a;
            }
            if (this.$isVisible) {
                PlayerCell$lambda$6 = PlayerShowcaseVerticalComposableKt.PlayerCell$lambda$6(this.$playerController$delegate);
                if (PlayerCell$lambda$6 == null && (poolPlayerController = this.$component.getVideoController().getPlayerPoolManager().getPoolPlayerController(PlayerConfigAlias.Default.INSTANCE, null, PoolStorageConfig.DEFAULT)) != null) {
                    this.$component.getPoolCapacityManager().onPlayerGet();
                    this.$playerController$delegate.setValue(this.$startPlaying.invoke(poolPlayerController));
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
            return invoke(num.intValue(), dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1(PlayerShowcaseComponent playerShowcaseComponent, boolean z11, Function1<? super PoolPlayerController, ? extends PoolPlayerController> function1, InterfaceC3978p0<PoolPlayerController> interfaceC3978p0, d<? super PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1> dVar) {
        super(2, dVar);
        this.$component = playerShowcaseComponent;
        this.$isVisible = z11;
        this.$startPlaying = function1;
        this.$playerController$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1(this.$component, this.$isVisible, this.$startPlaying, this.$playerController$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C2408n0 c2408n0 = new C2408n0(C2399j.l(this.$component.getPoolCapacityManager().getRemainPoolPlayers(), 500L), new AnonymousClass1(this.$isVisible, this.$component, this.$startPlaying, this.$playerController$delegate, null));
            this.label = 1;
            if (C2399j.g(c2408n0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PlayerShowcaseVerticalComposableKt$PlayerCell$1$1$job$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
