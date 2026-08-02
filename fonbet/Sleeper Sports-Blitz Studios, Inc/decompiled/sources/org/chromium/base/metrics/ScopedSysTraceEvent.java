package org.chromium.base.metrics;

import android.os.Trace;

/* loaded from: classes10.dex */
public class ScopedSysTraceEvent implements AutoCloseable {
    public static final int MAX_SECTION_NAME_LEN = 127;

    public static ScopedSysTraceEvent scoped(String name) {
        return new ScopedSysTraceEvent(name);
    }

    private ScopedSysTraceEvent(String name) {
        if (name.length() > 127) {
            name = name.substring(0, 124) + "...";
        }
        Trace.beginSection(name);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Trace.endSection();
    }
}
