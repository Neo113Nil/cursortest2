package ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation;

import Sc.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.InterfaceC10733l;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MarqueeAnimationManager$scheduleNextCycle$1$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ M $$this$launch;
    final /* synthetic */ InterfaceC10733l<Unit> $continuation;
    final /* synthetic */ MarqueeAnimationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MarqueeAnimationManager$scheduleNextCycle$1$2$1(M m11, MarqueeAnimationManager marqueeAnimationManager, InterfaceC10733l<? super Unit> interfaceC10733l) {
        super(0);
        this.$$this$launch = m11;
        this.this$0 = marqueeAnimationManager;
        this.$continuation = interfaceC10733l;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int i11;
        if (N.f(this.$$this$launch)) {
            i11 = this.this$0.animationCycleCount;
            this.this$0.animationCycleCount = i11 + 1;
            InterfaceC10733l<Unit> interfaceC10733l = this.$continuation;
            r.Companion companion = r.INSTANCE;
            interfaceC10733l.resumeWith(Unit.f71690a);
        }
    }
}
