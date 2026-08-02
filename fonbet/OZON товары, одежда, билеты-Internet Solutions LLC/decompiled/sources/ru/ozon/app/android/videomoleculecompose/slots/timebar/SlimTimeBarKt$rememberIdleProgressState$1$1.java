package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SlimTimeBarKt$rememberIdleProgressState$1$1 extends AbstractC7737t implements Function0<Long> {
    final /* synthetic */ long $durationMs;
    final /* synthetic */ Function0<Long> $positionMsProvider;
    final /* synthetic */ boolean $throttle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlimTimeBarKt$rememberIdleProgressState$1$1(Function0<Long> function0, long j11, boolean z11) {
        super(0);
        this.$positionMsProvider = function0;
        this.$durationMs = j11;
        this.$throttle = z11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long readIdleProgress;
        readIdleProgress = SlimTimeBarKt.readIdleProgress(this.$positionMsProvider, this.$durationMs, this.$throttle);
        return Long.valueOf(readIdleProgress);
    }
}
