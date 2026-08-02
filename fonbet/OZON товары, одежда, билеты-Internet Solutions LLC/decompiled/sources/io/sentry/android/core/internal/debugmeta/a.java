package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.I2;
import io.sentry.ILogger;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f67114a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f67115b;

    public a(@NotNull Context context, @NotNull ILogger iLogger) {
        Context applicationContext = context.getApplicationContext();
        this.f67114a = applicationContext != null ? applicationContext : context;
        this.f67115b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public final List<Properties> a() {
        ILogger iLogger = this.f67115b;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f67114a.getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> singletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return singletonList;
            } finally {
            }
        } catch (FileNotFoundException unused) {
            iLogger.c(I2.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e11) {
            iLogger.a(I2.ERROR, "Error getting Proguard UUIDs.", e11);
            return null;
        } catch (RuntimeException e12) {
            iLogger.b(I2.ERROR, e12, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }
}
