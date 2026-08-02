package com.vk.push.core.remote.config.omicron.segment;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class SegmentsHolder {
    public static SegmentsProvider a;

    public static synchronized void clearProvider() {
        synchronized (SegmentsHolder.class) {
            a = null;
        }
    }

    public static synchronized Map<String, String> getSegments() {
        synchronized (SegmentsHolder.class) {
            SegmentsProvider segmentsProvider = a;
            if (segmentsProvider == null) {
                return Collections.EMPTY_MAP;
            }
            Map<String, String> segments = segmentsProvider.getSegments();
            if (segments == null) {
                segments = Collections.EMPTY_MAP;
            }
            return segments;
        }
    }

    public static synchronized void registerProvider(SegmentsProvider segmentsProvider) {
        synchronized (SegmentsHolder.class) {
            a = segmentsProvider;
        }
    }
}
