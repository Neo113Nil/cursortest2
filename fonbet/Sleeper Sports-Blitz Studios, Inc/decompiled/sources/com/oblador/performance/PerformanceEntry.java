package com.oblador.performance;

import android.os.Bundle;

/* loaded from: classes8.dex */
abstract class PerformanceEntry {
    protected String name;
    protected long startTime;
    protected boolean ephemeral = true;
    protected Bundle detail = null;

    PerformanceEntry() {
    }

    protected String getName() {
        return this.name;
    }

    protected long getStartTime() {
        return this.startTime;
    }

    protected boolean isEphemeral() {
        return this.ephemeral;
    }

    protected Bundle getDetail() {
        return this.detail;
    }
}
