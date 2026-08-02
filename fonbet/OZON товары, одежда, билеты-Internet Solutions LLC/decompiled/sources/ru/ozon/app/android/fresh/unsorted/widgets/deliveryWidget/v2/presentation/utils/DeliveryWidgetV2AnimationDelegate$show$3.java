package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV2AnimationDelegate$show$3 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ long $lifetimeSeconds;
    final /* synthetic */ Function0<Unit> $onVisible;
    final /* synthetic */ DeliveryWidgetV2AnimationDelegate this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate$show$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ DeliveryWidgetV2AnimationDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate) {
            super(0);
            this.this$0 = deliveryWidgetV2AnimationDelegate;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DeliveryWidgetV2AnimationDelegate.animateDisappear$default(this.this$0, 0L, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2AnimationDelegate$show$3(Function0<Unit> function0, DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate, long j11) {
        super(0);
        this.$onVisible = function0;
        this.this$0 = deliveryWidgetV2AnimationDelegate;
        this.$lifetimeSeconds = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TimerHelper timer;
        this.$onVisible.invoke();
        timer = this.this$0.getTimer();
        timer.start(this.$lifetimeSeconds, new AnonymousClass1(this.this$0));
    }
}
