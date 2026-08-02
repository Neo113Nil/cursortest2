package ru.ozon.app.android.metrics.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/tracker/performance/ServerTimingsParser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MetricsClientImpl$requestIdParser$2 extends AbstractC7737t implements Function0<ServerTimingsParser> {
    public static final MetricsClientImpl$requestIdParser$2 INSTANCE = new MetricsClientImpl$requestIdParser$2();

    MetricsClientImpl$requestIdParser$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ServerTimingsParser invoke() {
        return new ServerTimingsParser();
    }
}
