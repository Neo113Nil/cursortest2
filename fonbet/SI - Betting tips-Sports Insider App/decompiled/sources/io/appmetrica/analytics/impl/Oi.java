package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Oi {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f12695a;

    /* renamed from: b, reason: collision with root package name */
    public final Um f12696b;

    /* renamed from: c, reason: collision with root package name */
    public final C0111dn f12697c;

    /* renamed from: d, reason: collision with root package name */
    public final C0111dn f12698d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f12699e;

    public Oi(Revenue revenue, PublicLogger publicLogger) {
        this.f12699e = publicLogger;
        this.f12695a = revenue;
        this.f12696b = new Um(30720, "revenue payload", publicLogger);
        this.f12697c = new C0111dn(new Um(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f12698d = new C0111dn(new Xm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
