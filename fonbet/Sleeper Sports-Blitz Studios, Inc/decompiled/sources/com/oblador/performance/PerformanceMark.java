package com.oblador.performance;

import android.os.Bundle;

/* loaded from: classes8.dex */
class PerformanceMark extends PerformanceEntry {
    protected PerformanceMark(String str, long j) {
        this(str, j, true);
    }

    protected PerformanceMark(String str, long j, boolean z) {
        this(str, j, z, null);
    }

    protected PerformanceMark(String str, long j, Bundle bundle) {
        this(str, j, true, bundle);
    }

    protected PerformanceMark(String str, long j, boolean z, Bundle bundle) {
        this.name = str;
        this.startTime = j;
        this.ephemeral = z;
        this.detail = bundle;
    }
}
