package io.sentry;

import java.util.List;

/* loaded from: classes9.dex */
public interface CompositePerformanceCollector {
    void close();

    void onSpanFinished(ISpan iSpan);

    void onSpanStarted(ISpan iSpan);

    void start(ITransaction iTransaction);

    void start(String str);

    List<PerformanceCollectionData> stop(ITransaction iTransaction);

    List<PerformanceCollectionData> stop(String str);
}
