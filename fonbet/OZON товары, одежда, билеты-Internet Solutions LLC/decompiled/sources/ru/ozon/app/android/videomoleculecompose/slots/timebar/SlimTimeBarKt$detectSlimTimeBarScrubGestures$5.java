package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.M;
import x1.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx1/x;", "change", "Lk1/e;", "<unused var>", "", "invoke-Uv8p0NA", "(Lx1/x;J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class SlimTimeBarKt$detectSlimTimeBarScrubGestures$5 extends AbstractC7737t implements Function2<x, C7459e, Unit> {
    final /* synthetic */ M<SlimTimeBarMetrics> $activeBar;
    final /* synthetic */ SlimTimeBarInputConfig $config;
    final /* synthetic */ M<Long> $gestureStartPositionMs;
    final /* synthetic */ I $hasScrubStarted;
    final /* synthetic */ J $lastCoarseScrubX;
    final /* synthetic */ Function1<Long, Unit> $onScrubMove;
    final /* synthetic */ Function1<Long, Unit> $onScrubStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlimTimeBarKt$detectSlimTimeBarScrubGestures$5(M<SlimTimeBarMetrics> m11, M<Long> m12, SlimTimeBarInputConfig slimTimeBarInputConfig, J j11, I i11, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12) {
        super(2);
        this.$activeBar = m11;
        this.$gestureStartPositionMs = m12;
        this.$config = slimTimeBarInputConfig;
        this.$lastCoarseScrubX = j11;
        this.$hasScrubStarted = i11;
        this.$onScrubStart = function1;
        this.$onScrubMove = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(x xVar, C7459e c7459e) {
        m1566invokeUv8p0NA(xVar, c7459e.n());
        return Unit.f71690a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m1566invokeUv8p0NA(x change, long j11) {
        Long l11;
        Intrinsics.checkNotNullParameter(change, "change");
        SlimTimeBarMetrics slimTimeBarMetrics = this.$activeBar.f71787a;
        if (slimTimeBarMetrics == null || (l11 = this.$gestureStartPositionMs.f71787a) == null) {
            return;
        }
        long longValue = l11.longValue();
        float g10 = C7459e.g(change.f());
        if (!this.$config.getFineScrubEnabled() || C7459e.h(change.f()) >= this.$config.getDimensions().getFineScrubYThresholdPx()) {
            this.$lastCoarseScrubX.f71784a = g10;
        } else {
            float f7 = this.$lastCoarseScrubX.f71784a;
            g10 = ((g10 - f7) / 3.0f) + f7;
        }
        long positionFromX = SlimTimeBarKt.positionFromX(g10, slimTimeBarMetrics.getLeft(), slimTimeBarMetrics.getRight(), this.$config.getDurationMs());
        I i11 = this.$hasScrubStarted;
        if (!i11.f71783a && positionFromX != longValue) {
            i11.f71783a = true;
            this.$onScrubStart.invoke(l11);
        }
        if (this.$hasScrubStarted.f71783a) {
            this.$onScrubMove.invoke(Long.valueOf(positionFromX));
        }
        change.a();
    }
}
