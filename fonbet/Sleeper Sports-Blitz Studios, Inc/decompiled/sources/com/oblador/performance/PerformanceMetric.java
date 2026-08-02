package com.oblador.performance;

import android.os.Bundle;

/* loaded from: classes8.dex */
class PerformanceMetric extends PerformanceEntry {
    private final double value;

    protected PerformanceMetric(String str, double d, long j) {
        this(str, d, j, true);
    }

    protected PerformanceMetric(String str, double d, long j, boolean z) {
        this(str, d, j, z, null);
    }

    protected PerformanceMetric(String str, double d, long j, Bundle bundle) {
        this(str, d, j, true, bundle);
    }

    protected PerformanceMetric(String str, double d, long j, boolean z, Bundle bundle) {
        this.name = str;
        this.value = d;
        this.startTime = j;
        this.ephemeral = z;
        this.detail = bundle;
    }

    protected double getValue() {
        return this.value;
    }
}
