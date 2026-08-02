package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface SummarySession {

    public interface SummaryListener {
        void onBicycleSummaries(@NonNull List<Summary> list);

        void onBicycleSummariesError(@NonNull Error error);
    }

    void cancel();

    void retry(@NonNull SummaryListener summaryListener);
}
