package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.util.TimeBucketKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeControlPanelKt$rememberThrottledTimeText$1$1 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ long $durationMs;
    final /* synthetic */ Function0<Long> $positionMsProvider;
    final /* synthetic */ Function1<Long, String> $timeFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeControlPanelKt$rememberThrottledTimeText$1$1(Function1<? super Long, String> function1, Function0<Long> function0, long j11) {
        super(0);
        this.$timeFormatter = function1;
        this.$positionMsProvider = function0;
        this.$durationMs = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$timeFormatter.invoke(Long.valueOf(TimeBucketKt.roundDownToTimeBucket(this.$positionMsProvider.invoke().longValue(), 1000L, this.$durationMs)));
    }
}
