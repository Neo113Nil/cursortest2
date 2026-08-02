package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.M;
import x1.F;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/e;", "offset", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class SlimTimeBarKt$detectSlimTimeBarScrubGestures$2 extends AbstractC7737t implements Function1<C7459e, Unit> {
    final /* synthetic */ M<SlimTimeBarMetrics> $activeBar;
    final /* synthetic */ SlimTimeBarInputConfig $config;
    final /* synthetic */ M<Long> $gestureStartPositionMs;
    final /* synthetic */ J $lastCoarseScrubX;
    final /* synthetic */ F $this_detectSlimTimeBarScrubGestures;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlimTimeBarKt$detectSlimTimeBarScrubGestures$2(SlimTimeBarInputConfig slimTimeBarInputConfig, F f7, M<SlimTimeBarMetrics> m11, J j11, M<Long> m12) {
        super(1);
        this.$config = slimTimeBarInputConfig;
        this.$this_detectSlimTimeBarScrubGestures = f7;
        this.$activeBar = m11;
        this.$lastCoarseScrubX = j11;
        this.$gestureStartPositionMs = m12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C7459e c7459e) {
        m1565invokek4lQ0M(c7459e.n());
        return Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarMetrics] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Long] */
    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m1565invokek4lQ0M(long j11) {
        if (this.$config.getEnabled() && SlimTimeBarKt.isValidDuration(this.$config.getDurationMs())) {
            ?? calculateBarMetrics = SlimTimeBarKt.calculateBarMetrics((int) (this.$this_detectSlimTimeBarScrubGestures.a() >> 32), (int) (this.$this_detectSlimTimeBarScrubGestures.a() & 4294967295L), this.$config.getDimensions(), this.$config.getGravity(), this.$config.getShowScrubber());
            this.$activeBar.f71787a = calculateBarMetrics;
            this.$lastCoarseScrubX.f71784a = C7459e.g(j11);
            this.$gestureStartPositionMs.f71787a = Long.valueOf(SlimTimeBarKt.positionFromX(C7459e.g(j11), calculateBarMetrics.getLeft(), calculateBarMetrics.getRight(), this.$config.getDurationMs()));
        }
    }
}
