package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.util.health.HealthReport;
import com.nimbusds.jose.util.health.HealthReportListener;
import com.nimbusds.jose.util.health.HealthStatus;
import java.util.Objects;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
/* loaded from: classes8.dex */
public class JWKSetSourceWithHealthStatusReporting<C extends SecurityContext> extends JWKSetSourceWrapper<C> {
    private final HealthReportListener<JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener;

    public JWKSetSourceWithHealthStatusReporting(JWKSetSource<C> jWKSetSource, HealthReportListener<JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener) {
        super(jWKSetSource);
        Objects.requireNonNull(healthReportListener);
        this.healthReportListener = healthReportListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws KeySourceException {
        JWKSetSourceWithHealthStatusReporting<C> jWKSetSourceWithHealthStatusReporting;
        long j2;
        C c2;
        JWKSet jWKSet;
        try {
            jWKSet = getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c);
            jWKSetSourceWithHealthStatusReporting = this;
            j2 = j;
            c2 = c;
        } catch (Exception e) {
            e = e;
            jWKSetSourceWithHealthStatusReporting = this;
            j2 = j;
            c2 = c;
        }
        try {
            this.healthReportListener.notify(new HealthReport<>(jWKSetSourceWithHealthStatusReporting, HealthStatus.HEALTHY, j2, c2));
            return jWKSet;
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C c3 = c2;
            JWKSetSourceWithHealthStatusReporting<C> jWKSetSourceWithHealthStatusReporting2 = jWKSetSourceWithHealthStatusReporting;
            jWKSetSourceWithHealthStatusReporting.healthReportListener.notify(new HealthReport<>(jWKSetSourceWithHealthStatusReporting2, HealthStatus.NOT_HEALTHY, exc, j2, c3));
            throw exc;
        }
    }
}
