package org.chromium.net.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes10.dex */
final class CronetRequestCommon {
    private CronetRequestCommon() {
    }

    public static CronetLogger.CronetTrafficInfo.RequestTerminalState finishedReasonToCronetTrafficInfoRequestTerminalState(int finishedReason) {
        if (finishedReason == 0) {
            return CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED;
        }
        if (finishedReason == 1) {
            return CronetLogger.CronetTrafficInfo.RequestTerminalState.ERROR;
        }
        if (finishedReason == 2) {
            return CronetLogger.CronetTrafficInfo.RequestTerminalState.CANCELLED;
        }
        throw new IllegalArgumentException("Invalid finished reason while producing request terminal state: " + finishedReason);
    }

    public static long estimateHeadersSizeInBytes(Map<String, List<String>> headers) {
        long j = 0;
        if (headers == null) {
            return 0L;
        }
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey() != null) {
                j += r3.length();
            }
            if (entry.getValue() != null) {
                while (entry.getValue().iterator().hasNext()) {
                    j += r2.next().length();
                }
            }
        }
        return j;
    }

    public static long estimateHeadersSizeInBytes(Collection<Map.Entry<String, String>> headers) {
        long j = 0;
        if (headers == null) {
            return 0L;
        }
        for (Map.Entry<String, String> entry : headers) {
            if (entry.getKey() != null) {
                j += r3.length();
            }
            if (entry.getValue() != null) {
                j += entry.getValue().length();
            }
        }
        return j;
    }

    public static long estimateHeadersSizeInBytes(String[] headers) {
        long j = 0;
        if (headers == null) {
            return 0L;
        }
        for (String str : headers) {
            if (str != null) {
                j += r4.length();
            }
        }
        return j;
    }
}
