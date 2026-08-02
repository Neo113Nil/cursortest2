package io.sentry;

/* loaded from: classes9.dex */
public interface IPerformanceContinuousCollector extends IPerformanceCollector {
    void clear();

    void onSpanFinished(ISpan iSpan);

    void onSpanStarted(ISpan iSpan);
}
