package ru.ozon.app.android.pdp.ui.compose.time;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Duration;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TimersKt$rememberRemainingPeriod$1$1 extends AbstractC7737t implements Function1<Duration, Boolean> {
    public static final TimersKt$rememberRemainingPeriod$1$1 INSTANCE = new TimersKt$rememberRemainingPeriod$1$1();

    TimersKt$rememberRemainingPeriod$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Duration it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
