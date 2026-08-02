package io.sentry.android.core.internal.modules;

import android.content.Context;
import com.appsflyer.internal.g;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f67141e;

    public a(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        super(sentryAndroidOptions.getLogger());
        Context applicationContext = context.getApplicationContext();
        this.f67141e = applicationContext != null ? applicationContext : context;
        try {
            sentryAndroidOptions.getExecutorService().submit(new g(this, 2));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "AssetsModulesLoader submit failed", th2);
        }
    }

    @Override // io.sentry.internal.modules.d
    protected final Map<String, String> b() {
        ILogger iLogger = this.f68010a;
        TreeMap treeMap = new TreeMap();
        try {
            InputStream open = this.f67141e.getAssets().open("sentry-external-modules.txt");
            try {
                TreeMap c11 = c(open);
                if (open == null) {
                    return c11;
                }
                open.close();
                return c11;
            } catch (Throwable th2) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            iLogger.c(I2.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e11) {
            iLogger.a(I2.ERROR, "Error extracting modules.", e11);
            return treeMap;
        }
    }
}
