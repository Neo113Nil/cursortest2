package ru.ozon.app.android.video.player.performance.cronet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/tracker/performance/ServerTimingsParser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class VideoCronetMetricListener$serverTimingParser$2 extends AbstractC7737t implements Function0<ServerTimingsParser> {
    public static final VideoCronetMetricListener$serverTimingParser$2 INSTANCE = new VideoCronetMetricListener$serverTimingParser$2();

    VideoCronetMetricListener$serverTimingParser$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ServerTimingsParser invoke() {
        return new ServerTimingsParser();
    }
}
