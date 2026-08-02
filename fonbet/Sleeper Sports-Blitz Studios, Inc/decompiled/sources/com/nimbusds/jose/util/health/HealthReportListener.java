package com.nimbusds.jose.util.health;

import com.nimbusds.jose.proc.SecurityContext;

/* loaded from: classes8.dex */
public interface HealthReportListener<S, C extends SecurityContext> {
    void notify(HealthReport<S, C> healthReport);
}
