package org.chromium.base.metrics;

import org.chromium.base.TimeUtils;

/* loaded from: classes10.dex */
public class RecordUserAction {
    public static void record(final String action) {
        UmaRecorderHolder.get().recordUserAction(action, TimeUtils.elapsedRealtimeMillis());
    }
}
