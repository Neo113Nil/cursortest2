package io.sentry;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class SpotlightIntegration implements q1, n5, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public b6 f15424a;

    /* renamed from: b, reason: collision with root package name */
    public ILogger f15425b = n2.f16660a;

    /* renamed from: c, reason: collision with root package name */
    public e1 f15426c = k2.f16595c;

    public static void c(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static HttpURLConnection k(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        httpURLConnection.setConnectTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15426c.d(0L);
        b6 b6Var = this.f15424a;
        if (b6Var == null || b6Var.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f15424a.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        this.f15424a = b6Var;
        this.f15425b = b6Var.getLogger();
        if (b6Var.getBeforeEnvelopeCallback() != null || !b6Var.isEnableSpotlight()) {
            this.f15425b.h(b5.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f15426c = new com.google.firebase.messaging.x(b6Var);
        b6Var.setBeforeEnvelopeCallback(this);
        this.f15425b.h(b5.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        rh.g.a("Spotlight");
    }
}
