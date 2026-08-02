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
@e(c = "ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt$SlimTimeBar$5$1", f = "SlimTimeBar.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlimTimeBarKt$SlimTimeBar$5$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
    final /* synthetic */ A1<Function2<Long, Boolean, Unit>> $currentOnScrubEnd$delegate;
    final /* synthetic */ A1<Function1<Long, Unit>> $currentOnScrubStart$delegate;
    final /* synthetic */ SlimTimeBarInputConfig $inputConfig;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "positionMs", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt$SlimTimeBar$5$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Long, Unit> {
        final /* synthetic */ InterfaceC3978p0<Long> $activeScrubPositionMs$delegate;
        final /* synthetic */ A1<Function2<Long, Boolean, Unit>> $currentOnScrubEnd$delegate;
        final /* synthetic */ A1<Function1<Long, Unit>> $currentOnScrubStart$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(InterfaceC3978p0<Long> interfaceC3978p0, A1<? extends Function1<? super Long, Unit>> a12, A1<? extends Function2<? super Long, ? super Boolean, Unit>> a13) {
            super(1);
            this.$activeScrubPositionMs$delegate = interfaceC3978p0;
            this.$currentOnScrubStart$delegate = a12;
            this.$currentOnScrubEnd$delegate = a13;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
            invoke(l11.longValue());
            return Unit.f71690a;
        }

        public final void invoke(long j11) {
            Function1 SlimTimeBar$lambda$3;
            Function2 SlimTimeBar$lambda$5;
            this.$activeScrubPositionMs$delegate.setValue(Long.valueOf(j11));
            SlimTimeBar$lambda$3 = SlimTimeBarKt.SlimTimeBar$lambda$3(this.$currentOnScrubStart$delegate);
            SlimTimeBar$lambda$3.invoke(Long.valueOf(j11));
            this.$activeScrubPositionMs$delegate.setValue(null);
            SlimTimeBar$lambda$5 = SlimTimeBarKt.SlimTimeBar$lambda$5(this.$currentOnScrubEnd$delegate);
            SlimTimeBar$lambda$5.invoke(Long.valueOf(j11), Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlimTimeBarKt$SlimTimeBar$5$1(SlimTimeBarInputConfig slimTimeBarInputConfig, InterfaceC3978p0<Long> interfaceC3978p0, A1<? extends Function1<? super Long, Unit>> a12, A1<? extends Function2<? super Long, ? super Boolean, Unit>> a13, d<? super SlimTimeBarKt$SlimTimeBar$5$1> dVar) {
        super(2, dVar);
        this.$inputConfig = slimTimeBarInputConfig;
        this.$activeScrubPositionMs$delegate = interfaceC3978p0;
        this.$currentOnScrubStart$delegate = a12;
        this.$currentOnScrubEnd$delegate = a13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SlimTimeBarKt$SlimTimeBar$5$1 slimTimeBarKt$SlimTimeBar$5$1 = new SlimTimeBarKt$SlimTimeBar$5$1(this.$inputConfig, this.$activeScrubPositionMs$delegate, this.$currentOnScrubStart$delegate, this.$currentOnScrubEnd$delegate, dVar);
        slimTimeBarKt$SlimTimeBar$5$1.L$0 = obj;
        return slimTimeBarKt$SlimTimeBar$5$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object detectSlimTimeBarTapGestures;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f7 = (F) this.L$0;
            SlimTimeBarInputConfig slimTimeBarInputConfig = this.$inputConfig;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activeScrubPositionMs$delegate, this.$currentOnScrubStart$delegate, this.$currentOnScrubEnd$delegate);
            this.label = 1;
            detectSlimTimeBarTapGestures = SlimTimeBarKt.detectSlimTimeBarTapGestures(f7, slimTimeBarInputConfig, anonymousClass1, this);
            if (detectSlimTimeBarTapGestures == aVar) {
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
        return ((SlimTimeBarKt$SlimTimeBar$5$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
