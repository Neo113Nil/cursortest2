package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import S0.A1;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt$SlimTimeBar$4$1", f = "SlimTimeBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlimTimeBarKt$SlimTimeBar$4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
    final /* synthetic */ A1<Function2<Long, Boolean, Unit>> $currentOnScrubEnd$delegate;
    final /* synthetic */ SlimTimeBarState $state;
    final /* synthetic */ boolean $validDuration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlimTimeBarKt$SlimTimeBar$4$1(SlimTimeBarState slimTimeBarState, boolean z11, InterfaceC3978p0<Long> interfaceC3978p0, A1<? extends Function2<? super Long, ? super Boolean, Unit>> a12, d<? super SlimTimeBarKt$SlimTimeBar$4$1> dVar) {
        super(2, dVar);
        this.$state = slimTimeBarState;
        this.$validDuration = z11;
        this.$activeScrubPositionMs$delegate = interfaceC3978p0;
        this.$currentOnScrubEnd$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SlimTimeBarKt$SlimTimeBar$4$1(this.$state, this.$validDuration, this.$activeScrubPositionMs$delegate, this.$currentOnScrubEnd$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long SlimTimeBar$lambda$7;
        Function2 SlimTimeBar$lambda$5;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SlimTimeBar$lambda$7 = SlimTimeBarKt.SlimTimeBar$lambda$7(this.$activeScrubPositionMs$delegate);
        if ((!this.$state.getEnabled() || !this.$validDuration) && SlimTimeBar$lambda$7 != null) {
            long coercePosition = SlimTimeBarKt.coercePosition(SlimTimeBar$lambda$7.longValue(), this.$state.getDurationMs());
            this.$activeScrubPositionMs$delegate.setValue(null);
            SlimTimeBar$lambda$5 = SlimTimeBarKt.SlimTimeBar$lambda$5(this.$currentOnScrubEnd$delegate);
            SlimTimeBar$lambda$5.invoke(new Long(coercePosition), Boolean.TRUE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SlimTimeBarKt$SlimTimeBar$4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
