package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface SummarySession {

    public interface SummaryListener {
        void onMasstransitSummaries(@NonNull List<Summary> list);

        void onMasstransitSummariesError(@NonNull Error error);
    }

    void cancel();

    void retry(@NonNull SummaryListener summaryListener);
}
