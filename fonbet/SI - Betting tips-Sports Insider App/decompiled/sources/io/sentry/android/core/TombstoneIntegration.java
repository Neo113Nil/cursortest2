package io.sentry.android.core;

import android.content.Context;
import com.sports.insider.MyApp;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class TombstoneIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15516a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.d f15517b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f15518c;

    public TombstoneIntegration(MyApp myApp) {
        Context applicationContext = myApp.getApplicationContext();
        this.f15516a = applicationContext != null ? applicationContext : myApp;
        this.f15517b = io.sentry.transport.d.f17127a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f15518c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15518c = sentryAndroidOptions;
        int i5 = 1;
        sentryAndroidOptions.getLogger().h(b5.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.f15518c.isTombstoneEnabled()));
        if (this.f15518c.isTombstoneEnabled()) {
            if (this.f15518c.getCacheDirPath() == null) {
                this.f15518c.getLogger().h(b5.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.e1 executorService = b6Var.getExecutorService();
                Context context = this.f15516a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f15518c;
                executorService.submit(new l0(context, sentryAndroidOptions2, this.f15517b, new a0(sentryAndroidOptions2, i5)));
            } catch (Throwable th2) {
                b6Var.getLogger().e(b5.DEBUG, "Failed to start tombstone processor.", th2);
            }
            b6Var.getLogger().h(b5.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            rh.g.a("Tombstone");
        }
    }
}
