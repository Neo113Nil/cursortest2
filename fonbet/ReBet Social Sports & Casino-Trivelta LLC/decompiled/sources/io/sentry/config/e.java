package io.sentry.config;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f52002a;

    /* renamed from: b, reason: collision with root package name */
    public final ILogger f52003b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52004c;

    public e(String str, ILogger iLogger) {
        this(str, iLogger, true);
    }

    public Properties a() {
        try {
            File file = new File(this.f52002a.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    this.f52003b.c(EnumC4788n3.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.f52002a);
                }
            } else if (this.f52004c) {
                this.f52003b.c(EnumC4788n3.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.f52002a);
            }
            return null;
        } catch (Throwable th2) {
            this.f52003b.a(EnumC4788n3.ERROR, th2, "Failed to load Sentry configuration from file: %s", this.f52002a);
            return null;
        }
    }

    public e(String str, ILogger iLogger, boolean z10) {
        this.f52002a = str;
        this.f52003b = iLogger;
        this.f52004c = z10;
    }
}
