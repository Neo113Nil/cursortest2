package io.sentry.clientreport;

import java.util.List;

/* loaded from: classes9.dex */
public interface IClientReportStorage {
    void addCount(ClientReportKey clientReportKey, Long l);

    List<DiscardedEvent> resetCountsAndGet();
}
