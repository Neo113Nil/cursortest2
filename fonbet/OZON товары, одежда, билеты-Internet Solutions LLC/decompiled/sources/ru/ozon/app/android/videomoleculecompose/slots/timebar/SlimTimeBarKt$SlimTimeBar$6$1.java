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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import x1.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt$SlimTimeBar$6$1", f = "SlimTimeBar.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlimTimeBarKt$SlimTimeBar$6$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
    final /* synthetic */ A1<Function2<Long, Boolean, Unit>> $currentOnScrubEnd$delegate;
    final /* synthetic */ A1<Function1<Long, Unit>> $currentOnScrubMove$delegate;
    final /* synthetic */ A1<Function1<Long, Unit>> $currentOnScrubStart$delegate;
    final /* synthetic */ SlimTimeBarInputConfig $inputConfig;
    final /* synthetic */ SlimTimeBarState $state;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "positionMs", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt$SlimTimeBar$6$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Long, Unit> {
        final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
        final /* synthetic */ A1<Function1<Long, Unit>> $currentOnScrubStart$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(InterfaceC3978p0<Long> interfaceC3978p0, A1<? extends Function1<? super Long, Unit>> a12) {
            super(1);
            this.$activeScrubPositionMs$delegate = interfaceC3978p0;
            this.$currentOnScrubStart$delegate = a12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
            invoke(l11.longValue());
            return Unit.f71690a;
        }

        public final void invoke(long j11) {
            Function1 SlimTimeBar$lambda$3;
            this.$activeScrubPositionMs$delegate.setValue(Long.valueOf(j11));
            SlimTimeBar$lambda$3 = SlimTimeBarKt.SlimTimeBar$lambda$3(this.$currentOnScrubStart$delegate);
            SlimTimeBar$lambda$3.invoke(Long.valueOf(j11));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "positionMs", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt$SlimTimeBar$6$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Long, Unit> {
        final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
        final /* synthetic */ A1<Function1<Long, Unit>> $currentOnScrubMove$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(InterfaceC3978p0<Long> interfaceC3978p0, A1<? extends Function1<? super Long, Unit>> a12) {
            super(1);
            this.$activeScrubPositionMs$delegate = interfaceC3978p0;
            this.$currentOnScrubMove$delegate = a12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
            invoke(l11.longValue());
            return Unit.f71690a;
        }

        public final void invoke(long j11) {
            Long SlimTimeBar$lambda$7;
            Function1 SlimTimeBar$lambda$4;
            SlimTimeBar$lambda$7 = SlimTimeBarKt.SlimTimeBar$lambda$7(this.$activeScrubPositionMs$delegate);
            if (SlimTimeBar$lambda$7 != null && SlimTimeBar$lambda$7.longValue() == j11) {
                return;
            }
            this.$activeScrubPositionMs$delegate.setValue(Long.valueOf(j11));
            SlimTimeBar$lambda$4 = SlimTimeBarKt.SlimTimeBar$lambda$4(this.$currentOnScrubMove$delegate);
            SlimTimeBar$lambda$4.invoke(Long.valueOf(j11));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "canceled", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt$SlimTimeBar$6$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
        final /* synthetic */ A1<Function2<Long, Boolean, Unit>> $currentOnScrubEnd$delegate;
        final /* synthetic */ SlimTimeBarState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(InterfaceC3978p0<Long> interfaceC3978p0, SlimTimeBarState slimTimeBarState, A1<? extends Function2<? super Long, ? super Boolean, Unit>> a12) {
            super(1);
            this.$activeScrubPositionMs$delegate = interfaceC3978p0;
            this.$state = slimTimeBarState;
            this.$currentOnScrubEnd$delegate = a12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            Long SlimTimeBar$lambda$7;
            Function2 SlimTimeBar$lambda$5;
            SlimTimeBar$lambda$7 = SlimTimeBarKt.SlimTimeBar$lambda$7(this.$activeScrubPositionMs$delegate);
            if (SlimTimeBar$lambda$7 != null) {
                SlimTimeBarState slimTimeBarState = this.$state;
                InterfaceC3978p0<Long> interfaceC3978p0 = this.$activeScrubPositionMs$delegate;
                A1<Function2<Long, Boolean, Unit>> a12 = this.$currentOnScrubEnd$delegate;
                long coercePosition = SlimTimeBarKt.coercePosition(SlimTimeBar$lambda$7.longValue(), slimTimeBarState.getDurationMs());
                interfaceC3978p0.setValue(null);
                SlimTimeBar$lambda$5 = SlimTimeBarKt.SlimTimeBar$lambda$5(a12);
                SlimTimeBar$lambda$5.invoke(Long.valueOf(coercePosition), Boolean.valueOf(z11));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlimTimeBarKt$SlimTimeBar$6$1(SlimTimeBarInputConfig slimTimeBarInputConfig, InterfaceC3978p0<Long> interfaceC3978p0, A1<? extends Function1<? super Long, Unit>> a12, A1<? extends Function1<? super Long, Unit>> a13, SlimTimeBarState slimTimeBarState, A1<? extends Function2<? super Long, ? super Boolean, Unit>> a14, d<? super SlimTimeBarKt$SlimTimeBar$6$1> dVar) {
        super(2, dVar);
        this.$inputConfig = slimTimeBarInputConfig;
        this.$activeScrubPositionMs$delegate = interfaceC3978p0;
        this.$currentOnScrubStart$delegate = a12;
        this.$currentOnScrubMove$delegate = a13;
        this.$state = slimTimeBarState;
        this.$currentOnScrubEnd$delegate = a14;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SlimTimeBarKt$SlimTimeBar$6$1 slimTimeBarKt$SlimTimeBar$6$1 = new SlimTimeBarKt$SlimTimeBar$6$1(this.$inputConfig, this.$activeScrubPositionMs$delegate, this.$currentOnScrubStart$delegate, this.$currentOnScrubMove$delegate, this.$state, this.$currentOnScrubEnd$delegate, dVar);
        slimTimeBarKt$SlimTimeBar$6$1.L$0 = obj;
        return slimTimeBarKt$SlimTimeBar$6$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object detectSlimTimeBarScrubGestures;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f7 = (F) this.L$0;
            SlimTimeBarInputConfig slimTimeBarInputConfig = this.$inputConfig;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activeScrubPositionMs$delegate, this.$currentOnScrubStart$delegate);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$activeScrubPositionMs$delegate, this.$currentOnScrubMove$delegate);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$activeScrubPositionMs$delegate, this.$state, this.$currentOnScrubEnd$delegate);
            this.label = 1;
            detectSlimTimeBarScrubGestures = SlimTimeBarKt.detectSlimTimeBarScrubGestures(f7, slimTimeBarInputConfig, anonymousClass1, anonymousClass2, anonymousClass3, this);
            if (detectSlimTimeBarScrubGestures == aVar) {
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
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((SlimTimeBarKt$SlimTimeBar$6$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
