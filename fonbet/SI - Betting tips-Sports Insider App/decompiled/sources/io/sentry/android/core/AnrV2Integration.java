package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.sports.insider.MyApp;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class AnrV2Integration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15471a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.d f15472b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f15473c;

    public AnrV2Integration(MyApp myApp) {
        Context applicationContext = myApp.getApplicationContext();
        this.f15471a = applicationContext != null ? applicationContext : myApp;
        this.f15472b = io.sentry.transport.d.f17127a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f15473c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15473c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(b5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f15473c.isAnrEnabled()));
        if (this.f15473c.getCacheDirPath() == null) {
            this.f15473c.getLogger().h(b5.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f15473c.isAnrEnabled()) {
            try {
                io.sentry.e1 executorService = b6Var.getExecutorService();
                Context context = this.f15471a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f15473c;
                executorService.submit(new l0(context, sentryAndroidOptions2, this.f15472b, new a0(sentryAndroidOptions2, 0)));
            } catch (Throwable th2) {
                b6Var.getLogger().e(b5.DEBUG, "Failed to start ANR processor.", th2);
            }
            b6Var.getLogger().h(b5.DEBUG, "AnrV2Integration installed.", new Object[0]);
            rh.g.a("AnrV2");
        }
    }
}
