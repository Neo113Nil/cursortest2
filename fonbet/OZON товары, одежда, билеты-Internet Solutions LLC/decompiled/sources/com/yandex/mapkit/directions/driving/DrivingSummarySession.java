package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface DrivingSummarySession {

    public interface DrivingSummaryListener {
        void onDrivingSummaries(@NonNull List<Summary> list);

        void onDrivingSummariesError(@NonNull Error error);
    }

    void cancel();

    void retry(@NonNull DrivingSummaryListener drivingSummaryListener);
}
