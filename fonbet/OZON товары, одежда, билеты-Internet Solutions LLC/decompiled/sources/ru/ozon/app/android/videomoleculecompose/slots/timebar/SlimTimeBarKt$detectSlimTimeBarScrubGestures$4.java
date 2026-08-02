package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SlimTimeBarKt$detectSlimTimeBarScrubGestures$4 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ M<SlimTimeBarMetrics> $activeBar;
    final /* synthetic */ M<Long> $gestureStartPositionMs;
    final /* synthetic */ I $hasScrubStarted;
    final /* synthetic */ Function1<Boolean, Unit> $onScrubEnd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlimTimeBarKt$detectSlimTimeBarScrubGestures$4(M<SlimTimeBarMetrics> m11, M<Long> m12, I i11, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$activeBar = m11;
        this.$gestureStartPositionMs = m12;
        this.$hasScrubStarted = i11;
        this.$onScrubEnd = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$activeBar.f71787a = null;
        this.$gestureStartPositionMs.f71787a = null;
        I i11 = this.$hasScrubStarted;
        if (i11.f71783a) {
            i11.f71783a = false;
            this.$onScrubEnd.invoke(Boolean.TRUE);
        }
    }
}
